package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdentifier extends StObject {
  
  /**
    * The account with which the resource is associated.
    */
  var account: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The ID of the CA certificate used to authorize the certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  
  /**
    * The ID of the Amazon Cognito identity pool.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
  
  /**
    * The ARN of the identified device certificate.
    */
  var deviceCertificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the certificate attached to the resource.
    */
  var deviceCertificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The ARN of the IAM role that has overly permissive actions.
    */
  var iamRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The issuer certificate identifier.
    */
  var issuerCertificateIdentifier: js.UndefOr[IssuerCertificateIdentifier] = js.undefined
  
  /**
    * The version of the policy associated with the resource.
    */
  var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined
  
  /**
    * The ARN of the role alias that has overly permissive actions.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
}
object ResourceIdentifier {
  
  inline def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  
  extension [Self <: ResourceIdentifier](x: Self) {
    
    inline def setAccount(value: AwsAccountId): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCaCertificateId(value: CertificateId): Self = StObject.set(x, "caCertificateId", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateIdUndefined: Self = StObject.set(x, "caCertificateId", js.undefined)
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setCognitoIdentityPoolIdUndefined: Self = StObject.set(x, "cognitoIdentityPoolId", js.undefined)
    
    inline def setDeviceCertificateArn(value: CertificateArn): Self = StObject.set(x, "deviceCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceCertificateArnUndefined: Self = StObject.set(x, "deviceCertificateArn", js.undefined)
    
    inline def setDeviceCertificateId(value: CertificateId): Self = StObject.set(x, "deviceCertificateId", value.asInstanceOf[js.Any])
    
    inline def setDeviceCertificateIdUndefined: Self = StObject.set(x, "deviceCertificateId", js.undefined)
    
    inline def setIamRoleArn(value: RoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
    
    inline def setIssuerCertificateIdentifier(value: IssuerCertificateIdentifier): Self = StObject.set(x, "issuerCertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIssuerCertificateIdentifierUndefined: Self = StObject.set(x, "issuerCertificateIdentifier", js.undefined)
    
    inline def setPolicyVersionIdentifier(value: PolicyVersionIdentifier): Self = StObject.set(x, "policyVersionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionIdentifierUndefined: Self = StObject.set(x, "policyVersionIdentifier", js.undefined)
    
    inline def setRoleAliasArn(value: RoleAliasArn): Self = StObject.set(x, "roleAliasArn", value.asInstanceOf[js.Any])
    
    inline def setRoleAliasArnUndefined: Self = StObject.set(x, "roleAliasArn", js.undefined)
  }
}
