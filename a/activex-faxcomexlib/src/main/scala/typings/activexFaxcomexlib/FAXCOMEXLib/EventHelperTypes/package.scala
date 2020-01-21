package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  type FaxAccountInvokeArgNames = js.Tuple8[
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.dispidMember, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.riid, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.lcid, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.wFlags, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pdispparams, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pvarResult, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pexcepinfo, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.puArgErr
  ]
  type FaxServerInvokeArgNames = js.Tuple8[
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.dispidMember, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.riid, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.lcid, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.wFlags, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pdispparams, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pvarResult, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pexcepinfo, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.puArgErr
  ]
  type FaxServerOnDeviceStatusChangeArgNames = js.Tuple6[
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.bPoweredOff, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.bSending, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.bReceiving, 
    typings.activexFaxcomexlib.activexFaxcomexlibStrings.bRinging
  ]
}
