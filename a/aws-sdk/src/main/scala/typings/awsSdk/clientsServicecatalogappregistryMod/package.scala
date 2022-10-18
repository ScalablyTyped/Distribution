package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.CFN_STACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationArn = java.lang.String

type ApplicationId = java.lang.String

type ApplicationSpecifier = java.lang.String

type ApplicationSummaries = js.Array[ApplicationSummary]

type Arn = java.lang.String

type AssociationCount = Double

type AttributeGroupArn = java.lang.String

type AttributeGroupDetailsList = js.Array[AttributeGroupDetails]

type AttributeGroupId = java.lang.String

type AttributeGroupIds = js.Array[AttributeGroupId]

type AttributeGroupSpecifier = java.lang.String

type AttributeGroupSummaries = js.Array[AttributeGroupSummary]

type Attributes = java.lang.String

type ClientToken = java.lang.String

type Description = java.lang.String

type MaxResults = Double

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ResourceGroupState = _ResourceGroupState | java.lang.String

type ResourceSpecifier = java.lang.String

type ResourceType = CFN_STACK | java.lang.String

type Resources = js.Array[ResourceInfo]

type StackArn = java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_SYNC
  - typings.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type SyncAction = _SyncAction | java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-06-24`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
