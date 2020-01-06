package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsOutpostsMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccountId = String
  type AvailabilityZone = String
  type AvailabilityZoneId = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type InstanceType = String
  type InstanceTypeListDefinition = js.Array[InstanceTypeItem]
  type LifeCycleStatus = String
  type MaxResults1000 = Double
  type OutpostArn = String
  type OutpostDescription = String
  type OutpostId = String
  type OutpostName = String
  type OwnerId = String
  type SiteDescription = String
  type SiteId = String
  type SiteName = String
  type Token = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-12-03`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type outpostListDefinition = js.Array[Outpost]
  type siteListDefinition = js.Array[Site]
}
