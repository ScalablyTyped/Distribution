package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTransferMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Arn = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DateImported = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUBLIC
    - typings.awsDashSdk.awsDashSdkStrings.VPC_ENDPOINT
    - java.lang.String
  */
  type EndpointType = _EndpointType | String
  type HomeDirectory = String
  type HostKey = String
  type HostKeyFingerprint = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_MANAGED
    - typings.awsDashSdk.awsDashSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type IdentityProviderType = _IdentityProviderType | String
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type MaxResults = Double
  type Message = String
  type NextToken = String
  type NullableRole = String
  type Policy = String
  type Role = String
  type ServerId = String
  type SshPublicKeyBody = String
  type SshPublicKeyCount = Double
  type SshPublicKeyId = String
  type SshPublicKeys = js.Array[SshPublicKey]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFFLINE
    - typings.awsDashSdk.awsDashSdkStrings.ONLINE
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.START_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STOP_FAILED
    - java.lang.String
  */
  type State = _State | String
  type StatusCode = Double
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Url = String
  type UserCount = Double
  type UserName = String
  type UserPassword = String
  type VpcEndpointId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-05`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
