package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationError extends StObject {
  
  var info: String = js.native
}
object GeolocationError {
  
  @scala.inline
  def apply(info: String): GeolocationError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationError]
  }
  
  @scala.inline
  implicit class GeolocationErrorMutableBuilder[Self <: GeolocationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
