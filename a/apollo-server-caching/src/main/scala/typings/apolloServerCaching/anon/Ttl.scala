package typings.apolloServerCaching.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ttl extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object Ttl {
  @scala.inline
  def apply(ttl: js.UndefOr[Double] = js.undefined): Ttl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ttl]
  }
}

