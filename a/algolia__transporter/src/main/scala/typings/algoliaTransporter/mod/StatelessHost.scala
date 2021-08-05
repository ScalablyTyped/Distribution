package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessHost extends StObject {
  
  /**
    * The type of the host.
    */
  val accept: CallType
  
  /**
    * The protocol of the stateless host. Between `http` and `https`.
    */
  val protocol: String
  
  /**
    * The url, without protocol.
    */
  val url: String
}
object StatelessHost {
  
  inline def apply(accept: CallType, protocol: String, url: String): StatelessHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessHost]
  }
  
  extension [Self <: StatelessHost](x: Self) {
    
    inline def setAccept(value: CallType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
