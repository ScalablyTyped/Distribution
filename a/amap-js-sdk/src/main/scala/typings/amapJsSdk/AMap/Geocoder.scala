package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder extends StObject {
  
  def getAddress(
    location: js.Array[LngLat],
    callback: js.Function2[
      /* status */ js.UndefOr[String], 
      /* result */ js.UndefOr[String | ReGeocodeResult], 
      Unit
    ]
  ): Unit = js.native
  def getAddress(
    location: LngLat,
    callback: js.Function2[
      /* status */ js.UndefOr[String], 
      /* result */ js.UndefOr[String | ReGeocodeResult], 
      Unit
    ]
  ): Unit = js.native
  
  def getLocation(address: String): Unit = js.native
  def getLocation(
    address: String,
    callback: js.Function2[
      /* status */ js.UndefOr[String], 
      /* result */ js.UndefOr[String | GeocodeResult], 
      Unit
    ]
  ): Unit = js.native
  
  def setCity(city: String): Unit = js.native
}
