package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConnectparticipantMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ChatContent = String
  type ChatContentType = String
  type ChatItemId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MESSAGE
    - typings.awsDashSdk.awsDashSdkStrings.EVENT
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTION_ACK
    - java.lang.String
  */
  type ChatItemType = _ChatItemType | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WEBSOCKET
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTION_CREDENTIALS
    - java.lang.String
  */
  type ConnectionType = _ConnectionType | String
  type ConnectionTypeList = js.Array[ConnectionType]
  type ContactId = String
  type DisplayName = String
  type ISO8601Datetime = String
  type Instant = String
  type MaxResults = Double
  type MostRecent = Double
  type NextToken = String
  type ParticipantId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AGENT
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM
    - java.lang.String
  */
  type ParticipantRole = _ParticipantRole | String
  type ParticipantToken = String
  type PreSignedConnectionUrl = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FORWARD
    - typings.awsDashSdk.awsDashSdkStrings.BACKWARD
    - java.lang.String
  */
  type ScanDirection = _ScanDirection | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortKey = _SortKey | String
  type Transcript = js.Array[Item]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-09-07`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
