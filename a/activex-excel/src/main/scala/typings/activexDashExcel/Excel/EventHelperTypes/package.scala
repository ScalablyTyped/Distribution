package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typings.activexDashExcel.activexDashExcelStrings.dispidMember
  import typings.activexDashExcel.activexDashExcelStrings.lcid
  import typings.activexDashExcel.activexDashExcelStrings.pdispparams
  import typings.activexDashExcel.activexDashExcelStrings.pexcepinfo
  import typings.activexDashExcel.activexDashExcelStrings.puArgErr
  import typings.activexDashExcel.activexDashExcelStrings.pvarResult
  import typings.activexDashExcel.activexDashExcelStrings.riid
  import typings.activexDashExcel.activexDashExcelStrings.wFlags

  type Application_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type Chart_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type OLEObject_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type QueryTable_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type Workbook_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type Worksheet_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
