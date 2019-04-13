package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsClouddirectoryMod {
  type Arn = java.lang.String
  type Arns = js.Array[Arn]
  type AttributeKeyAndValueList = js.Array[AttributeKeyAndValue]
  type AttributeKeyList = js.Array[AttributeKey]
  type AttributeName = java.lang.String
  type AttributeNameAndValueList = js.Array[AttributeNameAndValue]
  type AttributeNameList = js.Array[AttributeName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ValidationException
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidArnException
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceNotFoundException
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidNextTokenException
    - awsDashSdkLib.awsDashSdkLibStrings.AccessDeniedException
    - awsDashSdkLib.awsDashSdkLibStrings.NotNodeException
    - awsDashSdkLib.awsDashSdkLibStrings.FacetValidationException
    - awsDashSdkLib.awsDashSdkLibStrings.CannotListParentOfRootException
    - awsDashSdkLib.awsDashSdkLibStrings.NotIndexException
    - awsDashSdkLib.awsDashSdkLibStrings.NotPolicyException
    - awsDashSdkLib.awsDashSdkLibStrings.DirectoryNotEnabledException
    - awsDashSdkLib.awsDashSdkLibStrings.LimitExceededException
    - awsDashSdkLib.awsDashSdkLibStrings.InternalServiceException
    - java.lang.String
  */
  type BatchReadExceptionType = _BatchReadExceptionType | java.lang.String
  type BatchReadOperationList = js.Array[BatchReadOperation]
  type BatchReadOperationResponseList = js.Array[BatchReadOperationResponse]
  type BatchReferenceName = java.lang.String
  type BatchWriteOperationList = js.Array[BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[BatchWriteOperationResponse]
  type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type Bool = scala.Boolean
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SERIALIZABLE
    - awsDashSdkLib.awsDashSdkLibStrings.EVENTUAL
    - java.lang.String
  */
  type ConsistencyLevel = _ConsistencyLevel | java.lang.String
  type DatetimeAttributeValue = stdLib.Date
  type DirectoryArn = java.lang.String
  type DirectoryList = js.Array[Directory]
  type DirectoryName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type DirectoryState = _DirectoryState | java.lang.String
  type ExceptionMessage = java.lang.String
  type FacetAttributeList = js.Array[FacetAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STRING
    - awsDashSdkLib.awsDashSdkLibStrings.BINARY
    - awsDashSdkLib.awsDashSdkLibStrings.BOOLEAN
    - awsDashSdkLib.awsDashSdkLibStrings.NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.DATETIME
    - awsDashSdkLib.awsDashSdkLibStrings.VARIANT
    - java.lang.String
  */
  type FacetAttributeType = _FacetAttributeType | java.lang.String
  type FacetAttributeUpdateList = js.Array[FacetAttributeUpdate]
  type FacetName = java.lang.String
  type FacetNameList = js.Array[FacetName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STATIC
    - awsDashSdkLib.awsDashSdkLibStrings.DYNAMIC
    - java.lang.String
  */
  type FacetStyle = _FacetStyle | java.lang.String
  type IndexAttachmentList = js.Array[IndexAttachment]
  type LinkAttributeUpdateList = js.Array[LinkAttributeUpdate]
  type LinkName = java.lang.String
  type LinkNameToObjectIdentifierMap = org.scalablytyped.runtime.StringDictionary[ObjectIdentifier]
  type NextToken = java.lang.String
  type NumberAttributeValue = java.lang.String
  type NumberResults = scala.Double
  type ObjectAttributeRangeList = js.Array[ObjectAttributeRange]
  type ObjectAttributeUpdateList = js.Array[ObjectAttributeUpdate]
  type ObjectIdentifier = java.lang.String
  type ObjectIdentifierAndLinkNameList = js.Array[ObjectIdentifierAndLinkNameTuple]
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectIdentifierToLinkNameMap = org.scalablytyped.runtime.StringDictionary[LinkName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NODE
    - awsDashSdkLib.awsDashSdkLibStrings.LEAF_NODE
    - awsDashSdkLib.awsDashSdkLibStrings.POLICY
    - awsDashSdkLib.awsDashSdkLibStrings.INDEX
    - java.lang.String
  */
  type ObjectType = _ObjectType | java.lang.String
  type PathString = java.lang.String
  type PathToObjectIdentifiersList = js.Array[PathToObjectIdentifiers]
  type PolicyAttachmentList = js.Array[PolicyAttachment]
  type PolicyToPathList = js.Array[PolicyToPath]
  type PolicyType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FIRST
    - awsDashSdkLib.awsDashSdkLibStrings.LAST
    - awsDashSdkLib.awsDashSdkLibStrings.LAST_BEFORE_MISSING_VALUES
    - awsDashSdkLib.awsDashSdkLibStrings.INCLUSIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXCLUSIVE
    - java.lang.String
  */
  type RangeMode = _RangeMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REQUIRED_ALWAYS
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_REQUIRED
    - java.lang.String
  */
  type RequiredAttributeBehavior = _RequiredAttributeBehavior | java.lang.String
  type RuleKey = java.lang.String
  type RuleMap = org.scalablytyped.runtime.StringDictionary[Rule]
  type RuleParameterKey = java.lang.String
  type RuleParameterMap = org.scalablytyped.runtime.StringDictionary[RuleParameterValue]
  type RuleParameterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BINARY_LENGTH
    - awsDashSdkLib.awsDashSdkLibStrings.NUMBER_COMPARISON
    - awsDashSdkLib.awsDashSdkLibStrings.STRING_FROM_SET
    - awsDashSdkLib.awsDashSdkLibStrings.STRING_LENGTH
    - java.lang.String
  */
  type RuleType = _RuleType | java.lang.String
  type SchemaFacetList = js.Array[SchemaFacet]
  type SchemaJsonDocument = java.lang.String
  type SchemaName = java.lang.String
  type SelectorObjectReference = java.lang.String
  type StringAttributeValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TagsNumberResults = scala.Double
  type TypedLinkAttributeDefinitionList = js.Array[TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList = js.Array[TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[TypedLinkFacetAttributeUpdate]
  type TypedLinkName = java.lang.String
  type TypedLinkNameList = js.Array[TypedLinkName]
  type TypedLinkSpecifierList = js.Array[TypedLinkSpecifier]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_OR_UPDATE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type UpdateActionType = _UpdateActionType | java.lang.String
  type Version = java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-05-10`
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-01-11`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
