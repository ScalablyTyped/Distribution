package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object braketMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CANCELLING
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type CancellationStatus = typings.awsSdk.braketMod._CancellationStatus | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.braketMod.ClientApiVersions
  
  type CreateQuantumTaskRequestDeviceParametersString = java.lang.String
  
  type CreateQuantumTaskRequestOutputS3BucketString = java.lang.String
  
  type CreateQuantumTaskRequestOutputS3KeyPrefixString = java.lang.String
  
  type CreateQuantumTaskRequestShotsLong = scala.Double
  
  type DeviceArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONLINE
    - typings.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type DeviceStatus = typings.awsSdk.braketMod._DeviceStatus | java.lang.String
  
  type DeviceSummaryList = js.Array[typings.awsSdk.braketMod.DeviceSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QPU
    - typings.awsSdk.awsSdkStrings.SIMULATOR
    - java.lang.String
  */
  type DeviceType = typings.awsSdk.braketMod._DeviceType | java.lang.String
  
  type JsonValue = java.lang.String
  
  type Long = scala.Double
  
  type QuantumTaskArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELLING
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type QuantumTaskStatus = typings.awsSdk.braketMod._QuantumTaskStatus | java.lang.String
  
  type QuantumTaskSummaryList = js.Array[typings.awsSdk.braketMod.QuantumTaskSummary]
  
  type SearchDevicesFilterNameString = java.lang.String
  
  type SearchDevicesFilterValuesList = js.Array[typings.awsSdk.braketMod.String256]
  
  type SearchDevicesRequestFiltersList = js.Array[typings.awsSdk.braketMod.SearchDevicesFilter]
  
  type SearchDevicesRequestMaxResultsInteger = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.LTE
    - typings.awsSdk.awsSdkStrings.EQUAL
    - typings.awsSdk.awsSdkStrings.GT
    - typings.awsSdk.awsSdkStrings.GTE
    - typings.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type SearchQuantumTasksFilterOperator = typings.awsSdk.braketMod._SearchQuantumTasksFilterOperator | java.lang.String
  
  type SearchQuantumTasksFilterValuesList = js.Array[typings.awsSdk.braketMod.String256]
  
  type SearchQuantumTasksRequestFiltersList = js.Array[typings.awsSdk.braketMod.SearchQuantumTasksFilter]
  
  type SearchQuantumTasksRequestMaxResultsInteger = scala.Double
  
  type String = java.lang.String
  
  type String256 = java.lang.String
  
  type String64 = java.lang.String
  
  type SyntheticTimestampDateTime = typings.std.Date
  
  type TagKeys = js.Array[typings.awsSdk.braketMod.String]
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.braketMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-09-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.braketMod._apiVersion | java.lang.String
}
