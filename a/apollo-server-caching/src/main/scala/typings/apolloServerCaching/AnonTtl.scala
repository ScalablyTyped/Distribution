package typings.apolloServerCaching

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTtl extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object AnonTtl {
  @scala.inline
  def apply(ttl: Int | Double = null): AnonTtl = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTtl]
  }
}

