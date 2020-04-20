package typings.accurateInterval.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var aligned: Boolean
  var immediate: Boolean
}

object Opts {
  @scala.inline
  def apply(aligned: Boolean, immediate: Boolean): Opts = {
    val __obj = js.Dynamic.literal(aligned = aligned.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

