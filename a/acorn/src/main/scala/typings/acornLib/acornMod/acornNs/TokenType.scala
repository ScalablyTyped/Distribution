package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenType extends js.Object {
  var beforeExpr: scala.Boolean
  var binop: scala.Double
  var isAssign: scala.Boolean
  var isLoop: scala.Boolean
  var keyword: java.lang.String
  var label: java.lang.String
  var postfix: scala.Boolean
  var prefix: scala.Boolean
  var startsExpr: scala.Boolean
  def updateContext(prevType: TokenType): scala.Unit
}

object TokenType {
  @scala.inline
  def apply(
    beforeExpr: scala.Boolean,
    binop: scala.Double,
    isAssign: scala.Boolean,
    isLoop: scala.Boolean,
    keyword: java.lang.String,
    label: java.lang.String,
    postfix: scala.Boolean,
    prefix: scala.Boolean,
    startsExpr: scala.Boolean,
    updateContext: js.Function1[TokenType, scala.Unit]
  ): TokenType = {
    val __obj = js.Dynamic.literal(beforeExpr = beforeExpr, binop = binop, isAssign = isAssign, isLoop = isLoop, keyword = keyword, label = label, postfix = postfix, prefix = prefix, startsExpr = startsExpr, updateContext = updateContext)
  
    __obj.asInstanceOf[TokenType]
  }
}

