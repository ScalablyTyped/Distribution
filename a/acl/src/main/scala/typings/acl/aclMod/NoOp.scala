package typings.acl.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoOp extends js.Object {
  def end(): Unit
  def params(types: String*): NoOp
}

object NoOp {
  @scala.inline
  def apply(end: () => Unit, params: /* repeated */ String => NoOp): NoOp = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), params = js.Any.fromFunction1(params))
  
    __obj.asInstanceOf[NoOp]
  }
}

