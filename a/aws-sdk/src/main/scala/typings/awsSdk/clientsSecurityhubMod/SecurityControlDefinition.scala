package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityControlDefinition extends StObject {
  
  /**
    *  Specifies whether a security control is available in the current Amazon Web Services Region. 
    */
  var CurrentRegionAvailability: RegionAvailabilityStatus
  
  /**
    *  The description of a security control across standards. This typically summarizes how Security Hub evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific standard. 
    */
  var Description: NonEmptyString
  
  /**
    *  A link to Security Hub documentation that explains how to remediate a failed finding for a security control. 
    */
  var RemediationUrl: NonEmptyString
  
  /**
    *  The unique identifier of a security control across standards. Values for this field typically consist of an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from SecurityControlArn, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN references the security control ID (for example, arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3). 
    */
  var SecurityControlId: NonEmptyString
  
  /**
    *  The severity of a security control. For more information about how Security Hub determines control severity, see Assigning severity to control findings in the Security Hub User Guide. 
    */
  var SeverityRating: typings.awsSdk.clientsSecurityhubMod.SeverityRating
  
  /**
    *  The title of a security control. 
    */
  var Title: NonEmptyString
}
object SecurityControlDefinition {
  
  inline def apply(
    CurrentRegionAvailability: RegionAvailabilityStatus,
    Description: NonEmptyString,
    RemediationUrl: NonEmptyString,
    SecurityControlId: NonEmptyString,
    SeverityRating: SeverityRating,
    Title: NonEmptyString
  ): SecurityControlDefinition = {
    val __obj = js.Dynamic.literal(CurrentRegionAvailability = CurrentRegionAvailability.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], RemediationUrl = RemediationUrl.asInstanceOf[js.Any], SecurityControlId = SecurityControlId.asInstanceOf[js.Any], SeverityRating = SeverityRating.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityControlDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityControlDefinition] (val x: Self) extends AnyVal {
    
    inline def setCurrentRegionAvailability(value: RegionAvailabilityStatus): Self = StObject.set(x, "CurrentRegionAvailability", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setRemediationUrl(value: NonEmptyString): Self = StObject.set(x, "RemediationUrl", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setSeverityRating(value: SeverityRating): Self = StObject.set(x, "SeverityRating", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: NonEmptyString): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
