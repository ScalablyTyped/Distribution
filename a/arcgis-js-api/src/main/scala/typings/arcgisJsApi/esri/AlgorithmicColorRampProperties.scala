package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cie-lab`
import typings.arcgisJsApi.arcgisJsApiStrings.`lab-lch`
import typings.arcgisJsApi.arcgisJsApiStrings.hsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmicColorRampProperties extends ColorRampProperties {
  
  /**
    * The algorithm used to generate the colors between the `fromColor` and `toColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#algorithm)
    */
  var algorithm: js.UndefOr[`cie-lab` | `lab-lch` | hsv] = js.native
  
  /**
    * The first color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#fromColor)
    */
  var fromColor: js.UndefOr[Color_] = js.native
  
  /**
    * The last color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#toColor)
    */
  var toColor: js.UndefOr[Color_] = js.native
}
object AlgorithmicColorRampProperties {
  
  @scala.inline
  def apply(): AlgorithmicColorRampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmicColorRampProperties]
  }
  
  @scala.inline
  implicit class AlgorithmicColorRampPropertiesOps[Self <: AlgorithmicColorRampProperties] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: `cie-lab` | `lab-lch` | hsv): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setFromColor(value: Color_): Self = this.set("fromColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromColor: Self = this.set("fromColor", js.undefined)
    
    @scala.inline
    def setToColor(value: Color_): Self = this.set("toColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToColor: Self = this.set("toColor", js.undefined)
  }
}
