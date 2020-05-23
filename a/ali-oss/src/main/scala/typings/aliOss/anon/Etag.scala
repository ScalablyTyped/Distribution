package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Etag extends js.Object {
  var etag: String
  var number: Double
}

object Etag {
  @scala.inline
  def apply(etag: String, number: Double): Etag = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Etag]
  }
}

