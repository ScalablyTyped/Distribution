package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsControlAssociationSummary extends StObject {
  
  /**
    *  The enablement status of a control in a specific standard. 
    */
  var AssociationStatus: typings.awsSdk.clientsSecurityhubMod.AssociationStatus
  
  /**
    *  The requirement that underlies this control in the compliance framework related to the standard. 
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.undefined
  
  /**
    *  The ARN of a control, such as arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1. This parameter doesn't mention a specific standard. 
    */
  var SecurityControlArn: NonEmptyString
  
  /**
    *  A unique standard-agnostic identifier for a control. Values for this field typically consist of an Amazon Web Service and a number, such as APIGateway.5. This field doesn't reference a specific standard. 
    */
  var SecurityControlId: NonEmptyString
  
  /**
    *  The Amazon Resource Name (ARN) of a standard. 
    */
  var StandardsArn: NonEmptyString
  
  /**
    *  The description of a control. This typically summarizes how Security Hub evaluates the control and the conditions under which it produces a failed finding. The parameter may reference a specific standard. 
    */
  var StandardsControlDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The title of a control. 
    */
  var StandardsControlTitle: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The last time that a control's enablement status in a specified standard was updated. 
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The reason for updating the control's enablement status in a specified standard. 
    */
  var UpdatedReason: js.UndefOr[NonEmptyString] = js.undefined
}
object StandardsControlAssociationSummary {
  
  inline def apply(
    AssociationStatus: AssociationStatus,
    SecurityControlArn: NonEmptyString,
    SecurityControlId: NonEmptyString,
    StandardsArn: NonEmptyString
  ): StandardsControlAssociationSummary = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], SecurityControlArn = SecurityControlArn.asInstanceOf[js.Any], SecurityControlId = SecurityControlId.asInstanceOf[js.Any], StandardsArn = StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsControlAssociationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardsControlAssociationSummary] (val x: Self) extends AnyVal {
    
    inline def setAssociationStatus(value: AssociationStatus): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setRelatedRequirements(value: RelatedRequirementsList): Self = StObject.set(x, "RelatedRequirements", value.asInstanceOf[js.Any])
    
    inline def setRelatedRequirementsUndefined: Self = StObject.set(x, "RelatedRequirements", js.undefined)
    
    inline def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = StObject.set(x, "RelatedRequirements", js.Array(value*))
    
    inline def setSecurityControlArn(value: NonEmptyString): Self = StObject.set(x, "SecurityControlArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlDescription(value: NonEmptyString): Self = StObject.set(x, "StandardsControlDescription", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlDescriptionUndefined: Self = StObject.set(x, "StandardsControlDescription", js.undefined)
    
    inline def setStandardsControlTitle(value: NonEmptyString): Self = StObject.set(x, "StandardsControlTitle", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlTitleUndefined: Self = StObject.set(x, "StandardsControlTitle", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setUpdatedReason(value: NonEmptyString): Self = StObject.set(x, "UpdatedReason", value.asInstanceOf[js.Any])
    
    inline def setUpdatedReasonUndefined: Self = StObject.set(x, "UpdatedReason", js.undefined)
  }
}
