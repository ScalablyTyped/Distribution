package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object accessanalyzerMod {
  
  type ActionList = js.Array[typings.awsSdk.accessanalyzerMod.String]
  
  type AnalyzedResourcesList = js.Array[typings.awsSdk.accessanalyzerMod.AnalyzedResourceSummary]
  
  type AnalyzerArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AnalyzerStatus = typings.awsSdk.accessanalyzerMod._AnalyzerStatus | java.lang.String
  
  type AnalyzersList = js.Array[typings.awsSdk.accessanalyzerMod.AnalyzerSummary]
  
  type ArchiveRulesList = js.Array[typings.awsSdk.accessanalyzerMod.ArchiveRuleSummary]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.accessanalyzerMod.ClientApiVersions
  
  type ConditionKeyMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.accessanalyzerMod.String]
  
  type FilterCriteriaMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.accessanalyzerMod.Criterion]
  
  type FindingId = java.lang.String
  
  type FindingIdList = js.Array[typings.awsSdk.accessanalyzerMod.FindingId]
  
  type FindingSourceList = js.Array[typings.awsSdk.accessanalyzerMod.FindingSource]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.POLICY
    - typings.awsSdk.awsSdkStrings.BUCKET_ACL
    - typings.awsSdk.awsSdkStrings.S3_ACCESS_POINT
    - java.lang.String
  */
  type FindingSourceType = typings.awsSdk.accessanalyzerMod._FindingSourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.ARCHIVED
    - typings.awsSdk.awsSdkStrings.RESOLVED
    - java.lang.String
  */
  type FindingStatus = typings.awsSdk.accessanalyzerMod._FindingStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type FindingStatusUpdate = typings.awsSdk.accessanalyzerMod._FindingStatusUpdate | java.lang.String
  
  type FindingsList = js.Array[typings.awsSdk.accessanalyzerMod.FindingSummary]
  
  type InlineArchiveRulesList = js.Array[typings.awsSdk.accessanalyzerMod.InlineArchiveRule]
  
  type Integer = scala.Double
  
  type Name = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASC
    - typings.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typings.awsSdk.accessanalyzerMod._OrderBy | java.lang.String
  
  type PrincipalMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.accessanalyzerMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWS_SERVICE_ACCESS_DISABLED
    - typings.awsSdk.awsSdkStrings.DELEGATED_ADMINISTRATOR_DEREGISTERED
    - typings.awsSdk.awsSdkStrings.ORGANIZATION_DELETED
    - typings.awsSdk.awsSdkStrings.SERVICE_LINKED_ROLE_CREATION_FAILED
    - java.lang.String
  */
  type ReasonCode = typings.awsSdk.accessanalyzerMod._ReasonCode | java.lang.String
  
  type ResourceArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typings.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
    - typings.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typings.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion
    - typings.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.accessanalyzerMod._ResourceType | java.lang.String
  
  type SharedViaList = js.Array[typings.awsSdk.accessanalyzerMod.String]
  
  type String = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.accessanalyzerMod.String]
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.accessanalyzerMod.String]
  
  type Timestamp = typings.std.Date
  
  type Token = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - typings.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type Type = typings.awsSdk.accessanalyzerMod._Type | java.lang.String
  
  type ValueList = js.Array[typings.awsSdk.accessanalyzerMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.accessanalyzerMod._apiVersion | java.lang.String
}
