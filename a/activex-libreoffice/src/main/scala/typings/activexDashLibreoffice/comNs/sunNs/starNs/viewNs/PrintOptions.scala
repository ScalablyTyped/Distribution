package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the options for print jobs.
  *
  * These options are only valid for a single print job. They do not change layout or formatting of the document.
  */
trait PrintOptions extends js.Object {
  /** advises the printer to collate the pages of the copies. */
  var Collate: Boolean
  /** specifies the number of copies to print. */
  var CopyCount: Double
  /**
    * determines the duplex mode for the print job.
    * @see DuplexMode for more information about supported values
    */
  var DuplexMode: Double
  /** if set, specifies the name of a file to print to. */
  var FileName: String
  /**
    * specifies which pages to print.
    *
    * This range is given as at the user interface. For example: "1-4;10" to print the pages 1 to 4 and 10.
    */
  var Pages: String
  /** if set, specifies name of the printer to use. */
  var PrinterName: String
  /**
    * advises the printer to sort the pages of the copies.
    * @deprecated DeprecatedUse Collate instead.
    */
  var Sort: Boolean
  /** if set to TRUE, the corresponding {@link XPrintable.print()} request will be executed synchronous. <p>Default is the asynchronous print mode.</p> */
  var Wait: Boolean
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
    val __obj = js.Dynamic.literal(Collate = Collate, CopyCount = CopyCount, DuplexMode = DuplexMode, FileName = FileName, Pages = Pages, PrinterName = PrinterName, Sort = Sort, Wait = Wait)
  
    __obj.asInstanceOf[PrintOptions]
  }
}

