package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServicecatalogMod {
  type AcceptLanguage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Account
    - awsDashSdkLib.awsDashSdkLibStrings.Role
    - awsDashSdkLib.awsDashSdkLibStrings.User
    - java.lang.String
  */
  type AccessLevelFilterKey = _AccessLevelFilterKey | java.lang.String
  type AccessLevelFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.UNDER_CHANGE
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type AccessStatus = _AccessStatus | java.lang.String
  type AccountId = java.lang.String
  type AccountIds = js.Array[AccountId]
  type AddTags = js.Array[Tag]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[AllowedValue]
  type ApproximateCount = scala.Double
  type AttributeValue = java.lang.String
  type BudgetName = java.lang.String
  type Budgets = js.Array[BudgetDetail]
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADD
    - awsDashSdkLib.awsDashSdkLibStrings.MODIFY
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchDashboardName = java.lang.String
  type CloudWatchDashboards = js.Array[CloudWatchDashboard]
  type ConstraintDescription = java.lang.String
  type ConstraintDetails = js.Array[ConstraintDetail]
  type ConstraintParameters = java.lang.String
  type ConstraintSummaries = js.Array[ConstraintSummary]
  type ConstraintType = java.lang.String
  type CopyOption = awsDashSdkLib.awsDashSdkLibStrings.CopyTags | java.lang.String
  type CopyOptions = js.Array[CopyOption]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type CopyProductStatus = _CopyProductStatus | java.lang.String
  type CreatedTime = stdLib.Date
  type CreationTime = stdLib.Date
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type DisableTemplateValidation = scala.Boolean
  type Error = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STATIC
    - awsDashSdkLib.awsDashSdkLibStrings.DYNAMIC
    - java.lang.String
  */
  type EvaluationType = _EvaluationType | java.lang.String
  type FailedServiceActionAssociations = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath = scala.Boolean
  type Id = java.lang.String
  type IdempotencyToken = java.lang.String
  type IgnoreErrors = scala.Boolean
  type InstructionType = java.lang.String
  type InstructionValue = java.lang.String
  type LastRequestId = java.lang.String
  type LaunchPathSummaries = js.Array[LaunchPathSummary]
  type LogicalResourceId = java.lang.String
  type Message = java.lang.String
  type Namespaces = js.Array[AccountId]
  type NoEcho = scala.Boolean
  type NotificationArn = java.lang.String
  type NotificationArns = js.Array[NotificationArn]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONAL_UNIT
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT
    - java.lang.String
  */
  type OrganizationNodeType = _OrganizationNodeType | java.lang.String
  type OrganizationNodeValue = java.lang.String
  type OrganizationNodes = js.Array[OrganizationNode]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type PhysicalId = java.lang.String
  type PhysicalResourceId = java.lang.String
  type PlanResourceType = java.lang.String
  type PortfolioDescription = java.lang.String
  type PortfolioDetails = js.Array[PortfolioDetail]
  type PortfolioDisplayName = java.lang.String
  type PortfolioName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORTED
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_SERVICECATALOG
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_ORGANIZATIONS
    - java.lang.String
  */
  type PortfolioShareType = _PortfolioShareType | java.lang.String
  type PrincipalARN = java.lang.String
  type PrincipalType = awsDashSdkLib.awsDashSdkLibStrings.IAM | java.lang.String
  type Principals = js.Array[Principal]
  type ProductArn = java.lang.String
  type ProductSource = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUD_FORMATION_TEMPLATE
    - awsDashSdkLib.awsDashSdkLibStrings.MARKETPLACE
    - java.lang.String
  */
  type ProductType = _ProductType | java.lang.String
  type ProductViewAggregationType = java.lang.String
  type ProductViewAggregationValues = js.Array[ProductViewAggregationValue]
  type ProductViewAggregations = org.scalablytyped.runtime.StringDictionary[ProductViewAggregationValues]
  type ProductViewDetails = js.Array[ProductViewDetail]
  type ProductViewDistributor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FullTextSearch
    - awsDashSdkLib.awsDashSdkLibStrings.Owner
    - awsDashSdkLib.awsDashSdkLibStrings.ProductType
    - awsDashSdkLib.awsDashSdkLibStrings.SourceProductId
    - java.lang.String
  */
  type ProductViewFilterBy = _ProductViewFilterBy | java.lang.String
  type ProductViewFilterValue = java.lang.String
  type ProductViewFilterValues = js.Array[ProductViewFilterValue]
  type ProductViewFilters = org.scalablytyped.runtime.StringDictionary[ProductViewFilterValues]
  type ProductViewName = java.lang.String
  type ProductViewOwner = java.lang.String
  type ProductViewShortDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Title
    - awsDashSdkLib.awsDashSdkLibStrings.VersionCount
    - awsDashSdkLib.awsDashSdkLibStrings.CreationDate
    - java.lang.String
  */
  type ProductViewSortBy = _ProductViewSortBy | java.lang.String
  type ProductViewSummaries = js.Array[ProductViewSummary]
  type PropertyName = java.lang.String
  type ProviderName = java.lang.String
  type ProvisionedProductAttributes = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[ProvisionedProductDetail]
  type ProvisionedProductFilters = org.scalablytyped.runtime.StringDictionary[ProvisionedProductViewFilterValues]
  type ProvisionedProductId = java.lang.String
  type ProvisionedProductName = java.lang.String
  type ProvisionedProductNameOrArn = java.lang.String
  type ProvisionedProductPlanName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTE_FAILED
    - java.lang.String
  */
  type ProvisionedProductPlanStatus = _ProvisionedProductPlanStatus | java.lang.String
  type ProvisionedProductPlanType = awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION | java.lang.String
  type ProvisionedProductPlans = js.Array[ProvisionedProductPlanSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UNDER_CHANGE
    - awsDashSdkLib.awsDashSdkLibStrings.TAINTED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.PLAN_IN_PROGRESS
    - java.lang.String
  */
  type ProvisionedProductStatus = _ProvisionedProductStatus | java.lang.String
  type ProvisionedProductStatusMessage = java.lang.String
  type ProvisionedProductType = java.lang.String
  type ProvisionedProductViewFilterBy = awsDashSdkLib.awsDashSdkLibStrings.SearchQuery | java.lang.String
  type ProvisionedProductViewFilterValue = java.lang.String
  type ProvisionedProductViewFilterValues = js.Array[ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive = scala.Boolean
  type ProvisioningArtifactCreatedTime = stdLib.Date
  type ProvisioningArtifactDescription = java.lang.String
  type ProvisioningArtifactDetails = js.Array[ProvisioningArtifactDetail]
  type ProvisioningArtifactInfo = org.scalablytyped.runtime.StringDictionary[ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey = java.lang.String
  type ProvisioningArtifactInfoValue = java.lang.String
  type ProvisioningArtifactName = java.lang.String
  type ProvisioningArtifactParameters = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName = awsDashSdkLib.awsDashSdkLibStrings.Id | java.lang.String
  type ProvisioningArtifactPropertyValue = java.lang.String
  type ProvisioningArtifactSummaries = js.Array[ProvisioningArtifactSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUD_FORMATION_TEMPLATE
    - awsDashSdkLib.awsDashSdkLibStrings.MARKETPLACE_AMI
    - awsDashSdkLib.awsDashSdkLibStrings.MARKETPLACE_CAR
    - java.lang.String
  */
  type ProvisioningArtifactType = _ProvisioningArtifactType | java.lang.String
  type ProvisioningArtifactViews = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[ProvisioningArtifact]
  type ProvisioningParameters = js.Array[ProvisioningParameter]
  type RecordDetails = js.Array[RecordDetail]
  type RecordErrors = js.Array[RecordError]
  type RecordOutputs = js.Array[RecordOutput]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS_IN_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type RecordStatus = _RecordStatus | java.lang.String
  type RecordTagKey = java.lang.String
  type RecordTagValue = java.lang.String
  type RecordTags = js.Array[RecordTag]
  type RecordType = java.lang.String
  type Region = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRUE
    - awsDashSdkLib.awsDashSdkLibStrings.FALSE
    - awsDashSdkLib.awsDashSdkLibStrings.CONDITIONAL
    - java.lang.String
  */
  type Replacement = _Replacement | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NEVER
    - awsDashSdkLib.awsDashSdkLibStrings.CONDITIONALLY
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS
    - java.lang.String
  */
  type RequiresRecreation = _RequiresRecreation | java.lang.String
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PROPERTIES
    - awsDashSdkLib.awsDashSdkLibStrings.METADATA
    - awsDashSdkLib.awsDashSdkLibStrings.CREATIONPOLICY
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATEPOLICY
    - awsDashSdkLib.awsDashSdkLibStrings.DELETIONPOLICY
    - awsDashSdkLib.awsDashSdkLibStrings.TAGS
    - java.lang.String
  */
  type ResourceAttribute = _ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceChanges = js.Array[ResourceChange]
  type ResourceDetailARN = java.lang.String
  type ResourceDetailCreatedTime = stdLib.Date
  type ResourceDetailDescription = java.lang.String
  type ResourceDetailId = java.lang.String
  type ResourceDetailName = java.lang.String
  type ResourceDetails = js.Array[ResourceDetail]
  type ResourceId = java.lang.String
  type ResourceType = java.lang.String
  type Scope = js.Array[ResourceAttribute]
  type SearchFilterKey = java.lang.String
  type SearchFilterValue = java.lang.String
  type SearchProvisionedProductsPageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_RESOURCE
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.THROTTLING
    - java.lang.String
  */
  type ServiceActionAssociationErrorCode = _ServiceActionAssociationErrorCode | java.lang.String
  type ServiceActionAssociationErrorMessage = java.lang.String
  type ServiceActionAssociations = js.Array[ServiceActionAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.Version
    - awsDashSdkLib.awsDashSdkLibStrings.AssumeRole
    - awsDashSdkLib.awsDashSdkLibStrings.Parameters
    - java.lang.String
  */
  type ServiceActionDefinitionKey = _ServiceActionDefinitionKey | java.lang.String
  type ServiceActionDefinitionMap = org.scalablytyped.runtime.StringDictionary[ServiceActionDefinitionValue]
  type ServiceActionDefinitionType = awsDashSdkLib.awsDashSdkLibStrings.SSM_AUTOMATION | java.lang.String
  type ServiceActionDefinitionValue = java.lang.String
  type ServiceActionDescription = java.lang.String
  type ServiceActionName = java.lang.String
  type ServiceActionSummaries = js.Array[ServiceActionSummary]
  type ShareErrors = js.Array[ShareError]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_WITH_ERRORS
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | java.lang.String
  type SortField = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASCENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  type SourceProvisioningArtifactProperties = js.Array[SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = org.scalablytyped.runtime.StringDictionary[ProvisioningArtifactPropertyValue]
  type StackSetAccounts = js.Array[AccountId]
  type StackSetFailureToleranceCount = scala.Double
  type StackSetFailureTolerancePercentage = scala.Double
  type StackSetMaxConcurrencyCount = scala.Double
  type StackSetMaxConcurrencyPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationType = _StackSetOperationType | java.lang.String
  type StackSetRegions = js.Array[Region]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StatusDetail = java.lang.String
  type StatusMessage = java.lang.String
  type SuccessfulShares = js.Array[AccountId]
  type SupportDescription = java.lang.String
  type SupportEmail = java.lang.String
  type SupportUrl = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagOptionActive = scala.Boolean
  type TagOptionDetails = js.Array[TagOptionDetail]
  type TagOptionId = java.lang.String
  type TagOptionKey = java.lang.String
  type TagOptionSummaries = js.Array[TagOptionSummary]
  type TagOptionValue = java.lang.String
  type TagOptionValues = js.Array[TagOptionValue]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TotalResultsCount = scala.Double
  type UpdateProvisioningParameters = js.Array[UpdateProvisioningParameter]
  type UpdatedTime = stdLib.Date
  type UsageInstructions = js.Array[UsageInstruction]
  type UsePreviousValue = scala.Boolean
  type UserArn = java.lang.String
  type UserArnSession = java.lang.String
  type Verbose = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-12-10`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
