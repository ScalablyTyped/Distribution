package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReGeocodeResult extends StObject {
  
  var info: String = js.native
  
  var regeocode: ReGeocode = js.native
}
object ReGeocodeResult {
  
  @scala.inline
  def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocode = regeocode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocodeResult]
  }
  
  @scala.inline
  implicit class ReGeocodeResultMutableBuilder[Self <: ReGeocodeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegeocode(value: ReGeocode): Self = StObject.set(x, "regeocode", value.asInstanceOf[js.Any])
  }
}
