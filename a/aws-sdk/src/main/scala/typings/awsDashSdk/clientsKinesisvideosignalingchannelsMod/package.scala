package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideosignalingchannelsMod {
  import typings.awsDashSdk.awsDashSdkStrings.TURN
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type Answer = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientId = String
  type IceServerList = js.Array[IceServer]
  type MessagePayload = String
  type Password = String
  type ResourceARN = String
  type Service = TURN | String
  type Ttl = Double
  type Uri = String
  type Uris = js.Array[Uri]
  type Username = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-12-04`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
