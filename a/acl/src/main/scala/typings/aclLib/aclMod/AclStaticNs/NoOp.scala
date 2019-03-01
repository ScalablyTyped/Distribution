package typings
package aclLib.aclMod.AclStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoOp extends js.Object {
  def end(): scala.Unit
  def params(types: java.lang.String*): NoOp
}

object NoOp {
  @scala.inline
  def apply(end: js.Function0[scala.Unit], params: js.Function1[/* repeated */ java.lang.String, NoOp]): NoOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NoOp]
  }
}

