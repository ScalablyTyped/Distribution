package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendObjectResult extends js.Object {
  var name: String
  var nextAppendPosition: String
   // the url of oss
  var res: NormalSuccessResponse
  var url: String
}

object AppendObjectResult {
  @scala.inline
  def apply(name: String, nextAppendPosition: String, res: NormalSuccessResponse, url: String): AppendObjectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nextAppendPosition = nextAppendPosition.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendObjectResult]
  }
}

