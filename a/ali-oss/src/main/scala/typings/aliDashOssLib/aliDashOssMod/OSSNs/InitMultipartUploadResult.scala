package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitMultipartUploadResult extends js.Object {
  var bucket: java.lang.String
   // bucket name
  var name: java.lang.String
  var res: aliDashOssLib.Anon_Headers
   // object name store on OSS
  var uploadId: java.lang.String
}

object InitMultipartUploadResult {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    name: java.lang.String,
    res: aliDashOssLib.Anon_Headers,
    uploadId: java.lang.String
  ): InitMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket, name = name, res = res, uploadId = uploadId)
  
    __obj.asInstanceOf[InitMultipartUploadResult]
  }
}

