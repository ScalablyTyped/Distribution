package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstRange extends js.Object {
  var firstRange: Range
  var range: js.UndefOr[Range] = js.undefined
}

object FirstRange {
  @scala.inline
  def apply(firstRange: Range, range: Range = null): FirstRange = {
    val __obj = js.Dynamic.literal(firstRange = firstRange.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstRange]
  }
}

