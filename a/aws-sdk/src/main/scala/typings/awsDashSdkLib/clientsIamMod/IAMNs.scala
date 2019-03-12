package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iam", "IAM")
@js.native
object IAMNs extends js.Object {
  trait AccessKey extends js.Object {
    /**
      * The ID for this access key.
      */
    var AccessKeyId: accessKeyIdType
    /**
      * The date when the access key was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The secret key used to sign requests.
      */
    var SecretAccessKey: accessKeySecretType
    /**
      * The status of the access key. Active means that the key is valid for API calls, while Inactive means it is not. 
      */
    var Status: statusType
    /**
      * The name of the IAM user that the access key is associated with.
      */
    var UserName: userNameType
  }
  
  trait AccessKeyLastUsed extends js.Object {
    /**
      * The date and time, in ISO 8601 date-time format, when the access key was most recently used. This field is null in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM began tracking this information.   There is no sign-in data associated with the user  
      */
    var LastUsedDate: dateType
    /**
      * The AWS region where this access key was most recently used. The value for this field is "N/A" in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM began tracking this information.   There is no sign-in data associated with the user   For more information about AWS regions, see Regions and Endpoints in the Amazon Web Services General Reference.
      */
    var Region: stringType
    /**
      * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A" in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM started tracking this information.   There is no sign-in data associated with the user  
      */
    var ServiceName: stringType
  }
  
  trait AccessKeyMetadata extends js.Object {
    /**
      * The ID for this access key.
      */
    var AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined
    /**
      * The date when the access key was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The status of the access key. Active means that the key is valid for API calls; Inactive means it is not.
      */
    var Status: js.UndefOr[statusType] = js.undefined
    /**
      * The name of the IAM user that the key is associated with.
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
    /**
      * The client ID (also known as audience) to add to the IAM OpenID Connect provider resource.
      */
    var ClientID: clientIDType
    /**
      * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider resource to add the client ID to. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation.
      */
    var OpenIDConnectProviderArn: arnType
  }
  
  trait AddRoleToInstanceProfileRequest extends js.Object {
    /**
      * The name of the instance profile to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var InstanceProfileName: instanceProfileNameType
    /**
      * The name of the role to add. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait AddUserToGroupRequest extends js.Object {
    /**
      * The name of the group to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The name of the user to add. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait AttachGroupPolicyRequest extends js.Object {
    /**
      * The name (friendly name, not ARN) of the group to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
  }
  
  trait AttachRolePolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The name (friendly name, not ARN) of the role to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait AttachUserPolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The name (friendly name, not ARN) of the IAM user to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait AttachedPermissionsBoundary extends js.Object {
    /**
      *  The ARN of the policy used to set the permissions boundary for the user or role.
      */
    var PermissionsBoundaryArn: js.UndefOr[arnType] = js.undefined
    /**
      *  The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary for an entity. This data type can only have a value of Policy.
      */
    var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.undefined
  }
  
  trait AttachedPolicy extends js.Object {
    var PolicyArn: js.UndefOr[arnType] = js.undefined
    /**
      * The friendly name of the attached policy.
      */
    var PolicyName: js.UndefOr[policyNameType] = js.undefined
  }
  
  trait ChangePasswordRequest extends js.Object {
    /**
      * The new password. The new password must conform to the AWS account's password policy, if one exists. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the AWS Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
      */
    var NewPassword: passwordType
    /**
      * The IAM user's current password.
      */
    var OldPassword: passwordType
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ContextEntry extends js.Object {
    /**
      * The full name of a condition context key, including the service prefix. For example, aws:SourceIp or s3:VersionId.
      */
    var ContextKeyName: js.UndefOr[ContextKeyNameType] = js.undefined
    /**
      * The data type of the value (or values) specified in the ContextKeyValues parameter.
      */
    var ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.undefined
    /**
      * The value (or values, if the condition context key supports multiple values) to provide to the simulation when the key is referenced by a Condition element in an input policy.
      */
    var ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.undefined
  }
  
  trait CreateAccessKeyRequest extends js.Object {
    /**
      * The name of the IAM user that the new key will belong to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait CreateAccessKeyResponse extends js.Object {
    /**
      * A structure with details about the access key.
      */
    var AccessKey: awsDashSdkLib.clientsIamMod.IAMNs.AccessKey
  }
  
  trait CreateAccountAliasRequest extends js.Object {
    /**
      * The account alias to create. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
      */
    var AccountAlias: accountAliasType
  }
  
  trait CreateGroupRequest extends js.Object {
    /**
      * The name of the group to create. Do not include the path in this value. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-. The group name must be unique within the account. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
      */
    var GroupName: groupNameType
    /**
      *  The path to the group. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var Path: js.UndefOr[pathType] = js.undefined
  }
  
  trait CreateGroupResponse extends js.Object {
    /**
      * A structure containing details about the new group.
      */
    var Group: awsDashSdkLib.clientsIamMod.IAMNs.Group
  }
  
  trait CreateInstanceProfileRequest extends js.Object {
    /**
      * The name of the instance profile to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var InstanceProfileName: instanceProfileNameType
    /**
      *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var Path: js.UndefOr[pathType] = js.undefined
  }
  
  trait CreateInstanceProfileResponse extends js.Object {
    /**
      * A structure containing details about the new instance profile.
      */
    var InstanceProfile: awsDashSdkLib.clientsIamMod.IAMNs.InstanceProfile
  }
  
  trait CreateLoginProfileRequest extends js.Object {
    /**
      * The new password for the user. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the AWS Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
      */
    var Password: passwordType
    /**
      * Specifies whether the user is required to set a new password on next sign-in.
      */
    var PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
    /**
      * The name of the IAM user to create a password for. The user must already exist. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait CreateLoginProfileResponse extends js.Object {
    /**
      * A structure containing the user name and password create date.
      */
    var LoginProfile: awsDashSdkLib.clientsIamMod.IAMNs.LoginProfile
  }
  
  trait CreateOpenIDConnectProviderRequest extends js.Object {
    /**
      * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.) You can register multiple client IDs with the same provider. For example, you might have multiple applications that use the same OIDC provider. You cannot register more than 100 client IDs with a single IAM OIDC provider. There is no defined format for a client ID. The CreateOpenIDConnectProviderRequest operation accepts client IDs up to 255 characters long.
      */
    var ClientIDList: js.UndefOr[clientIDListType] = js.undefined
    /**
      * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificates. Typically this list includes only one entry. However, IAM lets you have up to five thumbprints for an OIDC provider. This lets you maintain multiple thumbprints if the identity provider is rotating certificates. The server certificate thumbprint is the hex-encoded SHA-1 hash value of the X.509 certificate used by the domain where the OpenID Connect provider makes its keys available. It is always a 40-character string. You must provide at least one thumbprint when creating an IAM OIDC provider. For example, assume that the OIDC provider is server.example.com and the provider stores its keys at https://keys.server.example.com/openid-connect. In that case, the thumbprint string would be the hex-encoded SHA-1 hash value of the certificate used by https://keys.server.example.com. For more information about obtaining the OIDC provider's thumbprint, see Obtaining the Thumbprint for an OpenID Connect Provider in the IAM User Guide.
      */
    var ThumbprintList: thumbprintListType
    /**
      * The URL of the identity provider. The URL must begin with https:// and should correspond to the iss claim in the provider's OpenID Connect ID tokens. Per the OIDC standard, path components are allowed but query parameters are not. Typically the URL consists of only a hostname, like https://server.example.org or https://example.com. You cannot register the same provider multiple times in a single AWS account. If you try to submit a URL that has already been used for an OpenID Connect provider in the AWS account, you will get an error.
      */
    var Url: OpenIDConnectProviderUrlType
  }
  
  trait CreateOpenIDConnectProviderResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see OpenIDConnectProviderListEntry. 
      */
    var OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
  }
  
  trait CreatePolicyRequest extends js.Object {
    /**
      * A friendly description of the policy. Typically used to store information about the permissions defined in the policy. For example, "Grants access to production DynamoDB tables." The policy description is immutable. After a value is assigned, it cannot be changed.
      */
    var Description: js.UndefOr[policyDescriptionType] = js.undefined
    /**
      * The path for the policy. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var Path: js.UndefOr[policyPathType] = js.undefined
    /**
      * The JSON policy document that you want to use as the content for the new policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyDocument: policyDocumentType
    /**
      * The friendly name of the policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
  }
  
  trait CreatePolicyResponse extends js.Object {
    /**
      * A structure containing details about the new policy.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
  }
  
  trait CreatePolicyVersionRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The JSON policy document that you want to use as the content for this new version of the policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyDocument: policyDocumentType
    /**
      * Specifies whether to set this version as the policy's default version. When this parameter is true, the new policy version becomes the operative version. That is, it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    var SetAsDefault: js.UndefOr[booleanType] = js.undefined
  }
  
  trait CreatePolicyVersionResponse extends js.Object {
    /**
      * A structure containing details about the new policy version.
      */
    var PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
  }
  
  trait CreateRoleRequest extends js.Object {
    /**
      * The trust relationship policy document that grants an entity permission to assume the role. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var AssumeRolePolicyDocument: policyDocumentType
    /**
      * A description of the role.
      */
    var Description: js.UndefOr[roleDescriptionType] = js.undefined
    /**
      * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours. Anyone who assumes the role from the AWS CLI or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM Roles in the IAM User Guide.
      */
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
    /**
      *  The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The ARN of the policy that is used to set the permissions boundary for the role.
      */
    var PermissionsBoundary: js.UndefOr[arnType] = js.undefined
    /**
      * The name of the role to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@- Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and "prodrole".
      */
    var RoleName: roleNameType
    /**
      * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.  If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request fails and the role is not created. 
      */
    var Tags: js.UndefOr[tagListType] = js.undefined
  }
  
  trait CreateRoleResponse extends js.Object {
    /**
      * A structure containing details about the new role.
      */
    var Role: awsDashSdkLib.clientsIamMod.IAMNs.Role
  }
  
  trait CreateSAMLProviderRequest extends js.Object {
    /**
      * The name of the provider to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var Name: SAMLProviderNameType
    /**
      * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP. For more information, see About SAML 2.0-based Federation in the IAM User Guide 
      */
    var SAMLMetadataDocument: SAMLMetadataDocumentType
  }
  
  trait CreateSAMLProviderResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
      */
    var SAMLProviderArn: js.UndefOr[arnType] = js.undefined
  }
  
  trait CreateServiceLinkedRoleRequest extends js.Object {
    /**
      * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but without the http:// in front. For example: elasticbeanstalk.amazonaws.com.  Service principals are unique and case-sensitive. To find the exact service principal for your service-linked role, see AWS Services That Work with IAM in the IAM User Guide and look for the services that have Yes in the Service-Linked Role column. Choose the Yes link to view the service-linked role documentation for that service.
      */
    var AWSServiceName: groupNameType
    /**
      *  A string that you provide, which is combined with the service-provided prefix to form the complete role name. If you make multiple requests for the same service, then you must supply a different CustomSuffix for each request. Otherwise the request fails with a duplicate role name error. For example, you could add -1 or -debug to the suffix. Some services do not support the CustomSuffix parameter. If you provide an optional suffix and the operation fails, try the operation again without the suffix.
      */
    var CustomSuffix: js.UndefOr[customSuffixType] = js.undefined
    /**
      * The description of the role.
      */
    var Description: js.UndefOr[roleDescriptionType] = js.undefined
  }
  
  trait CreateServiceLinkedRoleResponse extends js.Object {
    /**
      * A Role object that contains details about the newly created role.
      */
    var Role: js.UndefOr[Role] = js.undefined
  }
  
  trait CreateServiceSpecificCredentialRequest extends js.Object {
    /**
      * The name of the AWS service that is to be associated with the credentials. The service you specify here is the only service that can be accessed using these credentials.
      */
    var ServiceName: serviceName
    /**
      * The name of the IAM user that is to be associated with the credentials. The new service-specific credentials have the same permissions as the associated user except that they can be used only to access the specified service. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait CreateServiceSpecificCredentialResponse extends js.Object {
    /**
      * A structure that contains information about the newly created service-specific credential.  This is the only time that the password for this credential set is available. It cannot be recovered later. Instead, you will have to reset the password with ResetServiceSpecificCredential. 
      */
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
  }
  
  trait CreateUserRequest extends js.Object {
    /**
      *  The path for the user name. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The ARN of the policy that is used to set the permissions boundary for the user.
      */
    var PermissionsBoundary: js.UndefOr[arnType] = js.undefined
    /**
      * A list of tags that you want to attach to the newly created user. Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.  If any one of the tags is invalid or if you exceed the allowed number of tags per user, then the entire request fails and the user is not created. 
      */
    var Tags: js.UndefOr[tagListType] = js.undefined
    /**
      * The name of the user to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
      */
    var UserName: userNameType
  }
  
  trait CreateUserResponse extends js.Object {
    /**
      * A structure with details about the new IAM user.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait CreateVirtualMFADeviceRequest extends js.Object {
    /**
      *  The path for the virtual MFA device. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var VirtualMFADeviceName: virtualMFADeviceName
  }
  
  trait CreateVirtualMFADeviceResponse extends js.Object {
    /**
      * A structure containing details about the new virtual MFA device.
      */
    var VirtualMFADevice: awsDashSdkLib.clientsIamMod.IAMNs.VirtualMFADevice
  }
  
  trait DeactivateMFADeviceRequest extends js.Object {
    /**
      * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
      */
    var SerialNumber: serialNumberType
    /**
      * The name of the user whose MFA device you want to deactivate. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait DeleteAccessKeyRequest extends js.Object {
    /**
      * The access key ID for the access key ID and secret access key you want to delete. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var AccessKeyId: accessKeyIdType
    /**
      * The name of the user whose access key pair you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait DeleteAccountAliasRequest extends js.Object {
    /**
      * The name of the account alias to delete. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
      */
    var AccountAlias: accountAliasType
  }
  
  trait DeleteGroupPolicyRequest extends js.Object {
    /**
      * The name (friendly name, not ARN) identifying the group that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The name identifying the policy document to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
  }
  
  trait DeleteGroupRequest extends js.Object {
    /**
      * The name of the IAM group to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
  }
  
  trait DeleteInstanceProfileRequest extends js.Object {
    /**
      * The name of the instance profile to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var InstanceProfileName: instanceProfileNameType
  }
  
  trait DeleteLoginProfileRequest extends js.Object {
    /**
      * The name of the user whose password you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait DeleteOpenIDConnectProviderRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the ListOpenIDConnectProviders operation.
      */
    var OpenIDConnectProviderArn: arnType
  }
  
  trait DeletePolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to delete. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
  }
  
  trait DeletePolicyVersionRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy from which you want to delete a version. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The policy version to delete. This parameter allows (through its regex pattern) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    var VersionId: policyVersionIdType
  }
  
  trait DeleteRolePermissionsBoundaryRequest extends js.Object {
    /**
      * The name (friendly name, not ARN) of the IAM role from which you want to remove the permissions boundary.
      */
    var RoleName: roleNameType
  }
  
  trait DeleteRolePolicyRequest extends js.Object {
    /**
      * The name of the inline policy to delete from the specified IAM role. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
    /**
      * The name (friendly name, not ARN) identifying the role that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait DeleteRoleRequest extends js.Object {
    /**
      * The name of the role to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait DeleteSAMLProviderRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the SAML provider to delete.
      */
    var SAMLProviderArn: arnType
  }
  
  trait DeleteSSHPublicKeyRequest extends js.Object {
    /**
      * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var SSHPublicKeyId: publicKeyIdType
    /**
      * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait DeleteServerCertificateRequest extends js.Object {
    /**
      * The name of the server certificate you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var ServerCertificateName: serverCertificateNameType
  }
  
  trait DeleteServiceLinkedRoleRequest extends js.Object {
    /**
      * The name of the service-linked role to be deleted.
      */
    var RoleName: roleNameType
  }
  
  trait DeleteServiceLinkedRoleResponse extends js.Object {
    /**
      * The deletion task identifier that you can use to check the status of the deletion. This identifier is returned in the format task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;.
      */
    var DeletionTaskId: DeletionTaskIdType
  }
  
  trait DeleteServiceSpecificCredentialRequest extends js.Object {
    /**
      * The unique identifier of the service-specific credential. You can get this value by calling ListServiceSpecificCredentials. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    /**
      * The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait DeleteSigningCertificateRequest extends js.Object {
    /**
      * The ID of the signing certificate to delete. The format of this parameter, as described by its regex pattern, is a string of characters that can be upper- or lower-cased letters or digits.
      */
    var CertificateId: certificateIdType
    /**
      * The name of the user the signing certificate belongs to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait DeleteUserPermissionsBoundaryRequest extends js.Object {
    /**
      * The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
      */
    var UserName: userNameType
  }
  
  trait DeleteUserPolicyRequest extends js.Object {
    /**
      * The name identifying the policy document to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
    /**
      * The name (friendly name, not ARN) identifying the user that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait DeleteUserRequest extends js.Object {
    /**
      * The name of the user to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait DeleteVirtualMFADeviceRequest extends js.Object {
    /**
      * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the same as the ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
      */
    var SerialNumber: serialNumberType
  }
  
  trait DeletionTaskFailureReasonType extends js.Object {
    /**
      * A short description of the reason that the service-linked role deletion failed.
      */
    var Reason: js.UndefOr[ReasonType] = js.undefined
    /**
      * A list of objects that contains details about the service-linked role deletion failure, if that information is returned by the service. If the service-linked role has active sessions or if any resources that were used by the role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of the resources that are associated with the role and the region in which the resources are being used.
      */
    var RoleUsageList: js.UndefOr[RoleUsageListType] = js.undefined
  }
  
  trait DetachGroupPolicyRequest extends js.Object {
    /**
      * The name (friendly name, not ARN) of the IAM group to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
  }
  
  trait DetachRolePolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The name (friendly name, not ARN) of the IAM role to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait DetachUserPolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy you want to detach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The name (friendly name, not ARN) of the IAM user to detach the policy from. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait EnableMFADeviceRequest extends js.Object {
    /**
      * An authentication code emitted by the device.  The format for this parameter is a string of six digits.  Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can resync the device. 
      */
    var AuthenticationCode1: authenticationCodeType
    /**
      * A subsequent authentication code emitted by the device. The format for this parameter is a string of six digits.  Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can resync the device. 
      */
    var AuthenticationCode2: authenticationCodeType
    /**
      * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
      */
    var SerialNumber: serialNumberType
    /**
      * The name of the IAM user for whom you want to enable the MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait EntityDetails extends js.Object {
    /**
      * The EntityInfo object that contains details about the entity (user or role).
      */
    var EntityInfo: awsDashSdkLib.clientsIamMod.IAMNs.EntityInfo
    /**
      * The date and time, in ISO 8601 date-time format, when the authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
      */
    var LastAuthenticated: js.UndefOr[dateType] = js.undefined
  }
  
  trait EntityInfo extends js.Object {
    var Arn: arnType
    /**
      * The identifier of the entity (user or role).
      */
    var Id: idType
    /**
      * The name of the entity (user or role).
      */
    var Name: userNameType
    /**
      * The path to the entity (user or role). For more information about paths, see IAM Identifiers in the Using IAM guide. 
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The type of entity (user or role).
      */
    var Type: policyOwnerEntityType
  }
  
  trait ErrorDetails extends js.Object {
    /**
      * The error code associated with the operation failure.
      */
    var Code: stringType
    /**
      * Detailed information about the reason that the operation failed.
      */
    var Message: stringType
  }
  
  trait EvalDecisionDetailsType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[PolicyEvaluationDecisionType]
  
  trait EvaluationResult extends js.Object {
    /**
      * The name of the API operation tested on the indicated resource.
      */
    var EvalActionName: ActionNameType
    /**
      * The result of the simulation.
      */
    var EvalDecision: PolicyEvaluationDecisionType
    /**
      * Additional details about the results of the evaluation decision. When there are both IAM policies and resource policies, this parameter explains how each set of policies contributes to the final evaluation decision. When simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must grant access. See How IAM Roles Differ from Resource-based Policies 
      */
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined
    /**
      * The ARN of the resource that the indicated API operation was tested on.
      */
    var EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * A list of the statements in the input policies that determine the result for this scenario. Remember that even if multiple statements allow the operation on the resource, if only one statement denies that operation, then the explicit deny overrides any allow. Inaddition, the deny statement is the only entry included in the result.
      */
    var MatchedStatements: js.UndefOr[StatementListType] = js.undefined
    /**
      * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when the resource in a simulation is "*", either explicitly, or when the ResourceArns parameter blank. If you include a list of resources, then any missing context values are instead included under the ResourceSpecificResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
      */
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
    /**
      * A structure that details how AWS Organizations and its service control policies affect the results of the simulation. Only applies if the simulated user's account is part of an organization.
      */
    var OrganizationsDecisionDetail: js.UndefOr[OrganizationsDecisionDetail] = js.undefined
    /**
      * The individual results of the simulation of the API operation specified in EvalActionName on each resource.
      */
    var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.undefined
  }
  
  trait GenerateCredentialReportResponse extends js.Object {
    /**
      * Information about the credential report.
      */
    var Description: js.UndefOr[ReportStateDescriptionType] = js.undefined
    /**
      * Information about the state of the credential report.
      */
    var State: js.UndefOr[ReportStateType] = js.undefined
  }
  
  trait GenerateServiceLastAccessedDetailsRequest extends js.Object {
    /**
      * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the resource was last used in an attempt to access an AWS service.
      */
    var Arn: arnType
  }
  
  trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
    /**
      * The job ID that you can use in the GetServiceLastAccessedDetails or GetServiceLastAccessedDetailsWithEntities operations.
      */
    var JobId: js.UndefOr[jobIDType] = js.undefined
  }
  
  trait GetAccessKeyLastUsedRequest extends js.Object {
    /**
      * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var AccessKeyId: accessKeyIdType
  }
  
  trait GetAccessKeyLastUsedResponse extends js.Object {
    /**
      * Contains information about the last time the access key was used.
      */
    var AccessKeyLastUsed: js.UndefOr[AccessKeyLastUsed] = js.undefined
    /**
      * The name of the AWS IAM user that owns this access key. 
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait GetAccountAuthorizationDetailsRequest extends js.Object {
    /**
      * A list of entity types used to filter the results. Only the entities that match the types you specify are included in the output. Use the value LocalManagedPolicy to include customer managed policies. The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the list must be one of the valid values listed below.
      */
    var Filter: js.UndefOr[entityListType] = js.undefined
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  }
  
  trait GetAccountAuthorizationDetailsResponse extends js.Object {
    /**
      * A list containing information about IAM groups.
      */
    var GroupDetailList: js.UndefOr[groupDetailListType] = js.undefined
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list containing information about managed policies.
      */
    var Policies: js.UndefOr[ManagedPolicyDetailListType] = js.undefined
    /**
      * A list containing information about IAM roles.
      */
    var RoleDetailList: js.UndefOr[roleDetailListType] = js.undefined
    /**
      * A list containing information about IAM users.
      */
    var UserDetailList: js.UndefOr[userDetailListType] = js.undefined
  }
  
  trait GetAccountPasswordPolicyResponse extends js.Object {
    /**
      * A structure that contains details about the account's password policy.
      */
    var PasswordPolicy: awsDashSdkLib.clientsIamMod.IAMNs.PasswordPolicy
  }
  
  trait GetAccountSummaryResponse extends js.Object {
    /**
      * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
      */
    var SummaryMap: js.UndefOr[summaryMapType] = js.undefined
  }
  
  trait GetContextKeysForCustomPolicyRequest extends js.Object {
    /**
      * A list of policies for which you want the list of context keys referenced in those policies. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyInputList: SimulationPolicyListType
  }
  
  trait GetContextKeysForPolicyResponse extends js.Object {
    /**
      * The list of context keys that are referenced in the input policies.
      */
    var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
  }
  
  trait GetContextKeysForPrincipalPolicyRequest extends js.Object {
    /**
      * An optional list of additional policies for which you want the list of context keys that are referenced. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
    /**
      * The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a user, the list includes context keys that are found in all policies that are attached to the user. The list also includes all groups that the user is a member of. If you pick a group or a role, then it includes only those context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part of a real HTML request. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicySourceArn: arnType
  }
  
  trait GetCredentialReportResponse extends js.Object {
    /**
      * Contains the credential report. The report is Base64-encoded.
      */
    var Content: js.UndefOr[ReportContentType] = js.undefined
    /**
      *  The date and time when the credential report was created, in ISO 8601 date-time format.
      */
    var GeneratedTime: js.UndefOr[dateType] = js.undefined
    /**
      * The format (MIME type) of the credential report.
      */
    var ReportFormat: js.UndefOr[ReportFormatType] = js.undefined
  }
  
  trait GetGroupPolicyRequest extends js.Object {
    /**
      * The name of the group the policy is associated with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
  }
  
  trait GetGroupPolicyResponse extends js.Object {
    /**
      * The group the policy is associated with.
      */
    var GroupName: groupNameType
    /**
      * The policy document.
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the policy.
      */
    var PolicyName: policyNameType
  }
  
  trait GetGroupRequest extends js.Object {
    /**
      * The name of the group. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  }
  
  trait GetGroupResponse extends js.Object {
    /**
      * A structure that contains details about the group.
      */
    var Group: awsDashSdkLib.clientsIamMod.IAMNs.Group
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of users in the group.
      */
    var Users: userListType
  }
  
  trait GetInstanceProfileRequest extends js.Object {
    /**
      * The name of the instance profile to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var InstanceProfileName: instanceProfileNameType
  }
  
  trait GetInstanceProfileResponse extends js.Object {
    /**
      * A structure containing details about the instance profile.
      */
    var InstanceProfile: awsDashSdkLib.clientsIamMod.IAMNs.InstanceProfile
  }
  
  trait GetLoginProfileRequest extends js.Object {
    /**
      * The name of the user whose login profile you want to retrieve. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait GetLoginProfileResponse extends js.Object {
    /**
      * A structure containing the user name and password create date for the user.
      */
    var LoginProfile: awsDashSdkLib.clientsIamMod.IAMNs.LoginProfile
  }
  
  trait GetOpenIDConnectProviderRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the OIDC provider resource object in IAM to get information for. You can get a list of OIDC provider resource ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var OpenIDConnectProviderArn: arnType
  }
  
  trait GetOpenIDConnectProviderResponse extends js.Object {
    /**
      * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider.
      */
    var ClientIDList: js.UndefOr[clientIDListType] = js.undefined
    /**
      * The date and time when the IAM OIDC provider resource object was created in the AWS account.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider. 
      */
    var ThumbprintList: js.UndefOr[thumbprintListType] = js.undefined
    /**
      * The URL that the IAM OIDC provider resource object is associated with. For more information, see CreateOpenIDConnectProvider.
      */
    var Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.undefined
  }
  
  trait GetPolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the managed policy that you want information about. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
  }
  
  trait GetPolicyResponse extends js.Object {
    /**
      * A structure containing details about the policy.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
  }
  
  trait GetPolicyVersionRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the managed policy that you want information about. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * Identifies the policy version to retrieve. This parameter allows (through its regex pattern) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits.
      */
    var VersionId: policyVersionIdType
  }
  
  trait GetPolicyVersionResponse extends js.Object {
    /**
      * A structure containing details about the policy version.
      */
    var PolicyVersion: js.UndefOr[PolicyVersion] = js.undefined
  }
  
  trait GetRolePolicyRequest extends js.Object {
    /**
      * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
    /**
      * The name of the role associated with the policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait GetRolePolicyResponse extends js.Object {
    /**
      * The policy document.
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the policy.
      */
    var PolicyName: policyNameType
    /**
      * The role the policy is associated with.
      */
    var RoleName: roleNameType
  }
  
  trait GetRoleRequest extends js.Object {
    /**
      * The name of the IAM role to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait GetRoleResponse extends js.Object {
    /**
      * A structure containing details about the IAM role.
      */
    var Role: awsDashSdkLib.clientsIamMod.IAMNs.Role
  }
  
  trait GetSAMLProviderRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the SAML provider resource object in IAM to get information about. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var SAMLProviderArn: arnType
  }
  
  trait GetSAMLProviderResponse extends js.Object {
    /**
      * The date and time when the SAML provider was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The XML metadata document that includes information about an identity provider.
      */
    var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined
    /**
      * The expiration date and time for the SAML provider.
      */
    var ValidUntil: js.UndefOr[dateType] = js.undefined
  }
  
  trait GetSSHPublicKeyRequest extends js.Object {
    /**
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use SSH. To retrieve the public key in PEM format, use PEM.
      */
    var Encoding: encodingType
    /**
      * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var SSHPublicKeyId: publicKeyIdType
    /**
      * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait GetSSHPublicKeyResponse extends js.Object {
    /**
      * A structure containing details about the SSH public key.
      */
    var SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
  }
  
  trait GetServerCertificateRequest extends js.Object {
    /**
      * The name of the server certificate you want to retrieve information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var ServerCertificateName: serverCertificateNameType
  }
  
  trait GetServerCertificateResponse extends js.Object {
    /**
      * A structure containing details about the server certificate.
      */
    var ServerCertificate: awsDashSdkLib.clientsIamMod.IAMNs.ServerCertificate
  }
  
  trait GetServiceLastAccessedDetailsRequest extends js.Object {
    /**
      * The ID of the request generated by the GenerateServiceLastAccessedDetails operation.
      */
    var JobId: jobIDType
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  }
  
  trait GetServiceLastAccessedDetailsResponse extends js.Object {
    /**
      * An object that contains details about the reason the operation failed.
      */
    var Error: js.UndefOr[ErrorDetails] = js.undefined
    /**
      *  A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a JobStatus value of IN_PROGRESS.
      */
    var JobCompletionDate: dateType
    /**
      * The date and time, in ISO 8601 date-time format, when the report job was created.
      */
    var JobCreationDate: dateType
    /**
      * The status of the job.
      */
    var JobStatus: jobStatusType
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      *  A ServiceLastAccessed object that contains details about the most recent attempt to access the service.
      */
    var ServicesLastAccessed: awsDashSdkLib.clientsIamMod.IAMNs.ServicesLastAccessed
  }
  
  trait GetServiceLastAccessedDetailsWithEntitiesRequest extends js.Object {
    /**
      * The ID of the request generated by the GenerateServiceLastAccessedDetails operation.
      */
    var JobId: jobIDType
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The service namespace for an AWS service. Provide the service namespace to learn when the IAM entity last attempted to access the specified service. To learn the service namespace for a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide and choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
      */
    var ServiceNamespace: serviceNamespaceType
  }
  
  trait GetServiceLastAccessedDetailsWithEntitiesResponse extends js.Object {
    /**
      * An EntityDetailsList object that contains details about when an IAM entity (user or role) used group or policy permissions in an attempt to access the specified AWS service.
      */
    var EntityDetailsList: entityDetailsListType
    /**
      * An object that contains details about the reason the operation failed.
      */
    var Error: js.UndefOr[ErrorDetails] = js.undefined
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed.
      */
    var JobCompletionDate: dateType
    /**
      * The date and time, in ISO 8601 date-time format, when the report job was created.
      */
    var JobCreationDate: dateType
    /**
      * The status of the job.
      */
    var JobStatus: jobStatusType
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait GetServiceLinkedRoleDeletionStatusRequest extends js.Object {
    /**
      * The deletion task identifier. This identifier is returned by the DeleteServiceLinkedRole operation in the format task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;.
      */
    var DeletionTaskId: DeletionTaskIdType
  }
  
  trait GetServiceLinkedRoleDeletionStatusResponse extends js.Object {
    /**
      * An object that contains details about the reason the deletion failed.
      */
    var Reason: js.UndefOr[DeletionTaskFailureReasonType] = js.undefined
    /**
      * The status of the deletion.
      */
    var Status: DeletionTaskStatusType
  }
  
  trait GetUserPolicyRequest extends js.Object {
    /**
      * The name of the policy document to get. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
    /**
      * The name of the user who the policy is associated with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait GetUserPolicyResponse extends js.Object {
    /**
      * The policy document.
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the policy.
      */
    var PolicyName: policyNameType
    /**
      * The user the policy is associated with.
      */
    var UserName: existingUserNameType
  }
  
  trait GetUserRequest extends js.Object {
    /**
      * The name of the user to get information about. This parameter is optional. If it is not included, it defaults to the user making the request. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait GetUserResponse extends js.Object {
    /**
      * A structure containing details about the IAM user.  Due to a service issue, password last used data does not include password use from May 3, 2018 22:50 PDT to May 23, 2018 14:08 PDT. This affects last sign-in dates shown in the IAM console and password last used dates in the IAM credential report, and returned by this GetUser API. If users signed in during the affected time, the password last used date that is returned is the date the user last signed in before May 3, 2018. For users that signed in after May 23, 2018 14:08 PDT, the returned password last used date is accurate. You can use password last used information to identify unused credentials for deletion. For example, you might delete users who did not sign in to AWS in the last 90 days. In cases like this, we recommend that you adjust your evaluation window to include dates after May 23, 2018. Alternatively, if your users use access keys to access AWS programmatically you can refer to access key last used information because it is accurate for all dates.  
      */
    var User: awsDashSdkLib.clientsIamMod.IAMNs.User
  }
  
  trait Group extends js.Object {
    /**
      *  The Amazon Resource Name (ARN) specifying the group. For more information about ARNs and how to use them in policies, see IAM Identifiers in the Using IAM guide. 
      */
    var Arn: arnType
    /**
      * The date and time, in ISO 8601 date-time format, when the group was created.
      */
    var CreateDate: dateType
    /**
      *  The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
      */
    var GroupId: idType
    /**
      * The friendly name that identifies the group.
      */
    var GroupName: groupNameType
    /**
      * The path to the group. For more information about paths, see IAM Identifiers in the Using IAM guide. 
      */
    var Path: pathType
  }
  
  trait GroupDetail extends js.Object {
    var Arn: js.UndefOr[arnType] = js.undefined
    /**
      * A list of the managed policies attached to the group.
      */
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the group was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the Using IAM guide.
      */
    var GroupId: js.UndefOr[idType] = js.undefined
    /**
      * The friendly name that identifies the group.
      */
    var GroupName: js.UndefOr[groupNameType] = js.undefined
    /**
      * A list of the inline policies embedded in the group.
      */
    var GroupPolicyList: js.UndefOr[policyDetailListType] = js.undefined
    /**
      * The path to the group. For more information about paths, see IAM Identifiers in the Using IAM guide.
      */
    var Path: js.UndefOr[pathType] = js.undefined
  }
  
  trait InstanceProfile extends js.Object {
    /**
      *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM Identifiers in the Using IAM guide. 
      */
    var Arn: arnType
    /**
      * The date when the instance profile was created.
      */
    var CreateDate: dateType
    /**
      *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
      */
    var InstanceProfileId: idType
    /**
      * The name identifying the instance profile.
      */
    var InstanceProfileName: instanceProfileNameType
    /**
      *  The path to the instance profile. For more information about paths, see IAM Identifiers in the Using IAM guide. 
      */
    var Path: pathType
    /**
      * The role associated with the instance profile.
      */
    var Roles: roleListType
  }
  
  trait ListAccessKeysRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the user. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait ListAccessKeysResponse extends js.Object {
    /**
      * A list of objects containing metadata about the access keys.
      */
    var AccessKeyMetadata: accessKeyMetadataListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListAccountAliasesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  }
  
  trait ListAccountAliasesResponse extends js.Object {
    /**
      * A list of aliases associated with the account. AWS supports only one alias per account.
      */
    var AccountAliases: accountAliasListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListAttachedGroupPoliciesRequest extends js.Object {
    /**
      * The name (friendly name, not ARN) of the group to list attached policies for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[policyPathType] = js.undefined
  }
  
  trait ListAttachedGroupPoliciesResponse extends js.Object {
    /**
      * A list of the attached policies.
      */
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListAttachedRolePoliciesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[policyPathType] = js.undefined
    /**
      * The name (friendly name, not ARN) of the role to list attached policies for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait ListAttachedRolePoliciesResponse extends js.Object {
    /**
      * A list of the attached policies.
      */
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListAttachedUserPoliciesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[policyPathType] = js.undefined
    /**
      * The name (friendly name, not ARN) of the user to list attached policies for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait ListAttachedUserPoliciesResponse extends js.Object {
    /**
      * A list of the attached policies.
      */
    var AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListEntitiesForPolicyRequest extends js.Object {
    /**
      * The entity type to use for filtering the results. For example, when EntityFilter is Role, only the roles that are attached to the specified policy are returned. This parameter is optional. If it is not included, all attached entities (users, groups, and roles) are returned. The argument for this parameter must be one of the valid values listed below.
      */
    var EntityFilter: js.UndefOr[EntityType] = js.undefined
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all entities. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[pathType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM policy for which you want the versions. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The policy usage method to use for filtering the results. To list only permissions policies, set PolicyUsageFilter to PermissionsPolicy. To list only the policies used to set permissions boundaries, set the value to PermissionsBoundary. This parameter is optional. If it is not included, all policies are returned. 
      */
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined
  }
  
  trait ListEntitiesForPolicyResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of IAM groups that the policy is attached to.
      */
    var PolicyGroups: js.UndefOr[PolicyGroupListType] = js.undefined
    /**
      * A list of IAM roles that the policy is attached to.
      */
    var PolicyRoles: js.UndefOr[PolicyRoleListType] = js.undefined
    /**
      * A list of IAM users that the policy is attached to.
      */
    var PolicyUsers: js.UndefOr[PolicyUserListType] = js.undefined
  }
  
  trait ListGroupPoliciesRequest extends js.Object {
    /**
      * The name of the group to list policies for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  }
  
  trait ListGroupPoliciesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of policy names. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyNames: policyNameListType
  }
  
  trait ListGroupsForUserRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the user to list groups for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait ListGroupsForUserResponse extends js.Object {
    /**
      * A list of groups.
      */
    var Groups: groupListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListGroupsRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      *  The path prefix for filtering the results. For example, the prefix /division_abc/subdivision_xyz/ gets all groups whose path starts with /division_abc/subdivision_xyz/. This parameter is optional. If it is not included, it defaults to a slash (/), listing all groups. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
  }
  
  trait ListGroupsResponse extends js.Object {
    /**
      * A list of groups.
      */
    var Groups: groupListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListInstanceProfilesForRoleRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the role to list instance profiles for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait ListInstanceProfilesForRoleResponse extends js.Object {
    /**
      * A list of instance profiles.
      */
    var InstanceProfiles: instanceProfileListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListInstanceProfilesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      *  The path prefix for filtering the results. For example, the prefix /application_abc/component_xyz/ gets all instance profiles whose path starts with /application_abc/component_xyz/. This parameter is optional. If it is not included, it defaults to a slash (/), listing all instance profiles. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
  }
  
  trait ListInstanceProfilesResponse extends js.Object {
    /**
      * A list of instance profiles.
      */
    var InstanceProfiles: instanceProfileListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListMFADevicesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the user whose MFA devices you want to list. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait ListMFADevicesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * A list of MFA devices.
      */
    var MFADevices: mfaDeviceListType
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListOpenIDConnectProvidersRequest extends js.Object
  
  trait ListOpenIDConnectProvidersResponse extends js.Object {
    /**
      * The list of IAM OIDC provider resource objects defined in the AWS account.
      */
    var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.undefined
  }
  
  trait ListPoliciesGrantingServiceAccessEntry extends js.Object {
    /**
      * The PoliciesGrantingServiceAccess object that contains details about the policy.
      */
    var Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.undefined
    /**
      * The namespace of the service that was accessed. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
      */
    var ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.undefined
  }
  
  trait ListPoliciesGrantingServiceAccessRequest extends js.Object {
    /**
      * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
      */
    var Arn: arnType
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * The service namespace for the AWS services whose policies you want to list. To learn the service namespace for a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
      */
    var ServiceNamespaces: serviceNamespaceListType
  }
  
  trait ListPoliciesGrantingServiceAccessResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A ListPoliciesGrantingServiceAccess object that contains details about the permissions policies attached to the specified identity (user, group, or role).
      */
    var PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType
  }
  
  trait ListPoliciesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * A flag to filter the results to only the attached policies. When OnlyAttached is true, the returned list contains only the policies that are attached to an IAM user, group, or role. When OnlyAttached is false, or when the parameter is not included, all policies are returned.
      */
    var OnlyAttached: js.UndefOr[booleanType] = js.undefined
    /**
      * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[policyPathType] = js.undefined
    /**
      * The policy usage method to use for filtering the results. To list only permissions policies, set PolicyUsageFilter to PermissionsPolicy. To list only the policies used to set permissions boundaries, set the value to PermissionsBoundary. This parameter is optional. If it is not included, all policies are returned. 
      */
    var PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined
    /**
      * The scope to use for filtering the results. To list only AWS managed policies, set Scope to AWS. To list only the customer managed policies in your AWS account, set Scope to Local. This parameter is optional. If it is not included, or if it is set to All, all policies are returned.
      */
    var Scope: js.UndefOr[policyScopeType] = js.undefined
  }
  
  trait ListPoliciesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of policies.
      */
    var Policies: js.UndefOr[policyListType] = js.undefined
  }
  
  trait ListPolicyVersionsRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM policy for which you want the versions. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
  }
  
  trait ListPolicyVersionsResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of policy versions. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    var Versions: js.UndefOr[policyDocumentVersionListType] = js.undefined
  }
  
  trait ListRolePoliciesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the role to list policies for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait ListRolePoliciesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of policy names.
      */
    var PolicyNames: policyNameListType
  }
  
  trait ListRoleTagsRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the response. If additional items exist beyond the maximum that you specify, the IsTruncated response element is true. If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when more results are available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the IAM role for which you want to see the list of tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait ListRoleTagsResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can use the Marker request parameter to make a subsequent pagination request that retrieves more items. Note that IAM might return fewer than the MaxItems number of results even when more results are available. Check IsTruncated after every call to ensure that you receive all of your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value. If no tags are attached to the specified role, the response contains an empty list.
      */
    var Tags: tagListType
  }
  
  trait ListRolesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      *  The path prefix for filtering the results. For example, the prefix /application_abc/component_xyz/ gets all roles whose path starts with /application_abc/component_xyz/. This parameter is optional. If it is not included, it defaults to a slash (/), listing all roles. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
  }
  
  trait ListRolesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of roles.
      */
    var Roles: roleListType
  }
  
  trait ListSAMLProvidersRequest extends js.Object
  
  trait ListSAMLProvidersResponse extends js.Object {
    /**
      * The list of SAML provider resource objects defined in IAM for this AWS account.
      */
    var SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.undefined
  }
  
  trait ListSSHPublicKeysRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the IAM user to list SSH public keys for. If none is specified, the UserName field is determined implicitly based on the AWS access key used to sign the request. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait ListSSHPublicKeysResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of the SSH public keys assigned to IAM user.
      */
    var SSHPublicKeys: js.UndefOr[SSHPublicKeyListType] = js.undefined
  }
  
  trait ListServerCertificatesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      *  The path prefix for filtering the results. For example: /company/servercerts would get all server certificates for which the path starts with /company/servercerts. This parameter is optional. If it is not included, it defaults to a slash (/), listing all server certificates. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
  }
  
  trait ListServerCertificatesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of server certificates.
      */
    var ServerCertificateMetadataList: serverCertificateMetadataListType
  }
  
  trait ListServiceSpecificCredentialsRequest extends js.Object {
    /**
      * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns service-specific credentials for all services.
      */
    var ServiceName: js.UndefOr[serviceName] = js.undefined
    /**
      * The name of the user whose service-specific credentials you want information about. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait ListServiceSpecificCredentialsResponse extends js.Object {
    /**
      * A list of structures that each contain details about a service-specific credential.
      */
    var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.undefined
  }
  
  trait ListSigningCertificatesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the IAM user whose signing certificates you want to examine. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait ListSigningCertificatesResponse extends js.Object {
    /**
      * A list of the user's signing certificate information.
      */
    var Certificates: certificateListType
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait ListUserPoliciesRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the user to list policies for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait ListUserPoliciesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of policy names.
      */
    var PolicyNames: policyNameListType
  }
  
  trait ListUserTagsRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * (Optional) Use this only when paginating results to indicate the maximum number of items that you want in the response. If additional items exist beyond the maximum that you specify, the IsTruncated response element is true. If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when more results are available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * The name of the IAM user whose tags you want to see. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait ListUserTagsResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can use the Marker request parameter to make a subsequent pagination request that retrieves more items. Note that IAM might return fewer than the MaxItems number of results even when more results are available. Check IsTruncated after every call to ensure that you receive all of your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * The list of tags that are currently attached to the user. Each tag consists of a key name and an associated value. If no tags are attached to the specified user, the response contains an empty list.
      */
    var Tags: tagListType
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      *  The path prefix for filtering the results. For example: /division_abc/subdivision_xyz/, which would get all user names whose path starts with /division_abc/subdivision_xyz/. This parameter is optional. If it is not included, it defaults to a slash (/), listing all user names. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var PathPrefix: js.UndefOr[pathPrefixType] = js.undefined
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * A list of users.
      */
    var Users: userListType
  }
  
  trait ListVirtualMFADevicesRequest extends js.Object {
    /**
      *  The status (Unassigned or Assigned) of the devices to list. If you do not specify an AssignmentStatus, the operation defaults to Any, which lists both assigned and unassigned virtual MFA devices.,
      */
    var AssignmentStatus: js.UndefOr[assignmentStatusType] = js.undefined
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  }
  
  trait ListVirtualMFADevicesResponse extends js.Object {
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      *  The list of virtual MFA devices in the current account that match the AssignmentStatus value that was passed in the request.
      */
    var VirtualMFADevices: virtualMFADeviceListType
  }
  
  trait LoginProfile extends js.Object {
    /**
      * The date when the password for the user was created.
      */
    var CreateDate: dateType
    /**
      * Specifies whether the user is required to set a new password on next sign-in.
      */
    var PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
    /**
      * The name of the user, which can be used for signing in to the AWS Management Console.
      */
    var UserName: userNameType
  }
  
  trait MFADevice extends js.Object {
    /**
      * The date when the MFA device was enabled for the user.
      */
    var EnableDate: dateType
    /**
      * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.
      */
    var SerialNumber: serialNumberType
    /**
      * The user with whom the MFA device is associated.
      */
    var UserName: userNameType
  }
  
  trait ManagedPolicyDetail extends js.Object {
    var Arn: js.UndefOr[arnType] = js.undefined
    /**
      * The number of principal entities (users, groups, and roles) that the policy is attached to.
      */
    var AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the policy was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The identifier for the version of the policy that is set as the default (operative) version. For more information about policy versions, see Versioning for Managed Policies in the Using IAM guide. 
      */
    var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined
    /**
      * A friendly description of the policy.
      */
    var Description: js.UndefOr[policyDescriptionType] = js.undefined
    /**
      * Specifies whether the policy can be attached to an IAM user, group, or role.
      */
    var IsAttachable: js.UndefOr[booleanType] = js.undefined
    /**
      * The path to the policy. For more information about paths, see IAM Identifiers in the Using IAM guide.
      */
    var Path: js.UndefOr[policyPathType] = js.undefined
    /**
      * The number of entities (users and roles) for which the policy is used as the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
      */
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined
    /**
      * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the Using IAM guide.
      */
    var PolicyId: js.UndefOr[idType] = js.undefined
    /**
      * The friendly name (not ARN) identifying the policy.
      */
    var PolicyName: js.UndefOr[policyNameType] = js.undefined
    /**
      * A list containing information about the versions of the policy.
      */
    var PolicyVersionList: js.UndefOr[policyDocumentVersionListType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
      */
    var UpdateDate: js.UndefOr[dateType] = js.undefined
  }
  
  trait OpenIDConnectProviderListEntry extends js.Object {
    var Arn: js.UndefOr[arnType] = js.undefined
  }
  
  trait OrganizationsDecisionDetail extends js.Object {
    /**
      * Specifies whether the simulated operation is allowed by the AWS Organizations service control policies that impact the simulated user's account.
      */
    var AllowedByOrganizations: js.UndefOr[booleanType] = js.undefined
  }
  
  trait PasswordPolicy extends js.Object {
    /**
      * Specifies whether IAM users are allowed to change their own password.
      */
    var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
    /**
      * Indicates whether passwords in the account expire. Returns true if MaxPasswordAge contains a value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
      */
    var ExpirePasswords: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether IAM users are prevented from setting a new password after their password has expired.
      */
    var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
    /**
      * The number of days that an IAM user password is valid.
      */
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
    /**
      * Minimum length to require for IAM user passwords.
      */
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
    /**
      * Specifies the number of previous passwords that IAM users are prevented from reusing.
      */
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
    /**
      * Specifies whether to require lowercase characters for IAM user passwords.
      */
    var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether to require numbers for IAM user passwords.
      */
    var RequireNumbers: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether to require symbols for IAM user passwords.
      */
    var RequireSymbols: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether to require uppercase characters for IAM user passwords.
      */
    var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
  }
  
  trait Policy extends js.Object {
    var Arn: js.UndefOr[arnType] = js.undefined
    /**
      * The number of entities (users, groups, and roles) that the policy is attached to.
      */
    var AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the policy was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The identifier for the version of the policy that is set as the default version.
      */
    var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined
    /**
      * A friendly description of the policy. This element is included in the response to the GetPolicy operation. It is not included in the response to the ListPolicies operation. 
      */
    var Description: js.UndefOr[policyDescriptionType] = js.undefined
    /**
      * Specifies whether the policy can be attached to an IAM user, group, or role.
      */
    var IsAttachable: js.UndefOr[booleanType] = js.undefined
    /**
      * The path to the policy. For more information about paths, see IAM Identifiers in the Using IAM guide.
      */
    var Path: js.UndefOr[policyPathType] = js.undefined
    /**
      * The number of entities (users and roles) for which the policy is used to set the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
      */
    var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined
    /**
      * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the Using IAM guide.
      */
    var PolicyId: js.UndefOr[idType] = js.undefined
    /**
      * The friendly name (not ARN) identifying the policy.
      */
    var PolicyName: js.UndefOr[policyNameType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
      */
    var UpdateDate: js.UndefOr[dateType] = js.undefined
  }
  
  trait PolicyDetail extends js.Object {
    /**
      * The policy document.
      */
    var PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    /**
      * The name of the policy.
      */
    var PolicyName: js.UndefOr[policyNameType] = js.undefined
  }
  
  trait PolicyGrantingServiceAccess extends js.Object {
    /**
      * The name of the entity (user or role) to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    var EntityName: js.UndefOr[entityNameType] = js.undefined
    /**
      * The type of entity (user or role) that used the policy to access the service to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    var EntityType: js.UndefOr[policyOwnerEntityType] = js.undefined
    var PolicyArn: js.UndefOr[arnType] = js.undefined
    /**
      * The policy name.
      */
    var PolicyName: policyNameType
    /**
      * The policy type. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    var PolicyType: policyType
  }
  
  trait PolicyGroup extends js.Object {
    /**
      * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide.
      */
    var GroupId: js.UndefOr[idType] = js.undefined
    /**
      * The name (friendly name, not ARN) identifying the group.
      */
    var GroupName: js.UndefOr[groupNameType] = js.undefined
  }
  
  trait PolicyRole extends js.Object {
    /**
      * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
      */
    var RoleId: js.UndefOr[idType] = js.undefined
    /**
      * The name (friendly name, not ARN) identifying the role.
      */
    var RoleName: js.UndefOr[roleNameType] = js.undefined
  }
  
  trait PolicyUser extends js.Object {
    /**
      * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
      */
    var UserId: js.UndefOr[idType] = js.undefined
    /**
      * The name (friendly name, not ARN) identifying the user.
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait PolicyVersion extends js.Object {
    /**
      * The date and time, in ISO 8601 date-time format, when the policy version was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The policy document. The policy document is returned in the response to the GetPolicyVersion and GetAccountAuthorizationDetails operations. It is not returned in the response to the CreatePolicyVersion or ListPolicyVersions operations.  The policy document returned in this structure is URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.
      */
    var Document: js.UndefOr[policyDocumentType] = js.undefined
    /**
      * Specifies whether the policy version is set as the policy's default version.
      */
    var IsDefaultVersion: js.UndefOr[booleanType] = js.undefined
    /**
      * The identifier for the policy version. Policy version identifiers always begin with v (always lowercase). When a policy is created, the first policy version is v1. 
      */
    var VersionId: js.UndefOr[policyVersionIdType] = js.undefined
  }
  
  trait Position extends js.Object {
    /**
      * The column in the line containing the specified position in the document.
      */
    var Column: js.UndefOr[ColumnNumber] = js.undefined
    /**
      * The line containing the specified position in the document.
      */
    var Line: js.UndefOr[LineNumber] = js.undefined
  }
  
  trait PutGroupPolicyRequest extends js.Object {
    /**
      * The name of the group to associate the policy with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The policy document. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the policy document. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
  }
  
  trait PutRolePermissionsBoundaryRequest extends js.Object {
    /**
      * The ARN of the policy that is used to set the permissions boundary for the role.
      */
    var PermissionsBoundary: arnType
    /**
      * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
      */
    var RoleName: roleNameType
  }
  
  trait PutRolePolicyRequest extends js.Object {
    /**
      * The policy document. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the policy document. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
    /**
      * The name of the role to associate the policy with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait PutUserPermissionsBoundaryRequest extends js.Object {
    /**
      * The ARN of the policy that is used to set the permissions boundary for the user.
      */
    var PermissionsBoundary: arnType
    /**
      * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
      */
    var UserName: userNameType
  }
  
  trait PutUserPolicyRequest extends js.Object {
    /**
      * The policy document. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the policy document. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var PolicyName: policyNameType
    /**
      * The name of the user to associate the policy with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
    /**
      * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about client IDs, see CreateOpenIDConnectProvider.
      */
    var ClientID: clientIDType
    /**
      * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var OpenIDConnectProviderArn: arnType
  }
  
  trait RemoveRoleFromInstanceProfileRequest extends js.Object {
    /**
      * The name of the instance profile to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var InstanceProfileName: instanceProfileNameType
    /**
      * The name of the role to remove. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait RemoveUserFromGroupRequest extends js.Object {
    /**
      * The name of the group to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * The name of the user to remove. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait ResetServiceSpecificCredentialRequest extends js.Object {
    /**
      * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    /**
      * The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait ResetServiceSpecificCredentialResponse extends js.Object {
    /**
      * A structure with details about the updated service-specific credential, including the new password.  This is the only time that you can access the password. You cannot recover the password later, but you can reset it again. 
      */
    var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
  }
  
  trait ResourceSpecificResult extends js.Object {
    /**
      * Additional details about the results of the evaluation decision. When there are both IAM policies and resource policies, this parameter explains how each set of policies contributes to the final evaluation decision. When simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must grant access.
      */
    var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined
    /**
      * The result of the simulation of the simulated API operation on the resource specified in EvalResourceName.
      */
    var EvalResourceDecision: PolicyEvaluationDecisionType
    /**
      * The name of the simulated resource, in Amazon Resource Name (ARN) format.
      */
    var EvalResourceName: ResourceNameType
    /**
      * A list of the statements in the input policies that determine the result for this part of the simulation. Remember that even if multiple statements allow the operation on the resource, if any statement denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry included in the result.
      */
    var MatchedStatements: js.UndefOr[StatementListType] = js.undefined
    /**
      * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when a list of ARNs is included in the ResourceArns parameter instead of "*". If you do not specify individual resources, by setting ResourceArns to "*" or by not including the ResourceArns parameter, then any missing context values are instead included under the EvaluationResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
      */
    var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
  }
  
  trait ResyncMFADeviceRequest extends js.Object {
    /**
      * An authentication code emitted by the device. The format for this parameter is a sequence of six digits.
      */
    var AuthenticationCode1: authenticationCodeType
    /**
      * A subsequent authentication code emitted by the device. The format for this parameter is a sequence of six digits.
      */
    var AuthenticationCode2: authenticationCodeType
    /**
      * Serial number that uniquely identifies the MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var SerialNumber: serialNumberType
    /**
      * The name of the user whose MFA device you want to resynchronize. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait Role extends js.Object {
    /**
      *  The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide guide. 
      */
    var Arn: arnType
    /**
      * The policy that grants an entity permission to assume the role.
      */
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the role was created.
      */
    var CreateDate: dateType
    /**
      * A description of the role that you provide.
      */
    var Description: js.UndefOr[roleDescriptionType] = js.undefined
    /**
      * The maximum session duration (in seconds) for the specified role. Anyone who uses the AWS CLI, or API to assume the role can specify the duration using the optional DurationSeconds API parameter or duration-seconds CLI parameter.
      */
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
    /**
      *  The path to the role. For more information about paths, see IAM Identifiers in the Using IAM guide. 
      */
    var Path: pathType
    /**
      * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
      */
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
    /**
      *  The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
      */
    var RoleId: idType
    /**
      * The friendly name that identifies the role.
      */
    var RoleName: roleNameType
    /**
      * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    var Tags: js.UndefOr[tagListType] = js.undefined
  }
  
  trait RoleDetail extends js.Object {
    var Arn: js.UndefOr[arnType] = js.undefined
    /**
      * The trust policy that grants permission to assume the role.
      */
    var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
    /**
      * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
      */
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the role was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * A list of instance profiles that contain this role.
      */
    var InstanceProfileList: js.UndefOr[instanceProfileListType] = js.undefined
    /**
      * The path to the role. For more information about paths, see IAM Identifiers in the Using IAM guide.
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
      */
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
    /**
      * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the Using IAM guide.
      */
    var RoleId: js.UndefOr[idType] = js.undefined
    /**
      * The friendly name that identifies the role.
      */
    var RoleName: js.UndefOr[roleNameType] = js.undefined
    /**
      * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
      */
    var RolePolicyList: js.UndefOr[policyDetailListType] = js.undefined
    /**
      * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    var Tags: js.UndefOr[tagListType] = js.undefined
  }
  
  trait RoleUsageType extends js.Object {
    /**
      * The name of the region where the service-linked role is being used.
      */
    var Region: js.UndefOr[RegionNameType] = js.undefined
    /**
      * The name of the resource that is using the service-linked role.
      */
    var Resources: js.UndefOr[ArnListType] = js.undefined
  }
  
  trait SAMLProviderListEntry extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the SAML provider.
      */
    var Arn: js.UndefOr[arnType] = js.undefined
    /**
      * The date and time when the SAML provider was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * The expiration date and time for the SAML provider.
      */
    var ValidUntil: js.UndefOr[dateType] = js.undefined
  }
  
  trait SSHPublicKey extends js.Object {
    /**
      * The MD5 message digest of the SSH public key.
      */
    var Fingerprint: publicKeyFingerprintType
    /**
      * The SSH public key.
      */
    var SSHPublicKeyBody: publicKeyMaterialType
    /**
      * The unique identifier for the SSH public key.
      */
    var SSHPublicKeyId: publicKeyIdType
    /**
      * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
      */
    var Status: statusType
    /**
      * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
      */
    var UploadDate: js.UndefOr[dateType] = js.undefined
    /**
      * The name of the IAM user associated with the SSH public key.
      */
    var UserName: userNameType
  }
  
  trait SSHPublicKeyMetadata extends js.Object {
    /**
      * The unique identifier for the SSH public key.
      */
    var SSHPublicKeyId: publicKeyIdType
    /**
      * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
      */
    var Status: statusType
    /**
      * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
      */
    var UploadDate: dateType
    /**
      * The name of the IAM user associated with the SSH public key.
      */
    var UserName: userNameType
  }
  
  trait ServerCertificate extends js.Object {
    /**
      * The contents of the public key certificate.
      */
    var CertificateBody: certificateBodyType
    /**
      * The contents of the public key certificate chain.
      */
    var CertificateChain: js.UndefOr[certificateChainType] = js.undefined
    /**
      * The meta information of the server certificate, such as its name, path, ID, and ARN.
      */
    var ServerCertificateMetadata: awsDashSdkLib.clientsIamMod.IAMNs.ServerCertificateMetadata
  }
  
  trait ServerCertificateMetadata extends js.Object {
    /**
      *  The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use them in policies, see IAM Identifiers in the Using IAM guide. 
      */
    var Arn: arnType
    /**
      * The date on which the certificate is set to expire.
      */
    var Expiration: js.UndefOr[dateType] = js.undefined
    /**
      *  The path to the server certificate. For more information about paths, see IAM Identifiers in the Using IAM guide. 
      */
    var Path: pathType
    /**
      *  The stable and unique string identifying the server certificate. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
      */
    var ServerCertificateId: idType
    /**
      * The name that identifies the server certificate.
      */
    var ServerCertificateName: serverCertificateNameType
    /**
      * The date when the server certificate was uploaded.
      */
    var UploadDate: js.UndefOr[dateType] = js.undefined
  }
  
  trait ServiceLastAccessed extends js.Object {
    /**
      * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
      */
    var LastAuthenticated: js.UndefOr[dateType] = js.undefined
    /**
      * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
      */
    var LastAuthenticatedEntity: js.UndefOr[arnType] = js.undefined
    /**
      * The name of the service in which access was attempted.
      */
    var ServiceName: serviceNameType
    /**
      * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
      */
    var ServiceNamespace: serviceNamespaceType
    /**
      * The total number of authenticated entities that have attempted to access the service. This field is null if no IAM entities attempted to access the service within the reporting period.
      */
    var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
  }
  
  trait ServiceSpecificCredential extends js.Object {
    /**
      * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
      */
    var CreateDate: dateType
    /**
      * The name of the service associated with the service-specific credential.
      */
    var ServiceName: serviceName
    /**
      * The generated password for the service-specific credential.
      */
    var ServicePassword: servicePassword
    /**
      * The unique identifier for the service-specific credential.
      */
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    /**
      * The generated user name for the service-specific credential. This value is generated by combining the IAM user's name combined with the ID number of the AWS account, as in jane-at-123456789012, for example. This value cannot be configured by the user.
      */
    var ServiceUserName: serviceUserName
    /**
      * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
      */
    var Status: statusType
    /**
      * The name of the IAM user associated with the service-specific credential.
      */
    var UserName: userNameType
  }
  
  trait ServiceSpecificCredentialMetadata extends js.Object {
    /**
      * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
      */
    var CreateDate: dateType
    /**
      * The name of the service associated with the service-specific credential.
      */
    var ServiceName: serviceName
    /**
      * The unique identifier for the service-specific credential.
      */
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    /**
      * The generated user name for the service-specific credential.
      */
    var ServiceUserName: serviceUserName
    /**
      * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
      */
    var Status: statusType
    /**
      * The name of the IAM user associated with the service-specific credential.
      */
    var UserName: userNameType
  }
  
  trait SetDefaultPolicyVersionRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM policy whose default version you want to set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicyArn: arnType
    /**
      * The version of the policy to set as the default (operative) version. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    var VersionId: policyVersionIdType
  }
  
  trait SigningCertificate extends js.Object {
    /**
      * The contents of the signing certificate.
      */
    var CertificateBody: certificateBodyType
    /**
      * The ID for the signing certificate.
      */
    var CertificateId: certificateIdType
    /**
      * The status of the signing certificate. Active means that the key is valid for API calls, while Inactive means it is not.
      */
    var Status: statusType
    /**
      * The date when the signing certificate was uploaded.
      */
    var UploadDate: js.UndefOr[dateType] = js.undefined
    /**
      * The name of the user the signing certificate is associated with.
      */
    var UserName: userNameType
  }
  
  trait SimulateCustomPolicyRequest extends js.Object {
    /**
      * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each resource. Each operation must include the service identifier, such as iam:CreateUser.
      */
    var ActionNames: ActionNameListType
    /**
      * The ARN of the IAM user that you want to use as the simulated caller of the API operations. CallerArn is required if you include a ResourcePolicy so that the policy's Principal element has a value to use in evaluating the policy. You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.
      */
    var CallerArn: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permission policies, the corresponding value is supplied.
      */
    var ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * A list of policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any resource-based policy must be submitted with the ResourcePolicy parameter. The policies cannot be "scope-down" policies, such as you could include in a call to GetFederationToken or one of the AssumeRole API operations. In other words, do not use policies designed to restrict what a user can do while using the temporary credentials. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyInputList: SimulationPolicyListType
    /**
      * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value defaults to * (all resources). Each API in the ActionNames parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the ResourcePolicy parameter. If you include a ResourcePolicy, then it must be applicable to all of the resources included in the simulation or you receive an invalid input error. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined
    /**
      * Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation. Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see Supported Platforms in the Amazon EC2 User Guide.    EC2-Classic-InstanceStore  instance, image, security-group    EC2-Classic-EBS  instance, image, security-group, volume    EC2-VPC-InstanceStore  instance, image, security-group, network-interface    EC2-VPC-InstanceStore-Subnet  instance, image, security-group, network-interface, subnet    EC2-VPC-EBS  instance, image, security-group, network-interface, volume    EC2-VPC-EBS-Subnet  instance, image, security-group, network-interface, subnet, volume  
      */
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined
    /**
      * An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN, such as an S3 bucket or object. If ResourceOwner is specified, it is also used as the account owner of any ResourcePolicy included in the simulation. If the ResourceOwner parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in CallerArn. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user CallerArn. The ARN for an account uses the following syntax: arn:aws:iam::AWS-account-ID:root. For example, to represent the account with the 112233445566 ID, use the following ARN: arn:aws:iam::112233445566-ID:root. 
      */
    var ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined
  }
  
  trait SimulatePolicyResponse extends js.Object {
    /**
      * The results of the simulation.
      */
    var EvaluationResults: js.UndefOr[EvaluationResultsListType] = js.undefined
    /**
      * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
      */
    var IsTruncated: js.UndefOr[booleanType] = js.undefined
    /**
      * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
  }
  
  trait SimulatePrincipalPolicyRequest extends js.Object {
    /**
      * A list of names of API operations to evaluate in the simulation. Each operation is evaluated for each resource. Each operation must include the service identifier, such as iam:CreateUser.
      */
    var ActionNames: ActionNameListType
    /**
      * The ARN of the IAM user that you want to specify as the simulated caller of the API operations. If you do not specify a CallerArn, it defaults to the ARN of the user that you specify in PolicySourceArn, if you specified a user. If you include both a PolicySourceArn (for example, arn:aws:iam::123456789012:user/David) and a CallerArn (for example, arn:aws:iam::123456789012:user/Bob), the result is that you simulate calling the API operations as Bob, as if Bob had David's policies. You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.  CallerArn is required if you include a ResourcePolicy and the PolicySourceArn is not the ARN for an IAM user. This is required so that the resource-based policy's Principal element has a value to use in evaluating the policy. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var CallerArn: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permission policies, the corresponding value is supplied.
      */
    var ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined
    /**
      * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
      */
    var Marker: js.UndefOr[markerType] = js.undefined
    /**
      * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
      */
    var MaxItems: js.UndefOr[maxItemsType] = js.undefined
    /**
      * An optional list of additional policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of a user, group, or role whose policies you want to include in the simulation. If you specify a user, group, or role, the simulation includes all policies that are associated with that entity. If you specify a user, the simulation also includes all policies that are attached to any groups the user belongs to. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var PolicySourceArn: arnType
    /**
      * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value defaults to * (all resources). Each API in the ActionNames parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the ResourcePolicy parameter. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined
    /**
      * Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation. Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see Supported Platforms in the Amazon EC2 User Guide.    EC2-Classic-InstanceStore  instance, image, security group    EC2-Classic-EBS  instance, image, security group, volume    EC2-VPC-InstanceStore  instance, image, security group, network interface    EC2-VPC-InstanceStore-Subnet  instance, image, security group, network interface, subnet    EC2-VPC-EBS  instance, image, security group, network interface, volume    EC2-VPC-EBS-Subnet  instance, image, security group, network interface, subnet, volume  
      */
    var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined
    /**
      * An AWS account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN, such as an S3 bucket or object. If ResourceOwner is specified, it is also used as the account owner of any ResourcePolicy included in the simulation. If the ResourceOwner parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in CallerArn. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user CallerArn.
      */
    var ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined
    /**
      * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined
  }
  
  trait Statement extends js.Object {
    /**
      * The row and column of the end of a Statement in an IAM policy.
      */
    var EndPosition: js.UndefOr[Position] = js.undefined
    /**
      * The identifier of the policy that was provided as an input.
      */
    var SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.undefined
    /**
      * The type of the policy.
      */
    var SourcePolicyType: js.UndefOr[PolicySourceType] = js.undefined
    /**
      * The row and column of the beginning of the Statement in an IAM policy.
      */
    var StartPosition: js.UndefOr[Position] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key name that can be used to look up or retrieve the associated value. For example, Department or Cost Center are common choices.
      */
    var Key: tagKeyType
    /**
      * The value associated with this tag. For example, tags with a key name of Department could have values such as Human Resources, Accounting, and Support. Tags with a key name of Cost Center might have values that consist of the number associated with the different cost centers in your company. Typically, many resources have tags with the same key name but with different values.  AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code. 
      */
    var Value: tagValueType
  }
  
  trait TagRoleRequest extends js.Object {
    /**
      * The name of the role that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
    /**
      * The list of tags that you want to attach to the role. Each tag consists of a key name and an associated value. You can specify this with a JSON string.
      */
    var Tags: tagListType
  }
  
  trait TagUserRequest extends js.Object {
    /**
      * The list of tags that you want to attach to the user. Each tag consists of a key name and an associated value.
      */
    var Tags: tagListType
    /**
      * The name of the user that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
      */
    var UserName: existingUserNameType
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
      */
    def addClientIDToOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addClientIDToOpenIDConnectProvider(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
      */
    def addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addClientIDToOpenIDConnectProvider(
      params: AddClientIDToOpenIDConnectProviderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this limit cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permissions policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
      */
    def addRoleToInstanceProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addRoleToInstanceProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this limit cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permissions policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
      */
    def addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addRoleToInstanceProfile(
      params: AddRoleToInstanceProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified user to the specified group.
      */
    def addUserToGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addUserToGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds the specified user to the specified group.
      */
    def addUserToGroup(params: AddUserToGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addUserToGroup(
      params: AddUserToGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def attachGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachGroupPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def attachGroupPolicy(params: AttachGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachGroupPolicy(
      params: AttachGroupPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def attachRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachRolePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def attachRolePolicy(params: AttachRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachRolePolicy(
      params: AttachRolePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def attachUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachUserPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def attachUserPolicy(params: AttachUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def attachUserPolicy(
      params: AttachUserPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
      */
    def changePassword(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def changePassword(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
      */
    def changePassword(params: ChangePasswordRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def changePassword(
      params: ChangePasswordRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users.  For information about limits on the number of keys you can create, see Limitations on IAM Entities in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
      */
    def createAccessKey(): awsDashSdkLib.libRequestMod.Request[CreateAccessKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAccessKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccessKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccessKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users.  For information about limits on the number of keys you can create, see Limitations on IAM Entities in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
      */
    def createAccessKey(params: CreateAccessKeyRequest): awsDashSdkLib.libRequestMod.Request[CreateAccessKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAccessKey(
      params: CreateAccessKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccessKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccessKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
      */
    def createAccountAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAccountAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
      */
    def createAccountAlias(params: CreateAccountAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAccountAlias(
      params: CreateAccountAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new group.  For information about the number of groups you can create, see Limitations on IAM Entities in the IAM User Guide.
      */
    def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new group.  For information about the number of groups you can create, see Limitations on IAM Entities in the IAM User Guide.
      */
    def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGroup(
      params: CreateGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.  For information about the number of instance profiles you can create, see Limitations on IAM Entities in the IAM User Guide.
      */
    def createInstanceProfile(): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInstanceProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInstanceProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.  For information about the number of instance profiles you can create, see Limitations on IAM Entities in the IAM User Guide.
      */
    def createInstanceProfile(params: CreateInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInstanceProfile(
      params: CreateInstanceProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInstanceProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
      */
    def createLoginProfile(): awsDashSdkLib.libRequestMod.Request[CreateLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoginProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoginProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
      */
    def createLoginProfile(params: CreateLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLoginProfile(
      params: CreateLoginProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLoginProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of the server certificate(s) that the IdP uses.   You get all of this information from the OIDC IdP that you want to use to access AWS.  Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
      */
    def createOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[CreateOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createOpenIDConnectProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOpenIDConnectProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of the server certificate(s) that the IdP uses.   You get all of this information from the OIDC IdP that you want to use to access AWS.  Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
      */
    def createOpenIDConnectProvider(params: CreateOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[CreateOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createOpenIDConnectProvider(
      params: CreateOpenIDConnectProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateOpenIDConnectProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def createPolicy(): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def createPolicy(params: CreatePolicyRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicy(
      params: CreatePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    def createPolicyVersion(): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicyVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    def createPolicyVersion(params: CreatePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPolicyVersion(
      params: CreatePolicyVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information about limitations on role names and the number of roles you can create, go to Limitations on IAM Entities in the IAM User Guide.
      */
    def createRole(): awsDashSdkLib.libRequestMod.Request[CreateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information about limitations on role names and the number of roles you can create, go to Limitations on IAM Entities in the IAM User Guide.
      */
    def createRole(params: CreateRoleRequest): awsDashSdkLib.libRequestMod.Request[CreateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRole(
      params: CreateRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
      */
    def createSAMLProvider(): awsDashSdkLib.libRequestMod.Request[CreateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSAMLProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSAMLProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
      */
    def createSAMLProvider(params: CreateSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[CreateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSAMLProvider(
      params: CreateSAMLProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSAMLProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
      */
    def createServiceLinkedRole(): awsDashSdkLib.libRequestMod.Request[CreateServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServiceLinkedRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServiceLinkedRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
      */
    def createServiceLinkedRole(params: CreateServiceLinkedRoleRequest): awsDashSdkLib.libRequestMod.Request[CreateServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServiceLinkedRole(
      params: CreateServiceLinkedRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServiceLinkedRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
      */
    def createServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[CreateServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServiceSpecificCredential(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServiceSpecificCredentialResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
      */
    def createServiceSpecificCredential(params: CreateServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[CreateServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServiceSpecificCredential(
      params: CreateServiceSpecificCredentialRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServiceSpecificCredentialResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new IAM user for your AWS account.  For information about limitations on the number of IAM users you can create, see Limitations on IAM Entities in the IAM User Guide.
      */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new IAM user for your AWS account.  For information about limitations on the number of IAM users you can create, see Limitations on IAM Entities in the IAM User Guide.
      */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. For information about limits on the number of MFA devices you can create, see Limitations on Entities in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
      */
    def createVirtualMFADevice(): awsDashSdkLib.libRequestMod.Request[CreateVirtualMFADeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVirtualMFADevice(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualMFADeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualMFADeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. For information about limits on the number of MFA devices you can create, see Limitations on Entities in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
      */
    def createVirtualMFADevice(params: CreateVirtualMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[CreateVirtualMFADeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVirtualMFADevice(
      params: CreateVirtualMFADeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualMFADeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualMFADeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Enabling a Virtual Multi-factor Authentication (MFA) Device in the IAM User Guide.
      */
    def deactivateMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deactivateMFADevice(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Enabling a Virtual Multi-factor Authentication (MFA) Device in the IAM User Guide.
      */
    def deactivateMFADevice(params: DeactivateMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deactivateMFADevice(
      params: DeactivateMFADeviceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
      */
    def deleteAccessKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccessKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
      */
    def deleteAccessKey(params: DeleteAccessKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccessKey(
      params: DeleteAccessKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
      */
    def deleteAccountAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccountAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
      */
    def deleteAccountAlias(params: DeleteAccountAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccountAlias(
      params: DeleteAccountAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the password policy for the AWS account. There are no parameters.
      */
    def deleteAccountPasswordPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccountPasswordPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
      */
    def deleteGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
      */
    def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroup(
      params: DeleteGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deleteGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroupPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deleteGroupPolicy(params: DeleteGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroupPolicy(
      params: DeleteGroupPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
      */
    def deleteInstanceProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInstanceProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
      */
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInstanceProfile(
      params: DeleteInstanceProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
      */
    def deleteLoginProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoginProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access, you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
      */
    def deleteLoginProfile(params: DeleteLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLoginProfile(
      params: DeleteLoginProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
      */
    def deleteOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteOpenIDConnectProvider(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
      */
    def deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteOpenIDConnectProvider(
      params: DeleteOpenIDConnectProviderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition, you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deletePolicy(params: DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicy(
      params: DeletePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
      */
    def deletePolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicyVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
      */
    def deletePolicyVersion(params: DeletePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePolicyVersion(
      params: DeletePolicyVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
      */
    def deleteRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRole(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
      */
    def deleteRole(params: DeleteRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRole(
      params: DeleteRoleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the role to perform all the actions granted in its permissions policies.  
      */
    def deleteRolePermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRolePermissionsBoundary(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the role to perform all the actions granted in its permissions policies.  
      */
    def deleteRolePermissionsBoundary(params: DeleteRolePermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRolePermissionsBoundary(
      params: DeleteRolePermissionsBoundaryRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deleteRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRolePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deleteRolePolicy(params: DeleteRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRolePolicy(
      params: DeleteRolePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
      */
    def deleteSAMLProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSAMLProvider(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
      */
    def deleteSAMLProvider(params: DeleteSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSAMLProvider(
      params: DeleteSAMLProviderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def deleteSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSSHPublicKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSSHPublicKey(
      params: DeleteSSHPublicKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
      */
    def deleteServerCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServerCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
      */
    def deleteServerCertificate(params: DeleteServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServerCertificate(
      params: DeleteServerCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
      */
    def deleteServiceLinkedRole(): awsDashSdkLib.libRequestMod.Request[DeleteServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServiceLinkedRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServiceLinkedRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
      */
    def deleteServiceLinkedRole(params: DeleteServiceLinkedRoleRequest): awsDashSdkLib.libRequestMod.Request[DeleteServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServiceLinkedRole(
      params: DeleteServiceLinkedRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServiceLinkedRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServiceLinkedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified service-specific credential.
      */
    def deleteServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServiceSpecificCredential(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified service-specific credential.
      */
    def deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServiceSpecificCredential(
      params: DeleteServiceSpecificCredentialRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
      */
    def deleteSigningCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSigningCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
      */
    def deleteSigningCertificate(params: DeleteSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSigningCertificate(
      params: DeleteSigningCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing certificates, MFA devices enabled for AWS, or attached policies.
      */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing certificates, MFA devices enabled for AWS, or attached policies.
      */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
      */
    def deleteUserPermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserPermissionsBoundary(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
      */
    def deleteUserPermissionsBoundary(params: DeleteUserPermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserPermissionsBoundary(
      params: DeleteUserPermissionsBoundaryRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deleteUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
      */
    def deleteUserPolicy(params: DeleteUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserPolicy(
      params: DeleteUserPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
      */
    def deleteVirtualMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVirtualMFADevice(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
      */
    def deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVirtualMFADevice(
      params: DeleteVirtualMFADeviceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def detachGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachGroupPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def detachGroupPolicy(params: DetachGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachGroupPolicy(
      params: DetachGroupPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def detachRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachRolePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def detachRolePolicy(params: DetachRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachRolePolicy(
      params: DetachRolePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def detachUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachUserPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def detachUserPolicy(params: DetachUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detachUserPolicy(
      params: DetachUserPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
      */
    def enableMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableMFADevice(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
      */
    def enableMFADevice(params: EnableMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableMFADevice(
      params: EnableMFADeviceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Generates a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
      */
    def generateCredentialReport(): awsDashSdkLib.libRequestMod.Request[GenerateCredentialReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateCredentialReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateCredentialReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateCredentialReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a request for a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access AWS services. Recent activity usually appears within four hours. IAM reports activity for the last 365 days, or less if your region began supporting this feature within the last year. For more information, see Regions Where Data Is Tracked.  The service last accessed data includes all attempts to access an AWS API, not just the successful ones. This includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with CloudTrail in the IAM User Guide.  The GenerateServiceLastAccessedDetails operation returns a JobId. Use this parameter in the following operations to retrieve the following details from your report:     GetServiceLastAccessedDetails – Use this operation for users, groups, roles, or policies to list every AWS service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt.     GetServiceLastAccessedDetailsWithEntities – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific AWS service.    To check the status of the GenerateServiceLastAccessedDetails request, use the JobId parameter in the same operations and test the JobStatus response parameter. For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the ListPoliciesGrantingServiceAccess operation.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For more information about service last accessed data, see Reducing Policy Scope by Viewing User Activity in the IAM User Guide.
      */
    def generateServiceLastAccessedDetails(): awsDashSdkLib.libRequestMod.Request[GenerateServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateServiceLastAccessedDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateServiceLastAccessedDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a request for a report that includes details about when an IAM resource (user, group, role, or policy) was last used in an attempt to access AWS services. Recent activity usually appears within four hours. IAM reports activity for the last 365 days, or less if your region began supporting this feature within the last year. For more information, see Regions Where Data Is Tracked.  The service last accessed data includes all attempts to access an AWS API, not just the successful ones. This includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An unexpected entry in the service last accessed data does not mean that your account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with CloudTrail in the IAM User Guide.  The GenerateServiceLastAccessedDetails operation returns a JobId. Use this parameter in the following operations to retrieve the following details from your report:     GetServiceLastAccessedDetails – Use this operation for users, groups, roles, or policies to list every AWS service that the resource could access using permissions policies. For each service, the response includes information about the most recent access attempt.     GetServiceLastAccessedDetailsWithEntities – Use this operation for groups and policies to list information about the associated entities (users or roles) that attempted to access a specific AWS service.    To check the status of the GenerateServiceLastAccessedDetails request, use the JobId parameter in the same operations and test the JobStatus response parameter. For additional information about the permissions policies that allow an identity (user, group, or role) to access specific services, use the ListPoliciesGrantingServiceAccess operation.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For more information about service last accessed data, see Reducing Policy Scope by Viewing User Activity in the IAM User Guide.
      */
    def generateServiceLastAccessedDetails(params: GenerateServiceLastAccessedDetailsRequest): awsDashSdkLib.libRequestMod.Request[GenerateServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateServiceLastAccessedDetails(
      params: GenerateServiceLastAccessedDetailsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateServiceLastAccessedDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and region that were specified in the last request made with that key.
      */
    def getAccessKeyLastUsed(): awsDashSdkLib.libRequestMod.Request[GetAccessKeyLastUsedResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccessKeyLastUsed(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccessKeyLastUsedResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccessKeyLastUsedResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and region that were specified in the last request made with that key.
      */
    def getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest): awsDashSdkLib.libRequestMod.Request[GetAccessKeyLastUsedResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccessKeyLastUsed(
      params: GetAccessKeyLastUsedRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccessKeyLastUsedResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccessKeyLastUsedResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
      */
    def getAccountAuthorizationDetails(): awsDashSdkLib.libRequestMod.Request[GetAccountAuthorizationDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountAuthorizationDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountAuthorizationDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountAuthorizationDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
      */
    def getAccountAuthorizationDetails(params: GetAccountAuthorizationDetailsRequest): awsDashSdkLib.libRequestMod.Request[GetAccountAuthorizationDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountAuthorizationDetails(
      params: GetAccountAuthorizationDetailsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountAuthorizationDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountAuthorizationDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the password policy for the AWS account. For more information about using a password policy, go to Managing an IAM Password Policy.
      */
    def getAccountPasswordPolicy(): awsDashSdkLib.libRequestMod.Request[GetAccountPasswordPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountPasswordPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountPasswordPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountPasswordPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about IAM entity usage and IAM quotas in the AWS account.  For information about limitations on IAM entities, see Limitations on IAM Entities in the IAM User Guide.
      */
    def getAccountSummary(): awsDashSdkLib.libRequestMod.Request[GetAccountSummaryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountSummary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSummaryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSummaryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
      */
    def getContextKeysForCustomPolicy(): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContextKeysForCustomPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContextKeysForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
      */
    def getContextKeysForCustomPolicy(params: GetContextKeysForCustomPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContextKeysForCustomPolicy(
      params: GetContextKeysForCustomPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContextKeysForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
      */
    def getContextKeysForPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContextKeysForPrincipalPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContextKeysForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
      */
    def getContextKeysForPrincipalPolicy(params: GetContextKeysForPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContextKeysForPrincipalPolicy(
      params: GetContextKeysForPrincipalPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContextKeysForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContextKeysForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Retrieves a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
      */
    def getCredentialReport(): awsDashSdkLib.libRequestMod.Request[GetCredentialReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCredentialReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCredentialReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCredentialReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
      */
    def getGroup(): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
      */
    def getGroup(params: GetGroupRequest): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroup(
      params: GetGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def getGroupPolicy(): awsDashSdkLib.libRequestMod.Request[GetGroupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroupPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGroupPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def getGroupPolicy(params: GetGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetGroupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGroupPolicy(
      params: GetGroupPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGroupPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGroupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
      */
    def getInstanceProfile(): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstanceProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
      */
    def getInstanceProfile(params: GetInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstanceProfile(
      params: GetInstanceProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
      */
    def getLoginProfile(): awsDashSdkLib.libRequestMod.Request[GetLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLoginProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLoginProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
      */
    def getLoginProfile(params: GetLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[GetLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLoginProfile(
      params: GetLoginProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLoginProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLoginProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
      */
    def getOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[GetOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOpenIDConnectProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOpenIDConnectProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
      */
    def getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[GetOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOpenIDConnectProvider(
      params: GetOpenIDConnectProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOpenIDConnectProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOpenIDConnectProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def getPolicy(): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def getPolicy(params: GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicy(
      params: GetPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    def getPolicyVersion(): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicyVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
      */
    def getPolicyVersion(params: GetPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPolicyVersion(
      params: GetPolicyVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPolicyVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
      */
    def getRole(): awsDashSdkLib.libRequestMod.Request[GetRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRole(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRoleResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
      */
    def getRole(params: GetRoleRequest): awsDashSdkLib.libRequestMod.Request[GetRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRole(
      params: GetRoleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRoleResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
      */
    def getRolePolicy(): awsDashSdkLib.libRequestMod.Request[GetRolePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRolePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRolePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRolePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
      */
    def getRolePolicy(params: GetRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[GetRolePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRolePolicy(
      params: GetRolePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRolePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRolePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
      */
    def getSAMLProvider(): awsDashSdkLib.libRequestMod.Request[GetSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSAMLProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSAMLProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
      */
    def getSAMLProvider(params: GetSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[GetSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSAMLProvider(
      params: GetSAMLProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSAMLProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def getSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[GetSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSSHPublicKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSSHPublicKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def getSSHPublicKey(params: GetSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[GetSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSSHPublicKey(
      params: GetSSHPublicKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSSHPublicKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
      */
    def getServerCertificate(): awsDashSdkLib.libRequestMod.Request[GetServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServerCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServerCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
      */
    def getServerCertificate(params: GetServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[GetServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServerCertificate(
      params: GetServerCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServerCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * After you generate a user, group, role, or policy report using the GenerateServiceLastAccessedDetails operation, you can use the JobId parameter in GetServiceLastAccessedDetails. This operation retrieves the status of your report job and a list of AWS services that the resource (user, group, role, or managed policy) can access.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the GetServiceLastAccessedDetails operation returns the reason that it failed. The GetServiceLastAccessedDetails operation returns a list of services that includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:    User – Returns the user ARN that you used to generate the report    Group – Returns the ARN of the group member (user) that last attempted to access the service    Role – Returns the role ARN that you used to generate the report    Policy – Returns the ARN of the user or role that last used the policy to attempt to access the service   By default, the list is sorted by service namespace.
      */
    def getServiceLastAccessedDetails(): awsDashSdkLib.libRequestMod.Request[GetServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServiceLastAccessedDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceLastAccessedDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * After you generate a user, group, role, or policy report using the GenerateServiceLastAccessedDetails operation, you can use the JobId parameter in GetServiceLastAccessedDetails. This operation retrieves the status of your report job and a list of AWS services that the resource (user, group, role, or managed policy) can access.  Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the GetServiceLastAccessedDetails operation returns the reason that it failed. The GetServiceLastAccessedDetails operation returns a list of services that includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:    User – Returns the user ARN that you used to generate the report    Group – Returns the ARN of the group member (user) that last attempted to access the service    Role – Returns the role ARN that you used to generate the report    Policy – Returns the ARN of the user or role that last used the policy to attempt to access the service   By default, the list is sorted by service namespace.
      */
    def getServiceLastAccessedDetails(params: GetServiceLastAccessedDetailsRequest): awsDashSdkLib.libRequestMod.Request[GetServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServiceLastAccessedDetails(
      params: GetServiceLastAccessedDetailsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceLastAccessedDetailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceLastAccessedDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * After you generate a group or policy report using the GenerateServiceLastAccessedDetails operation, you can use the JobId parameter in GetServiceLastAccessedDetailsWithEntities. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.    Group – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.    Policy – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.   You can also use this operation for user or role reports to retrieve details about those entities. If the operation fails, the GetServiceLastAccessedDetailsWithEntities operation returns the reason that it failed. By default, the list of associated entities is sorted by date, with the most recent access listed first.
      */
    def getServiceLastAccessedDetailsWithEntities(): awsDashSdkLib.libRequestMod.Request[
        GetServiceLastAccessedDetailsWithEntitiesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def getServiceLastAccessedDetailsWithEntities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceLastAccessedDetailsWithEntitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetServiceLastAccessedDetailsWithEntitiesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * After you generate a group or policy report using the GenerateServiceLastAccessedDetails operation, you can use the JobId parameter in GetServiceLastAccessedDetailsWithEntities. This operation retrieves the status of your report job and a list of entities that could have used group or policy permissions to access the specified service.    Group – For a group report, this operation returns a list of users in the group that could have used the group’s policies in an attempt to access the service.    Policy – For a policy report, this operation returns a list of entities (users or roles) that could have used the policy in an attempt to access the service.   You can also use this operation for user or role reports to retrieve details about those entities. If the operation fails, the GetServiceLastAccessedDetailsWithEntities operation returns the reason that it failed. By default, the list of associated entities is sorted by date, with the most recent access listed first.
      */
    def getServiceLastAccessedDetailsWithEntities(params: GetServiceLastAccessedDetailsWithEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
        GetServiceLastAccessedDetailsWithEntitiesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def getServiceLastAccessedDetailsWithEntities(
      params: GetServiceLastAccessedDetailsWithEntitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceLastAccessedDetailsWithEntitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetServiceLastAccessedDetailsWithEntitiesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
      */
    def getServiceLinkedRoleDeletionStatus(): awsDashSdkLib.libRequestMod.Request[GetServiceLinkedRoleDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServiceLinkedRoleDeletionStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceLinkedRoleDeletionStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceLinkedRoleDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
      */
    def getServiceLinkedRoleDeletionStatus(params: GetServiceLinkedRoleDeletionStatusRequest): awsDashSdkLib.libRequestMod.Request[GetServiceLinkedRoleDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getServiceLinkedRoleDeletionStatus(
      params: GetServiceLinkedRoleDeletionStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceLinkedRoleDeletionStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceLinkedRoleDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
      */
    def getUser(): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
      */
    def getUser(params: GetUserRequest): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUser(
      params: GetUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def getUserPolicy(): awsDashSdkLib.libRequestMod.Request[GetUserPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUserPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def getUserPolicy(params: GetUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetUserPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUserPolicy(
      params: GetUserPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
      */
    def listAccessKeys(): awsDashSdkLib.libRequestMod.Request[ListAccessKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAccessKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAccessKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAccessKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the access key IDs associated with the specified IAM user. If there is none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
      */
    def listAccessKeys(params: ListAccessKeysRequest): awsDashSdkLib.libRequestMod.Request[ListAccessKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAccessKeys(
      params: ListAccessKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAccessKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAccessKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
      */
    def listAccountAliases(): awsDashSdkLib.libRequestMod.Request[ListAccountAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAccountAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAccountAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAccountAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
      */
    def listAccountAliases(params: ListAccountAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListAccountAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAccountAliases(
      params: ListAccountAliasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAccountAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAccountAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
      */
    def listAttachedGroupPolicies(): awsDashSdkLib.libRequestMod.Request[ListAttachedGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedGroupPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedGroupPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
      */
    def listAttachedGroupPolicies(params: ListAttachedGroupPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListAttachedGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedGroupPolicies(
      params: ListAttachedGroupPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedGroupPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
      */
    def listAttachedRolePolicies(): awsDashSdkLib.libRequestMod.Request[ListAttachedRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedRolePolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedRolePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
      */
    def listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListAttachedRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedRolePolicies(
      params: ListAttachedRolePoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedRolePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
      */
    def listAttachedUserPolicies(): awsDashSdkLib.libRequestMod.Request[ListAttachedUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedUserPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedUserPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
      */
    def listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListAttachedUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAttachedUserPolicies(
      params: ListAttachedUserPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedUserPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listEntitiesForPolicy(): awsDashSdkLib.libRequestMod.Request[ListEntitiesForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listEntitiesForPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEntitiesForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEntitiesForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listEntitiesForPolicy(params: ListEntitiesForPolicyRequest): awsDashSdkLib.libRequestMod.Request[ListEntitiesForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listEntitiesForPolicy(
      params: ListEntitiesForPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEntitiesForPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEntitiesForPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
      */
    def listGroupPolicies(): awsDashSdkLib.libRequestMod.Request[ListGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroupPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
      */
    def listGroupPolicies(params: ListGroupPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroupPolicies(
      params: ListGroupPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
      */
    def listGroups(): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
      */
    def listGroups(params: ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroups(
      params: ListGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listGroupsForUser(): awsDashSdkLib.libRequestMod.Request[ListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroupsForUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupsForUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listGroupsForUser(params: ListGroupsForUserRequest): awsDashSdkLib.libRequestMod.Request[ListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroupsForUser(
      params: ListGroupsForUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupsForUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listInstanceProfiles(): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInstanceProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listInstanceProfiles(params: ListInstanceProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInstanceProfiles(
      params: ListInstanceProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listInstanceProfilesForRole(): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesForRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInstanceProfilesForRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceProfilesForRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesForRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listInstanceProfilesForRole(params: ListInstanceProfilesForRoleRequest): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesForRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInstanceProfilesForRole(
      params: ListInstanceProfilesForRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceProfilesForRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesForRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listMFADevices(): awsDashSdkLib.libRequestMod.Request[ListMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMFADevices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMFADevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listMFADevices(params: ListMFADevicesRequest): awsDashSdkLib.libRequestMod.Request[ListMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMFADevices(
      params: ListMFADevicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMFADevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
      */
    def listOpenIDConnectProviders(): awsDashSdkLib.libRequestMod.Request[ListOpenIDConnectProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOpenIDConnectProviders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOpenIDConnectProvidersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOpenIDConnectProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
      */
    def listOpenIDConnectProviders(params: ListOpenIDConnectProvidersRequest): awsDashSdkLib.libRequestMod.Request[ListOpenIDConnectProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOpenIDConnectProviders(
      params: ListOpenIDConnectProvidersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOpenIDConnectProvidersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOpenIDConnectProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def listPolicies(): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def listPolicies(params: ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicies(
      params: ListPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.  This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  The list of policies returned by the operation depends on the ARN of the identity that you provide.    User – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs.     Group – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.    Role – The list of policies includes only the managed and inline policies that are attached to the role.   For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide. Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the GetUser or GetRole operations.
      */
    def listPoliciesGrantingServiceAccess(): awsDashSdkLib.libRequestMod.Request[ListPoliciesGrantingServiceAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPoliciesGrantingServiceAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPoliciesGrantingServiceAccessResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPoliciesGrantingServiceAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified service.  This operation does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.  The list of policies returned by the operation depends on the ARN of the identity that you provide.    User – The list of policies includes the managed and inline policies that are attached to the user directly. The list also includes any additional managed and inline policies that are attached to the group to which the user belongs.     Group – The list of policies includes only the managed and inline policies that are attached to the group directly. Policies that are attached to the group’s user are not included.    Role – The list of policies includes only the managed and inline policies that are attached to the role.   For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide. Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed policy is currently used to set the permissions boundary for a user or role, use the GetUser or GetRole operations.
      */
    def listPoliciesGrantingServiceAccess(params: ListPoliciesGrantingServiceAccessRequest): awsDashSdkLib.libRequestMod.Request[ListPoliciesGrantingServiceAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPoliciesGrantingServiceAccess(
      params: ListPoliciesGrantingServiceAccessRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPoliciesGrantingServiceAccessResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPoliciesGrantingServiceAccessResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def listPolicyVersions(): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicyVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def listPolicyVersions(params: ListPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPolicyVersions(
      params: ListPolicyVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
      */
    def listRolePolicies(): awsDashSdkLib.libRequestMod.Request[ListRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRolePolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRolePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
      */
    def listRolePolicies(params: ListRolePoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRolePolicies(
      params: ListRolePoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRolePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRolePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def listRoleTags(): awsDashSdkLib.libRequestMod.Request[ListRoleTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoleTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoleTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoleTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def listRoleTags(params: ListRoleTagsRequest): awsDashSdkLib.libRequestMod.Request[ListRoleTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoleTags(
      params: ListRoleTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoleTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoleTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listRoles(): awsDashSdkLib.libRequestMod.Request[ListRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRolesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listRoles(params: ListRolesRequest): awsDashSdkLib.libRequestMod.Request[ListRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRoles(
      params: ListRolesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRolesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
      */
    def listSAMLProviders(): awsDashSdkLib.libRequestMod.Request[ListSAMLProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSAMLProviders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSAMLProvidersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSAMLProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
      */
    def listSAMLProviders(params: ListSAMLProvidersRequest): awsDashSdkLib.libRequestMod.Request[ListSAMLProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSAMLProviders(
      params: ListSAMLProvidersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSAMLProvidersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSAMLProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the SSH public keys associated with the specified IAM user. If there none exists, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
      */
    def listSSHPublicKeys(): awsDashSdkLib.libRequestMod.Request[ListSSHPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSSHPublicKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSSHPublicKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSSHPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the SSH public keys associated with the specified IAM user. If there none exists, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
      */
    def listSSHPublicKeys(params: ListSSHPublicKeysRequest): awsDashSdkLib.libRequestMod.Request[ListSSHPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSSHPublicKeys(
      params: ListSSHPublicKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSSHPublicKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSSHPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
      */
    def listServerCertificates(): awsDashSdkLib.libRequestMod.Request[ListServerCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServerCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServerCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServerCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
      */
    def listServerCertificates(params: ListServerCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListServerCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServerCertificates(
      params: ListServerCertificatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServerCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServerCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
      */
    def listServiceSpecificCredentials(): awsDashSdkLib.libRequestMod.Request[ListServiceSpecificCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServiceSpecificCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServiceSpecificCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServiceSpecificCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the service-specific credentials associated with the specified IAM user. If none exists, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
      */
    def listServiceSpecificCredentials(params: ListServiceSpecificCredentialsRequest): awsDashSdkLib.libRequestMod.Request[ListServiceSpecificCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServiceSpecificCredentials(
      params: ListServiceSpecificCredentialsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServiceSpecificCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServiceSpecificCredentialsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the signing certificates associated with the specified IAM user. If there none exists, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
      */
    def listSigningCertificates(): awsDashSdkLib.libRequestMod.Request[ListSigningCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSigningCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the signing certificates associated with the specified IAM user. If there none exists, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
      */
    def listSigningCertificates(params: ListSigningCertificatesRequest): awsDashSdkLib.libRequestMod.Request[ListSigningCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSigningCertificates(
      params: ListSigningCertificatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSigningCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSigningCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
      */
    def listUserPolicies(): awsDashSdkLib.libRequestMod.Request[ListUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
      */
    def listUserPolicies(params: ListUserPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserPolicies(
      params: ListUserPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def listUserTags(): awsDashSdkLib.libRequestMod.Request[ListUserTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def listUserTags(params: ListUserTagsRequest): awsDashSdkLib.libRequestMod.Request[ListUserTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserTags(
      params: ListUserTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      params: ListUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listVirtualMFADevices(): awsDashSdkLib.libRequestMod.Request[ListVirtualMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVirtualMFADevices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualMFADevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
      */
    def listVirtualMFADevices(params: ListVirtualMFADevicesRequest): awsDashSdkLib.libRequestMod.Request[ListVirtualMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVirtualMFADevices(
      params: ListVirtualMFADevicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualMFADevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualMFADevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def putGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putGroupPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def putGroupPolicy(params: PutGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putGroupPolicy(
      params: PutGroupPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
      */
    def putRolePermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRolePermissionsBoundary(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
      */
    def putRolePermissionsBoundary(params: PutRolePermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRolePermissionsBoundary(
      params: PutRolePermissionsBoundaryRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def putRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRolePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def putRolePolicy(params: PutRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRolePolicy(
      params: PutRolePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
      */
    def putUserPermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putUserPermissionsBoundary(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
      */
    def putUserPermissionsBoundary(params: PutUserPermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putUserPermissionsBoundary(
      params: PutUserPermissionsBoundaryRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def putUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putUserPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def putUserPolicy(params: PutUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putUserPolicy(
      params: PutUserPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
      */
    def removeClientIDFromOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeClientIDFromOpenIDConnectProvider(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
      */
    def removeClientIDFromOpenIDConnectProvider(params: RemoveClientIDFromOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeClientIDFromOpenIDConnectProvider(
      params: RemoveClientIDFromOpenIDConnectProviderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
      */
    def removeRoleFromInstanceProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeRoleFromInstanceProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
      */
    def removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeRoleFromInstanceProfile(
      params: RemoveRoleFromInstanceProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified user from the specified group.
      */
    def removeUserFromGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeUserFromGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified user from the specified group.
      */
    def removeUserFromGroup(params: RemoveUserFromGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeUserFromGroup(
      params: RemoveUserFromGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
      */
    def resetServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[ResetServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetServiceSpecificCredential(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetServiceSpecificCredentialResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
      */
    def resetServiceSpecificCredential(params: ResetServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[ResetServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetServiceSpecificCredential(
      params: ResetServiceSpecificCredentialRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetServiceSpecificCredentialResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetServiceSpecificCredentialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
      */
    def resyncMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resyncMFADevice(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
      */
    def resyncMFADevice(params: ResyncMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resyncMFADevice(
      params: ResyncMFADeviceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def setDefaultPolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDefaultPolicyVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
      */
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDefaultPolicyVersion(
      params: SetDefaultPolicyVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
      */
    def simulateCustomPolicy(): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def simulateCustomPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SimulatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
      */
    def simulateCustomPolicy(params: SimulateCustomPolicyRequest): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def simulateCustomPolicy(
      params: SimulateCustomPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SimulatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations, it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
      */
    def simulatePrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def simulatePrincipalPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SimulatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations, it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
      */
    def simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def simulatePrincipalPolicy(
      params: SimulatePrincipalPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SimulatePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SimulatePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def tagRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagRole(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def tagRole(params: TagRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagRole(
      params: TagRoleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def tagUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def tagUser(params: TagUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagUser(
      params: TagUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def untagRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagRole(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def untagRole(params: UntagRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagRole(
      params: UntagRoleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def untagUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    def untagUser(params: UntagUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagUser(
      params: UntagUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
      */
    def updateAccessKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccessKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
      */
    def updateAccessKey(params: UpdateAccessKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccessKey(
      params: UpdateAccessKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
      */
    def updateAccountPasswordPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountPasswordPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
      */
    def updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountPasswordPolicy(
      params: UpdateAccountPasswordPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
      */
    def updateAssumeRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAssumeRolePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
      */
    def updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAssumeRolePolicy(
      params: UpdateAssumeRolePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
      */
    def updateGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
      */
    def updateGroup(params: UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGroup(
      params: UpdateGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
      */
    def updateLoginProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateLoginProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
      */
    def updateLoginProfile(params: UpdateLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateLoginProfile(
      params: UpdateLoginProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint. Therefore, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
      */
    def updateOpenIDConnectProviderThumbprint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateOpenIDConnectProviderThumbprint(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint. Therefore, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
      */
    def updateOpenIDConnectProviderThumbprint(params: UpdateOpenIDConnectProviderThumbprintRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateOpenIDConnectProviderThumbprint(
      params: UpdateOpenIDConnectProviderThumbprintRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the description or maximum session duration setting of a role.
      */
    def updateRole(): awsDashSdkLib.libRequestMod.Request[UpdateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the description or maximum session duration setting of a role.
      */
    def updateRole(params: UpdateRoleRequest): awsDashSdkLib.libRequestMod.Request[UpdateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRole(
      params: UpdateRoleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use UpdateRole instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
      */
    def updateRoleDescription(): awsDashSdkLib.libRequestMod.Request[UpdateRoleDescriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRoleDescription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoleDescriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoleDescriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use UpdateRole instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
      */
    def updateRoleDescription(params: UpdateRoleDescriptionRequest): awsDashSdkLib.libRequestMod.Request[UpdateRoleDescriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRoleDescription(
      params: UpdateRoleDescriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoleDescriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoleDescriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
      */
    def updateSAMLProvider(): awsDashSdkLib.libRequestMod.Request[UpdateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSAMLProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSAMLProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
      */
    def updateSAMLProvider(params: UpdateSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[UpdateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSAMLProvider(
      params: UpdateSAMLProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSAMLProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSAMLProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def updateSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSSHPublicKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def updateSSHPublicKey(params: UpdateSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSSHPublicKey(
      params: UpdateSSHPublicKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
      */
    def updateServerCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServerCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
      */
    def updateServerCertificate(params: UpdateServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServerCertificate(
      params: UpdateServerCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
      */
    def updateServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServiceSpecificCredential(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
      */
    def updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServiceSpecificCredential(
      params: UpdateServiceSpecificCredentialRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
      */
    def updateSigningCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSigningCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
      */
    def updateSigningCertificate(params: UpdateSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSigningCertificate(
      params: UpdateSigningCertificateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
      */
    def updateUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
      */
    def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      params: UpdateUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def uploadSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[UploadSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadSSHPublicKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadSSHPublicKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
      */
    def uploadSSHPublicKey(params: UploadSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[UploadSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadSSHPublicKey(
      params: UploadSSHPublicKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadSSHPublicKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadSSHPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
      */
    def uploadServerCertificate(): awsDashSdkLib.libRequestMod.Request[UploadServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadServerCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadServerCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
      */
    def uploadServerCertificate(params: UploadServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[UploadServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadServerCertificate(
      params: UploadServerCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadServerCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadServerCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName field is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def uploadSigningCertificate(): awsDashSdkLib.libRequestMod.Request[UploadSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadSigningCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadSigningCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName field is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
      */
    def uploadSigningCertificate(params: UploadSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[UploadSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadSigningCertificate(
      params: UploadSigningCertificateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadSigningCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_instanceProfileExists(state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceProfileExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_instanceProfileExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists,
      params: GetInstanceProfileRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_instanceProfileExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists,
      params: GetInstanceProfileRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_userExists(state: awsDashSdkLib.awsDashSdkLibStrings.userExists): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_userExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.userExists,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_userExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.userExists,
      params: GetUserRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_userExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.userExists,
      params: GetUserRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagRoleRequest extends js.Object {
    /**
      * The name of the IAM role from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
    /**
      * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified role.
      */
    var TagKeys: tagKeyListType
  }
  
  trait UntagUserRequest extends js.Object {
    /**
      * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified user.
      */
    var TagKeys: tagKeyListType
    /**
      * The name of the IAM user from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait UpdateAccessKeyRequest extends js.Object {
    /**
      * The access key ID of the secret access key you want to update. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var AccessKeyId: accessKeyIdType
    /**
      *  The status you want to assign to the secret access key. Active means that the key can be used for API calls to AWS, while Inactive means that the key cannot be used.
      */
    var Status: statusType
    /**
      * The name of the user whose key you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait UpdateAccountPasswordPolicyRequest extends js.Object {
    /**
      *  Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more information, see Letting IAM Users Change Their Own Passwords in the IAM User Guide. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users in the account do not automatically have permissions to change their own password.
      */
    var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
    /**
      * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed until an administrator resets the password. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
      */
    var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
    /**
      * The number of days that an IAM user password is valid. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM user passwords never expire.
      */
    var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
    /**
      * The minimum number of characters allowed in an IAM user password. If you do not specify a value for this parameter, then the operation uses the default value of 6.
      */
    var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
    /**
      * Specifies the number of previous passwords that IAM users are prevented from reusing. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM users are not prevented from reusing previous passwords.
      */
    var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
    /**
      * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one lowercase character.
      */
    var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one numeric character.
      */
    var RequireNumbers: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | ' If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one symbol character.
      */
    var RequireSymbols: js.UndefOr[booleanType] = js.undefined
    /**
      * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one uppercase character.
      */
    var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
  }
  
  trait UpdateAssumeRolePolicyRequest extends js.Object {
    /**
      * The policy that grants an entity permission to assume the role. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PolicyDocument: policyDocumentType
    /**
      * The name of the role to update with the new policy. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var RoleName: roleNameType
  }
  
  trait UpdateGroupRequest extends js.Object {
    /**
      * Name of the IAM group to update. If you're changing the name of the group, this is the original name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var GroupName: groupNameType
    /**
      * New name for the IAM group. Only include this if changing the group's name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var NewGroupName: js.UndefOr[groupNameType] = js.undefined
    /**
      * New path for the IAM group. Only include this if changing the group's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var NewPath: js.UndefOr[pathType] = js.undefined
  }
  
  trait UpdateLoginProfileRequest extends js.Object {
    /**
      * The new password for the specified IAM user. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)   However, the format can be further restricted by the account administrator by setting a password policy on the AWS account. For more information, see UpdateAccountPasswordPolicy.
      */
    var Password: js.UndefOr[passwordType] = js.undefined
    /**
      * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next sign-in.
      */
    var PasswordResetRequired: js.UndefOr[booleanObjectType] = js.undefined
    /**
      * The name of the user whose password you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait UpdateOpenIDConnectProviderThumbprintRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the thumbprint. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var OpenIDConnectProviderArn: arnType
    /**
      * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more information, see CreateOpenIDConnectProvider. 
      */
    var ThumbprintList: thumbprintListType
  }
  
  trait UpdateRoleDescriptionRequest extends js.Object {
    /**
      * The new description that you want to apply to the specified role.
      */
    var Description: roleDescriptionType
    /**
      * The name of the role that you want to modify.
      */
    var RoleName: roleNameType
  }
  
  trait UpdateRoleDescriptionResponse extends js.Object {
    /**
      * A structure that contains details about the modified role.
      */
    var Role: js.UndefOr[Role] = js.undefined
  }
  
  trait UpdateRoleRequest extends js.Object {
    /**
      * The new description that you want to apply to the specified role.
      */
    var Description: js.UndefOr[roleDescriptionType] = js.undefined
    /**
      * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours. Anyone who assumes the role from the AWS CLI or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM Roles in the IAM User Guide.
      */
    var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
    /**
      * The name of the role that you want to modify.
      */
    var RoleName: roleNameType
  }
  
  trait UpdateRoleResponse extends js.Object
  
  trait UpdateSAMLProviderRequest extends js.Object {
    /**
      * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP.
      */
    var SAMLMetadataDocument: SAMLMetadataDocumentType
    /**
      * The Amazon Resource Name (ARN) of the SAML provider to update. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
      */
    var SAMLProviderArn: arnType
  }
  
  trait UpdateSAMLProviderResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the SAML provider that was updated.
      */
    var SAMLProviderArn: js.UndefOr[arnType] = js.undefined
  }
  
  trait UpdateSSHPublicKeyRequest extends js.Object {
    /**
      * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var SSHPublicKeyId: publicKeyIdType
    /**
      * The status to assign to the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
      */
    var Status: statusType
    /**
      * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait UpdateServerCertificateRequest extends js.Object {
    /**
      * The new path for the server certificate. Include this only if you are updating the server certificate's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var NewPath: js.UndefOr[pathType] = js.undefined
    /**
      * The new name for the server certificate. Include this only if you are updating the server certificate's name. The name of the certificate cannot contain any spaces. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var NewServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined
    /**
      * The name of the server certificate that you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var ServerCertificateName: serverCertificateNameType
  }
  
  trait UpdateServiceSpecificCredentialRequest extends js.Object {
    /**
      * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var ServiceSpecificCredentialId: serviceSpecificCredentialId
    /**
      * The status to be assigned to the service-specific credential.
      */
    var Status: statusType
    /**
      * The name of the IAM user associated with the service-specific credential. If you do not specify this value, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
  }
  
  trait UpdateSigningCertificateRequest extends js.Object {
    /**
      * The ID of the signing certificate you want to update. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
      */
    var CertificateId: certificateIdType
    /**
      *  The status you want to assign to the certificate. Active means that the certificate can be used for API calls to AWS Inactive means that the certificate cannot be used.
      */
    var Status: statusType
    /**
      * The name of the IAM user the signing certificate belongs to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait UpdateUserRequest extends js.Object {
    /**
      * New path for the IAM user. Include this parameter only if you're changing the user's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
      */
    var NewPath: js.UndefOr[pathType] = js.undefined
    /**
      * New name for the user. Include this parameter only if you're changing the user's name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var NewUserName: js.UndefOr[userNameType] = js.undefined
    /**
      * Name of the user to update. If you're changing the name of the user, this is the original user name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: existingUserNameType
  }
  
  trait UploadSSHPublicKeyRequest extends js.Object {
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format. The minimum bit-length of the public key is 2048 bits. For example, you can generate a 2048-bit key, and the resulting PEM file is 1679 bytes long. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var SSHPublicKeyBody: publicKeyMaterialType
    /**
      * The name of the IAM user to associate the SSH public key with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: userNameType
  }
  
  trait UploadSSHPublicKeyResponse extends js.Object {
    /**
      * Contains information about the SSH public key.
      */
    var SSHPublicKey: js.UndefOr[SSHPublicKey] = js.undefined
  }
  
  trait UploadServerCertificateRequest extends js.Object {
    /**
      * The contents of the public key certificate in PEM-encoded format. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var CertificateBody: certificateBodyType
    /**
      * The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key certificates of the chain. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var CertificateChain: js.UndefOr[certificateChainType] = js.undefined
    /**
      * The path for the server certificate. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.   If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must specify a path using the path parameter. The path must begin with /cloudfront and must include a trailing slash (for example, /cloudfront/test/). 
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The contents of the private key in PEM-encoded format. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var PrivateKey: privateKeyType
    /**
      * The name for the server certificate. Do not include the path in this value. The name of the certificate cannot contain any spaces. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var ServerCertificateName: serverCertificateNameType
  }
  
  trait UploadServerCertificateResponse extends js.Object {
    /**
      * The meta information of the uploaded server certificate without its certificate body, certificate chain, and private key.
      */
    var ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined
  }
  
  trait UploadSigningCertificateRequest extends js.Object {
    /**
      * The contents of the signing certificate. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
      */
    var CertificateBody: certificateBodyType
    /**
      * The name of the user the signing certificate is for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
      */
    var UserName: js.UndefOr[existingUserNameType] = js.undefined
  }
  
  trait UploadSigningCertificateResponse extends js.Object {
    /**
      * Information about the certificate.
      */
    var Certificate: SigningCertificate
  }
  
  trait User extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in policies, see IAM Identifiers in the Using IAM guide. 
      */
    var Arn: arnType
    /**
      * The date and time, in ISO 8601 date-time format, when the user was created.
      */
    var CreateDate: dateType
    /**
      * The date and time, in ISO 8601 date-time format, when the user's password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last sign-in time, see the Credential Reports topic in the Using IAM guide. If a password is used more than once in a five-minute span, only the first use is returned in this field. If the field is null (no value), then it indicates that they never signed in with a password. This can be because:   The user never had a password.   A password exists but has not been used since IAM started tracking this information on October 20, 2014.   A null valuedoes not mean that the user never had a password. Also, if the user does not currently have a password, but had one in the past, then this field contains the date and time the most recent password was used. This value is returned only in the GetUser and ListUsers operations. 
      */
    var PasswordLastUsed: js.UndefOr[dateType] = js.undefined
    /**
      * The path to the user. For more information about paths, see IAM Identifiers in the Using IAM guide.
      */
    var Path: pathType
    /**
      * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
      */
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
    /**
      * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    var Tags: js.UndefOr[tagListType] = js.undefined
    /**
      * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the Using IAM guide.
      */
    var UserId: idType
    /**
      * The friendly name identifying the user.
      */
    var UserName: userNameType
  }
  
  trait UserDetail extends js.Object {
    var Arn: js.UndefOr[arnType] = js.undefined
    /**
      * A list of the managed policies attached to the user.
      */
    var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
    /**
      * The date and time, in ISO 8601 date-time format, when the user was created.
      */
    var CreateDate: js.UndefOr[dateType] = js.undefined
    /**
      * A list of IAM groups that the user is in.
      */
    var GroupList: js.UndefOr[groupNameListType] = js.undefined
    /**
      * The path to the user. For more information about paths, see IAM Identifiers in the Using IAM guide.
      */
    var Path: js.UndefOr[pathType] = js.undefined
    /**
      * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
      */
    var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
    /**
      * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
      */
    var Tags: js.UndefOr[tagListType] = js.undefined
    /**
      * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the Using IAM guide.
      */
    var UserId: js.UndefOr[idType] = js.undefined
    /**
      * The friendly name identifying the user.
      */
    var UserName: js.UndefOr[userNameType] = js.undefined
    /**
      * A list of the inline policies embedded in the user.
      */
    var UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined
  }
  
  trait VirtualMFADevice extends js.Object {
    /**
      *  The base32 seed defined as specified in RFC3548. The Base32StringSeed is base64-encoded. 
      */
    var Base32StringSeed: js.UndefOr[BootstrapDatum] = js.undefined
    /**
      * The date and time on which the virtual MFA device was enabled.
      */
    var EnableDate: js.UndefOr[dateType] = js.undefined
    /**
      *  A QR code PNG image that encodes otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String where $virtualMFADeviceName is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format. The Base32String value is base64-encoded. 
      */
    var QRCodePNG: js.UndefOr[BootstrapDatum] = js.undefined
    /**
      * The serial number associated with VirtualMFADevice.
      */
    var SerialNumber: serialNumberType
    /**
      * The IAM user associated with this virtual MFA device.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait _ContextKeyTypeEnum extends js.Object
  
  trait _DeletionTaskStatusType extends js.Object
  
  trait _EntityType extends js.Object
  
  trait _PolicyEvaluationDecisionType extends js.Object
  
  trait _PolicySourceType extends js.Object
  
  trait _PolicyUsageType extends js.Object
  
  trait _ReportStateType extends js.Object
  
  trait _apiVersion extends js.Object
  
  trait _assignmentStatusType extends js.Object
  
  trait _encodingType extends js.Object
  
  trait _jobStatusType extends js.Object
  
  trait _policyOwnerEntityType extends js.Object
  
  trait _policyScopeType extends js.Object
  
  trait _policyType extends js.Object
  
  trait _statusType extends js.Object
  
  trait _summaryKeyType extends js.Object
  
  trait summaryMapType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[summaryValueType]
  
  val TypesNs: this.type = js.native
  type ActionNameListType = js.Array[ActionNameType]
  type ActionNameType = java.lang.String
  type ArnListType = js.Array[arnType]
  type BootstrapDatum = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsIamMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnNumber = scala.Double
  type ContextEntryListType = js.Array[ContextEntry]
  type ContextKeyNameType = java.lang.String
  type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]
  type ContextKeyTypeEnum = _ContextKeyTypeEnum | java.lang.String
  type ContextKeyValueListType = js.Array[ContextKeyValueType]
  type ContextKeyValueType = java.lang.String
  type DeletionTaskIdType = java.lang.String
  type DeletionTaskStatusType = _DeletionTaskStatusType | java.lang.String
  type EntityType = _EntityType | java.lang.String
  type EvalDecisionSourceType = java.lang.String
  type EvaluationResultsListType = js.Array[EvaluationResult]
  type LineNumber = scala.Double
  type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = java.lang.String
  type PermissionsBoundaryAttachmentType = awsDashSdkLib.awsDashSdkLibStrings.PermissionsBoundaryPolicy | java.lang.String
  type PolicyEvaluationDecisionType = _PolicyEvaluationDecisionType | java.lang.String
  type PolicyGroupListType = js.Array[PolicyGroup]
  type PolicyIdentifierType = java.lang.String
  type PolicyRoleListType = js.Array[PolicyRole]
  type PolicySourceType = _PolicySourceType | java.lang.String
  type PolicyUsageType = _PolicyUsageType | java.lang.String
  type PolicyUserListType = js.Array[PolicyUser]
  type ReasonType = java.lang.String
  type RegionNameType = java.lang.String
  type ReportContentType = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsIamMod.Blob | java.lang.String
  type ReportFormatType = awsDashSdkLib.awsDashSdkLibStrings.`text/csv` | java.lang.String
  type ReportStateDescriptionType = java.lang.String
  type ReportStateType = _ReportStateType | java.lang.String
  type ResourceHandlingOptionType = java.lang.String
  type ResourceNameListType = js.Array[ResourceNameType]
  type ResourceNameType = java.lang.String
  type ResourceSpecificResultListType = js.Array[ResourceSpecificResult]
  type RoleUsageListType = js.Array[RoleUsageType]
  type SAMLMetadataDocumentType = java.lang.String
  type SAMLProviderListType = js.Array[SAMLProviderListEntry]
  type SAMLProviderNameType = java.lang.String
  type SSHPublicKeyListType = js.Array[SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType = js.Array[ServiceSpecificCredentialMetadata]
  type ServicesLastAccessed = js.Array[ServiceLastAccessed]
  type SimulationPolicyListType = js.Array[policyDocumentType]
  type StatementListType = js.Array[Statement]
  type accessKeyIdType = java.lang.String
  type accessKeyMetadataListType = js.Array[AccessKeyMetadata]
  type accessKeySecretType = java.lang.String
  type accountAliasListType = js.Array[accountAliasType]
  type accountAliasType = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
  type arnType = java.lang.String
  type assignmentStatusType = _assignmentStatusType | java.lang.String
  type attachedPoliciesListType = js.Array[AttachedPolicy]
  type attachmentCountType = scala.Double
  type authenticationCodeType = java.lang.String
  type booleanObjectType = scala.Boolean
  type booleanType = scala.Boolean
  type certificateBodyType = java.lang.String
  type certificateChainType = java.lang.String
  type certificateIdType = java.lang.String
  type certificateListType = js.Array[SigningCertificate]
  type clientIDListType = js.Array[clientIDType]
  type clientIDType = java.lang.String
  type customSuffixType = java.lang.String
  type dateType = stdLib.Date
  type encodingType = _encodingType | java.lang.String
  type entityDetailsListType = js.Array[EntityDetails]
  type entityListType = js.Array[EntityType]
  type entityNameType = java.lang.String
  type existingUserNameType = java.lang.String
  type groupDetailListType = js.Array[GroupDetail]
  type groupListType = js.Array[Group]
  type groupNameListType = js.Array[groupNameType]
  type groupNameType = java.lang.String
  type idType = java.lang.String
  type instanceProfileListType = js.Array[InstanceProfile]
  type instanceProfileNameType = java.lang.String
  type integerType = scala.Double
  type jobIDType = java.lang.String
  type jobStatusType = _jobStatusType | java.lang.String
  type listPolicyGrantingServiceAccessResponseListType = js.Array[ListPoliciesGrantingServiceAccessEntry]
  type markerType = java.lang.String
  type maxItemsType = scala.Double
  type maxPasswordAgeType = scala.Double
  type mfaDeviceListType = js.Array[MFADevice]
  type minimumPasswordLengthType = scala.Double
  type passwordReusePreventionType = scala.Double
  type passwordType = java.lang.String
  type pathPrefixType = java.lang.String
  type pathType = java.lang.String
  type policyDescriptionType = java.lang.String
  type policyDetailListType = js.Array[PolicyDetail]
  type policyDocumentType = java.lang.String
  type policyDocumentVersionListType = js.Array[PolicyVersion]
  type policyGrantingServiceAccessListType = js.Array[PolicyGrantingServiceAccess]
  type policyListType = js.Array[Policy]
  type policyNameListType = js.Array[policyNameType]
  type policyNameType = java.lang.String
  type policyOwnerEntityType = _policyOwnerEntityType | java.lang.String
  type policyPathType = java.lang.String
  type policyScopeType = _policyScopeType | java.lang.String
  type policyType = _policyType | java.lang.String
  type policyVersionIdType = java.lang.String
  type privateKeyType = java.lang.String
  type publicKeyFingerprintType = java.lang.String
  type publicKeyIdType = java.lang.String
  type publicKeyMaterialType = java.lang.String
  type roleDescriptionType = java.lang.String
  type roleDetailListType = js.Array[RoleDetail]
  type roleListType = js.Array[Role]
  type roleMaxSessionDurationType = scala.Double
  type roleNameType = java.lang.String
  type serialNumberType = java.lang.String
  type serverCertificateMetadataListType = js.Array[ServerCertificateMetadata]
  type serverCertificateNameType = java.lang.String
  type serviceName = java.lang.String
  type serviceNameType = java.lang.String
  type serviceNamespaceListType = js.Array[serviceNamespaceType]
  type serviceNamespaceType = java.lang.String
  type servicePassword = java.lang.String
  type serviceSpecificCredentialId = java.lang.String
  type serviceUserName = java.lang.String
  type statusType = _statusType | java.lang.String
  type stringType = java.lang.String
  type summaryKeyType = _summaryKeyType | java.lang.String
  type summaryValueType = scala.Double
  type tagKeyListType = js.Array[tagKeyType]
  type tagKeyType = java.lang.String
  type tagListType = js.Array[Tag]
  type tagValueType = java.lang.String
  type thumbprintListType = js.Array[thumbprintType]
  type thumbprintType = java.lang.String
  type userDetailListType = js.Array[UserDetail]
  type userListType = js.Array[User]
  type userNameType = java.lang.String
  type virtualMFADeviceListType = js.Array[VirtualMFADevice]
  type virtualMFADeviceName = java.lang.String
}

