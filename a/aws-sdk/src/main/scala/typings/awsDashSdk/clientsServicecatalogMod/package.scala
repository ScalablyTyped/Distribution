package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
import typings.awsDashSdk.awsDashSdkStrings.CLOUDFORMATION
import typings.awsDashSdk.awsDashSdkStrings.CopyTags
import typings.awsDashSdk.awsDashSdkStrings.IAM
import typings.awsDashSdk.awsDashSdkStrings.OWNER
import typings.awsDashSdk.awsDashSdkStrings.SSM_AUTOMATION
import typings.awsDashSdk.awsDashSdkStrings.SearchQuery
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServicecatalogMod {
  type AcceptLanguage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Account
    - typings.awsDashSdk.awsDashSdkStrings.Role
    - typings.awsDashSdk.awsDashSdkStrings.User
    - java.lang.String
  */
  type AccessLevelFilterKey = _AccessLevelFilterKey | String
  type AccessLevelFilterValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.UNDER_CHANGE
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type AccessStatus = _AccessStatus | String
  type AccountId = String
  type AccountIds = js.Array[AccountId]
  type AddTags = js.Array[Tag]
  type AllowedValue = String
  type AllowedValues = js.Array[AllowedValue]
  type ApproximateCount = Double
  type AttributeValue = String
  type BudgetName = String
  type Budgets = js.Array[BudgetDetail]
  type CausingEntity = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADD
    - typings.awsDashSdk.awsDashSdkStrings.MODIFY
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDashboardName = String
  type CloudWatchDashboards = js.Array[CloudWatchDashboard]
  type ConstraintDescription = String
  type ConstraintDetails = js.Array[ConstraintDetail]
  type ConstraintParameters = String
  type ConstraintSummaries = js.Array[ConstraintSummary]
  type ConstraintType = String
  type CopyOption = CopyTags | String
  type CopyOptions = js.Array[CopyOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type CopyProductStatus = _CopyProductStatus | String
  type CreatedTime = Date
  type CreationTime = Date
  type DefaultValue = String
  type Description = String
  type DisableTemplateValidation = Boolean
  type Error = String
  type ErrorCode = String
  type ErrorDescription = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STATIC
    - typings.awsDashSdk.awsDashSdkStrings.DYNAMIC
    - java.lang.String
  */
  type EvaluationType = _EvaluationType | String
  type ExecutionParameterKey = String
  type ExecutionParameterMap = StringDictionary[ExecutionParameterValueList]
  type ExecutionParameterType = String
  type ExecutionParameterValue = String
  type ExecutionParameterValueList = js.Array[ExecutionParameterValue]
  type ExecutionParameters = js.Array[ExecutionParameter]
  type FailedServiceActionAssociations = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath = Boolean
  type Id = String
  type IdempotencyToken = String
  type IgnoreErrors = Boolean
  type InstructionType = String
  type InstructionValue = String
  type LastRequestId = String
  type LaunchPathSummaries = js.Array[LaunchPathSummary]
  type LogicalResourceId = String
  type Message = String
  type Namespaces = js.Array[AccountId]
  type NoEcho = Boolean
  type NotificationArn = String
  type NotificationArns = js.Array[NotificationArn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATIONAL_UNIT
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - java.lang.String
  */
  type OrganizationNodeType = _OrganizationNodeType | String
  type OrganizationNodeValue = String
  type OrganizationNodes = js.Array[OrganizationNode]
  type OutputKey = String
  type OutputValue = String
  type PageSize = Double
  type PageToken = String
  type ParameterKey = String
  type ParameterType = String
  type ParameterValue = String
  type PhysicalId = String
  type PhysicalResourceId = String
  type PlanResourceType = String
  type PortfolioDescription = String
  type PortfolioDetails = js.Array[PortfolioDetail]
  type PortfolioDisplayName = String
  type PortfolioName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMPORTED
    - typings.awsDashSdk.awsDashSdkStrings.AWS_SERVICECATALOG
    - typings.awsDashSdk.awsDashSdkStrings.AWS_ORGANIZATIONS
    - java.lang.String
  */
  type PortfolioShareType = _PortfolioShareType | String
  type PrincipalARN = String
  type PrincipalType = IAM | String
  type Principals = js.Array[Principal]
  type ProductArn = String
  type ProductSource = ACCOUNT | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typings.awsDashSdk.awsDashSdkStrings.MARKETPLACE
    - java.lang.String
  */
  type ProductType = _ProductType | String
  type ProductViewAggregationType = String
  type ProductViewAggregationValues = js.Array[ProductViewAggregationValue]
  type ProductViewAggregations = StringDictionary[ProductViewAggregationValues]
  type ProductViewDetails = js.Array[ProductViewDetail]
  type ProductViewDistributor = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FullTextSearch
    - typings.awsDashSdk.awsDashSdkStrings.Owner
    - typings.awsDashSdk.awsDashSdkStrings.ProductType
    - typings.awsDashSdk.awsDashSdkStrings.SourceProductId
    - java.lang.String
  */
  type ProductViewFilterBy = _ProductViewFilterBy | String
  type ProductViewFilterValue = String
  type ProductViewFilterValues = js.Array[ProductViewFilterValue]
  type ProductViewFilters = StringDictionary[ProductViewFilterValues]
  type ProductViewName = String
  type ProductViewOwner = String
  type ProductViewShortDescription = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Title
    - typings.awsDashSdk.awsDashSdkStrings.VersionCount
    - typings.awsDashSdk.awsDashSdkStrings.CreationDate
    - java.lang.String
  */
  type ProductViewSortBy = _ProductViewSortBy | String
  type ProductViewSummaries = js.Array[ProductViewSummary]
  type PropertyKey = OWNER | String
  type PropertyName = String
  type PropertyValue = String
  type ProviderName = String
  type ProvisionedProductAttributes = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[ProvisionedProductDetail]
  type ProvisionedProductFilters = StringDictionary[ProvisionedProductViewFilterValues]
  type ProvisionedProductId = String
  type ProvisionedProductName = String
  type ProvisionedProductNameOrArn = String
  type ProvisionedProductPlanName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTE_SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTE_FAILED
    - java.lang.String
  */
  type ProvisionedProductPlanStatus = _ProvisionedProductPlanStatus | String
  type ProvisionedProductPlanType = CLOUDFORMATION | String
  type ProvisionedProductPlans = js.Array[ProvisionedProductPlanSummary]
  type ProvisionedProductProperties = StringDictionary[PropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.UNDER_CHANGE
    - typings.awsDashSdk.awsDashSdkStrings.TAINTED
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.PLAN_IN_PROGRESS
    - java.lang.String
  */
  type ProvisionedProductStatus = _ProvisionedProductStatus | String
  type ProvisionedProductStatusMessage = String
  type ProvisionedProductType = String
  type ProvisionedProductViewFilterBy = SearchQuery | String
  type ProvisionedProductViewFilterValue = String
  type ProvisionedProductViewFilterValues = js.Array[ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive = Boolean
  type ProvisioningArtifactCreatedTime = Date
  type ProvisioningArtifactDescription = String
  type ProvisioningArtifactDetails = js.Array[ProvisioningArtifactDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.DEPRECATED
    - java.lang.String
  */
  type ProvisioningArtifactGuidance = _ProvisioningArtifactGuidance | String
  type ProvisioningArtifactInfo = StringDictionary[ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey = String
  type ProvisioningArtifactInfoValue = String
  type ProvisioningArtifactName = String
  type ProvisioningArtifactParameters = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName = typings.awsDashSdk.awsDashSdkStrings.Id | String
  type ProvisioningArtifactPropertyValue = String
  type ProvisioningArtifactSummaries = js.Array[ProvisioningArtifactSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typings.awsDashSdk.awsDashSdkStrings.MARKETPLACE_AMI
    - typings.awsDashSdk.awsDashSdkStrings.MARKETPLACE_CAR
    - java.lang.String
  */
  type ProvisioningArtifactType = _ProvisioningArtifactType | String
  type ProvisioningArtifactViews = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[ProvisioningArtifact]
  type ProvisioningParameters = js.Array[ProvisioningParameter]
  type RecordDetails = js.Array[RecordDetail]
  type RecordErrors = js.Array[RecordError]
  type RecordOutputs = js.Array[RecordOutput]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS_IN_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type RecordStatus = _RecordStatus | String
  type RecordTagKey = String
  type RecordTagValue = String
  type RecordTags = js.Array[RecordTag]
  type RecordType = String
  type Region = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRUE
    - typings.awsDashSdk.awsDashSdkStrings.FALSE
    - typings.awsDashSdk.awsDashSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type Replacement = _Replacement | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - typings.awsDashSdk.awsDashSdkStrings.CONDITIONALLY
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - java.lang.String
  */
  type RequiresRecreation = _RequiresRecreation | String
  type ResourceARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PROPERTIES
    - typings.awsDashSdk.awsDashSdkStrings.METADATA
    - typings.awsDashSdk.awsDashSdkStrings.CREATIONPOLICY
    - typings.awsDashSdk.awsDashSdkStrings.UPDATEPOLICY
    - typings.awsDashSdk.awsDashSdkStrings.DELETIONPOLICY
    - typings.awsDashSdk.awsDashSdkStrings.TAGS
    - java.lang.String
  */
  type ResourceAttribute = _ResourceAttribute | String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceChanges = js.Array[ResourceChange]
  type ResourceDetailARN = String
  type ResourceDetailCreatedTime = Date
  type ResourceDetailDescription = String
  type ResourceDetailId = String
  type ResourceDetailName = String
  type ResourceDetails = js.Array[ResourceDetail]
  type ResourceId = String
  type ResourceType = String
  type Scope = js.Array[ResourceAttribute]
  type SearchFilterKey = String
  type SearchFilterValue = String
  type SearchProvisionedProductsPageSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DUPLICATE_RESOURCE
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.THROTTLING
    - java.lang.String
  */
  type ServiceActionAssociationErrorCode = _ServiceActionAssociationErrorCode | String
  type ServiceActionAssociationErrorMessage = String
  type ServiceActionAssociations = js.Array[ServiceActionAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.Version
    - typings.awsDashSdk.awsDashSdkStrings.AssumeRole
    - typings.awsDashSdk.awsDashSdkStrings.Parameters
    - java.lang.String
  */
  type ServiceActionDefinitionKey = _ServiceActionDefinitionKey | String
  type ServiceActionDefinitionMap = StringDictionary[ServiceActionDefinitionValue]
  type ServiceActionDefinitionType = SSM_AUTOMATION | String
  type ServiceActionDefinitionValue = String
  type ServiceActionDescription = String
  type ServiceActionName = String
  type ServiceActionSummaries = js.Array[ServiceActionSummary]
  type ShareErrors = js.Array[ShareError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED_WITH_ERRORS
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | String
  type SortField = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = _SortOrder | String
  type SourceProvisioningArtifactProperties = js.Array[SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = StringDictionary[ProvisioningArtifactPropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CURRENT
    - typings.awsDashSdk.awsDashSdkStrings.OUTDATED
    - typings.awsDashSdk.awsDashSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = _StackInstanceStatus | String
  type StackInstances = js.Array[StackInstance]
  type StackSetAccounts = js.Array[AccountId]
  type StackSetFailureToleranceCount = Double
  type StackSetFailureTolerancePercentage = Double
  type StackSetMaxConcurrencyCount = Double
  type StackSetMaxConcurrencyPercentage = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationType = _StackSetOperationType | String
  type StackSetRegions = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type Status = _Status | String
  type StatusDetail = String
  type StatusMessage = String
  type SuccessfulShares = js.Array[AccountId]
  type SupportDescription = String
  type SupportEmail = String
  type SupportUrl = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagOptionActive = Boolean
  type TagOptionDetails = js.Array[TagOptionDetail]
  type TagOptionId = String
  type TagOptionKey = String
  type TagOptionSummaries = js.Array[TagOptionSummary]
  type TagOptionValue = String
  type TagOptionValues = js.Array[TagOptionValue]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TotalResultsCount = Double
  type UpdateProvisioningParameters = js.Array[UpdateProvisioningParameter]
  type UpdatedTime = Date
  type UsageInstructions = js.Array[UsageInstruction]
  type UsePreviousValue = Boolean
  type UserArn = String
  type UserArnSession = String
  type Verbose = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-12-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
