package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplunkDomain extends StObject {
  
  var splunkDomain: String
  
  var splunkPort: String
  
  var splunkSecure: Boolean
  
  var splunkToken: String
}
object SplunkDomain {
  
  inline def apply(splunkDomain: String, splunkPort: String, splunkSecure: Boolean, splunkToken: String): SplunkDomain = {
    val __obj = js.Dynamic.literal(splunkDomain = splunkDomain.asInstanceOf[js.Any], splunkPort = splunkPort.asInstanceOf[js.Any], splunkSecure = splunkSecure.asInstanceOf[js.Any], splunkToken = splunkToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplunkDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplunkDomain] (val x: Self) extends AnyVal {
    
    inline def setSplunkDomain(value: String): Self = StObject.set(x, "splunkDomain", value.asInstanceOf[js.Any])
    
    inline def setSplunkPort(value: String): Self = StObject.set(x, "splunkPort", value.asInstanceOf[js.Any])
    
    inline def setSplunkSecure(value: Boolean): Self = StObject.set(x, "splunkSecure", value.asInstanceOf[js.Any])
    
    inline def setSplunkToken(value: String): Self = StObject.set(x, "splunkToken", value.asInstanceOf[js.Any])
  }
}
