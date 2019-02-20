package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole presentation document. */
trait DocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.HeaderFooterSettings {
  /** enables or disables the printing of the drawing pages */
  var IsPrintDrawing: scala.Boolean
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: scala.Boolean
  /** enables or disables the printing of the handout pages */
  var IsPrintHandout: scala.Boolean
  /** enables or disables the printing of draw pages that are marked hidden */
  var IsPrintHiddenPages: scala.Boolean
  /** enables or disables the printing of the notes pages */
  var IsPrintNotes: scala.Boolean
  /** enables or disables the printing of the outline pages */
  var IsPrintOutline: scala.Boolean
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: scala.Boolean
  /** is the number format used for page number fields */
  var PageNumberFormat: scala.Double
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: scala.Boolean
}

