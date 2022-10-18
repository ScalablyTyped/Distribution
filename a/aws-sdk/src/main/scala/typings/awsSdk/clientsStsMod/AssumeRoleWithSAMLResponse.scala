package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleWithSAMLResponse extends StObject {
  
  /**
    * The identifiers for the temporary security credentials that the operation returns.
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdk.clientsStsMod.AssumedRoleUser] = js.undefined
  
  /**
    *  The value of the Recipient attribute of the SubjectConfirmationData element of the SAML assertion. 
    */
  var Audience: js.UndefOr[typings.awsSdk.clientsStsMod.Audience] = js.undefined
  
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.clientsStsMod.Credentials] = js.undefined
  
  /**
    * The value of the Issuer element of the SAML assertion.
    */
  var Issuer: js.UndefOr[typings.awsSdk.clientsStsMod.Issuer] = js.undefined
  
  /**
    * A hash value based on the concatenation of the following:   The Issuer response value.   The Amazon Web Services account ID.   The friendly name (the last part of the ARN) of the SAML provider in IAM.   The combination of NameQualifier and Subject can be used to uniquely identify a federated user. The following pseudocode shows how the hash value is calculated:  BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) ) 
    */
  var NameQualifier: js.UndefOr[typings.awsSdk.clientsStsMod.NameQualifier] = js.undefined
  
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  
  /**
    * The value in the SourceIdentity attribute in the SAML assertion.  You can require users to set a source identity value when they assume a role. You do this by using the sts:SourceIdentity condition key in a role trust policy. That way, actions that are taken with the role are associated with that user. After the source identity is set, the value cannot be changed. It is present in the request for all actions that are taken by the role and persists across chained role sessions. You can configure your SAML identity provider to use an attribute associated with your users, like user name or email, as the source identity when calling AssumeRoleWithSAML. You do this by adding an attribute to the SAML assertion. For more information about using source identity, see Monitor and control actions taken with assumed roles in the IAM User Guide. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var SourceIdentity: js.UndefOr[sourceIdentityType] = js.undefined
  
  /**
    * The value of the NameID element in the Subject element of the SAML assertion.
    */
  var Subject: js.UndefOr[typings.awsSdk.clientsStsMod.Subject] = js.undefined
  
  /**
    *  The format of the name ID, as defined by the Format attribute in the NameID element of the SAML assertion. Typical examples of the format are transient or persistent.   If the format includes the prefix urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as transient. If the format includes any other prefix, the format is returned with no modifications.
    */
  var SubjectType: js.UndefOr[typings.awsSdk.clientsStsMod.SubjectType] = js.undefined
}
object AssumeRoleWithSAMLResponse {
  
  inline def apply(): AssumeRoleWithSAMLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
  }
  
  extension [Self <: AssumeRoleWithSAMLResponse](x: Self) {
    
    inline def setAssumedRoleUser(value: AssumedRoleUser): Self = StObject.set(x, "AssumedRoleUser", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleUserUndefined: Self = StObject.set(x, "AssumedRoleUser", js.undefined)
    
    inline def setAudience(value: Audience): Self = StObject.set(x, "Audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "Audience", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    inline def setNameQualifier(value: NameQualifier): Self = StObject.set(x, "NameQualifier", value.asInstanceOf[js.Any])
    
    inline def setNameQualifierUndefined: Self = StObject.set(x, "NameQualifier", js.undefined)
    
    inline def setPackedPolicySize(value: nonNegativeIntegerType): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    inline def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
    
    inline def setSourceIdentity(value: sourceIdentityType): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectType(value: SubjectType): Self = StObject.set(x, "SubjectType", value.asInstanceOf[js.Any])
    
    inline def setSubjectTypeUndefined: Self = StObject.set(x, "SubjectType", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
