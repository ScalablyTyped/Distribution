package typings.aliOss.mod

import typings.aliOss.AnonHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitMultipartUploadResult extends js.Object {
  var bucket: String
   // bucket name
  var name: String
  var res: AnonHeaders
   // object name store on OSS
  var uploadId: String
}

object InitMultipartUploadResult {
  @scala.inline
  def apply(bucket: String, name: String, res: AnonHeaders, uploadId: String): InitMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitMultipartUploadResult]
  }
}

