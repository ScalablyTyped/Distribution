package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBucket extends js.Object {
  var bucket: String
  var res: NormalSuccessResponse
}

object AnonBucket {
  @scala.inline
  def apply(bucket: String, res: NormalSuccessResponse): AnonBucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBucket]
  }
}

