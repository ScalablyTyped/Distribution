package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  type ApplicationEPostageInsertExArgNames = js.Tuple11[
    typings.activexWord.activexWordStrings.Doc, 
    typings.activexWord.activexWordStrings.cpDeliveryAddrStart, 
    typings.activexWord.activexWordStrings.cpDeliveryAddrEnd, 
    typings.activexWord.activexWordStrings.cpReturnAddrStart, 
    typings.activexWord.activexWordStrings.cpReturnAddrEnd, 
    typings.activexWord.activexWordStrings.xaWidth, 
    typings.activexWord.activexWordStrings.yaHeight, 
    typings.activexWord.activexWordStrings.bstrPrinterName, 
    typings.activexWord.activexWordStrings.bstrPaperFeed, 
    typings.activexWord.activexWordStrings.fPrint, 
    typings.activexWord.activexWordStrings.fCancel
  ]
  type ApplicationInvokeArgNames = js.Tuple8[
    typings.activexWord.activexWordStrings.dispidMember, 
    typings.activexWord.activexWordStrings.riid, 
    typings.activexWord.activexWordStrings.lcid, 
    typings.activexWord.activexWordStrings.wFlags, 
    typings.activexWord.activexWordStrings.pdispparams, 
    typings.activexWord.activexWordStrings.pvarResult, 
    typings.activexWord.activexWordStrings.pexcepinfo, 
    typings.activexWord.activexWordStrings.puArgErr
  ]
}
