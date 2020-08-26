package typings.activexWord.Word.EventHelperTypes

import typings.activexStdole.stdole.DISPPARAMS
import typings.activexStdole.stdole.EXCEPINFO
import typings.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInvokeParameter extends js.Object {
  val dispidMember: Double = js.native
  val lcid: Double = js.native
  val pdispparams: DISPPARAMS = js.native
  var pexcepinfo: EXCEPINFO = js.native
  var puArgErr: Double = js.native
  var pvarResult: js.Any = js.native
  val riid: GUID = js.native
  val wFlags: Double = js.native
}

object ApplicationInvokeParameter {
  @scala.inline
  def apply(
    dispidMember: Double,
    lcid: Double,
    pdispparams: DISPPARAMS,
    pexcepinfo: EXCEPINFO,
    puArgErr: Double,
    pvarResult: js.Any,
    riid: GUID,
    wFlags: Double
  ): ApplicationInvokeParameter = {
    val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInvokeParameter]
  }
  @scala.inline
  implicit class ApplicationInvokeParameterOps[Self <: ApplicationInvokeParameter] (val x: Self) extends AnyVal {
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
    def setDispidMember(value: Double): Self = this.set("dispidMember", value.asInstanceOf[js.Any])
    @scala.inline
    def setLcid(value: Double): Self = this.set("lcid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPdispparams(value: DISPPARAMS): Self = this.set("pdispparams", value.asInstanceOf[js.Any])
    @scala.inline
    def setPexcepinfo(value: EXCEPINFO): Self = this.set("pexcepinfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPuArgErr(value: Double): Self = this.set("puArgErr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPvarResult(value: js.Any): Self = this.set("pvarResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setRiid(value: GUID): Self = this.set("riid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWFlags(value: Double): Self = this.set("wFlags", value.asInstanceOf[js.Any])
  }
  
}

