package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryAttachment extends StObject {
  
  /**
    * If this is set to true, the developer is specifying a request for an attachment consisting of binary data (e.g. an image) and the format of the response will be set to "arraybuffer".
    */
  var binaryAttachment: js.UndefOr[`false`] = js.undefined
}
object BinaryAttachment {
  
  inline def apply(): BinaryAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryAttachment] (val x: Self) extends AnyVal {
    
    inline def setBinaryAttachment(value: `false`): Self = StObject.set(x, "binaryAttachment", value.asInstanceOf[js.Any])
    
    inline def setBinaryAttachmentUndefined: Self = StObject.set(x, "binaryAttachment", js.undefined)
  }
}
