package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the base routines for iteration in Unicode string. Iterates over characters, words, sentences and line breaks.
  *
  * Assumption: StartPos is inclusive and EndPos is exclusive.
  */
@js.native
trait XBreakIterator extends XInterface {
  
  /**
    * Traverses in Text from **nStartPos** to the beginning of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the character type starts
    */
  def beginOfCharBlock(aText: String, nStartPos: Double, aLocale: Locale, nCharType: Double): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the beginning of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the script type starts.
    */
  def beginOfScript(aText: String, nStartPos: Double, nScriptType: Double): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the start of a sentence.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @returns The position where the sentence starts.
    */
  def beginOfSentence(aText: String, nStartPos: Double, aLocale: Locale): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the end of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the character type ends.
    */
  def endOfCharBlock(aText: String, nStartPos: Double, aLocale: Locale, nCharType: Double): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the end of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the script type ends.
    */
  def endOfScript(aText: String, nStartPos: Double, nScriptType: Double): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the end of a sentence.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @returns The position where the sentence ends.
    */
  def endOfSentence(aText: String, nStartPos: Double, aLocale: Locale): Double = js.native
  
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
    aText: String,
    nStartPos: Double,
    aLocale: Locale,
    nMinBreakPos: Double,
    aHyphOptions: LineBreakHyphenationOptions,
    aUserOptions: LineBreakUserOptions
  ): LineBreakResults = js.native
  
  /**
    * Get the script type of the character at position **nPos** .
    * @param aText The input text.
    * @param nPos The index in aText.
    * @returns One of {@link ScriptType} .
    */
  def getScriptType(aText: String, nPos: Double): Double = js.native
  
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
  def getWordBoundary(aText: String, nPos: Double, aLocale: Locale, nWordType: Double, bPreferForward: Boolean): Boundary = js.native
  
  /** @deprecated DeprecatedGet the WordType of the word that starts at position nPos.  This method is mis-defined, since {@link WordType} is not an attribute of a */
  def getWordType(aText: String, nPos: Double, aLocale: Locale): Double = js.native
  
  /**
    * If a word starts at position **nPos** .
    *
    * It is possible that both of this method and following method **isEndWord** all return `TRUE` , since StartPos of a word is inclusive while EndPos of a
    * word is exclusive.
    */
  def isBeginWord(aText: String, nPos: Double, aLocale: Locale, nWordType: Double): Boolean = js.native
  
  /** If a word ends at position **nPos** . */
  def isEndWord(aText: String, nPos: Double, aLocale: Locale, nWordType: Double): Boolean = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the next start of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the next character type starts.
    */
  def nextCharBlock(aText: String, nStartPos: Double, aLocale: Locale, nCharType: Double): Double = js.native
  
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
    aText: String,
    nStartPos: Double,
    aLocale: Locale,
    nCharacterIteratorMode: Double,
    nCount: Double,
    nDone: js.Array[Double]
  ): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the next start of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the next script type starts.
    */
  def nextScript(aText: String, nStartPos: Double, nScriptType: Double): Double = js.native
  
  /**
    * Traverses one word in Text from **nStartPos** forwards.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nWordType One of {@link WordType} , specifies the type of traveling.
    * @returns The {@link Boundary} of the found word. Normally used for CTRL-Right.
    */
  def nextWord(aText: String, nStartPos: Double, aLocale: Locale, nWordType: Double): Boundary = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the previous start of the specified character type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .
    * @param nCharType One of {@link CharType}
    * @returns The position where the previous character type starts.
    */
  def previousCharBlock(aText: String, nStartPos: Double, aLocale: Locale, nCharType: Double): Double = js.native
  
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
    aText: String,
    nStartPos: Double,
    aLocale: Locale,
    nCharacterIteratorMode: Double,
    nCount: Double,
    nDone: js.Array[Double]
  ): Double = js.native
  
  /**
    * Traverses in Text from **nStartPos** to the previous start of the specified script type.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param nScriptType One of {@link ScriptType} .
    * @returns The position where the previous script type starts.
    */
  def previousScript(aText: String, nStartPos: Double, nScriptType: Double): Double = js.native
  
  /**
    * Traverses one word in Text from **nStartPos** backwards.
    * @param aText The input text.
    * @param nStartPos The start index in aText.
    * @param aLocale The locale of the character preceding **nStartPos** .  If the previous character is a space character and **nWordType** indicates spaces
    * @param nWordType One of {@link WordType} , specifies the type of traveling.
    * @returns The {@link Boundary} of the found word. Normally used for CTRL-Left.
    */
  def previousWord(aText: String, nStartPos: Double, aLocale: Locale, nWordType: Double): Boundary = js.native
}
object XBreakIterator {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    beginOfCharBlock: (String, Double, Locale, Double) => Double,
    beginOfScript: (String, Double, Double) => Double,
    beginOfSentence: (String, Double, Locale) => Double,
    endOfCharBlock: (String, Double, Locale, Double) => Double,
    endOfScript: (String, Double, Double) => Double,
    endOfSentence: (String, Double, Locale) => Double,
    getLineBreak: (String, Double, Locale, Double, LineBreakHyphenationOptions, LineBreakUserOptions) => LineBreakResults,
    getScriptType: (String, Double) => Double,
    getWordBoundary: (String, Double, Locale, Double, Boolean) => Boundary,
    getWordType: (String, Double, Locale) => Double,
    isBeginWord: (String, Double, Locale, Double) => Boolean,
    isEndWord: (String, Double, Locale, Double) => Boolean,
    nextCharBlock: (String, Double, Locale, Double) => Double,
    nextCharacters: (String, Double, Locale, Double, Double, js.Array[Double]) => Double,
    nextScript: (String, Double, Double) => Double,
    nextWord: (String, Double, Locale, Double) => Boundary,
    previousCharBlock: (String, Double, Locale, Double) => Double,
    previousCharacters: (String, Double, Locale, Double, Double, js.Array[Double]) => Double,
    previousScript: (String, Double, Double) => Double,
    previousWord: (String, Double, Locale, Double) => Boundary,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBreakIterator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), beginOfCharBlock = js.Any.fromFunction4(beginOfCharBlock), beginOfScript = js.Any.fromFunction3(beginOfScript), beginOfSentence = js.Any.fromFunction3(beginOfSentence), endOfCharBlock = js.Any.fromFunction4(endOfCharBlock), endOfScript = js.Any.fromFunction3(endOfScript), endOfSentence = js.Any.fromFunction3(endOfSentence), getLineBreak = js.Any.fromFunction6(getLineBreak), getScriptType = js.Any.fromFunction2(getScriptType), getWordBoundary = js.Any.fromFunction5(getWordBoundary), getWordType = js.Any.fromFunction3(getWordType), isBeginWord = js.Any.fromFunction4(isBeginWord), isEndWord = js.Any.fromFunction4(isEndWord), nextCharBlock = js.Any.fromFunction4(nextCharBlock), nextCharacters = js.Any.fromFunction6(nextCharacters), nextScript = js.Any.fromFunction3(nextScript), nextWord = js.Any.fromFunction4(nextWord), previousCharBlock = js.Any.fromFunction4(previousCharBlock), previousCharacters = js.Any.fromFunction6(previousCharacters), previousScript = js.Any.fromFunction3(previousScript), previousWord = js.Any.fromFunction4(previousWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBreakIterator]
  }
  
  @scala.inline
  implicit class XBreakIteratorMutableBuilder[Self <: XBreakIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOfCharBlock(value: (String, Double, Locale, Double) => Double): Self = StObject.set(x, "beginOfCharBlock", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBeginOfScript(value: (String, Double, Double) => Double): Self = StObject.set(x, "beginOfScript", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeginOfSentence(value: (String, Double, Locale) => Double): Self = StObject.set(x, "beginOfSentence", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEndOfCharBlock(value: (String, Double, Locale, Double) => Double): Self = StObject.set(x, "endOfCharBlock", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEndOfScript(value: (String, Double, Double) => Double): Self = StObject.set(x, "endOfScript", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEndOfSentence(value: (String, Double, Locale) => Double): Self = StObject.set(x, "endOfSentence", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetLineBreak(
      value: (String, Double, Locale, Double, LineBreakHyphenationOptions, LineBreakUserOptions) => LineBreakResults
    ): Self = StObject.set(x, "getLineBreak", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetScriptType(value: (String, Double) => Double): Self = StObject.set(x, "getScriptType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetWordBoundary(value: (String, Double, Locale, Double, Boolean) => Boundary): Self = StObject.set(x, "getWordBoundary", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetWordType(value: (String, Double, Locale) => Double): Self = StObject.set(x, "getWordType", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsBeginWord(value: (String, Double, Locale, Double) => Boolean): Self = StObject.set(x, "isBeginWord", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIsEndWord(value: (String, Double, Locale, Double) => Boolean): Self = StObject.set(x, "isEndWord", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNextCharBlock(value: (String, Double, Locale, Double) => Double): Self = StObject.set(x, "nextCharBlock", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNextCharacters(value: (String, Double, Locale, Double, Double, js.Array[Double]) => Double): Self = StObject.set(x, "nextCharacters", js.Any.fromFunction6(value))
    
    @scala.inline
    def setNextScript(value: (String, Double, Double) => Double): Self = StObject.set(x, "nextScript", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNextWord(value: (String, Double, Locale, Double) => Boundary): Self = StObject.set(x, "nextWord", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPreviousCharBlock(value: (String, Double, Locale, Double) => Double): Self = StObject.set(x, "previousCharBlock", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPreviousCharacters(value: (String, Double, Locale, Double, Double, js.Array[Double]) => Double): Self = StObject.set(x, "previousCharacters", js.Any.fromFunction6(value))
    
    @scala.inline
    def setPreviousScript(value: (String, Double, Double) => Double): Self = StObject.set(x, "previousScript", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreviousWord(value: (String, Double, Locale, Double) => Boundary): Self = StObject.set(x, "previousWord", js.Any.fromFunction4(value))
  }
}
