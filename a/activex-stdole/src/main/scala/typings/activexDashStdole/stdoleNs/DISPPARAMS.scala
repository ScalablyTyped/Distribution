package typings.activexDashStdole.stdoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DISPPARAMS extends js.Object {
  val cArgs: Double
  val cNamedArgs: Double
  val rgdispidNamedArgs: Double
  val rgvarg: js.Any
}

object DISPPARAMS {
  @scala.inline
  def apply(cArgs: Double, cNamedArgs: Double, rgdispidNamedArgs: Double, rgvarg: js.Any): DISPPARAMS = {
    val __obj = js.Dynamic.literal(cArgs = cArgs, cNamedArgs = cNamedArgs, rgdispidNamedArgs = rgdispidNamedArgs, rgvarg = rgvarg)
  
    __obj.asInstanceOf[DISPPARAMS]
  }
}

