package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraph
import typings.activexLibreoffice.com_.sun.star.text.XFlatParagraphIteratorProvider
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API for the proofreading iterator that mediates between the document and the proofreader.
  * @since OOo 3.0.1
  */
trait XProofreadingIterator
  extends StObject
     with XInterface {
  
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
  ): ProofreadingResult
  
  /**
    * checks if the given document is currently being checked
    * @param xDocument the document.
    * @returns if the document is currently being checked.
    */
  def isProofreading(xDocument: XInterface): Boolean
  
  /** clears the list of ignored rules for each proofreader */
  def resetIgnoreRules(): Unit
  
  /**
    * start proofreading and automatically process the whole text
    * @param xDocument the text document.
    * @param xIteratorProvider the flat paragraph iterator provider.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def startProofreading(xDocument: XInterface, xIteratorProvider: XFlatParagraphIteratorProvider): Unit
}
object XProofreadingIterator {
  
  inline def apply(
    acquire: () => Unit,
    checkSentenceAtPosition: (XInterface, XFlatParagraph, String, Locale, Double, Double, Double) => ProofreadingResult,
    isProofreading: XInterface => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    resetIgnoreRules: () => Unit,
    startProofreading: (XInterface, XFlatParagraphIteratorProvider) => Unit
  ): XProofreadingIterator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), checkSentenceAtPosition = js.Any.fromFunction7(checkSentenceAtPosition), isProofreading = js.Any.fromFunction1(isProofreading), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetIgnoreRules = js.Any.fromFunction0(resetIgnoreRules), startProofreading = js.Any.fromFunction2(startProofreading))
    __obj.asInstanceOf[XProofreadingIterator]
  }
  
  extension [Self <: XProofreadingIterator](x: Self) {
    
    inline def setCheckSentenceAtPosition(value: (XInterface, XFlatParagraph, String, Locale, Double, Double, Double) => ProofreadingResult): Self = StObject.set(x, "checkSentenceAtPosition", js.Any.fromFunction7(value))
    
    inline def setIsProofreading(value: XInterface => Boolean): Self = StObject.set(x, "isProofreading", js.Any.fromFunction1(value))
    
    inline def setResetIgnoreRules(value: () => Unit): Self = StObject.set(x, "resetIgnoreRules", js.Any.fromFunction0(value))
    
    inline def setStartProofreading(value: (XInterface, XFlatParagraphIteratorProvider) => Unit): Self = StObject.set(x, "startProofreading", js.Any.fromFunction2(value))
  }
}
