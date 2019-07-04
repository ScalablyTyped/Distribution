package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediastoreMod {
  type AllowedHeaders = js.Array[Header]
  type AllowedMethods = js.Array[MethodName]
  type AllowedOrigins = js.Array[Origin]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContainerARN = java.lang.String
  type ContainerAccessLoggingEnabled = scala.Boolean
  type ContainerList = js.Array[Container]
  type ContainerListLimit = scala.Double
  type ContainerName = java.lang.String
  type ContainerPolicy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type ContainerStatus = _ContainerStatus | java.lang.String
  type CorsPolicy = js.Array[CorsRule]
  type Endpoint = java.lang.String
  type ExposeHeaders = js.Array[Header]
  type Header = java.lang.String
  type LifecyclePolicy = java.lang.String
  type MaxAgeSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUT
    - awsDashSdkLib.awsDashSdkLibStrings.GET
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - awsDashSdkLib.awsDashSdkLibStrings.HEAD
    - java.lang.String
  */
  type MethodName = _MethodName | java.lang.String
  type Origin = java.lang.String
  type PaginationToken = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TimeStamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
