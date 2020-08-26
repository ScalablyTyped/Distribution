package typings.activexWord.Word.EventHelperTypes

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationEPostageInsertExParameter extends js.Object {
  val Doc: Document = js.native
  val bstrPaperFeed: String = js.native
  val bstrPrinterName: String = js.native
  val cpDeliveryAddrEnd: Double = js.native
  val cpDeliveryAddrStart: Double = js.native
  val cpReturnAddrEnd: Double = js.native
  val cpReturnAddrStart: Double = js.native
  var fCancel: Boolean = js.native
  val fPrint: Boolean = js.native
  val xaWidth: Double = js.native
  val yaHeight: Double = js.native
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
  @scala.inline
  implicit class ApplicationEPostageInsertExParameterOps[Self <: ApplicationEPostageInsertExParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoc(value: Document): Self = this.set("Doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setBstrPaperFeed(value: String): Self = this.set("bstrPaperFeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setBstrPrinterName(value: String): Self = this.set("bstrPrinterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpDeliveryAddrEnd(value: Double): Self = this.set("cpDeliveryAddrEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpDeliveryAddrStart(value: Double): Self = this.set("cpDeliveryAddrStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpReturnAddrEnd(value: Double): Self = this.set("cpReturnAddrEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpReturnAddrStart(value: Double): Self = this.set("cpReturnAddrStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFCancel(value: Boolean): Self = this.set("fCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFPrint(value: Boolean): Self = this.set("fPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def setXaWidth(value: Double): Self = this.set("xaWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setYaHeight(value: Double): Self = this.set("yaHeight", value.asInstanceOf[js.Any])
  }
  
}

