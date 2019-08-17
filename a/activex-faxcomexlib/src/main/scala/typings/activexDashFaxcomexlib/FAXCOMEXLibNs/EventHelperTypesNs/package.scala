package typings.activexDashFaxcomexlib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypesNs {
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bPoweredOff
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bReceiving
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bRinging
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bSending
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.dispidMember
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lDeviceId
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lcid
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pFaxServer
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pdispparams
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pexcepinfo
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.puArgErr
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pvarResult
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.riid
  import typings.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.wFlags

  type FaxAccount_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type FaxServer_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  type FaxServer_OnDeviceStatusChange_ArgNames = js.Tuple6[pFaxServer, lDeviceId, bPoweredOff, bSending, bReceiving, bRinging]
}
