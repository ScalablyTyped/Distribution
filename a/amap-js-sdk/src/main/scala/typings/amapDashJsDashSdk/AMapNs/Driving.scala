package typings.amapDashJsDashSdk.AMapNs

import typings.amapDashJsDashSdk.Anon_CityKeyword
import typings.amapDashJsDashSdk.Anon_Destination
import typings.amapDashJsDashSdk.Anon_Extensions
import typings.amapDashJsDashSdk.Anon_Waypoints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Driving")
@js.native
class Driving () extends EventBindable {
  def this(options: Anon_Extensions) = this()
  def clear(): Unit = js.native
  def clearAvoidPolygons(): Unit = js.native
  def clearAvoidRoad(): Unit = js.native
  def getAvlidPolygons(): js.Array[js.Array[LngLat]] = js.native
  def getAvoidRoad(): String = js.native
  def search(origin: LngLat, destination: LngLat): Unit = js.native
  def search(origin: LngLat, destination: LngLat, opts: Anon_Waypoints): Unit = js.native
  def search(
    origin: LngLat,
    destination: LngLat,
    opts: Anon_Waypoints,
    callback: js.Function2[/* status */ String, /* result */ String | DrivingResult, Unit]
  ): Unit = js.native
  def search(
    point: js.Array[Anon_CityKeyword],
    callback: js.Function2[/* status */ String, /* result */ String | DrivingResult, Unit]
  ): Unit = js.native
  def searchOnAMAP(obj: Anon_Destination): Unit = js.native
  def setAvoidPolygons(path: js.Array[js.Array[LngLat]]): Unit = js.native
  def setAvoidRoad(road: String): Unit = js.native
  def setPolicy(policy: DrivingPolicy): Unit = js.native
}

