package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  val type_MultipartColorRamp: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.multipart = js.native
}

@JSGlobal("__esri.MultipartColorRamp")
@js.native
class MultipartColorRampCls () extends MultipartColorRamp {
  def this(properties: MultipartColorRampProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

