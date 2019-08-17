package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsClouddirectoryMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Arn = String
  type Arns = js.Array[Arn]
  type AttributeKeyAndValueList = js.Array[AttributeKeyAndValue]
  type AttributeKeyList = js.Array[AttributeKey]
  type AttributeName = String
  type AttributeNameAndValueList = js.Array[AttributeNameAndValue]
  type AttributeNameList = js.Array[AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ValidationException
    - typings.awsDashSdk.awsDashSdkStrings.InvalidArnException
    - typings.awsDashSdk.awsDashSdkStrings.ResourceNotFoundException
    - typings.awsDashSdk.awsDashSdkStrings.InvalidNextTokenException
    - typings.awsDashSdk.awsDashSdkStrings.AccessDeniedException
    - typings.awsDashSdk.awsDashSdkStrings.NotNodeException
    - typings.awsDashSdk.awsDashSdkStrings.FacetValidationException
    - typings.awsDashSdk.awsDashSdkStrings.CannotListParentOfRootException
    - typings.awsDashSdk.awsDashSdkStrings.NotIndexException
    - typings.awsDashSdk.awsDashSdkStrings.NotPolicyException
    - typings.awsDashSdk.awsDashSdkStrings.DirectoryNotEnabledException
    - typings.awsDashSdk.awsDashSdkStrings.LimitExceededException
    - typings.awsDashSdk.awsDashSdkStrings.InternalServiceException
    - java.lang.String
  */
  type BatchReadExceptionType = _BatchReadExceptionType | String
  type BatchReadOperationList = js.Array[BatchReadOperation]
  type BatchReadOperationResponseList = js.Array[BatchReadOperationResponse]
  type BatchReferenceName = String
  type BatchWriteOperationList = js.Array[BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[BatchWriteOperationResponse]
  type BinaryAttributeValue = Buffer | Uint8Array | Blob | String
  type Bool = Boolean
  type BooleanAttributeValue = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SERIALIZABLE
    - typings.awsDashSdk.awsDashSdkStrings.EVENTUAL
    - java.lang.String
  */
  type ConsistencyLevel = _ConsistencyLevel | String
  type DatetimeAttributeValue = Date
  type DirectoryArn = String
  type DirectoryList = js.Array[Directory]
  type DirectoryName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type DirectoryState = _DirectoryState | String
  type ExceptionMessage = String
  type FacetAttributeList = js.Array[FacetAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STRING
    - typings.awsDashSdk.awsDashSdkStrings.BINARY
    - typings.awsDashSdk.awsDashSdkStrings.BOOLEAN
    - typings.awsDashSdk.awsDashSdkStrings.NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.DATETIME
    - typings.awsDashSdk.awsDashSdkStrings.VARIANT
    - java.lang.String
  */
  type FacetAttributeType = _FacetAttributeType | String
  type FacetAttributeUpdateList = js.Array[FacetAttributeUpdate]
  type FacetName = String
  type FacetNameList = js.Array[FacetName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STATIC
    - typings.awsDashSdk.awsDashSdkStrings.DYNAMIC
    - java.lang.String
  */
  type FacetStyle = _FacetStyle | String
  type IndexAttachmentList = js.Array[IndexAttachment]
  type LinkAttributeUpdateList = js.Array[LinkAttributeUpdate]
  type LinkName = String
  type LinkNameToObjectIdentifierMap = StringDictionary[ObjectIdentifier]
  type NextToken = String
  type NumberAttributeValue = String
  type NumberResults = Double
  type ObjectAttributeRangeList = js.Array[ObjectAttributeRange]
  type ObjectAttributeUpdateList = js.Array[ObjectAttributeUpdate]
  type ObjectIdentifier = String
  type ObjectIdentifierAndLinkNameList = js.Array[ObjectIdentifierAndLinkNameTuple]
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectIdentifierToLinkNameMap = StringDictionary[LinkName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NODE
    - typings.awsDashSdk.awsDashSdkStrings.LEAF_NODE
    - typings.awsDashSdk.awsDashSdkStrings.POLICY
    - typings.awsDashSdk.awsDashSdkStrings.INDEX
    - java.lang.String
  */
  type ObjectType = _ObjectType | String
  type PathString = String
  type PathToObjectIdentifiersList = js.Array[PathToObjectIdentifiers]
  type PolicyAttachmentList = js.Array[PolicyAttachment]
  type PolicyToPathList = js.Array[PolicyToPath]
  type PolicyType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FIRST
    - typings.awsDashSdk.awsDashSdkStrings.LAST
    - typings.awsDashSdk.awsDashSdkStrings.LAST_BEFORE_MISSING_VALUES
    - typings.awsDashSdk.awsDashSdkStrings.INCLUSIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type RangeMode = _RangeMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REQUIRED_ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NOT_REQUIRED
    - java.lang.String
  */
  type RequiredAttributeBehavior = _RequiredAttributeBehavior | String
  type RuleKey = String
  type RuleMap = StringDictionary[Rule]
  type RuleParameterKey = String
  type RuleParameterMap = StringDictionary[RuleParameterValue]
  type RuleParameterValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BINARY_LENGTH
    - typings.awsDashSdk.awsDashSdkStrings.NUMBER_COMPARISON
    - typings.awsDashSdk.awsDashSdkStrings.STRING_FROM_SET
    - typings.awsDashSdk.awsDashSdkStrings.STRING_LENGTH
    - java.lang.String
  */
  type RuleType = _RuleType | String
  type SchemaFacetList = js.Array[SchemaFacet]
  type SchemaJsonDocument = String
  type SchemaName = String
  type SelectorObjectReference = String
  type StringAttributeValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TagsNumberResults = Double
  type TypedLinkAttributeDefinitionList = js.Array[TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList = js.Array[TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[TypedLinkFacetAttributeUpdate]
  type TypedLinkName = String
  type TypedLinkNameList = js.Array[TypedLinkName]
  type TypedLinkSpecifierList = js.Array[TypedLinkSpecifier]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_OR_UPDATE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type UpdateActionType = _UpdateActionType | String
  type Version = String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-05-10`
    - typings.awsDashSdk.awsDashSdkStrings.`2017-01-11`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
