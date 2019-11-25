package typings.ansiDashStyles.escapeDashCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePair extends js.Object {
  var close: String
  var open: String
}

object CodePair {
  @scala.inline
  def apply(close: String, open: String): CodePair = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodePair]
  }
}

