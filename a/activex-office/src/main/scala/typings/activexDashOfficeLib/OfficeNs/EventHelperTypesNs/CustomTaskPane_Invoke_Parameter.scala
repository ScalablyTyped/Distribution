package typings
package activexDashOfficeLib.OfficeNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTaskPane_Invoke_Parameter extends js.Object {
  val dispidMember: scala.Double
  val lcid: scala.Double
  val pdispparams: activexDashStdoleLib.stdoleNs.DISPPARAMS
  var pexcepinfo: activexDashStdoleLib.stdoleNs.EXCEPINFO
  var puArgErr: scala.Double
  var pvarResult: js.Any
  val riid: activexDashStdoleLib.stdoleNs.GUID
  val wFlags: scala.Double
}

object CustomTaskPane_Invoke_Parameter {
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
  ): CustomTaskPane_Invoke_Parameter = {
    val __obj = js.Dynamic.literal(dispidMember = dispidMember, lcid = lcid, pdispparams = pdispparams, pexcepinfo = pexcepinfo, puArgErr = puArgErr, pvarResult = pvarResult, riid = riid, wFlags = wFlags)
  
    __obj.asInstanceOf[CustomTaskPane_Invoke_Parameter]
  }
}

