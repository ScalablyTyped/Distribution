package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LnglatLngLat extends StObject {
  
  var lnglat: LngLat
}
object LnglatLngLat {
  
  inline def apply(lnglat: LngLat): LnglatLngLat = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LnglatLngLat]
  }
  
  extension [Self <: LnglatLngLat](x: Self) {
    
    inline def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
  }
}
