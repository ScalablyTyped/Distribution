package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These properties describe the printing of the content of a text document. */
trait PrintSettings extends js.Object {
  /**
    * determines how notes are printed.
    * @see NotePrintMode
    */
  var PrintAnnotationMode: NotePrintMode
  /** determines if characters are always printed in black. */
  var PrintBlackFonts: scala.Boolean
  /** determines if control shapes are printed. */
  var PrintControls: scala.Boolean
  /** determines if shapes are printed. */
  var PrintDrawings: scala.Boolean
  /** determines if automatically inserted empty pages are printed. */
  var PrintEmptyPages: scala.Boolean
  /** contains the name of the fax. */
  var PrintFaxName: java.lang.String
  /** determines if graphic objects are printed */
  var PrintGraphics: scala.Boolean
  /** determines if left pages are printed. */
  var PrintLeftPages: scala.Boolean
  /** determines if the background color / background graphic of pages is printed. */
  var PrintPageBackground: scala.Boolean
  /**
    * specifies if the printer paper tray selection of the system printer is used.
    *
    * If com::sun::star::view::PrintSettings::PaperFromSetup is `FALSE` , then the paper tray selection of the page styles is used.
    */
  var PrintPaperFromSetup: scala.Boolean
  /** determines if prospect printing is used. */
  var PrintProspect: scala.Boolean
  /** determines if the pages are printed in the reverse order, starting with the last page. */
  var PrintReversed: scala.Boolean
  /** determines if right pages are printed. */
  var PrintRightPages: scala.Boolean
  /** determines if text tables are printed. */
  var PrintTables: scala.Boolean
}

object PrintSettings {
  @scala.inline
  def apply(
    PrintAnnotationMode: NotePrintMode,
    PrintBlackFonts: scala.Boolean,
    PrintControls: scala.Boolean,
    PrintDrawings: scala.Boolean,
    PrintEmptyPages: scala.Boolean,
    PrintFaxName: java.lang.String,
    PrintGraphics: scala.Boolean,
    PrintLeftPages: scala.Boolean,
    PrintPageBackground: scala.Boolean,
    PrintPaperFromSetup: scala.Boolean,
    PrintProspect: scala.Boolean,
    PrintReversed: scala.Boolean,
    PrintRightPages: scala.Boolean,
    PrintTables: scala.Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode, PrintBlackFonts = PrintBlackFonts, PrintControls = PrintControls, PrintDrawings = PrintDrawings, PrintEmptyPages = PrintEmptyPages, PrintFaxName = PrintFaxName, PrintGraphics = PrintGraphics, PrintLeftPages = PrintLeftPages, PrintPageBackground = PrintPageBackground, PrintPaperFromSetup = PrintPaperFromSetup, PrintProspect = PrintProspect, PrintReversed = PrintReversed, PrintRightPages = PrintRightPages, PrintTables = PrintTables)
  
    __obj.asInstanceOf[PrintSettings]
  }
}

