package typings
package activexDashStdoleLib.stdoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DISPPARAMS extends js.Object {
  val cArgs: scala.Double
  val cNamedArgs: scala.Double
  val rgdispidNamedArgs: scala.Double
  val rgvarg: js.Any
}

object DISPPARAMS {
  @scala.inline
  def apply(cArgs: scala.Double, cNamedArgs: scala.Double, rgdispidNamedArgs: scala.Double, rgvarg: js.Any): DISPPARAMS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cArgs")(cArgs)
    __obj.updateDynamic("cNamedArgs")(cNamedArgs)
    __obj.updateDynamic("rgdispidNamedArgs")(rgdispidNamedArgs)
    __obj.updateDynamic("rgvarg")(rgvarg)
    __obj.asInstanceOf[DISPPARAMS]
  }
}

