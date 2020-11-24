package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typings.arcgisJsApi.arcgisJsApiStrings.geographic
import typings.arcgisJsApi.arcgisJsApiStrings.heading
import typings.arcgisJsApi.arcgisJsApiStrings.roll
import typings.arcgisJsApi.arcgisJsApiStrings.tilt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationVariableProperties extends VisualVariableProperties {
  
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    */
  var axis: js.UndefOr[heading | tilt | roll] = js.native
  
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    */
  var rotationType: js.UndefOr[geographic | arithmetic] = js.native
}
object RotationVariableProperties {
  
  @scala.inline
  def apply(): RotationVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationVariableProperties]
  }
  
  @scala.inline
  implicit class RotationVariablePropertiesOps[Self <: RotationVariableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: heading | tilt | roll): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setRotationType(value: geographic | arithmetic): Self = this.set("rotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationType: Self = this.set("rotationType", js.undefined)
  }
}
