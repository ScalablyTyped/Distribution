package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraph
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraphIteratorProvider
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API for the proofreading iterator that mediates between the document and the proofreader.
  * @since OOo 3.0.1
  */
@js.native
trait XProofreadingIterator extends XInterface {
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
    xDocument: XInterface,
    xFlatParagraph: XFlatParagraph,
    aText: String,
    aLocale: Locale,
    nStartOfSentencePosition: Double,
    nSuggestedBehindEndOfSentencePosition: Double,
    nErrorPositionInParagraph: Double
  ): ProofreadingResult = js.native
  /**
    * checks if the given document is currently being checked
    * @param xDocument the document.
    * @returns if the document is currently being checked.
    */
  def isProofreading(xDocument: XInterface): Boolean = js.native
  /** clears the list of ignored rules for each proofreader */
  def resetIgnoreRules(): Unit = js.native
  /**
    * start proofreading and automatically process the whole text
    * @param xDocument the text document.
    * @param xIteratorProvider the flat paragraph iterator provider.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def startProofreading(xDocument: XInterface, xIteratorProvider: XFlatParagraphIteratorProvider): Unit = js.native
}

object XProofreadingIterator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    checkSentenceAtPosition: (XInterface, XFlatParagraph, String, Locale, Double, Double, Double) => ProofreadingResult,
    isProofreading: XInterface => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resetIgnoreRules: () => Unit,
    startProofreading: (XInterface, XFlatParagraphIteratorProvider) => Unit
  ): XProofreadingIterator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkSentenceAtPosition = js.Any.fromFunction7(checkSentenceAtPosition), isProofreading = js.Any.fromFunction1(isProofreading), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetIgnoreRules = js.Any.fromFunction0(resetIgnoreRules), startProofreading = js.Any.fromFunction2(startProofreading))
    __obj.asInstanceOf[XProofreadingIterator]
  }
  @scala.inline
  implicit class XProofreadingIteratorOps[Self <: XProofreadingIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckSentenceAtPosition(value: (XInterface, XFlatParagraph, String, Locale, Double, Double, Double) => ProofreadingResult): Self = this.set("checkSentenceAtPosition", js.Any.fromFunction7(value))
    @scala.inline
    def setIsProofreading(value: XInterface => Boolean): Self = this.set("isProofreading", js.Any.fromFunction1(value))
    @scala.inline
    def setResetIgnoreRules(value: () => Unit): Self = this.set("resetIgnoreRules", js.Any.fromFunction0(value))
    @scala.inline
    def setStartProofreading(value: (XInterface, XFlatParagraphIteratorProvider) => Unit): Self = this.set("startProofreading", js.Any.fromFunction2(value))
  }
  
}

