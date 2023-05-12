package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityControl extends StObject {
  
  /**
    *  The description of a security control across standards. This typically summarizes how Security Hub evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific standard. 
    */
  var Description: NonEmptyString
  
  /**
    *  A link to Security Hub documentation that explains how to remediate a failed finding for a security control. 
    */
  var RemediationUrl: NonEmptyString
  
  /**
    *  The Amazon Resource Name (ARN) for a security control across standards, such as arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1. This parameter doesn't mention a specific standard. 
    */
  var SecurityControlArn: NonEmptyString
  
  /**
    *  The unique identifier of a security control across standards. Values for this field typically consist of an Amazon Web Service name and a number, such as APIGateway.3. 
    */
  var SecurityControlId: NonEmptyString
  
  /**
    *  The status of a security control based on the compliance status of its findings. For more information about how control status is determined, see Determining the overall status of a control from its findings in the Security Hub User Guide. 
    */
  var SecurityControlStatus: ControlStatus
  
  /**
    *  The severity of a security control. For more information about how Security Hub determines control severity, see Assigning severity to control findings in the Security Hub User Guide. 
    */
  var SeverityRating: typings.awsSdk.clientsSecurityhubMod.SeverityRating
  
  /**
    * The title of a security control. 
    */
  var Title: NonEmptyString
}
object SecurityControl {
  
  inline def apply(
    Description: NonEmptyString,
    RemediationUrl: NonEmptyString,
    SecurityControlArn: NonEmptyString,
    SecurityControlId: NonEmptyString,
    SecurityControlStatus: ControlStatus,
    SeverityRating: SeverityRating,
    Title: NonEmptyString
  ): SecurityControl = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RemediationUrl = RemediationUrl.asInstanceOf[js.Any], SecurityControlArn = SecurityControlArn.asInstanceOf[js.Any], SecurityControlId = SecurityControlId.asInstanceOf[js.Any], SecurityControlStatus = SecurityControlStatus.asInstanceOf[js.Any], SeverityRating = SeverityRating.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityControl] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setRemediationUrl(value: NonEmptyString): Self = StObject.set(x, "RemediationUrl", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlArn(value: NonEmptyString): Self = StObject.set(x, "SecurityControlArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setSecurityControlStatus(value: ControlStatus): Self = StObject.set(x, "SecurityControlStatus", value.asInstanceOf[js.Any])
    
    inline def setSeverityRating(value: SeverityRating): Self = StObject.set(x, "SeverityRating", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: NonEmptyString): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
