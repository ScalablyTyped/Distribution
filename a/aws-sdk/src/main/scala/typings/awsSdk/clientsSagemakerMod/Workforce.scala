package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workforce extends StObject {
  
  /**
    * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to a single  Amazon Cognito user pool.
    */
  var CognitoConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CognitoConfig] = js.undefined
  
  /**
    * The date that the workforce is created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason your workforce failed.
    */
  var FailureReason: js.UndefOr[WorkforceFailureReason] = js.undefined
  
  /**
    * The most recent date that was used to successfully add one or more IP address ranges (CIDRs) to a private workforce's allow list.
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration of an OIDC Identity Provider (IdP) private workforce.
    */
  var OidcConfig: js.UndefOr[OidcConfigForResponse] = js.undefined
  
  /**
    * A list of one to ten IP address ranges (CIDRs) to be added to the workforce allow list. By default, a workforce isn't restricted to specific IP addresses.
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceIpConfig] = js.undefined
  
  /**
    * The status of your workforce.
    */
  var Status: js.UndefOr[WorkforceStatus] = js.undefined
  
  /**
    * The subdomain for your OIDC Identity Provider.
    */
  var SubDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the private workforce.
    */
  var WorkforceArn: typings.awsSdk.clientsSagemakerMod.WorkforceArn
  
  /**
    * The name of the private workforce.
    */
  var WorkforceName: typings.awsSdk.clientsSagemakerMod.WorkforceName
  
  /**
    * The configuration of a VPC workforce.
    */
  var WorkforceVpcConfig: js.UndefOr[WorkforceVpcConfigResponse] = js.undefined
}
object Workforce {
  
  inline def apply(WorkforceArn: WorkforceArn, WorkforceName: WorkforceName): Workforce = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any], WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workforce]
  }
  
  extension [Self <: Workforce](x: Self) {
    
    inline def setCognitoConfig(value: CognitoConfig): Self = StObject.set(x, "CognitoConfig", value.asInstanceOf[js.Any])
    
    inline def setCognitoConfigUndefined: Self = StObject.set(x, "CognitoConfig", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setFailureReason(value: WorkforceFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setOidcConfig(value: OidcConfigForResponse): Self = StObject.set(x, "OidcConfig", value.asInstanceOf[js.Any])
    
    inline def setOidcConfigUndefined: Self = StObject.set(x, "OidcConfig", js.undefined)
    
    inline def setSourceIpConfig(value: SourceIpConfig): Self = StObject.set(x, "SourceIpConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceIpConfigUndefined: Self = StObject.set(x, "SourceIpConfig", js.undefined)
    
    inline def setStatus(value: WorkforceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubDomain(value: String): Self = StObject.set(x, "SubDomain", value.asInstanceOf[js.Any])
    
    inline def setSubDomainUndefined: Self = StObject.set(x, "SubDomain", js.undefined)
    
    inline def setWorkforceArn(value: WorkforceArn): Self = StObject.set(x, "WorkforceArn", value.asInstanceOf[js.Any])
    
    inline def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
    
    inline def setWorkforceVpcConfig(value: WorkforceVpcConfigResponse): Self = StObject.set(x, "WorkforceVpcConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkforceVpcConfigUndefined: Self = StObject.set(x, "WorkforceVpcConfig", js.undefined)
  }
}
