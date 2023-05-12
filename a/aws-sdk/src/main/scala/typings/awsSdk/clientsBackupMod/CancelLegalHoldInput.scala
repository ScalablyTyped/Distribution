package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelLegalHoldInput extends StObject {
  
  /**
    * String describing the reason for removing the legal hold.
    */
  var CancelDescription: String
  
  /**
    * Legal hold ID required to remove the specified legal hold on a recovery point.
    */
  var LegalHoldId: String
  
  /**
    * The integer amount in days specifying amount of days after this API operation to remove legal hold.
    */
  var RetainRecordInDays: js.UndefOr[Long_] = js.undefined
}
object CancelLegalHoldInput {
  
  inline def apply(CancelDescription: String, LegalHoldId: String): CancelLegalHoldInput = {
    val __obj = js.Dynamic.literal(CancelDescription = CancelDescription.asInstanceOf[js.Any], LegalHoldId = LegalHoldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelLegalHoldInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelLegalHoldInput] (val x: Self) extends AnyVal {
    
    inline def setCancelDescription(value: String): Self = StObject.set(x, "CancelDescription", value.asInstanceOf[js.Any])
    
    inline def setLegalHoldId(value: String): Self = StObject.set(x, "LegalHoldId", value.asInstanceOf[js.Any])
    
    inline def setRetainRecordInDays(value: Long_): Self = StObject.set(x, "RetainRecordInDays", value.asInstanceOf[js.Any])
    
    inline def setRetainRecordInDaysUndefined: Self = StObject.set(x, "RetainRecordInDays", js.undefined)
  }
}
