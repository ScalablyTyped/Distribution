package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedStandardsControlAssociationUpdate extends StObject {
  
  /**
    * The error code for the unprocessed update of the control's enablement status in the specified standard.
    */
  var ErrorCode: UnprocessedErrorCode
  
  /**
    * The reason why a control's enablement status in the specified standard couldn't be updated. 
    */
  var ErrorReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of control and standard associations for which an update failed when calling BatchUpdateStandardsControlAssociations. 
    */
  var StandardsControlAssociationUpdate: typings.awsSdk.clientsSecurityhubMod.StandardsControlAssociationUpdate
}
object UnprocessedStandardsControlAssociationUpdate {
  
  inline def apply(
    ErrorCode: UnprocessedErrorCode,
    StandardsControlAssociationUpdate: StandardsControlAssociationUpdate
  ): UnprocessedStandardsControlAssociationUpdate = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], StandardsControlAssociationUpdate = StandardsControlAssociationUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedStandardsControlAssociationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedStandardsControlAssociationUpdate] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: UnprocessedErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorReason(value: NonEmptyString): Self = StObject.set(x, "ErrorReason", value.asInstanceOf[js.Any])
    
    inline def setErrorReasonUndefined: Self = StObject.set(x, "ErrorReason", js.undefined)
    
    inline def setStandardsControlAssociationUpdate(value: StandardsControlAssociationUpdate): Self = StObject.set(x, "StandardsControlAssociationUpdate", value.asInstanceOf[js.Any])
  }
}
