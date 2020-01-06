package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDataexchangeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.S3_SNAPSHOT
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Arn = String
  type AssetName = String
  type AssetType = S3_SNAPSHOT | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_DENIED_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_SERVER_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.MALWARE_DETECTED
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_NOT_FOUND_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_QUOTA_EXCEEDED_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.MALWARE_SCAN_ENCRYPTED_FILE
    - java.lang.String
  */
  type Code = _Code | String
  type Description = String
  type Id = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Assets per revision`
    - typings.awsDashSdk.awsDashSdkStrings.`Asset size in GB`
    - java.lang.String
  */
  type JobErrorLimitName = _JobErrorLimitName | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REVISION
    - typings.awsDashSdk.awsDashSdkStrings.ASSET
    - java.lang.String
  */
  type JobErrorResourceTypes = _JobErrorResourceTypes | String
  type ListOfAssetDestinationEntry = js.Array[AssetDestinationEntry]
  type ListOfAssetEntry = js.Array[AssetEntry]
  type ListOfAssetSourceEntry = js.Array[AssetSourceEntry]
  type ListOfDataSetEntry = js.Array[DataSetEntry]
  type ListOfJobEntry = js.Array[JobEntry]
  type ListOfJobError = js.Array[JobError]
  type ListOfRevisionEntry = js.Array[RevisionEntry]
  type ListOf__string = js.Array[__string]
  type MapOf__string = StringDictionary[__string]
  type MaxResults = Double
  type Name = String
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OWNED
    - typings.awsDashSdk.awsDashSdkStrings.ENTITLED
    - java.lang.String
  */
  type Origin = _Origin | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WAITING
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type State = _State | String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_ASSETS_FROM_S3
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
    - typings.awsDashSdk.awsDashSdkStrings.EXPORT_ASSETS_TO_S3
    - typings.awsDashSdk.awsDashSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
    - java.lang.String
  */
  type Type = _Type | String
  type __boolean = Boolean
  type __double = Double
  type __doubleMin0 = Double
  type __string = String
  type __stringMin0Max16384 = String
  type __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
