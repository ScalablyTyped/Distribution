package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compliance extends StObject {
  
  /**
    * The enabled security standards in which a security control is currently enabled. 
    */
  var AssociatedStandards: js.UndefOr[AssociatedStandardsList] = js.undefined
  
  /**
    * For a control, the industry or regulatory framework requirements that are related to the control. The check for that control is aligned with these requirements.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.undefined
  
  /**
    *  The unique identifier of a control across standards. Values for this field typically consist of an Amazon Web Service and a number, such as APIGateway.5. 
    */
  var SecurityControlId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The result of a standards check. The valid values for Status are as follows.      PASSED - Standards check passed for all evaluated resources.    WARNING - Some information is missing or this check is not supported for your configuration.    FAILED - Standards check failed for at least one evaluated resource.    NOT_AVAILABLE - Check could not be performed due to a service outage, API error, or because the result of the Config evaluation was NOT_APPLICABLE. If the Config evaluation result was NOT_APPLICABLE, then after 3 days, Security Hub automatically archives the finding.    
    */
  var Status: js.UndefOr[ComplianceStatus] = js.undefined
  
  /**
    * For findings generated from controls, a list of reasons behind the value of Status. For the list of status reason codes and their meanings, see Standards-related information in the ASFF in the Security Hub User Guide. 
    */
  var StatusReasons: js.UndefOr[StatusReasonsList] = js.undefined
}
object Compliance {
  
  inline def apply(): Compliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compliance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compliance] (val x: Self) extends AnyVal {
    
    inline def setAssociatedStandards(value: AssociatedStandardsList): Self = StObject.set(x, "AssociatedStandards", value.asInstanceOf[js.Any])
    
    inline def setAssociatedStandardsUndefined: Self = StObject.set(x, "AssociatedStandards", js.undefined)
    
    inline def setAssociatedStandardsVarargs(value: AssociatedStandard*): Self = StObject.set(x, "AssociatedStandards", js.Array(value*))
    
    inline def setRelatedRequirements(value: RelatedRequirementsList): Self = StObject.set(x, "RelatedRequirements", value.asInstanceOf[js.Any])
    
    inline def setRelatedRequirementsUndefined: Self = StObject.set(x, "RelatedRequirements", js.undefined)
    
    inline def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = StObject.set(x, "RelatedRequirements", js.Array(value*))
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlIdUndefined: Self = StObject.set(x, "SecurityControlId", js.undefined)
    
    inline def setStatus(value: ComplianceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReasons(value: StatusReasonsList): Self = StObject.set(x, "StatusReasons", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonsUndefined: Self = StObject.set(x, "StatusReasons", js.undefined)
    
    inline def setStatusReasonsVarargs(value: StatusReason*): Self = StObject.set(x, "StatusReasons", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
