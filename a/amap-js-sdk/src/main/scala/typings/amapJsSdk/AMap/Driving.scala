package typings.amapJsSdk.AMap

import typings.amapJsSdk.anon.Destination
import typings.amapJsSdk.anon.Keyword
import typings.amapJsSdk.anon.Waypoints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Driving extends EventBindable {
  def clear(): Unit = js.native
  def clearAvoidPolygons(): Unit = js.native
  def clearAvoidRoad(): Unit = js.native
  def getAvlidPolygons(): js.Array[js.Array[LngLat]] = js.native
  def getAvoidRoad(): String = js.native
  def search(origin: LngLat, destination: LngLat): Unit = js.native
  def search(origin: LngLat, destination: LngLat, opts: Waypoints): Unit = js.native
  def search(
    origin: LngLat,
    destination: LngLat,
    opts: Waypoints,
    callback: js.Function2[/* status */ String, /* result */ String | DrivingResult, Unit]
  ): Unit = js.native
  def search(
    point: js.Array[Keyword],
    callback: js.Function2[/* status */ String, /* result */ String | DrivingResult, Unit]
  ): Unit = js.native
  def searchOnAMAP(obj: Destination): Unit = js.native
  def setAvoidPolygons(path: js.Array[js.Array[LngLat]]): Unit = js.native
  def setAvoidRoad(road: String): Unit = js.native
  def setPolicy(policy: DrivingPolicy): Unit = js.native
}

