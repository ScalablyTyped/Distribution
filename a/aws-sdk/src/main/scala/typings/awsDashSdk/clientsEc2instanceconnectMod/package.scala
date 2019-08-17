package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEc2instanceconnectMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AvailabilityZone = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type InstanceId = String
  type InstanceOSUser = String
  type RequestId = String
  type SSHPublicKey = String
  type Success = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-04-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
