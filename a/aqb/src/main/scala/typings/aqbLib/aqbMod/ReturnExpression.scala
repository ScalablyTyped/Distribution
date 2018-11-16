package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnExpression
  extends Expression
     with ScalablyTyped.runtime.Instantiable3[/* prev */ LetExpression, /* value */ js.Any, /* distinct */ scala.Boolean, Expression] {
  var _distinct: scala.Boolean = js.native
  var _prev: LetExpression = js.native
  def toAQL(): java.lang.String = js.native
}

