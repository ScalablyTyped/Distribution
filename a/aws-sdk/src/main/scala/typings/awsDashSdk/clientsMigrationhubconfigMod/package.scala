package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMigrationhubconfigMod {
  import typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ControlId = String
  type DescribeHomeRegionControlsMaxResults = Double
  type DryRun = Boolean
  type HomeRegion = String
  type HomeRegionControls = js.Array[HomeRegionControl]
  type RequestedTime = Date
  type TargetId = String
  type TargetType = ACCOUNT | String
  type Token = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-06-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
