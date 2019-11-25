package typings.atom

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WordRegex extends js.Object {
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object Anon_WordRegex {
  @scala.inline
  def apply(wordRegex: RegExp = null): Anon_WordRegex = {
    val __obj = js.Dynamic.literal()
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WordRegex]
  }
}

