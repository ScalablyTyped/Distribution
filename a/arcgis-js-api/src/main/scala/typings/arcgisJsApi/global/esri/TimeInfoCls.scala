package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TimeInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.TimeInfo")
@js.native
/**
  * Time info represents the temporal data of a time-aware layer. The time info class provides information such as date fields that store the [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) times for each feature and the [total time span](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html)
  */
class TimeInfoCls ()
  extends typings.arcgisJsApi.esri.TimeInfo {
  def this(properties: TimeInfoProperties) = this()
}

