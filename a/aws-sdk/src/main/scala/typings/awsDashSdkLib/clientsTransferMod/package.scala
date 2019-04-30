package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTransferMod {
  type Arn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DateImported = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.VPC_ENDPOINT
    - java.lang.String
  */
  type EndpointType = _EndpointType | java.lang.String
  type HomeDirectory = java.lang.String
  type HostKey = java.lang.String
  type HostKeyFingerprint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_MANAGED
    - awsDashSdkLib.awsDashSdkLibStrings.API_GATEWAY
    - java.lang.String
  */
  type IdentityProviderType = _IdentityProviderType | java.lang.String
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NullableRole = java.lang.String
  type Policy = java.lang.String
  type Role = java.lang.String
  type ServerId = java.lang.String
  type SshPublicKeyBody = java.lang.String
  type SshPublicKeyCount = scala.Double
  type SshPublicKeyId = java.lang.String
  type SshPublicKeys = js.Array[SshPublicKey]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OFFLINE
    - awsDashSdkLib.awsDashSdkLibStrings.ONLINE
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.START_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_FAILED
    - java.lang.String
  */
  type State = _State | java.lang.String
  type StatusCode = scala.Double
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type Url = java.lang.String
  type UserCount = scala.Double
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcEndpointId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-05`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
