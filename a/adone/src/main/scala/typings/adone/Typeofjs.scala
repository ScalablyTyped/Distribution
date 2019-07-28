package typings.adone

import typings.adone.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjs extends js.Object {
  val Function: Scalar[js.Function1[/* repeated */ _, Unit]]
  val RegExp: Scalar[typings.std.RegExp]
  val Undefined: Scalar[js.UndefOr[scala.Nothing]]
}

object Typeofjs {
  @scala.inline
  def apply(
    Function: Scalar[js.Function1[/* repeated */ _, Unit]],
    RegExp: Scalar[RegExp],
    Undefined: Scalar[js.UndefOr[scala.Nothing]]
  ): Typeofjs = {
    val __obj = js.Dynamic.literal(Function = Function, RegExp = RegExp, Undefined = Undefined)
  
    __obj.asInstanceOf[Typeofjs]
  }
}

