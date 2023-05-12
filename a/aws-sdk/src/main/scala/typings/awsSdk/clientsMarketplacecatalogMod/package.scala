package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type Catalog = String

type ChangeName = String

type ChangeSetDescription = js.Array[ChangeSummary]

type ChangeSetName = String

type ChangeSetSummaryList = js.Array[ChangeSetSummaryListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PREPARING
  - typings.awsSdk.awsSdkStrings.APPLYING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ChangeStatus = _ChangeStatus | String

type ChangeType = String

type ClientRequestToken = String

type DateTimeISO8601 = String

type EntityNameString = String

type EntitySummaryList = js.Array[EntitySummary]

type EntityType = String

type ErrorCodeString = String

type ErrorDetailList = js.Array[ErrorDetail]

type ExceptionMessageContent = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIENT_ERROR
  - typings.awsSdk.awsSdkStrings.SERVER_FAULT
  - java.lang.String
*/
type FailureCode = _FailureCode | String

type FilterList = js.Array[Filter]

type FilterName = String

type FilterValueContent = String

type Identifier = String

type Json = String

type ListChangeSetsMaxResultInteger = Double

type ListEntitiesMaxResultInteger = Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SELF
  - typings.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
type OwnershipType = _OwnershipType | String

type RequestedChangeList = js.Array[Change]

type ResourceARN = String

type ResourceId = String

type ResourceIdList = js.Array[ResourceId]

type ResourcePolicyJson = String

type SortBy = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type ValueList = js.Array[FilterValueContent]

type VisibilityValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-09-17`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
