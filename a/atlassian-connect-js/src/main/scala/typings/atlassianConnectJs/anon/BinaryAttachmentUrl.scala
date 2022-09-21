package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryAttachmentUrl extends StObject {
  
  /**
    * If this is set to true, the developer is specifying a request for an attachment consisting of binary data (e.g. an image) and the format of the response will be set to "arraybuffer".
    */
  var binaryAttachment: `true`
  
  /**
    * The url to request from the host application, relative to the host's context path
    */
  var url: String
}
object BinaryAttachmentUrl {
  
  inline def apply(url: String): BinaryAttachmentUrl = {
    val __obj = js.Dynamic.literal(binaryAttachment = true, url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryAttachmentUrl]
  }
  
  extension [Self <: BinaryAttachmentUrl](x: Self) {
    
    inline def setBinaryAttachment(value: `true`): Self = StObject.set(x, "binaryAttachment", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
