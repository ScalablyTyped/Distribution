package typings.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEtag extends js.Object {
  var etag: String
  var number: Double
}

object AnonEtag {
  @scala.inline
  def apply(etag: String, number: Double): AnonEtag = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEtag]
  }
}

