package typings.atom.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordRegex extends js.Object {
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object WordRegex {
  @scala.inline
  def apply(wordRegex: RegExp = null): WordRegex = {
    val __obj = js.Dynamic.literal()
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordRegex]
  }
}

