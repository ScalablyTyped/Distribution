package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediastoredataMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentRangePattern = java.lang.String
  type ContentType = java.lang.String
  type ETag = java.lang.String
  type ItemList = js.Array[Item]
  type ItemName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OBJECT
    - awsDashSdkLib.awsDashSdkLibStrings.FOLDER
    - java.lang.String
  */
  type ItemType = _ItemType | java.lang.String
  type ListLimit = scala.Double
  type ListPathNaming = java.lang.String
  type NonNegativeLong = scala.Double
  type PaginationToken = java.lang.String
  type PathNaming = java.lang.String
  type PayloadBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  type RangePattern = java.lang.String
  type SHA256Hash = java.lang.String
  type StorageClass = awsDashSdkLib.awsDashSdkLibStrings.TEMPORAL | java.lang.String
  type StringPrimitive = java.lang.String
  type TimeStamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.STREAMING
    - java.lang.String
  */
  type UploadAvailability = _UploadAvailability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type statusCode = scala.Double
}
