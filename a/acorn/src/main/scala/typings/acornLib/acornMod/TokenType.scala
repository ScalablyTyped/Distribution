package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "TokenType")
@js.native
class TokenType protected ()
  extends acornLib.acornMod.acornNs.TokenType {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, conf: acornLib.acornMod.acornNs.TokeTypeConfig) = this()
  /* CompleteClass */
  override var beforeExpr: scala.Boolean = js.native
  /* CompleteClass */
  override var binop: scala.Double = js.native
  /* CompleteClass */
  override var isAssign: scala.Boolean = js.native
  /* CompleteClass */
  override var isLoop: scala.Boolean = js.native
  /* CompleteClass */
  override var keyword: java.lang.String = js.native
  /* CompleteClass */
  override var label: java.lang.String = js.native
  /* CompleteClass */
  override var postfix: scala.Boolean = js.native
  /* CompleteClass */
  override var prefix: scala.Boolean = js.native
  /* CompleteClass */
  override var startsExpr: scala.Boolean = js.native
  /* CompleteClass */
  override def updateContext(prevType: acornLib.acornMod.acornNs.TokenType): scala.Unit = js.native
}

