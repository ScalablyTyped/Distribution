package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediastoredataMod {
  import typings.awsDashSdk.awsDashSdkStrings.TEMPORAL
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Date
  import typings.std.Uint8Array

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContentRangePattern = String
  type ContentType = String
  type ETag = String
  type ItemList = js.Array[Item]
  type ItemName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OBJECT
    - typings.awsDashSdk.awsDashSdkStrings.FOLDER
    - java.lang.String
  */
  type ItemType = _ItemType | String
  type ListLimit = Double
  type ListPathNaming = String
  type NonNegativeLong = Double
  type PaginationToken = String
  type PathNaming = String
  type PayloadBlob = Buffer | Uint8Array | Blob | String | Readable
  type RangePattern = String
  type SHA256Hash = String
  type StorageClass = TEMPORAL | String
  type StringPrimitive = String
  type TimeStamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.STREAMING
    - java.lang.String
  */
  type UploadAvailability = _UploadAvailability | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type statusCode = Double
}
