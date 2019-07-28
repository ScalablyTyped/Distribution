package typings.activexDashOffice.OfficeNs.EventHelperTypesNs

import typings.activexDashStdole.stdoleNs.DISPPARAMS
import typings.activexDashStdole.stdoleNs.EXCEPINFO
import typings.activexDashStdole.stdoleNs.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomXMLPart_Invoke_Parameter extends js.Object {
  val dispidMember: Double
  val lcid: Double
  val pdispparams: DISPPARAMS
  var pexcepinfo: EXCEPINFO
  var puArgErr: Double
  var pvarResult: js.Any
  val riid: GUID
  val wFlags: Double
}

object CustomXMLPart_Invoke_Parameter {
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
  ): CustomXMLPart_Invoke_Parameter = {
    val __obj = js.Dynamic.literal(dispidMember = dispidMember, lcid = lcid, pdispparams = pdispparams, pexcepinfo = pexcepinfo, puArgErr = puArgErr, pvarResult = pvarResult, riid = riid, wFlags = wFlags)
  
    __obj.asInstanceOf[CustomXMLPart_Invoke_Parameter]
  }
}

