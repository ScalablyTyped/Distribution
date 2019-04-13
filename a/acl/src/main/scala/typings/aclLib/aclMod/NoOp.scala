package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoOp extends js.Object {
  def end(): scala.Unit
  def params(types: java.lang.String*): NoOp
}

object NoOp {
  @scala.inline
  def apply(end: () => scala.Unit, params: /* repeated */ java.lang.String => NoOp): NoOp = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), params = js.Any.fromFunction1(params))
  
    __obj.asInstanceOf[NoOp]
  }
}

