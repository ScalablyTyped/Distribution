package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutChannelResult extends js.Object {
  var playUrls: js.Array[String]
  var publishUrls: js.Array[String]
  var res: NormalSuccessResponse
}

object PutChannelResult {
  @scala.inline
  def apply(playUrls: js.Array[String], publishUrls: js.Array[String], res: NormalSuccessResponse): PutChannelResult = {
    val __obj = js.Dynamic.literal(playUrls = playUrls.asInstanceOf[js.Any], publishUrls = publishUrls.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelResult]
  }
}

