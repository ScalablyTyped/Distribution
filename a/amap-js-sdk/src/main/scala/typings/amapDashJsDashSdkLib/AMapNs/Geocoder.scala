package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geocoder")
@js.native
class Geocoder () extends js.Object {
  def this(opts: amapDashJsDashSdkLib.Anon_Batch) = this()
  def getAddress(
    location: LngLat,
    callback: js.Function2[
      /* status */ js.UndefOr[java.lang.String], 
      /* result */ js.UndefOr[java.lang.String | ReGeocodeResult], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getAddress(
    location: js.Array[LngLat],
    callback: js.Function2[
      /* status */ js.UndefOr[java.lang.String], 
      /* result */ js.UndefOr[java.lang.String | ReGeocodeResult], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLocation(address: java.lang.String): scala.Unit = js.native
  def getLocation(
    address: java.lang.String,
    callback: js.Function2[
      /* status */ js.UndefOr[java.lang.String], 
      /* result */ js.UndefOr[java.lang.String | GeocodeResult], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setCity(city: java.lang.String): scala.Unit = js.native
}

