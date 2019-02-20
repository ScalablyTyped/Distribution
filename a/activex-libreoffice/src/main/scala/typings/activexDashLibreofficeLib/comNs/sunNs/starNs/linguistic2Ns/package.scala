package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linguistic2Ns {
  /**
    * represents a list of available conversion dictionaries.
    *
    * There will be only one list that may hold different types of conversion dictionaries. That is e.g. it may hold dictionaries for Korean Hangul/Hanja
    * conversion along with ones for Chinese traditional/simplified conversion or conversion between different Indic script types.
    *
    * The list will be used by the text conversion service to check for user supplied text conversions.
    * @see com.sun.star.linguistic2.ConversionDictionary
    * @see com.sun.star.linguistic2.HangulHanjaConversionDictionary
    * @see com.sun.star.i18n.TextConversion
    * @since OOo 1.1.2
    */
  type ConversionDictionaryList = XConversionDictionaryList
  /**
    * is the list of personal dictionaries.
    *
    * The active dictionaries of this list will be used for spell checking and hyphenation.
    * @see com.sun.star.linguistic2.XDictionary
    * @see com.sun.star.linguistic2.XDictionaryList
    * @see com.sun.star.linguistic2.XSearchableDictionaryList
    */
  type DictionaryList = XSearchableDictionaryList
  /**
    * represents a dictionary for Hangul/Hanja text conversion.
    *
    * A dictionary implementing this service will be used for Hangul/Hanja conversion. Therefore the locale of the dictionary has to be Korean, and the
    * conversion type {@link com.sun.star.linguistic2.ConversionDictionaryType.HANGUL_HANJA} .
    *
    * Also for a pair (entry) to be added the left part has to be in Hangul and the right in Hanja, and the number of characters for the left part has to be
    * the same as for the right part.
    * @since OOo 1.1.2
    */
  type HangulHanjaConversionDictionary = ConversionDictionary
  type LanguageGuessing = XLanguageGuessing
  /** the set of linguistic relevant properties. */
  type LinguProperties = XLinguProperties
  /** offers linguistic functionality. Is to be used to access spell checker, hyphenator and thesaurus. */
  type LinguServiceManager = XLinguServiceManager2
  /**
    * provides a proofreader (often known as grammar checker) for text
    *
    * An implementation of this service will receive text and has to identify the sentence end and report all errors found.
    *
    * An implementation of this service is not limited to grammar checking at all. It might also check style, used terms etc. Basically it can check every
    * aspect of a single sentence. Since the text provided is always the complete paragraph it can also choose to analyze the context of the sentence
    * currently required to be checked. However error reports need to be limited to the current sentence.
    * @since OOo 3.0.1
    */
  type Proofreader = XProofreader
  /**
    * provides a proofreading iterator
    *
    * An implementation of this service acts as a mediator between documents and proofreaders (often called just grammar checkers). It is responsible to
    * process requests for proofreading text portions.
    * @since OOo 3.0.1
    */
  type ProofreadingIterator = XProofreadingIterator
}
