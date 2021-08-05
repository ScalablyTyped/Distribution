package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var method: String
  
  var path: String
  
  var protocol: String
  
  var sourceIp: String
  
  var userAgent: String
}
object Method {
  
  inline def apply(method: String, path: String, protocol: String, sourceIp: String, userAgent: String): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
