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
    val __obj = js.Dynamic.literal(cArgs = cArgs, cNamedArgs = cNamedArgs, rgdispidNamedArgs = rgdispidNamedArgs, rgvarg = rgvarg)
  
    __obj.asInstanceOf[DISPPARAMS]
  }
}

