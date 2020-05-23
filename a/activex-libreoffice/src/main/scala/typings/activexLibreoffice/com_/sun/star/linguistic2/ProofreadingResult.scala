package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraph
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
    val __obj = js.Dynamic.literal(aDocumentIdentifier = aDocumentIdentifier.asInstanceOf[js.Any], aErrors = aErrors.asInstanceOf[js.Any], aLocale = aLocale.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aText = aText.asInstanceOf[js.Any], nBehindEndOfSentencePosition = nBehindEndOfSentencePosition.asInstanceOf[js.Any], nStartOfNextSentencePosition = nStartOfNextSentencePosition.asInstanceOf[js.Any], nStartOfSentencePosition = nStartOfSentencePosition.asInstanceOf[js.Any], xFlatParagraph = xFlatParagraph.asInstanceOf[js.Any], xProofreader = xProofreader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingResult]
  }
}

