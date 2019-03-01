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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aDocumentIdentifier")(aDocumentIdentifier)
    __obj.updateDynamic("aErrors")(aErrors)
    __obj.updateDynamic("aLocale")(aLocale)
    __obj.updateDynamic("aProperties")(aProperties)
    __obj.updateDynamic("aText")(aText)
    __obj.updateDynamic("nBehindEndOfSentencePosition")(nBehindEndOfSentencePosition)
    __obj.updateDynamic("nStartOfNextSentencePosition")(nStartOfNextSentencePosition)
    __obj.updateDynamic("nStartOfSentencePosition")(nStartOfSentencePosition)
    __obj.updateDynamic("xFlatParagraph")(xFlatParagraph)
    __obj.updateDynamic("xProofreader")(xProofreader)
    __obj.asInstanceOf[ProofreadingResult]
  }
}

