package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsControl extends StObject {
  
  /**
    * The identifier of the security standard control.
    */
  var ControlId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the security standard control. Indicates whether the control is enabled or disabled. Security Hub does not check against disabled controls.
    */
  var ControlStatus: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.ControlStatus] = js.undefined
  
  /**
    * The date and time that the status of the security standard control was most recently updated.
    */
  var ControlStatusUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The longer description of the security standard control. Provides information about what the control is checking for.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The reason provided for the most recent change in status for the control.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of requirements that are related to this control.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.undefined
  
  /**
    * A link to remediation information for the control in the Security Hub user documentation.
    */
  var RemediationUrl: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The severity of findings generated from this security standard control. The finding severity is based on an assessment of how easy it would be to compromise Amazon Web Services resources if the issue is detected.
    */
  var SeverityRating: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.SeverityRating] = js.undefined
  
  /**
    * The ARN of the security standard control.
    */
  var StandardsControlArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The title of the security standard control.
    */
  var Title: js.UndefOr[NonEmptyString] = js.undefined
}
object StandardsControl {
  
  inline def apply(): StandardsControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardsControl]
  }
  
  extension [Self <: StandardsControl](x: Self) {
    
    inline def setControlId(value: NonEmptyString): Self = StObject.set(x, "ControlId", value.asInstanceOf[js.Any])
    
    inline def setControlIdUndefined: Self = StObject.set(x, "ControlId", js.undefined)
    
    inline def setControlStatus(value: ControlStatus): Self = StObject.set(x, "ControlStatus", value.asInstanceOf[js.Any])
    
    inline def setControlStatusUndefined: Self = StObject.set(x, "ControlStatus", js.undefined)
    
    inline def setControlStatusUpdatedAt(value: js.Date): Self = StObject.set(x, "ControlStatusUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setControlStatusUpdatedAtUndefined: Self = StObject.set(x, "ControlStatusUpdatedAt", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisabledReason(value: NonEmptyString): Self = StObject.set(x, "DisabledReason", value.asInstanceOf[js.Any])
    
    inline def setDisabledReasonUndefined: Self = StObject.set(x, "DisabledReason", js.undefined)
    
    inline def setRelatedRequirements(value: RelatedRequirementsList): Self = StObject.set(x, "RelatedRequirements", value.asInstanceOf[js.Any])
    
    inline def setRelatedRequirementsUndefined: Self = StObject.set(x, "RelatedRequirements", js.undefined)
    
    inline def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = StObject.set(x, "RelatedRequirements", js.Array(value*))
    
    inline def setRemediationUrl(value: NonEmptyString): Self = StObject.set(x, "RemediationUrl", value.asInstanceOf[js.Any])
    
    inline def setRemediationUrlUndefined: Self = StObject.set(x, "RemediationUrl", js.undefined)
    
    inline def setSeverityRating(value: SeverityRating): Self = StObject.set(x, "SeverityRating", value.asInstanceOf[js.Any])
    
    inline def setSeverityRatingUndefined: Self = StObject.set(x, "SeverityRating", js.undefined)
    
    inline def setStandardsControlArn(value: NonEmptyString): Self = StObject.set(x, "StandardsControlArn", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlArnUndefined: Self = StObject.set(x, "StandardsControlArn", js.undefined)
    
    inline def setTitle(value: NonEmptyString): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
