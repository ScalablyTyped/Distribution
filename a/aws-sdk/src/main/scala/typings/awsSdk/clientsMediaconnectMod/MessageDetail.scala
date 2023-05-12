package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDetail extends StObject {
  
  /**
    * The error code.
    */
  var Code: string
  
  /**
    * The specific error message that MediaConnect returns to help you understand the reason that the request did not succeed.
    */
  var Message: string
  
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[string] = js.undefined
}
object MessageDetail {
  
  inline def apply(Code: string, Message: string): MessageDetail = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageDetail] (val x: Self) extends AnyVal {
    
    inline def setCode(value: string): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: string): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}
