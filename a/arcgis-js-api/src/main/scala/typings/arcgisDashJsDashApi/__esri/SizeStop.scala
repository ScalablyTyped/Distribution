package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeStop
  extends Accessor
     with JSONSupport {
  /**
    * A string value used to label the stop in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#label)
    */
  var label: String = js.native
  /**
    * The size value in points (between `0` and `90`) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#value). This value may also be autocast from a string in points or pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#size)
    */
  var size: Double = js.native
  /**
    * Specifies the data value to map to the given [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#size).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#value)
    */
  var value: Double = js.native
}

@JSGlobal("__esri.SizeStop")
@js.native
object SizeStop extends TopLevel[SizeStopConstructor]

