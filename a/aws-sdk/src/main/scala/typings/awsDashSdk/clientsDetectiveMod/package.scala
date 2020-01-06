package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDetectiveMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountId = String
  type AccountIdList = js.Array[AccountId]
  type AccountList = js.Array[Account]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EmailAddress = String
  type EmailMessage = String
  type GraphArn = String
  type GraphList = js.Array[Graph]
  type MemberDetailList = js.Array[MemberDetail]
  type MemberResultsLimit = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INVITED
    - typings.awsDashSdk.awsDashSdkStrings.VERIFICATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.VERIFICATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type MemberStatus = _MemberStatus | String
  type PaginationToken = String
  type Timestamp = Date
  type UnprocessedAccountList = js.Array[UnprocessedAccount]
  type UnprocessedReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
