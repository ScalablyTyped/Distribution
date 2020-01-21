package typings.activexWord.Word.EventHelperTypes

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationEPostageInsertExParameter extends js.Object {
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

object ApplicationEPostageInsertExParameter {
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
  ): ApplicationEPostageInsertExParameter = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], bstrPaperFeed = bstrPaperFeed.asInstanceOf[js.Any], bstrPrinterName = bstrPrinterName.asInstanceOf[js.Any], cpDeliveryAddrEnd = cpDeliveryAddrEnd.asInstanceOf[js.Any], cpDeliveryAddrStart = cpDeliveryAddrStart.asInstanceOf[js.Any], cpReturnAddrEnd = cpReturnAddrEnd.asInstanceOf[js.Any], cpReturnAddrStart = cpReturnAddrStart.asInstanceOf[js.Any], fCancel = fCancel.asInstanceOf[js.Any], fPrint = fPrint.asInstanceOf[js.Any], xaWidth = xaWidth.asInstanceOf[js.Any], yaHeight = yaHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationEPostageInsertExParameter]
  }
}

