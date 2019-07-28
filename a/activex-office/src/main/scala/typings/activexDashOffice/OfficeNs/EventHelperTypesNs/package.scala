package typings.activexDashOffice.OfficeNs

import typings.activexDashOffice.activexDashOfficeStrings.dispidMember
import typings.activexDashOffice.activexDashOfficeStrings.lcid
import typings.activexDashOffice.activexDashOfficeStrings.pdispparams
import typings.activexDashOffice.activexDashOfficeStrings.pexcepinfo
import typings.activexDashOffice.activexDashOfficeStrings.puArgErr
import typings.activexDashOffice.activexDashOfficeStrings.pvarResult
import typings.activexDashOffice.activexDashOfficeStrings.riid
import typings.activexDashOffice.activexDashOfficeStrings.wFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypesNs {
  type CommandBarButton_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CommandBarComboBox_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CommandBars_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CustomTaskPane_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CustomXMLPart_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type CustomXMLParts_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
