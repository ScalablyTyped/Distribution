package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMarketplacemeteringMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CustomerIdentifier = java.lang.String
  type NonEmptyString = java.lang.String
  type Nonce = java.lang.String
  type ProductCode = java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  type UsageDimension = java.lang.String
  type UsageQuantity = Double
  type UsageRecordList = js.Array[UsageRecord]
  type UsageRecordResultList = js.Array[UsageRecordResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success_
    - typings.awsDashSdk.awsDashSdkStrings.CustomerNotSubscribed
    - typings.awsDashSdk.awsDashSdkStrings.DuplicateRecord
    - java.lang.String
  */
  type UsageRecordResultStatus = _UsageRecordResultStatus | java.lang.String
  type VersionInteger = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-01-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
