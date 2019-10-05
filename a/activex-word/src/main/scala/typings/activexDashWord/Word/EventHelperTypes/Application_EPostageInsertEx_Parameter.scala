package typings.activexDashWord.Word.EventHelperTypes

import typings.activexDashWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application_EPostageInsertEx_Parameter extends js.Object {
  val Doc: Document
  val bstrPaperFeed: String
  val bstrPrinterName: String
  val cpDeliveryAddrEnd: Double
  val cpDeliveryAddrStart: Double
  val cpReturnAddrEnd: Double
  val cpReturnAddrStart: Double
  var fCancel: Boolean
  val fPrint: Boolean
  val xaWidth: Double
  val yaHeight: Double
}

object Application_EPostageInsertEx_Parameter {
  @scala.inline
  def apply(
    Doc: Document,
    bstrPaperFeed: String,
    bstrPrinterName: String,
    cpDeliveryAddrEnd: Double,
    cpDeliveryAddrStart: Double,
    cpReturnAddrEnd: Double,
    cpReturnAddrStart: Double,
    fCancel: Boolean,
    fPrint: Boolean,
    xaWidth: Double,
    yaHeight: Double
  ): Application_EPostageInsertEx_Parameter = {
    val __obj = js.Dynamic.literal(Doc = Doc, bstrPaperFeed = bstrPaperFeed, bstrPrinterName = bstrPrinterName, cpDeliveryAddrEnd = cpDeliveryAddrEnd, cpDeliveryAddrStart = cpDeliveryAddrStart, cpReturnAddrEnd = cpReturnAddrEnd, cpReturnAddrStart = cpReturnAddrStart, fCancel = fCancel, fPrint = fPrint, xaWidth = xaWidth, yaHeight = yaHeight)
  
    __obj.asInstanceOf[Application_EPostageInsertEx_Parameter]
  }
}

