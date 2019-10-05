package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStop
  extends Accessor
     with JSONSupport {
  /**
    * The [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#value).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#color)
    */
  var color: Color = js.native
  /**
    * A string value used to label the stop along the color ramp in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#label)
    */
  var label: String = js.native
  /**
    * Specifies the data value to map to the given [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#color).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#value)
    */
  var value: Double = js.native
}

@JSGlobal("__esri.ColorStop")
@js.native
object ColorStop extends TopLevel[ColorStopConstructor]

