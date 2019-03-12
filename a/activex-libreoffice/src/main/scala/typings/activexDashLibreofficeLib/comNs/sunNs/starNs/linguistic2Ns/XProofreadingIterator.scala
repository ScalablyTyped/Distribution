package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API for the proofreading iterator that mediates between the document and the proofreader.
  * @since OOo 3.0.1
  */
trait XProofreadingIterator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * start proofreading from a given position
    * @param xDocument the document.
    * @param xFlatParagraph the single flat paragraph to be checked.
    * @param aText the text of the paragraph to be checked.
    * @param aLocale currently unused parameter.
    * @param nStartOfSentencePosition the start position of the current sentence.
    * @param nSuggestedBehindEndOfSentencePosition currently unused parameter.
    * @param nErrorPositionInParagraph the given index.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def checkSentenceAtPosition(
    xDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    xFlatParagraph: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XFlatParagraph,
    aText: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nStartOfSentencePosition: scala.Double,
    nSuggestedBehindEndOfSentencePosition: scala.Double,
    nErrorPositionInParagraph: scala.Double
  ): ProofreadingResult
  /**
    * checks if the given document is currently being checked
    * @param xDocument the document.
    * @returns if the document is currently being checked.
    */
  def isProofreading(xDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Boolean
  /** clears the list of ignored rules for each proofreader */
  def resetIgnoreRules(): scala.Unit
  /**
    * start proofreading and automatically process the whole text
    * @param xDocument the text document.
    * @param xIteratorProvider the flat paragraph iterator provider.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def startProofreading(
    xDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    xIteratorProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XFlatParagraphIteratorProvider
  ): scala.Unit
}

object XProofreadingIterator {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    checkSentenceAtPosition: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XFlatParagraph, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double, scala.Double) => ProofreadingResult,
    isProofreading: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resetIgnoreRules: () => scala.Unit,
    startProofreading: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XFlatParagraphIteratorProvider) => scala.Unit
  ): XProofreadingIterator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkSentenceAtPosition = js.Any.fromFunction7(checkSentenceAtPosition), isProofreading = js.Any.fromFunction1(isProofreading), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetIgnoreRules = js.Any.fromFunction0(resetIgnoreRules), startProofreading = js.Any.fromFunction2(startProofreading))
  
    __obj.asInstanceOf[XProofreadingIterator]
  }
}

