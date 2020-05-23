package typings.assertionError.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowDiff extends js.Object {
  var showDiff: Boolean
}

object ShowDiff {
  @scala.inline
  def apply(showDiff: Boolean): ShowDiff = {
    val __obj = js.Dynamic.literal(showDiff = showDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowDiff]
  }
}

