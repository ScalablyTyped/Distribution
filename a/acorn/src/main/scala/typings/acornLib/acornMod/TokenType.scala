package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "TokenType")
@js.native
class TokenType protected () extends js.Object {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, conf: TokeTypeConfig) = this()
  var beforeExpr: scala.Boolean = js.native
  var binop: scala.Double = js.native
  var isAssign: scala.Boolean = js.native
  var isLoop: scala.Boolean = js.native
  var keyword: java.lang.String = js.native
  var label: java.lang.String = js.native
  var postfix: scala.Boolean = js.native
  var prefix: scala.Boolean = js.native
  var startsExpr: scala.Boolean = js.native
  def updateContext(prevType: TokenType): scala.Unit = js.native
}

