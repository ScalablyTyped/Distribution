package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

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
  var Collate: scala.Boolean
  /** specifies the number of copies to print. */
  var CopyCount: scala.Double
  /**
    * determines the duplex mode for the print job.
    * @see DuplexMode for more information about supported values
    */
  var DuplexMode: scala.Double
  /** if set, specifies the name of a file to print to. */
  var FileName: java.lang.String
  /**
    * specifies which pages to print.
    *
    * This range is given as at the user interface. For example: "1-4;10" to print the pages 1 to 4 and 10.
    */
  var Pages: java.lang.String
  /** if set, specifies name of the printer to use. */
  var PrinterName: java.lang.String
  /**
    * advises the printer to sort the pages of the copies.
    * @deprecated DeprecatedUse Collate instead.
    */
  var Sort: scala.Boolean
  /** if set to TRUE, the corresponding {@link XPrintable.print()} request will be executed synchronous. <p>Default is the asynchronous print mode.</p> */
  var Wait: scala.Boolean
}

object PrintOptions {
  @scala.inline
  def apply(
    Collate: scala.Boolean,
    CopyCount: scala.Double,
    DuplexMode: scala.Double,
    FileName: java.lang.String,
    Pages: java.lang.String,
    PrinterName: java.lang.String,
    Sort: scala.Boolean,
    Wait: scala.Boolean
  ): PrintOptions = {
    val __obj = js.Dynamic.literal(Collate = Collate, CopyCount = CopyCount, DuplexMode = DuplexMode, FileName = FileName, Pages = Pages, PrinterName = PrinterName, Sort = Sort, Wait = Wait)
  
    __obj.asInstanceOf[PrintOptions]
  }
}

