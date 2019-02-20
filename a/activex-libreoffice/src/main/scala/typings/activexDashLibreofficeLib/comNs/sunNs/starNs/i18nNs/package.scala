package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nNs {
  /**
    * contains the base routines for iteration in Unicode string. Iterates over characters, words, sentences and line breaks.
    *
    * It also contains a {@link BreakIterator} service for Asian languages.
    */
  type BreakIterator = XBreakIterator
  type ChapterCollator = XCollator
  /**
    * Character classification, such as upper, lower, alpha, digit, et al.
    *
    * Provides also a generic parser functionality.
    */
  type CharacterClassification = XCharacterClassification
  /** Access collation algorithms of different locales. */
  type Collator = XCollator
  type IndexEntrySupplier = XExtendedIndexEntrySupplier
  /**
    * Check input sequence of CTL languages like Thai or Hindi.
    * @since OOo 1.1.2
    */
  type InputSequenceChecker = XExtendedInputSequenceChecker
  type LocaleCalendar = XCalendar3
  /**
    * Access a locale specific calendar.
    * @since LibreOffice 5.0
    */
  type LocaleCalendar2 = XCalendar4
  type LocaleData = XLocaleData4
  /**
    * Indicates transliteration generated multiple characters output but only single character return value was requested.
    *
    * Used by {@link XExtendedTransliteration.transliterateChar2Char()}
    * @since OOo 1.1.2
    */
  type MultipleCharsOutputException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * Supplier for transliteration of numerals (native number strings).
    * @since OOo 1.1.2
    */
  type NativeNumberSupplier = XNativeNumberSupplier
  /** Access locale data number format codes to use with the number formatter */
  type NumberFormatMapper = XNumberFormatCode
  /**
    * provides access to locale specific ordinal suffix systems.
    * @since OOo 2.2
    */
  type OrdinalSuffix = XOrdinalSuffix
  /**
    * offers generic text conversion.
    *
    * This is an abstract service which does not make sense to be instantiated.
    * @since OOo 1.1.2
    */
  type TextConversion = XExtendedTextConversion
  type Transliteration = XExtendedTransliteration
}
