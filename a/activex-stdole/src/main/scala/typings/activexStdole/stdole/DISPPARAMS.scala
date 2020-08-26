package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DISPPARAMS extends js.Object {
  val cArgs: Double = js.native
  val cNamedArgs: Double = js.native
  val rgdispidNamedArgs: Double = js.native
  val rgvarg: js.Any = js.native
}

object DISPPARAMS {
  @scala.inline
  def apply(cArgs: Double, cNamedArgs: Double, rgdispidNamedArgs: Double, rgvarg: js.Any): DISPPARAMS = {
    val __obj = js.Dynamic.literal(cArgs = cArgs.asInstanceOf[js.Any], cNamedArgs = cNamedArgs.asInstanceOf[js.Any], rgdispidNamedArgs = rgdispidNamedArgs.asInstanceOf[js.Any], rgvarg = rgvarg.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISPPARAMS]
  }
  @scala.inline
  implicit class DISPPARAMSOps[Self <: DISPPARAMS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCArgs(value: Double): Self = this.set("cArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setCNamedArgs(value: Double): Self = this.set("cNamedArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgdispidNamedArgs(value: Double): Self = this.set("rgdispidNamedArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgvarg(value: js.Any): Self = this.set("rgvarg", value.asInstanceOf[js.Any])
  }
  
}

