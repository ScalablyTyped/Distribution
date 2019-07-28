package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XFlatParagraph
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds the results from proofreading a sentence.
  * @since OOo 3.0.1
  */
trait ProofreadingResult extends js.Object {
  var aDocumentIdentifier: String
  var aErrors: SafeArray[SingleProofreadingError]
  var aLocale: Locale
  var aProperties: SafeArray[PropertyValue]
  var aText: String
  var nBehindEndOfSentencePosition: Double
  var nStartOfNextSentencePosition: Double
  var nStartOfSentencePosition: Double
  var xFlatParagraph: XFlatParagraph
  var xProofreader: XProofreader
}

object ProofreadingResult {
  @scala.inline
  def apply(
    aDocumentIdentifier: String,
    aErrors: SafeArray[SingleProofreadingError],
    aLocale: Locale,
    aProperties: SafeArray[PropertyValue],
    aText: String,
    nBehindEndOfSentencePosition: Double,
    nStartOfNextSentencePosition: Double,
    nStartOfSentencePosition: Double,
    xFlatParagraph: XFlatParagraph,
    xProofreader: XProofreader
  ): ProofreadingResult = {
    val __obj = js.Dynamic.literal(aDocumentIdentifier = aDocumentIdentifier, aErrors = aErrors, aLocale = aLocale, aProperties = aProperties, aText = aText, nBehindEndOfSentencePosition = nBehindEndOfSentencePosition, nStartOfNextSentencePosition = nStartOfNextSentencePosition, nStartOfSentencePosition = nStartOfSentencePosition, xFlatParagraph = xFlatParagraph, xProofreader = xProofreader)
  
    __obj.asInstanceOf[ProofreadingResult]
  }
}

