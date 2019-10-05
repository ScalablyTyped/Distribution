package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typings.activexDashWord.activexDashWordStrings.Doc
  import typings.activexDashWord.activexDashWordStrings.bstrPaperFeed
  import typings.activexDashWord.activexDashWordStrings.bstrPrinterName
  import typings.activexDashWord.activexDashWordStrings.cpDeliveryAddrEnd
  import typings.activexDashWord.activexDashWordStrings.cpDeliveryAddrStart
  import typings.activexDashWord.activexDashWordStrings.cpReturnAddrEnd
  import typings.activexDashWord.activexDashWordStrings.cpReturnAddrStart
  import typings.activexDashWord.activexDashWordStrings.dispidMember
  import typings.activexDashWord.activexDashWordStrings.fCancel
  import typings.activexDashWord.activexDashWordStrings.fPrint
  import typings.activexDashWord.activexDashWordStrings.lcid
  import typings.activexDashWord.activexDashWordStrings.pdispparams
  import typings.activexDashWord.activexDashWordStrings.pexcepinfo
  import typings.activexDashWord.activexDashWordStrings.puArgErr
  import typings.activexDashWord.activexDashWordStrings.pvarResult
  import typings.activexDashWord.activexDashWordStrings.riid
  import typings.activexDashWord.activexDashWordStrings.wFlags
  import typings.activexDashWord.activexDashWordStrings.xaWidth
  import typings.activexDashWord.activexDashWordStrings.yaHeight

  type Application_EPostageInsertEx_ArgNames = js.Tuple11[
    Doc, 
    cpDeliveryAddrStart, 
    cpDeliveryAddrEnd, 
    cpReturnAddrStart, 
    cpReturnAddrEnd, 
    xaWidth, 
    yaHeight, 
    bstrPrinterName, 
    bstrPaperFeed, 
    fPrint, 
    fCancel
  ]
  type Application_Invoke_ArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
}
