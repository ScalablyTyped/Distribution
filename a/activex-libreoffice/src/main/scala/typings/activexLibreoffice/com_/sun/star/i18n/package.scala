package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * contains the base routines for iteration in Unicode string. Iterates over characters, words, sentences and line breaks.
  *
  * It also contains a {@link BreakIterator} service for Asian languages.
  */
type BreakIterator = typings.activexLibreoffice.com_.sun.star.i18n.XBreakIterator

type ChapterCollator = typings.activexLibreoffice.com_.sun.star.i18n.XCollator

/**
  * Character classification, such as upper, lower, alpha, digit, et al.
  *
  * Provides also a generic parser functionality.
  */
type CharacterClassification = typings.activexLibreoffice.com_.sun.star.i18n.XCharacterClassification

/** Access collation algorithms of different locales. */
type Collator = typings.activexLibreoffice.com_.sun.star.i18n.XCollator

type IndexEntrySupplier = typings.activexLibreoffice.com_.sun.star.i18n.XExtendedIndexEntrySupplier

/**
  * Check input sequence of CTL languages like Thai or Hindi.
  * @since OOo 1.1.2
  */
type InputSequenceChecker = typings.activexLibreoffice.com_.sun.star.i18n.XExtendedInputSequenceChecker

type LocaleCalendar = typings.activexLibreoffice.com_.sun.star.i18n.XCalendar3

/**
  * Access a locale specific calendar.
  * @since LibreOffice 5.0
  */
type LocaleCalendar2 = typings.activexLibreoffice.com_.sun.star.i18n.XCalendar4

type LocaleData = typings.activexLibreoffice.com_.sun.star.i18n.XLocaleData4

/**
  * Indicates transliteration generated multiple characters output but only single character return value was requested.
  *
  * Used by {@link XExtendedTransliteration.transliterateChar2Char()}
  * @since OOo 1.1.2
  */
type MultipleCharsOutputException = typings.activexLibreoffice.com_.sun.star.uno.Exception

/**
  * Supplier for transliteration of numerals (native number strings).
  * @since OOo 1.1.2
  */
type NativeNumberSupplier = typings.activexLibreoffice.com_.sun.star.i18n.XNativeNumberSupplier

/** Access locale data number format codes to use with the number formatter */
type NumberFormatMapper = typings.activexLibreoffice.com_.sun.star.i18n.XNumberFormatCode

/**
  * provides access to locale specific ordinal suffix systems.
  * @since OOo 2.2
  */
type OrdinalSuffix = typings.activexLibreoffice.com_.sun.star.i18n.XOrdinalSuffix

/**
  * offers generic text conversion.
  *
  * This is an abstract service which does not make sense to be instantiated.
  * @since OOo 1.1.2
  */
type TextConversion = typings.activexLibreoffice.com_.sun.star.i18n.XExtendedTextConversion

type Transliteration = typings.activexLibreoffice.com_.sun.star.i18n.XExtendedTransliteration
