package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

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
  var PrintBlackFonts: Boolean
  /** determines if control shapes are printed. */
  var PrintControls: Boolean
  /** determines if shapes are printed. */
  var PrintDrawings: Boolean
  /** determines if automatically inserted empty pages are printed. */
  var PrintEmptyPages: Boolean
  /** contains the name of the fax. */
  var PrintFaxName: String
  /** determines if graphic objects are printed */
  var PrintGraphics: Boolean
  /** determines if left pages are printed. */
  var PrintLeftPages: Boolean
  /** determines if the background color / background graphic of pages is printed. */
  var PrintPageBackground: Boolean
  /**
    * specifies if the printer paper tray selection of the system printer is used.
    *
    * If com::sun::star::view::PrintSettings::PaperFromSetup is `FALSE` , then the paper tray selection of the page styles is used.
    */
  var PrintPaperFromSetup: Boolean
  /** determines if prospect printing is used. */
  var PrintProspect: Boolean
  /** determines if the pages are printed in the reverse order, starting with the last page. */
  var PrintReversed: Boolean
  /** determines if right pages are printed. */
  var PrintRightPages: Boolean
  /** determines if text tables are printed. */
  var PrintTables: Boolean
}

object PrintSettings {
  @scala.inline
  def apply(
    PrintAnnotationMode: NotePrintMode,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintEmptyPages: Boolean,
    PrintFaxName: String,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintPaperFromSetup: Boolean,
    PrintProspect: Boolean,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode, PrintBlackFonts = PrintBlackFonts, PrintControls = PrintControls, PrintDrawings = PrintDrawings, PrintEmptyPages = PrintEmptyPages, PrintFaxName = PrintFaxName, PrintGraphics = PrintGraphics, PrintLeftPages = PrintLeftPages, PrintPageBackground = PrintPageBackground, PrintPaperFromSetup = PrintPaperFromSetup, PrintProspect = PrintProspect, PrintReversed = PrintReversed, PrintRightPages = PrintRightPages, PrintTables = PrintTables)
  
    __obj.asInstanceOf[PrintSettings]
  }
}

