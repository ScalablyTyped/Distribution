package typings.activexLibreoffice.com_.sun.star.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the options for print jobs.
  *
  * These options are only valid for a single print job. They do not change layout or formatting of the document.
  */
@js.native
trait PrintOptions extends js.Object {
  /** advises the printer to collate the pages of the copies. */
  var Collate: Boolean = js.native
  /** specifies the number of copies to print. */
  var CopyCount: Double = js.native
  /**
    * determines the duplex mode for the print job.
    * @see DuplexMode for more information about supported values
    */
  var DuplexMode: Double = js.native
  /** if set, specifies the name of a file to print to. */
  var FileName: String = js.native
  /**
    * specifies which pages to print.
    *
    * This range is given as at the user interface. For example: "1-4;10" to print the pages 1 to 4 and 10.
    */
  var Pages: String = js.native
  /** if set, specifies name of the printer to use. */
  var PrinterName: String = js.native
  /**
    * advises the printer to sort the pages of the copies.
    * @deprecated DeprecatedUse Collate instead.
    */
  var Sort: Boolean = js.native
  /** if set to TRUE, the corresponding {@link XPrintable.print()} request will be executed synchronous. <p>Default is the asynchronous print mode.</p> */
  var Wait: Boolean = js.native
}

object PrintOptions {
  @scala.inline
  def apply(
    Collate: Boolean,
    CopyCount: Double,
    DuplexMode: Double,
    FileName: String,
    Pages: String,
    PrinterName: String,
    Sort: Boolean,
    Wait: Boolean
  ): PrintOptions = {
    val __obj = js.Dynamic.literal(Collate = Collate.asInstanceOf[js.Any], CopyCount = CopyCount.asInstanceOf[js.Any], DuplexMode = DuplexMode.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Wait = Wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
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
    def setCollate(value: Boolean): Self = this.set("Collate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyCount(value: Double): Self = this.set("CopyCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuplexMode(value: Double): Self = this.set("DuplexMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: String): Self = this.set("Pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrinterName(value: String): Self = this.set("PrinterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSort(value: Boolean): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def setWait(value: Boolean): Self = this.set("Wait", value.asInstanceOf[js.Any])
  }
  
}

