package typings.angularCompiler

import typings.angularCompiler.astMod.ParseSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeySpan extends js.Object {
  var key: String
  var keySpan: ParseSpan
}

object AnonKeySpan {
  @scala.inline
  def apply(key: String, keySpan: ParseSpan): AnonKeySpan = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keySpan = keySpan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeySpan]
  }
}

