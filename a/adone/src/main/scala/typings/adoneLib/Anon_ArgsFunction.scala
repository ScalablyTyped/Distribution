package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsFunction extends js.Object {
  val Function: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar[js.Function1[/* repeated */ _, scala.Unit]]
  val RegExp: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar[stdLib.RegExp]
  val Undefined: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar[js.UndefOr[scala.Nothing]]
}

object Anon_ArgsFunction {
  @scala.inline
  def apply(
    Function: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar[js.Function1[/* repeated */ _, scala.Unit]],
    RegExp: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar[stdLib.RegExp],
    Undefined: adoneLib.adoneNs.dataNs.yamlNs.typeNs.INs.Scalar[js.UndefOr[scala.Nothing]]
  ): Anon_ArgsFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Function")(Function)
    __obj.updateDynamic("RegExp")(RegExp)
    __obj.updateDynamic("Undefined")(Undefined)
    __obj.asInstanceOf[Anon_ArgsFunction]
  }
}

