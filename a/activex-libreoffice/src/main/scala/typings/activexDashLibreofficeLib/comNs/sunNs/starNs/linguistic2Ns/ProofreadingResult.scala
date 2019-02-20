package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds the results from proofreading a sentence.
  * @since OOo 3.0.1
  */
trait ProofreadingResult extends js.Object {
  var aDocumentIdentifier: java.lang.String
  var aErrors: activexDashInteropLib.SafeArray[SingleProofreadingError]
  var aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  var aProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  var aText: java.lang.String
  var nBehindEndOfSentencePosition: scala.Double
  var nStartOfNextSentencePosition: scala.Double
  var nStartOfSentencePosition: scala.Double
  var xFlatParagraph: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XFlatParagraph
  var xProofreader: XProofreader
}

