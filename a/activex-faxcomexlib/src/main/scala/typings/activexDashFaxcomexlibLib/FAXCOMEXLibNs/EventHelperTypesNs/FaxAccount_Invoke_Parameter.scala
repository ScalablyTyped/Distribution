package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaxAccount_Invoke_Parameter extends js.Object {
  val dispidMember: scala.Double
  val lcid: scala.Double
  val pdispparams: activexDashStdoleLib.stdoleNs.DISPPARAMS
  var pexcepinfo: activexDashStdoleLib.stdoleNs.EXCEPINFO
  var puArgErr: scala.Double
  var pvarResult: js.Any
  val riid: activexDashStdoleLib.stdoleNs.GUID
  val wFlags: scala.Double
}

object FaxAccount_Invoke_Parameter {
  @scala.inline
  def apply(
    dispidMember: scala.Double,
    lcid: scala.Double,
    pdispparams: activexDashStdoleLib.stdoleNs.DISPPARAMS,
    pexcepinfo: activexDashStdoleLib.stdoleNs.EXCEPINFO,
    puArgErr: scala.Double,
    pvarResult: js.Any,
    riid: activexDashStdoleLib.stdoleNs.GUID,
    wFlags: scala.Double
  ): FaxAccount_Invoke_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispidMember")(dispidMember)
    __obj.updateDynamic("lcid")(lcid)
    __obj.updateDynamic("pdispparams")(pdispparams)
    __obj.updateDynamic("pexcepinfo")(pexcepinfo)
    __obj.updateDynamic("puArgErr")(puArgErr)
    __obj.updateDynamic("pvarResult")(pvarResult)
    __obj.updateDynamic("riid")(riid)
    __obj.updateDynamic("wFlags")(wFlags)
    __obj.asInstanceOf[FaxAccount_Invoke_Parameter]
  }
}

