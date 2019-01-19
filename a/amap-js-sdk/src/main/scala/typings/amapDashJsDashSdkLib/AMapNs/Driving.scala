package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Driving")
@js.native
class Driving () extends EventBindable {
  def this(options: amapDashJsDashSdkLib.Anon_Extensions) = this()
  def clear(): scala.Unit = js.native
  def clearAvoidPolygons(): scala.Unit = js.native
  def clearAvoidRoad(): scala.Unit = js.native
  def getAvlidPolygons(): js.Array[js.Array[LngLat]] = js.native
  def getAvoidRoad(): java.lang.String = js.native
  def search(origin: LngLat, destination: LngLat): scala.Unit = js.native
  def search(origin: LngLat, destination: LngLat, opts: amapDashJsDashSdkLib.Anon_Waypoints): scala.Unit = js.native
  def search(
    origin: LngLat,
    destination: LngLat,
    opts: amapDashJsDashSdkLib.Anon_Waypoints,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | DrivingResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    point: js.Array[amapDashJsDashSdkLib.Anon_CityKeyword],
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | DrivingResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def searchOnAMAP(obj: amapDashJsDashSdkLib.Anon_Destination): scala.Unit = js.native
  def setAvoidPolygons(path: js.Array[js.Array[LngLat]]): scala.Unit = js.native
  def setAvoidRoad(road: java.lang.String): scala.Unit = js.native
  def setPolicy(policy: DrivingPolicy): scala.Unit = js.native
}

