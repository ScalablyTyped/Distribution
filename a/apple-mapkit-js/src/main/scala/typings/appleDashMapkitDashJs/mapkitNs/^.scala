package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit")
@js.native
object ^ extends js.Object {
  val build: String = js.native
  var language: String = js.native
  var maps: js.Array[Map] = js.native
  val version: String = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def importGeoJSON(data: String): ItemCollection | Error = js.native
  def importGeoJSON(
    data: String,
    callback: js.Function2[/* error */ Error, /* result */ ItemCollection, Unit | GeoJSONDelegate]
  ): ItemCollection | Error = js.native
  def importGeoJSON(data: js.Object): ItemCollection | Error = js.native
  def importGeoJSON(
    data: js.Object,
    callback: js.Function2[/* error */ Error, /* result */ ItemCollection, Unit | GeoJSONDelegate]
  ): ItemCollection | Error = js.native
  def init(options: MapKitInitOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
}

