package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object augmentedairuntimeMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.augmentedairuntimeMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typings.awsSdk.augmentedairuntimeMod._ContentClassifier | java.lang.String
  
  type ContentClassifiers = js.Array[typings.awsSdk.augmentedairuntimeMod.ContentClassifier]
  
  type FailureReason = java.lang.String
  
  type FlowDefinitionArn = java.lang.String
  
  type HumanLoopArn = java.lang.String
  
  type HumanLoopName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type HumanLoopStatus = typings.awsSdk.augmentedairuntimeMod._HumanLoopStatus | java.lang.String
  
  type HumanLoopSummaries = js.Array[typings.awsSdk.augmentedairuntimeMod.HumanLoopSummary]
  
  type InputContent = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.augmentedairuntimeMod._SortOrder | java.lang.String
  
  type String = java.lang.String
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-11-07`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.augmentedairuntimeMod._apiVersion | java.lang.String
}
