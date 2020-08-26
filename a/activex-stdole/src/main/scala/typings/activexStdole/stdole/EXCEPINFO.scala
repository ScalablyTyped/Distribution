package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXCEPINFO extends js.Object {
  val bstrDescription: String = js.native
  val bstrHelpFile: String = js.native
  val bstrSource: String = js.native
  val dwHelpContext: Double = js.native
  val pfnDeferredFillIn: js.UndefOr[scala.Nothing] = js.native
  val pvReserved: js.UndefOr[scala.Nothing] = js.native
  val scode: js.Any = js.native
  val wCode: Double = js.native
  val wReserved: Double = js.native
}

object EXCEPINFO {
  @scala.inline
  def apply(
    bstrDescription: String,
    bstrHelpFile: String,
    bstrSource: String,
    dwHelpContext: Double,
    scode: js.Any,
    wCode: Double,
    wReserved: Double
  ): EXCEPINFO = {
    val __obj = js.Dynamic.literal(bstrDescription = bstrDescription.asInstanceOf[js.Any], bstrHelpFile = bstrHelpFile.asInstanceOf[js.Any], bstrSource = bstrSource.asInstanceOf[js.Any], dwHelpContext = dwHelpContext.asInstanceOf[js.Any], scode = scode.asInstanceOf[js.Any], wCode = wCode.asInstanceOf[js.Any], wReserved = wReserved.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXCEPINFO]
  }
  @scala.inline
  implicit class EXCEPINFOOps[Self <: EXCEPINFO] (val x: Self) extends AnyVal {
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
    def setBstrDescription(value: String): Self = this.set("bstrDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setBstrHelpFile(value: String): Self = this.set("bstrHelpFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setBstrSource(value: String): Self = this.set("bstrSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwHelpContext(value: Double): Self = this.set("dwHelpContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setScode(value: js.Any): Self = this.set("scode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWCode(value: Double): Self = this.set("wCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWReserved(value: Double): Self = this.set("wReserved", value.asInstanceOf[js.Any])
  }
  
}

