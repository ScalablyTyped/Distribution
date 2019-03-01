package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WordRegex extends js.Object {
  var wordRegex: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Anon_WordRegex {
  @scala.inline
  def apply(wordRegex: stdLib.RegExp = null): Anon_WordRegex = {
    val __obj = js.Dynamic.literal()
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex)
    __obj.asInstanceOf[Anon_WordRegex]
  }
}

