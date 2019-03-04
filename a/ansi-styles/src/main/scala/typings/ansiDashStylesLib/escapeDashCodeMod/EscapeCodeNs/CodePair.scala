package typings
package ansiDashStylesLib.escapeDashCodeMod.EscapeCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePair extends js.Object {
  var close: java.lang.String
  var open: java.lang.String
}

object CodePair {
  @scala.inline
  def apply(close: java.lang.String, open: java.lang.String): CodePair = {
    val __obj = js.Dynamic.literal(close = close, open = open)
  
    __obj.asInstanceOf[CodePair]
  }
}

