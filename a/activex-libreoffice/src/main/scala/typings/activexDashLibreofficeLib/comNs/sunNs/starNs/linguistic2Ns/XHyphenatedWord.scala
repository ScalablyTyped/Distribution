package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives information obtained by a successful hyphenation attempt.
  *
  * This interface is used as a return value for some of the hyphenator functions.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XHyphenatedWord
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  val HyphenPos: scala.Double
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  val HyphenatedWord: java.lang.String
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  val HyphenationPos: scala.Double
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was hyphenated. */
  val Word: java.lang.String
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  def getHyphenPos(): scala.Double
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  def getHyphenatedWord(): java.lang.String
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  def getHyphenationPos(): scala.Double
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was hyphenated. */
  def getWord(): java.lang.String
  /**
    * is used to query if the hyphenation result is an alternative spelling.
    *
    * A hyphenation result is an alternative spelling if the hyphenated word is different from the word that was hyphenated.
    * @returns `TRUE` if it is an alternative spelling, `FALSE` otherwise.
    */
  def isAlternativeSpelling(): scala.Boolean
}

