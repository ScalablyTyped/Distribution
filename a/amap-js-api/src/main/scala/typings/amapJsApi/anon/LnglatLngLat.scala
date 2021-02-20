package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LnglatLngLat extends StObject {
  
  var lnglat: LngLat = js.native
}
object LnglatLngLat {
  
  @scala.inline
  def apply(lnglat: LngLat): LnglatLngLat = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LnglatLngLat]
  }
  
  @scala.inline
  implicit class LnglatLngLatMutableBuilder[Self <: LnglatLngLat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
  }
}
