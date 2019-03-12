package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the base routines for iteration in Unicode string. Iterates over characters, words, sentences and line breaks.
  *
  * Assumption: StartPos is inclusive and EndPos is exclusive.
  */
trait XBreakIterator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Traverses in Text from **nStartPos** to the beginning of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the character type starts
    */
  def beginOfCharBlock(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCharType: scala.Double
  ): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the beginning of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the script type starts.
    */
  def beginOfScript(aText: java.lang.String, nStartPos: scala.Double, nScriptType: scala.Double): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the start of a sentence.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @returns The position where the sentence starts.
    */
  def beginOfSentence(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the end of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the character type ends.
    */
  def endOfCharBlock(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCharType: scala.Double
  ): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the end of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the script type ends.
    */
  def endOfScript(aText: java.lang.String, nStartPos: scala.Double, nScriptType: scala.Double): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the end of a sentence.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @returns The position where the sentence ends.
    */
  def endOfSentence(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  /**
    * Calculate the line break position in the Text from the specified **nStartPos** .
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nMinBreakPos Defines a minimum break position for hyphenated line break. When the position for hyphenated line break is less than **nMinBreakPos*
    * @param aHyphOptions Defines if the hyphenator is to be used.
    * @param aUserOptions Defines how to handle hanging punctuations and forbidden characters at the start/end of a line.
    * @returns The {@link LineBreakResults} contain the break position of the line, {@link BreakType} and {@link com.sun.star.linguistic2.XHyphenatedWord}
    */
  def getLineBreak(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nMinBreakPos: scala.Double,
    aHyphOptions: LineBreakHyphenationOptions,
    aUserOptions: LineBreakUserOptions
  ): LineBreakResults
  /**
    * Get the script type of the character at position **nPos** .
    * @param aText The input text.
    * @param nPos The index in aText.
    * @returns One of {@link ScriptType} .
    */
  def getScriptType(aText: java.lang.String, nPos: scala.Double): scala.Double
  /**
    * Identifies StartPos and EndPos of current word.
    *
    * If **nPos** is the boundary of a word, it is StartPos of one word and EndPos of previous word. In this situation, the outcome of the algorithm can be
    * indeterminate. In this situation the **bPreferForward** flag is used. If bPreferForward == `FALSE` , **nPos** is considered to be the end of the word
    * and we look backwards for beginning of word, otherwise **nPos** is considered to be the start of the next word and we look forwards for the end of the
    * word.
    * @param aText The input text.
    * @param nPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nWordType One of {@link WordType} .
    * @param bPreferForward If `TRUE` , nPos should be considered the start of the next word and search proceeds forwards. If `FALSE` , nPos should be conside
    * @returns The {@link Boundary} of the current word.
    */
  def getWordBoundary(
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nWordType: scala.Double,
    bPreferForward: scala.Boolean
  ): Boundary
  /** @deprecated DeprecatedGet the WordType of the word that starts at position nPos.  This method is mis-defined, since {@link WordType} is not an attribute of a */
  def getWordType(
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  /**
    * If a word starts at position **nPos** .
    *
    * It is possible that both of this method and following method **isEndWord** all return `TRUE` , since StartPos of a word is inclusive while EndPos of a
    * word is exclusive.
    */
  def isBeginWord(
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nWordType: scala.Double
  ): scala.Boolean
  /** If a word ends at position **nPos** . */
  def isEndWord(
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nWordType: scala.Double
  ): scala.Boolean
  /**
    * Traverses in Text from **nStartPos** to the next start of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the next character type starts.
    */
  def nextCharBlock(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCharType: scala.Double
  ): scala.Double
  /**
    * Traverses specified number of characters/cells in Text from **nStartPos** forwards. {@link CharacterIteratorMode} can be cell based or character
    * based. A cell is made of more than one character.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharacterIteratorMode A constant from {@link CharacterIteratorMode}
    * @param nCount Number of characters to traverse, it should not be less than 0. If you want to traverse in the opposite direction use {@link XBreakIterato
    * @param nDone Out parameter to receive the number of cells/Unicode characters traversed.
    */
  def nextCharacters(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCharacterIteratorMode: scala.Double,
    nCount: scala.Double,
    nDone: js.Array[scala.Double]
  ): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the next start of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the next script type starts.
    */
  def nextScript(aText: java.lang.String, nStartPos: scala.Double, nScriptType: scala.Double): scala.Double
  /**
    * Traverses one word in Text from **nStartPos** forwards.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nWordType One of {@link WordType} , specifies the type of traveling.
    * @returns The {@link Boundary} of the found word. Normally used for CTRL-Right.
    */
  def nextWord(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nWordType: scala.Double
  ): Boundary
  /**
    * Traverses in Text from **nStartPos** to the previous start of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the previous character type starts.
    */
  def previousCharBlock(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCharType: scala.Double
  ): scala.Double
  /**
    * Traverses specified number of characters/cells in Text from **nStartPos** backwards. {@link CharacterIteratorMode} can be cell based or character
    * based. A cell is made of more than one character.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharacterIteratorMode A constant from {@link CharacterIteratorMode}
    * @param nCount Number of characters to traverse, it should not be less than 0. If you want to traverse in the opposite direction use {@link XBreakIterato
    * @param nDone Out parameter to receive the number of cells/Unicode characters traversed.
    */
  def previousCharacters(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCharacterIteratorMode: scala.Double,
    nCount: scala.Double,
    nDone: js.Array[scala.Double]
  ): scala.Double
  /**
    * Traverses in Text from **nStartPos** to the previous start of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the previous script type starts.
    */
  def previousScript(aText: java.lang.String, nStartPos: scala.Double, nScriptType: scala.Double): scala.Double
  /**
    * Traverses one word in Text from **nStartPos** backwards.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .  If the previous character is a space character and **nWordType** indicates spaces
    * @param nWordType One of {@link WordType} , specifies the type of traveling.
    * @returns The {@link Boundary} of the found word. Normally used for CTRL-Left.
    */
  def previousWord(
    aText: java.lang.String,
    nStartPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nWordType: scala.Double
  ): Boundary
}

object XBreakIterator {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    beginOfCharBlock: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Double,
    beginOfScript: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    beginOfSentence: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    endOfCharBlock: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Double,
    endOfScript: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    endOfSentence: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getLineBreak: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, LineBreakHyphenationOptions, LineBreakUserOptions) => LineBreakResults,
    getScriptType: (java.lang.String, scala.Double) => scala.Double,
    getWordBoundary: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Boolean) => Boundary,
    getWordType: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    isBeginWord: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Boolean,
    isEndWord: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Boolean,
    nextCharBlock: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Double,
    nextCharacters: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Double,
    nextScript: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    nextWord: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => Boundary,
    previousCharBlock: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Double,
    previousCharacters: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Double,
    previousScript: (java.lang.String, scala.Double, scala.Double) => scala.Double,
    previousWord: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => Boundary,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBreakIterator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginOfCharBlock = js.Any.fromFunction4(beginOfCharBlock), beginOfScript = js.Any.fromFunction3(beginOfScript), beginOfSentence = js.Any.fromFunction3(beginOfSentence), endOfCharBlock = js.Any.fromFunction4(endOfCharBlock), endOfScript = js.Any.fromFunction3(endOfScript), endOfSentence = js.Any.fromFunction3(endOfSentence), getLineBreak = js.Any.fromFunction6(getLineBreak), getScriptType = js.Any.fromFunction2(getScriptType), getWordBoundary = js.Any.fromFunction5(getWordBoundary), getWordType = js.Any.fromFunction3(getWordType), isBeginWord = js.Any.fromFunction4(isBeginWord), isEndWord = js.Any.fromFunction4(isEndWord), nextCharBlock = js.Any.fromFunction4(nextCharBlock), nextCharacters = js.Any.fromFunction6(nextCharacters), nextScript = js.Any.fromFunction3(nextScript), nextWord = js.Any.fromFunction4(nextWord), previousCharBlock = js.Any.fromFunction4(previousCharBlock), previousCharacters = js.Any.fromFunction6(previousCharacters), previousScript = js.Any.fromFunction3(previousScript), previousWord = js.Any.fromFunction4(previousWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBreakIterator]
  }
}

