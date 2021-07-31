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
  
  @scala.inline
  def apply(accept: CallType, protocol: String, url: String): StatelessHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessHost]
  }
  
  @scala.inline
  implicit class StatelessHostMutableBuilder[Self <: StatelessHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: CallType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
