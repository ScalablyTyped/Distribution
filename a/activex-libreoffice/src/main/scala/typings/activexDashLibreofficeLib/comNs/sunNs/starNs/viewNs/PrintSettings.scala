package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

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
  var PrintAnnotationMode: scala.Double
  /**
    * If `TRUE` , all characters are printed in black.
    *
    * It is useful for printing colored text on a b/w printer.
    */
  var PrintBlackFonts: scala.Boolean
  /** If `TRUE` , control shapes are included in printing. */
  var PrintControls: scala.Boolean
  /** If `TRUE` , drawing objects (shapes) are included in printing. */
  var PrintDrawings: scala.Boolean
  /** If `TRUE` , graphic objects are included in printing. */
  var PrintGraphics: scala.Boolean
  /** If `TRUE` , left pages are included in printing. */
  var PrintLeftPages: scala.Boolean
  /** If `TRUE` , the background of the page is printed. */
  var PrintPageBackground: scala.Boolean
  /** If `TRUE` , the pages are printed in the order of prospects. */
  var PrintProspect: scala.Boolean
  /**
    * If `TRUE` , the pages are printed in reverse order.
    *
    * The last page is printed first.
    */
  var PrintReversed: scala.Boolean
  /** If `TRUE` , right pages are included in printing. */
  var PrintRightPages: scala.Boolean
  /** If `TRUE` , tables are included in printing. */
  var PrintTables: scala.Boolean
}

