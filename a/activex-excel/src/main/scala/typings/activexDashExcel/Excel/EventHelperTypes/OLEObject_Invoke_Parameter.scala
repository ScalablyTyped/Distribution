package typings.activexDashExcel.Excel.EventHelperTypes

import typings.activexDashStdole.stdole.DISPPARAMS
import typings.activexDashStdole.stdole.EXCEPINFO
import typings.activexDashStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OLEObject_Invoke_Parameter extends js.Object {
  val dispidMember: Double
  val lcid: Double
  val pdispparams: DISPPARAMS
  var pexcepinfo: EXCEPINFO
  var puArgErr: Double
  var pvarResult: js.Any
  val riid: GUID
  val wFlags: Double
}

object OLEObject_Invoke_Parameter {
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
  ): OLEObject_Invoke_Parameter = {
    val __obj = js.Dynamic.literal(dispidMember = dispidMember, lcid = lcid, pdispparams = pdispparams, pexcepinfo = pexcepinfo, puArgErr = puArgErr, pvarResult = pvarResult, riid = riid, wFlags = wFlags)
  
    __obj.asInstanceOf[OLEObject_Invoke_Parameter]
  }
}

