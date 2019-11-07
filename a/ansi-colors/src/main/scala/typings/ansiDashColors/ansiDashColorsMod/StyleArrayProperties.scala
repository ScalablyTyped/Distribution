package typings.ansiDashColors.ansiDashColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleArrayProperties extends js.Object {
  var close: String
  var closeRe: String
  var open: String
}

object StyleArrayProperties {
  @scala.inline
  def apply(close: String, closeRe: String, open: String): StyleArrayProperties = {
    val __obj = js.Dynamic.literal(close = close, closeRe = closeRe, open = open)
  
    __obj.asInstanceOf[StyleArrayProperties]
  }
}

