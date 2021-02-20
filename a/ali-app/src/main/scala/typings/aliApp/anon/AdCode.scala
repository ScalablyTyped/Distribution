package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdCode extends StObject {
  
  var adCode: String = js.native
  
  var city: String = js.native
}
object AdCode {
  
  @scala.inline
  def apply(adCode: String, city: String): AdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCode]
  }
  
  @scala.inline
  implicit class AdCodeMutableBuilder[Self <: AdCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
  }
}
