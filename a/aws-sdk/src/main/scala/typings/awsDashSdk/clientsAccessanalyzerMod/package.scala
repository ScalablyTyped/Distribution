package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAccessanalyzerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ActionList = js.Array[String]
  type AnalyzedResourcesList = js.Array[AnalyzedResourceSummary]
  type AnalyzerArn = java.lang.String
  type AnalyzersList = js.Array[AnalyzerSummary]
  type ArchiveRulesList = js.Array[ArchiveRuleSummary]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConditionKeyMap = StringDictionary[String]
  type FilterCriteriaMap = StringDictionary[Criterion]
  type FindingId = java.lang.String
  type FindingIdList = js.Array[FindingId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVED
    - typings.awsDashSdk.awsDashSdkStrings.RESOLVED
    - java.lang.String
  */
  type FindingStatus = _FindingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVED
    - java.lang.String
  */
  type FindingStatusUpdate = _FindingStatusUpdate | java.lang.String
  type FindingsList = js.Array[FindingSummary]
  type InlineArchiveRulesList = js.Array[InlineArchiveRule]
  type Integer = Double
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = _OrderBy | java.lang.String
  type PrincipalMap = StringDictionary[String]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonIAMColonColonRole
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonKMSColonColonKey
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonLambdaColonColonFunction
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonLambdaColonColonLayerVersion
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonS3ColonColonBucket
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSQSColonColonQueue
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type SharedViaList = js.Array[String]
  type String = java.lang.String
  type TagKeys = js.Array[String]
  type TagsMap = StringDictionary[String]
  type Timestamp = Date
  type Token = java.lang.String
  type Type = ACCOUNT | java.lang.String
  type ValueList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
