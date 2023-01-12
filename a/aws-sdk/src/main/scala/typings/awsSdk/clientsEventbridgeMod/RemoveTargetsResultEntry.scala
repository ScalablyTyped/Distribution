package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTargetsResultEntry extends StObject {
  
  /**
    * The error code that indicates why the target removal failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ErrorCode] = js.undefined
  
  /**
    * The error message that explains why the target removal failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ErrorMessage] = js.undefined
  
  /**
    * The ID of the target.
    */
  var TargetId: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.TargetId] = js.undefined
}
object RemoveTargetsResultEntry {
  
  inline def apply(): RemoveTargetsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetsResultEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTargetsResultEntry] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
