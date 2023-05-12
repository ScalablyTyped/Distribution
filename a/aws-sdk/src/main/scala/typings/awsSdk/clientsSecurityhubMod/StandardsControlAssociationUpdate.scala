package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsControlAssociationUpdate extends StObject {
  
  /**
    * The desired enablement status of the control in the standard.
    */
  var AssociationStatus: typings.awsSdk.clientsSecurityhubMod.AssociationStatus
  
  /**
    * The unique identifier for the security control whose enablement status you want to update.
    */
  var SecurityControlId: NonEmptyString
  
  /**
    * The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement status.
    */
  var StandardsArn: NonEmptyString
  
  /**
    * The reason for updating the control's enablement status in the standard.
    */
  var UpdatedReason: js.UndefOr[NonEmptyString] = js.undefined
}
object StandardsControlAssociationUpdate {
  
  inline def apply(
    AssociationStatus: AssociationStatus,
    SecurityControlId: NonEmptyString,
    StandardsArn: NonEmptyString
  ): StandardsControlAssociationUpdate = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], SecurityControlId = SecurityControlId.asInstanceOf[js.Any], StandardsArn = StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsControlAssociationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardsControlAssociationUpdate] (val x: Self) extends AnyVal {
    
    inline def setAssociationStatus(value: AssociationStatus): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    inline def setUpdatedReason(value: NonEmptyString): Self = StObject.set(x, "UpdatedReason", value.asInstanceOf[js.Any])
    
    inline def setUpdatedReasonUndefined: Self = StObject.set(x, "UpdatedReason", js.undefined)
  }
}
