package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediastoreMod {
  type AllowedHeaders = js.Array[Header]
  type AllowedMethods = js.Array[MethodName]
  type AllowedOrigins = js.Array[Origin]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContainerARN = String
  type ContainerAccessLoggingEnabled = Boolean
  type ContainerList = js.Array[Container]
  type ContainerListLimit = Double
  type ContainerName = String
  type ContainerPolicy = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ContainerStatus = _ContainerStatus | String
  type CorsPolicy = js.Array[CorsRule]
  type Endpoint = String
  type ExposeHeaders = js.Array[Header]
  type Header = String
  type LifecyclePolicy = String
  type MaxAgeSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUT
    - typings.awsDashSdk.awsDashSdkStrings.GET
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - typings.awsDashSdk.awsDashSdkStrings.HEAD
    - java.lang.String
  */
  type MethodName = _MethodName | String
  type Origin = String
  type PaginationToken = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeStamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
