package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole drawing document. */
trait DocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.HeaderFooterSettings {
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: scala.Boolean
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: scala.Boolean
  /** This is the default logical measure unit that is used for string formatting inside the document, f.e. the measure text */
  var MeasureUnit: scala.Double
  /** is the number format used for page number fields */
  var PageNumberFormat: scala.Double
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: scala.Boolean
  /** is the denominator for the logical scale of the document */
  var ScaleDenominator: scala.Double
  /** is the numerator for the logical scale of the document */
  var ScaleNumerator: scala.Double
}

