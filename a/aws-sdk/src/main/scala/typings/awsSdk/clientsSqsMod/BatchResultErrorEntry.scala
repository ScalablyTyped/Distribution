package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchResultErrorEntry extends StObject {
  
  /**
    * An error code representing why the action failed on this entry.
    */
  var Code: String
  
  /**
    * The Id of an entry in a batch request.
    */
  var Id: String
  
  /**
    * A message explaining why the action failed on this entry.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the error happened due to the caller of the batch API action.
    */
  var SenderFault: Boolean
}
object BatchResultErrorEntry {
  
  inline def apply(Code: String, Id: String, SenderFault: Boolean): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SenderFault = SenderFault.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
  
  extension [Self <: BatchResultErrorEntry](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSenderFault(value: Boolean): Self = StObject.set(x, "SenderFault", value.asInstanceOf[js.Any])
  }
}
