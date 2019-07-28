package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings for printing documents.
  *
  * These settings are printer independent but affect the rendering of the document.
  */
trait PrintSettings extends js.Object {
  /**
    * determines how annotations are printed.
    * @see NotePrintMode
    */
  var PrintAnnotationMode: Double
  /**
    * If `TRUE` , all characters are printed in black.
    *
    * It is useful for printing colored text on a b/w printer.
    */
  var PrintBlackFonts: Boolean
  /** If `TRUE` , control shapes are included in printing. */
  var PrintControls: Boolean
  /** If `TRUE` , drawing objects (shapes) are included in printing. */
  var PrintDrawings: Boolean
  /** If `TRUE` , graphic objects are included in printing. */
  var PrintGraphics: Boolean
  /** If `TRUE` , left pages are included in printing. */
  var PrintLeftPages: Boolean
  /** If `TRUE` , the background of the page is printed. */
  var PrintPageBackground: Boolean
  /** If `TRUE` , the pages are printed in the order of prospects. */
  var PrintProspect: Boolean
  /**
    * If `TRUE` , the pages are printed in reverse order.
    *
    * The last page is printed first.
    */
  var PrintReversed: Boolean
  /** If `TRUE` , right pages are included in printing. */
  var PrintRightPages: Boolean
  /** If `TRUE` , tables are included in printing. */
  var PrintTables: Boolean
}

object PrintSettings {
  @scala.inline
  def apply(
    PrintAnnotationMode: Double,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintProspect: Boolean,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode, PrintBlackFonts = PrintBlackFonts, PrintControls = PrintControls, PrintDrawings = PrintDrawings, PrintGraphics = PrintGraphics, PrintLeftPages = PrintLeftPages, PrintPageBackground = PrintPageBackground, PrintProspect = PrintProspect, PrintReversed = PrintReversed, PrintRightPages = PrintRightPages, PrintTables = PrintTables)
  
    __obj.asInstanceOf[PrintSettings]
  }
}

