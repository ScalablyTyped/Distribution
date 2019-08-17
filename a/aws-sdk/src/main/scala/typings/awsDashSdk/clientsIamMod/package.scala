package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIamMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.PermissionsBoundaryPolicy
  import typings.awsDashSdk.awsDashSdkStrings.`text/csv`
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AccessDetails = js.Array[AccessDetail]
  type ActionNameListType = js.Array[ActionNameType]
  type ActionNameType = String
  type ArnListType = js.Array[arnType]
  type BootstrapDatum = Buffer | Uint8Array | Blob | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ColumnNumber = Double
  type ContextEntryListType = js.Array[ContextEntry]
  type ContextKeyNameType = String
  type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.string
    - typings.awsDashSdk.awsDashSdkStrings.stringList
    - typings.awsDashSdk.awsDashSdkStrings.numeric
    - typings.awsDashSdk.awsDashSdkStrings.numericList
    - typings.awsDashSdk.awsDashSdkStrings.boolean
    - typings.awsDashSdk.awsDashSdkStrings.booleanList
    - typings.awsDashSdk.awsDashSdkStrings.ip
    - typings.awsDashSdk.awsDashSdkStrings.ipList
    - typings.awsDashSdk.awsDashSdkStrings.binary
    - typings.awsDashSdk.awsDashSdkStrings.binaryList
    - typings.awsDashSdk.awsDashSdkStrings.date
    - typings.awsDashSdk.awsDashSdkStrings.dateList
    - java.lang.String
  */
  type ContextKeyTypeEnum = _ContextKeyTypeEnum | String
  type ContextKeyValueListType = js.Array[ContextKeyValueType]
  type ContextKeyValueType = String
  type DeletionTaskIdType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DeletionTaskStatusType = _DeletionTaskStatusType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.User
    - typings.awsDashSdk.awsDashSdkStrings.Role
    - typings.awsDashSdk.awsDashSdkStrings.Group
    - typings.awsDashSdk.awsDashSdkStrings.LocalManagedPolicy
    - typings.awsDashSdk.awsDashSdkStrings.AWSManagedPolicy
    - java.lang.String
  */
  type EntityType = _EntityType | String
  type EvalDecisionDetailsType = StringDictionary[PolicyEvaluationDecisionType]
  type EvalDecisionSourceType = String
  type EvaluationResultsListType = js.Array[EvaluationResult]
  type LineNumber = Double
  type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = String
  type PermissionsBoundaryAttachmentType = PermissionsBoundaryPolicy | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.allowed
    - typings.awsDashSdk.awsDashSdkStrings.explicitDeny
    - typings.awsDashSdk.awsDashSdkStrings.implicitDeny
    - java.lang.String
  */
  type PolicyEvaluationDecisionType = _PolicyEvaluationDecisionType | String
  type PolicyGroupListType = js.Array[PolicyGroup]
  type PolicyIdentifierType = String
  type PolicyRoleListType = js.Array[PolicyRole]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.user
    - typings.awsDashSdk.awsDashSdkStrings.group
    - typings.awsDashSdk.awsDashSdkStrings.role
    - typings.awsDashSdk.awsDashSdkStrings.`aws-managed`
    - typings.awsDashSdk.awsDashSdkStrings.`user-managed`
    - typings.awsDashSdk.awsDashSdkStrings.resource
    - typings.awsDashSdk.awsDashSdkStrings.none
    - java.lang.String
  */
  type PolicySourceType = _PolicySourceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PermissionsPolicy
    - typings.awsDashSdk.awsDashSdkStrings.PermissionsBoundary
    - java.lang.String
  */
  type PolicyUsageType = _PolicyUsageType | String
  type PolicyUserListType = js.Array[PolicyUser]
  type ReasonType = String
  type RegionNameType = String
  type ReportContentType = Buffer | Uint8Array | Blob | String
  type ReportFormatType = `text/csv` | String
  type ReportStateDescriptionType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTED
    - typings.awsDashSdk.awsDashSdkStrings.INPROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - java.lang.String
  */
  type ReportStateType = _ReportStateType | String
  type ResourceHandlingOptionType = String
  type ResourceNameListType = js.Array[ResourceNameType]
  type ResourceNameType = String
  type ResourceSpecificResultListType = js.Array[ResourceSpecificResult]
  type RoleUsageListType = js.Array[RoleUsageType]
  type SAMLMetadataDocumentType = String
  type SAMLProviderListType = js.Array[SAMLProviderListEntry]
  type SAMLProviderNameType = String
  type SSHPublicKeyListType = js.Array[SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType = js.Array[ServiceSpecificCredentialMetadata]
  type ServicesLastAccessed = js.Array[ServiceLastAccessed]
  type SimulationPolicyListType = js.Array[policyDocumentType]
  type StatementListType = js.Array[Statement]
  type accessKeyIdType = String
  type accessKeyMetadataListType = js.Array[AccessKeyMetadata]
  type accessKeySecretType = String
  type accountAliasListType = js.Array[accountAliasType]
  type accountAliasType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-05-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type arnType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Assigned
    - typings.awsDashSdk.awsDashSdkStrings.Unassigned
    - typings.awsDashSdk.awsDashSdkStrings.Any
    - java.lang.String
  */
  type assignmentStatusType = _assignmentStatusType | String
  type attachedPoliciesListType = js.Array[AttachedPolicy]
  type attachmentCountType = Double
  type authenticationCodeType = String
  type booleanObjectType = Boolean
  type booleanType = Boolean
  type certificateBodyType = String
  type certificateChainType = String
  type certificateIdType = String
  type certificateListType = js.Array[SigningCertificate]
  type clientIDListType = js.Array[clientIDType]
  type clientIDType = String
  type customSuffixType = String
  type dateType = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SSH
    - typings.awsDashSdk.awsDashSdkStrings.PEM
    - java.lang.String
  */
  type encodingType = _encodingType | String
  type entityDetailsListType = js.Array[EntityDetails]
  type entityListType = js.Array[EntityType]
  type entityNameType = String
  type existingUserNameType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.v1Token
    - typings.awsDashSdk.awsDashSdkStrings.v2Token
    - java.lang.String
  */
  type globalEndpointTokenVersion = _globalEndpointTokenVersion | String
  type groupDetailListType = js.Array[GroupDetail]
  type groupListType = js.Array[Group]
  type groupNameListType = js.Array[groupNameType]
  type groupNameType = String
  type idType = String
  type instanceProfileListType = js.Array[InstanceProfile]
  type instanceProfileNameType = String
  type integerType = Double
  type jobIDType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type jobStatusType = _jobStatusType | String
  type listPolicyGrantingServiceAccessResponseListType = js.Array[ListPoliciesGrantingServiceAccessEntry]
  type markerType = String
  type maxItemsType = Double
  type maxPasswordAgeType = Double
  type mfaDeviceListType = js.Array[MFADevice]
  type minimumPasswordLengthType = Double
  type organizationsEntityPathType = String
  type organizationsPolicyIdType = String
  type passwordReusePreventionType = Double
  type passwordType = String
  type pathPrefixType = String
  type pathType = String
  type policyDescriptionType = String
  type policyDetailListType = js.Array[PolicyDetail]
  type policyDocumentType = String
  type policyDocumentVersionListType = js.Array[PolicyVersion]
  type policyGrantingServiceAccessListType = js.Array[PolicyGrantingServiceAccess]
  type policyListType = js.Array[Policy]
  type policyNameListType = js.Array[policyNameType]
  type policyNameType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.ROLE
    - typings.awsDashSdk.awsDashSdkStrings.GROUP
    - java.lang.String
  */
  type policyOwnerEntityType = _policyOwnerEntityType | String
  type policyPathType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.All
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.Local
    - java.lang.String
  */
  type policyScopeType = _policyScopeType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INLINE
    - typings.awsDashSdk.awsDashSdkStrings.MANAGED
    - java.lang.String
  */
  type policyType = _policyType | String
  type policyVersionIdType = String
  type privateKeyType = String
  type publicKeyFingerprintType = String
  type publicKeyIdType = String
  type publicKeyMaterialType = String
  type responseMarkerType = String
  type roleDescriptionType = String
  type roleDetailListType = js.Array[RoleDetail]
  type roleListType = js.Array[Role]
  type roleMaxSessionDurationType = Double
  type roleNameType = String
  type serialNumberType = String
  type serverCertificateMetadataListType = js.Array[ServerCertificateMetadata]
  type serverCertificateNameType = String
  type serviceName = String
  type serviceNameType = String
  type serviceNamespaceListType = js.Array[serviceNamespaceType]
  type serviceNamespaceType = String
  type servicePassword = String
  type serviceSpecificCredentialId = String
  type serviceUserName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_NAMESPACE_ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_NAMESPACE_DESCENDING
    - typings.awsDashSdk.awsDashSdkStrings.LAST_AUTHENTICATED_TIME_ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.LAST_AUTHENTICATED_TIME_DESCENDING
    - java.lang.String
  */
  type sortKeyType = _sortKeyType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Inactive
    - java.lang.String
  */
  type statusType = _statusType | String
  type stringType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Users
    - typings.awsDashSdk.awsDashSdkStrings.UsersQuota
    - typings.awsDashSdk.awsDashSdkStrings.Groups
    - typings.awsDashSdk.awsDashSdkStrings.GroupsQuota
    - typings.awsDashSdk.awsDashSdkStrings.ServerCertificates
    - typings.awsDashSdk.awsDashSdkStrings.ServerCertificatesQuota
    - typings.awsDashSdk.awsDashSdkStrings.UserPolicySizeQuota
    - typings.awsDashSdk.awsDashSdkStrings.GroupPolicySizeQuota
    - typings.awsDashSdk.awsDashSdkStrings.GroupsPerUserQuota
    - typings.awsDashSdk.awsDashSdkStrings.SigningCertificatesPerUserQuota
    - typings.awsDashSdk.awsDashSdkStrings.AccessKeysPerUserQuota
    - typings.awsDashSdk.awsDashSdkStrings.MFADevices
    - typings.awsDashSdk.awsDashSdkStrings.MFADevicesInUse
    - typings.awsDashSdk.awsDashSdkStrings.AccountMFAEnabled
    - typings.awsDashSdk.awsDashSdkStrings.AccountAccessKeysPresent
    - typings.awsDashSdk.awsDashSdkStrings.AccountSigningCertificatesPresent
    - typings.awsDashSdk.awsDashSdkStrings.AttachedPoliciesPerGroupQuota
    - typings.awsDashSdk.awsDashSdkStrings.AttachedPoliciesPerRoleQuota
    - typings.awsDashSdk.awsDashSdkStrings.AttachedPoliciesPerUserQuota
    - typings.awsDashSdk.awsDashSdkStrings.Policies
    - typings.awsDashSdk.awsDashSdkStrings.PoliciesQuota
    - typings.awsDashSdk.awsDashSdkStrings.PolicySizeQuota
    - typings.awsDashSdk.awsDashSdkStrings.PolicyVersionsInUse
    - typings.awsDashSdk.awsDashSdkStrings.PolicyVersionsInUseQuota
    - typings.awsDashSdk.awsDashSdkStrings.VersionsPerPolicyQuota
    - typings.awsDashSdk.awsDashSdkStrings.GlobalEndpointTokenVersion
    - java.lang.String
  */
  type summaryKeyType = _summaryKeyType | String
  type summaryMapType = StringDictionary[summaryValueType]
  type summaryValueType = Double
  type tagKeyListType = js.Array[tagKeyType]
  type tagKeyType = String
  type tagListType = js.Array[Tag]
  type tagValueType = String
  type thumbprintListType = js.Array[thumbprintType]
  type thumbprintType = String
  type userDetailListType = js.Array[UserDetail]
  type userListType = js.Array[User]
  type userNameType = String
  type virtualMFADeviceListType = js.Array[VirtualMFADevice]
  type virtualMFADeviceName = String
}
