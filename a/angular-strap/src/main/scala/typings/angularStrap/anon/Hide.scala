package typings.angularStrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hide extends js.Object {
  var hide: Double
  var show: Double
}

object Hide {
  @scala.inline
  def apply(hide: Double, show: Double): Hide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
}

