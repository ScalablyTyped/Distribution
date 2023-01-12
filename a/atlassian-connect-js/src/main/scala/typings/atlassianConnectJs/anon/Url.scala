package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  /**
    * If this is set to true, the developer is specifying a request for an attachment consisting of binary data (e.g. an image) and the format of the response will be set to "arraybuffer".
    */
  var binaryAttachment: js.UndefOr[`false`] = js.undefined
  
  /**
    * The url to request from the host application, relative to the host's context path
    */
  var url: String
}
object Url {
  
  inline def apply(url: String): Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
    
    inline def setBinaryAttachment(value: `false`): Self = StObject.set(x, "binaryAttachment", value.asInstanceOf[js.Any])
    
    inline def setBinaryAttachmentUndefined: Self = StObject.set(x, "binaryAttachment", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
