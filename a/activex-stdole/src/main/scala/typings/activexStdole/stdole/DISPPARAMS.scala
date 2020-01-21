package typings.activexStdole.stdole

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
    val __obj = js.Dynamic.literal(cArgs = cArgs.asInstanceOf[js.Any], cNamedArgs = cNamedArgs.asInstanceOf[js.Any], rgdispidNamedArgs = rgdispidNamedArgs.asInstanceOf[js.Any], rgvarg = rgvarg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DISPPARAMS]
  }
}

