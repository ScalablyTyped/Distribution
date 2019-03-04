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

object ProofreadingResult {
  @scala.inline
  def apply(
    aDocumentIdentifier: java.lang.String,
    aErrors: activexDashInteropLib.SafeArray[SingleProofreadingError],
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aText: java.lang.String,
    nBehindEndOfSentencePosition: scala.Double,
    nStartOfNextSentencePosition: scala.Double,
    nStartOfSentencePosition: scala.Double,
    xFlatParagraph: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XFlatParagraph,
    xProofreader: XProofreader
  ): ProofreadingResult = {
    val __obj = js.Dynamic.literal(aDocumentIdentifier = aDocumentIdentifier, aErrors = aErrors, aLocale = aLocale, aProperties = aProperties, aText = aText, nBehindEndOfSentencePosition = nBehindEndOfSentencePosition, nStartOfNextSentencePosition = nStartOfNextSentencePosition, nStartOfSentencePosition = nStartOfSentencePosition, xFlatParagraph = xFlatParagraph, xProofreader = xProofreader)
  
    __obj.asInstanceOf[ProofreadingResult]
  }
}

