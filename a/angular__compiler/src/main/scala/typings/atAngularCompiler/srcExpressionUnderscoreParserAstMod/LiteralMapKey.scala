package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralMapKey extends js.Object {
  var key: String
  var quoted: Boolean
}

object LiteralMapKey {
  @scala.inline
  def apply(key: String, quoted: Boolean): LiteralMapKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiteralMapKey]
  }
}

