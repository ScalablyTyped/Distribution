package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typings.arcgisJsApi.arcgisJsApiStrings.geographic
import typings.arcgisJsApi.arcgisJsApiStrings.heading
import typings.arcgisJsApi.arcgisJsApiStrings.roll
import typings.arcgisJsApi.arcgisJsApiStrings.tilt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationVariableProperties extends VisualVariableProperties {
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Defines the axis the rotation visual variable should be applied to when rendering features with an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then the following rotation axis will rotate the symbol as indicated by their name.
    *
    * Possible Value | Description
    * ----------------|-----------
    * heading | The rotation of the symbol in the horizontal plane (i.e., around the z axis).
    * tilt | The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
    * roll | The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    *
    * @default heading
    */
  var axis: js.UndefOr[heading | tilt | roll] = js.native
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured. See the table below for a list of possible values. This property only applies to rotations around the `heading` axis.
    *
    * Value | Description
    * ------|------------
    * geographic | Rotates the symbol from the north in a clockwise direction.
    * arithmetic | Rotates the symbol from the east in a counter-clockwise direction.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    *
    * @default geographic
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

