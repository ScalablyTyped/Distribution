package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusReason extends StObject {
  
  /**
    * The corresponding description for the status reason code.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A code that represents a reason for the control status. For the list of status reason codes and their meanings, see Standards-related information in the ASFF in the Security Hub User Guide. 
    */
  var ReasonCode: NonEmptyString
}
object StatusReason {
  
  inline def apply(ReasonCode: NonEmptyString): StatusReason = {
    val __obj = js.Dynamic.literal(ReasonCode = ReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
  
  extension [Self <: StatusReason](x: Self) {
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setReasonCode(value: NonEmptyString): Self = StObject.set(x, "ReasonCode", value.asInstanceOf[js.Any])
  }
}
