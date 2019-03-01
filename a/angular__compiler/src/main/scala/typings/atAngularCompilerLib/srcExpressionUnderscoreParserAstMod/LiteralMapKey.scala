package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralMapKey extends js.Object {
  var key: java.lang.String
  var quoted: scala.Boolean
}

object LiteralMapKey {
  @scala.inline
  def apply(key: java.lang.String, quoted: scala.Boolean): LiteralMapKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("quoted")(quoted)
    __obj.asInstanceOf[LiteralMapKey]
  }
}

