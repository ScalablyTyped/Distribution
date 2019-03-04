package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForRet extends js.Object {
  var in_ : js.Function1[/* expr */ js.Any, ForExpression]
  def in(expr: js.Any): ForExpression
}

object ForRet {
  @scala.inline
  def apply(in: js.Function1[js.Any, ForExpression], in_ : js.Function1[/* expr */ js.Any, ForExpression]): ForRet = {
    val __obj = js.Dynamic.literal(in = in, in_ = in_)
  
    __obj.asInstanceOf[ForRet]
  }
}

