package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.multipart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartColorRamp extends ColorRamp {
  /**
    * Define an array of algorithmic color ramps used to generate the multi part ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#colorRamps)
    */
  var colorRamps: js.Array[AlgorithmicColorRamp] = js.native
  /**
    * A string value representing the color ramp type. This value is always `multipart`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#type)
    *
    * @default multipart
    */
  @JSName("type")
  val type_MultipartColorRamp: multipart = js.native
}

@JSGlobal("__esri.MultipartColorRamp")
@js.native
object MultipartColorRamp extends TopLevel[MultipartColorRampConstructor]

