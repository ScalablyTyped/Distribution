package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIamMod {
  type ActionNameListType = js.Array[ActionNameType]
  type ActionNameType = java.lang.String
  type ArnListType = js.Array[arnType]
  type BootstrapDatum = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ColumnNumber = scala.Double
  type ContextEntryListType = js.Array[ContextEntry]
  type ContextKeyNameType = java.lang.String
  type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.string
    - awsDashSdkLib.awsDashSdkLibStrings.stringList
    - awsDashSdkLib.awsDashSdkLibStrings.numeric
    - awsDashSdkLib.awsDashSdkLibStrings.numericList
    - awsDashSdkLib.awsDashSdkLibStrings.boolean
    - awsDashSdkLib.awsDashSdkLibStrings.booleanList
    - awsDashSdkLib.awsDashSdkLibStrings.ip
    - awsDashSdkLib.awsDashSdkLibStrings.ipList
    - awsDashSdkLib.awsDashSdkLibStrings.binary
    - awsDashSdkLib.awsDashSdkLibStrings.binaryList
    - awsDashSdkLib.awsDashSdkLibStrings.date
    - awsDashSdkLib.awsDashSdkLibStrings.dateList
    - java.lang.String
  */
  type ContextKeyTypeEnum = _ContextKeyTypeEnum | java.lang.String
  type ContextKeyValueListType = js.Array[ContextKeyValueType]
  type ContextKeyValueType = java.lang.String
  type DeletionTaskIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED
    - java.lang.String
  */
  type DeletionTaskStatusType = _DeletionTaskStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.User
    - awsDashSdkLib.awsDashSdkLibStrings.Role
    - awsDashSdkLib.awsDashSdkLibStrings.Group
    - awsDashSdkLib.awsDashSdkLibStrings.LocalManagedPolicy
    - awsDashSdkLib.awsDashSdkLibStrings.AWSManagedPolicy
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EvalDecisionDetailsType = org.scalablytyped.runtime.StringDictionary[PolicyEvaluationDecisionType]
  type EvalDecisionSourceType = java.lang.String
  type EvaluationResultsListType = js.Array[EvaluationResult]
  type LineNumber = scala.Double
  type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = java.lang.String
  type PermissionsBoundaryAttachmentType = awsDashSdkLib.awsDashSdkLibStrings.PermissionsBoundaryPolicy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.allowed
    - awsDashSdkLib.awsDashSdkLibStrings.explicitDeny
    - awsDashSdkLib.awsDashSdkLibStrings.implicitDeny
    - java.lang.String
  */
  type PolicyEvaluationDecisionType = _PolicyEvaluationDecisionType | java.lang.String
  type PolicyGroupListType = js.Array[PolicyGroup]
  type PolicyIdentifierType = java.lang.String
  type PolicyRoleListType = js.Array[PolicyRole]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.user
    - awsDashSdkLib.awsDashSdkLibStrings.group
    - awsDashSdkLib.awsDashSdkLibStrings.role
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-managed`
    - awsDashSdkLib.awsDashSdkLibStrings.`user-managed`
    - awsDashSdkLib.awsDashSdkLibStrings.resource
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - java.lang.String
  */
  type PolicySourceType = _PolicySourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PermissionsPolicy
    - awsDashSdkLib.awsDashSdkLibStrings.PermissionsBoundary
    - java.lang.String
  */
  type PolicyUsageType = _PolicyUsageType | java.lang.String
  type PolicyUserListType = js.Array[PolicyUser]
  type ReasonType = java.lang.String
  type RegionNameType = java.lang.String
  type ReportContentType = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ReportFormatType = awsDashSdkLib.awsDashSdkLibStrings.`text/csv` | java.lang.String
  type ReportStateDescriptionType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.INPROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2010-05-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type arnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Assigned
    - awsDashSdkLib.awsDashSdkLibStrings.Unassigned
    - awsDashSdkLib.awsDashSdkLibStrings.Any
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SSH
    - awsDashSdkLib.awsDashSdkLibStrings.PEM
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER
    - awsDashSdkLib.awsDashSdkLibStrings.ROLE
    - awsDashSdkLib.awsDashSdkLibStrings.GROUP
    - java.lang.String
  */
  type policyOwnerEntityType = _policyOwnerEntityType | java.lang.String
  type policyPathType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.Local
    - java.lang.String
  */
  type policyScopeType = _policyScopeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INLINE
    - awsDashSdkLib.awsDashSdkLibStrings.MANAGED
    - java.lang.String
  */
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Inactive
    - java.lang.String
  */
  type statusType = _statusType | java.lang.String
  type stringType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Users
    - awsDashSdkLib.awsDashSdkLibStrings.UsersQuota
    - awsDashSdkLib.awsDashSdkLibStrings.Groups
    - awsDashSdkLib.awsDashSdkLibStrings.GroupsQuota
    - awsDashSdkLib.awsDashSdkLibStrings.ServerCertificates
    - awsDashSdkLib.awsDashSdkLibStrings.ServerCertificatesQuota
    - awsDashSdkLib.awsDashSdkLibStrings.UserPolicySizeQuota
    - awsDashSdkLib.awsDashSdkLibStrings.GroupPolicySizeQuota
    - awsDashSdkLib.awsDashSdkLibStrings.GroupsPerUserQuota
    - awsDashSdkLib.awsDashSdkLibStrings.SigningCertificatesPerUserQuota
    - awsDashSdkLib.awsDashSdkLibStrings.AccessKeysPerUserQuota
    - awsDashSdkLib.awsDashSdkLibStrings.MFADevices
    - awsDashSdkLib.awsDashSdkLibStrings.MFADevicesInUse
    - awsDashSdkLib.awsDashSdkLibStrings.AccountMFAEnabled
    - awsDashSdkLib.awsDashSdkLibStrings.AccountAccessKeysPresent
    - awsDashSdkLib.awsDashSdkLibStrings.AccountSigningCertificatesPresent
    - awsDashSdkLib.awsDashSdkLibStrings.AttachedPoliciesPerGroupQuota
    - awsDashSdkLib.awsDashSdkLibStrings.AttachedPoliciesPerRoleQuota
    - awsDashSdkLib.awsDashSdkLibStrings.AttachedPoliciesPerUserQuota
    - awsDashSdkLib.awsDashSdkLibStrings.Policies
    - awsDashSdkLib.awsDashSdkLibStrings.PoliciesQuota
    - awsDashSdkLib.awsDashSdkLibStrings.PolicySizeQuota
    - awsDashSdkLib.awsDashSdkLibStrings.PolicyVersionsInUse
    - awsDashSdkLib.awsDashSdkLibStrings.PolicyVersionsInUseQuota
    - awsDashSdkLib.awsDashSdkLibStrings.VersionsPerPolicyQuota
    - java.lang.String
  */
  type summaryKeyType = _summaryKeyType | java.lang.String
  type summaryMapType = org.scalablytyped.runtime.StringDictionary[summaryValueType]
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
