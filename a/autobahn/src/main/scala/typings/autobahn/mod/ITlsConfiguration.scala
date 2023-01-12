package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITlsConfiguration extends StObject {
  
  var ca: String
  
  var cert: String
  
  var key: String
}
object ITlsConfiguration {
  
  inline def apply(ca: String, cert: String, key: String): ITlsConfiguration = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITlsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITlsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
