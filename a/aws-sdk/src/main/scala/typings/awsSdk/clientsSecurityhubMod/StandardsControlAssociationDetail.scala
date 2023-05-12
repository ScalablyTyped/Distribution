package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsControlAssociationDetail extends StObject {
  
  /**
    *  Specifies whether a control is enabled or disabled in a specified standard. 
    */
  var AssociationStatus: typings.awsSdk.clientsSecurityhubMod.AssociationStatus
  
  /**
    *  The requirement that underlies a control in the compliance framework related to the standard. 
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.undefined
  
  /**
    *  The ARN of a security control across standards, such as arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1. This parameter doesn't mention a specific standard. 
    */
  var SecurityControlArn: NonEmptyString
  
  /**
    *  The unique identifier of a security control across standards. Values for this field typically consist of an Amazon Web Service name and a number, such as APIGateway.3. 
    */
  var SecurityControlId: NonEmptyString
  
  /**
    *  The Amazon Resource Name (ARN) of a security standard. 
    */
  var StandardsArn: NonEmptyString
  
  /**
    *  Provides the input parameter that Security Hub uses to call the UpdateStandardsControl API. This API can be used to enable or disable a control in a specified standard. 
    */
  var StandardsControlArns: js.UndefOr[StandardsControlArnList] = js.undefined
  
  /**
    *  The description of a control. This typically summarizes how Security Hub evaluates the control and the conditions under which it produces a failed finding. This parameter may reference a specific standard. 
    */
  var StandardsControlDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The title of a control. This field may reference a specific standard. 
    */
  var StandardsControlTitle: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The time at which the enablement status of the control in the specified standard was last updated. 
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The reason for updating the enablement status of a control in a specified standard. 
    */
  var UpdatedReason: js.UndefOr[NonEmptyString] = js.undefined
}
object StandardsControlAssociationDetail {
  
  inline def apply(
    AssociationStatus: AssociationStatus,
    SecurityControlArn: NonEmptyString,
    SecurityControlId: NonEmptyString,
    StandardsArn: NonEmptyString
  ): StandardsControlAssociationDetail = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], SecurityControlArn = SecurityControlArn.asInstanceOf[js.Any], SecurityControlId = SecurityControlId.asInstanceOf[js.Any], StandardsArn = StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsControlAssociationDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardsControlAssociationDetail] (val x: Self) extends AnyVal {
    
    inline def setAssociationStatus(value: AssociationStatus): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setRelatedRequirements(value: RelatedRequirementsList): Self = StObject.set(x, "RelatedRequirements", value.asInstanceOf[js.Any])
    
    inline def setRelatedRequirementsUndefined: Self = StObject.set(x, "RelatedRequirements", js.undefined)
    
    inline def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = StObject.set(x, "RelatedRequirements", js.Array(value*))
    
    inline def setSecurityControlArn(value: NonEmptyString): Self = StObject.set(x, "SecurityControlArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlArns(value: StandardsControlArnList): Self = StObject.set(x, "StandardsControlArns", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlArnsUndefined: Self = StObject.set(x, "StandardsControlArns", js.undefined)
    
    inline def setStandardsControlArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "StandardsControlArns", js.Array(value*))
    
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
