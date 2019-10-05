package typings.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typings.activexDashInfopath.activexDashInfopathStrings.dispidMember
  import typings.activexDashInfopath.activexDashInfopathStrings.lcid
  import typings.activexDashInfopath.activexDashInfopathStrings.pdispparams
  import typings.activexDashInfopath.activexDashInfopathStrings.pexcepinfo
  import typings.activexDashInfopath.activexDashInfopathStrings.puArgErr
  import typings.activexDashInfopath.activexDashInfopathStrings.pvarResult
  import typings.activexDashInfopath.activexDashInfopathStrings.riid
  import typings.activexDashInfopath.activexDashInfopathStrings.wFlags

  type Button_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type DataDOM_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type XDocument_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
