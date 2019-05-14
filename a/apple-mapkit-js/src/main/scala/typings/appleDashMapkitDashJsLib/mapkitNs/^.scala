package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit")
@js.native
object ^ extends js.Object {
  val build: java.lang.String = js.native
  var language: java.lang.String = js.native
  var maps: js.Array[Map] = js.native
  val version: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def importGeoJSON(data: java.lang.String): ItemCollection | stdLib.Error = js.native
  def importGeoJSON(
    data: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ ItemCollection, scala.Unit | GeoJSONDelegate]
  ): ItemCollection | stdLib.Error = js.native
  def importGeoJSON(data: js.Object): ItemCollection | stdLib.Error = js.native
  def importGeoJSON(
    data: js.Object,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ ItemCollection, scala.Unit | GeoJSONDelegate]
  ): ItemCollection | stdLib.Error = js.native
  def init(options: MapKitInitOptions): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
}

