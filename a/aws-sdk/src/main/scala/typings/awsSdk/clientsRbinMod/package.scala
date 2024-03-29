package typings.awsSdk.clientsRbinMod

import typings.awsSdk.awsSdkStrings.DAYS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Description = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.locked_
  - typings.awsSdk.awsSdkStrings.pending_unlock
  - typings.awsSdk.awsSdkStrings.unlocked_
  - java.lang.String
*/
type LockState = _LockState | String

type MaxResults = Double

type NextToken = String

type ResourceTagKey = String

type ResourceTagValue = String

type ResourceTags = js.Array[ResourceTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EBS_SNAPSHOT
  - typings.awsSdk.awsSdkStrings.EC2_IMAGE
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type RetentionPeriodUnit = DAYS | String

type RetentionPeriodValue = Double

type RuleArn = String

type RuleIdentifier = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - java.lang.String
*/
type RuleStatus = _RuleStatus | String

type RuleSummaryList = js.Array[RuleSummary]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimeStamp = js.Date

type UnlockDelayUnit = DAYS | String

type UnlockDelayValue = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-06-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
