package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.TextSlashPlain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type AssociationTime = js.Date

type BatchGetFieldIdentifierList = js.Array[FieldIdentifier]

type BatchGetFieldResponseErrorsList = js.Array[FieldError]

type BatchGetFieldResponseFieldsList = js.Array[GetFieldResponse]

type BatchPutFieldOptionsRequestOptionsList = js.Array[FieldOption]

type BatchPutFieldOptionsResponseErrorsList = js.Array[FieldOptionError]

type Boolean = scala.Boolean

type CaseArn = java.lang.String

type CaseEventIncludedDataFieldsList = js.Array[FieldIdentifier]

type CaseFilterAndAllList = js.Array[CaseFilter]

type CaseId = java.lang.String

type Channel = java.lang.String

type CommentBody = java.lang.String

type CommentBodyTextType = TextSlashPlain | java.lang.String

type ConnectedToSystemTime = js.Date

type ContactArn = java.lang.String

type ContactFilterChannelList = js.Array[Channel]

type CreateCaseRequestClientTokenString = java.lang.String

type CreateCaseRequestFieldsList = js.Array[FieldValue]

type CreatedTime = js.Date

type DomainArn = java.lang.String

type DomainId = java.lang.String

type DomainName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.CreationInProgress
  - typings.awsSdk.awsSdkStrings.CreationFailed
  - java.lang.String
*/
type DomainStatus = _DomainStatus | java.lang.String

type DomainSummaryList = js.Array[DomainSummary]

type Double = scala.Double

type FieldArn = java.lang.String

type FieldDescription = java.lang.String

type FieldGroupFieldsList = js.Array[FieldItem]

type FieldGroupNameString = java.lang.String

type FieldId = java.lang.String

type FieldName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.System_
  - typings.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type FieldNamespace = _FieldNamespace | java.lang.String

type FieldOptionName = java.lang.String

type FieldOptionValue = java.lang.String

type FieldOptionsList = js.Array[FieldOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Text_
  - typings.awsSdk.awsSdkStrings.Number_
  - typings.awsSdk.awsSdkStrings.Boolean_
  - typings.awsSdk.awsSdkStrings.DateTime_
  - typings.awsSdk.awsSdkStrings.SingleSelect_
  - java.lang.String
*/
type FieldType = _FieldType | java.lang.String

type FieldValueUnionStringValueString = java.lang.String

type GetCaseRequestFieldsList = js.Array[FieldIdentifier]

type GetCaseResponseFieldsList = js.Array[FieldValue]

type LayoutArn = java.lang.String

type LayoutId = java.lang.String

type LayoutName = java.lang.String

type LayoutSummaryList = js.Array[LayoutSummary]

type ListCasesForContactRequestMaxResultsInteger = scala.Double

type ListCasesForContactResponseCasesList = js.Array[CaseSummary]

type ListDomainsRequestMaxResultsInteger = scala.Double

type ListFieldsResponseFieldsList = js.Array[FieldSummary]

type ListTemplatesResponseTemplatesList = js.Array[TemplateSummary]

type MaxResults = scala.Double

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Asc_
  - typings.awsSdk.awsSdkStrings.Desc_
  - java.lang.String
*/
type Order = _Order | java.lang.String

type RelatedItemArn = java.lang.String

type RelatedItemId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Contact_
  - typings.awsSdk.awsSdkStrings.Comment_
  - java.lang.String
*/
type RelatedItemType = _RelatedItemType | java.lang.String

type RequiredFieldList = js.Array[RequiredField]

type SearchCasesRequestFieldsList = js.Array[FieldIdentifier]

type SearchCasesRequestMaxResultsInteger = scala.Double

type SearchCasesRequestSearchTermString = java.lang.String

type SearchCasesRequestSortsList = js.Array[Sort]

type SearchCasesResponseCasesList = js.Array[SearchCasesResponseItem]

type SearchCasesResponseItemFieldsList = js.Array[FieldValue]

type SearchRelatedItemsRequestFiltersList = js.Array[RelatedItemTypeFilter]

type SearchRelatedItemsRequestMaxResultsInteger = scala.Double

type SearchRelatedItemsResponseRelatedItemsList = js.Array[SearchRelatedItemsResponseItem]

type SectionsList = js.Array[Section]

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type Tags = StringDictionary[String]

type TemplateArn = java.lang.String

type TemplateDescription = java.lang.String

type TemplateId = java.lang.String

type TemplateName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type TemplateStatus = _TemplateStatus | java.lang.String

type TemplateStatusFilters = js.Array[TemplateStatus]

type UpdateCaseRequestFieldsList = js.Array[FieldValue]

type Value = java.lang.String

type ValuesList = js.Array[Value]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-10-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
