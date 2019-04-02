package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInfo
  extends Accessor
     with JSONSupport {
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: java.lang.String = js.native
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: java.lang.String = js.native
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: TimeExtent = js.native
}

@JSGlobal("__esri.TimeInfo")
@js.native
/**
  * Time info represents a temporal data of a time-aware layer. The time info provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [total time span](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#timeExtent) for the layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html)
  */
class TimeInfoCls () extends TimeInfo {
  def this(properties: TimeInfoProperties) = this()
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

