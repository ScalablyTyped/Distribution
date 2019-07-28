package typings.acorn.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "TokenType")
@js.native
class TokenType protected () extends js.Object {
  def this(label: String) = this()
  def this(label: String, conf: TokeTypeConfig) = this()
  var beforeExpr: Boolean = js.native
  var binop: Double = js.native
  var isAssign: Boolean = js.native
  var isLoop: Boolean = js.native
  var keyword: String = js.native
  var label: String = js.native
  var postfix: Boolean = js.native
  var prefix: Boolean = js.native
  var startsExpr: Boolean = js.native
  def updateContext(prevType: TokenType): Unit = js.native
}

