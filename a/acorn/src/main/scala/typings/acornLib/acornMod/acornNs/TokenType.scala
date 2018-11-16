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

