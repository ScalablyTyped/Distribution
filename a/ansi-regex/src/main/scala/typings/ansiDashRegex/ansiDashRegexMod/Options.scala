package typings.ansiDashRegex.ansiDashRegexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Match only the first ANSI escape.
  		@default false
  		*/
  var onlyFirst: Boolean
}

object Options {
  @scala.inline
  def apply(onlyFirst: Boolean): Options = {
    val __obj = js.Dynamic.literal(onlyFirst = onlyFirst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

