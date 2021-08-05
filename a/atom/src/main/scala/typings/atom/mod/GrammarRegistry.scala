package typings.atom.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarRegistry extends StObject {
  
  /**
    *  Add a grammar to this registry.
    *  A 'grammar-added' event is emitted after the grammar is added.
    *  @param grammar The Grammar to add. This should be a value previously returned
    *  from ::readGrammar or ::readGrammarSync.
    *  @return Returns a Disposable on which `.dispose()` can be called to remove
    *  the grammar.
    */
  def addGrammar(grammar: Grammar): Disposable
  
  /**
    *  Force a TextBuffer to use a different grammar than the one that would otherwise
    *  be selected for it.
    *  @param buffer The buffer whose grammar will be set.
    *  @param languageId The identifier of the desired language.
    *  @return Returns a boolean that indicates whether the language was successfully
    * found.
    */
  def assignLanguageMode(buffer: TextBuffer, languageId: String): Boolean
  
  /**
    *  Remove any language mode override that has been set for the given TextBuffer.
    *  This will assign to the buffer the best language mode available.
    */
  def autoAssignLanguageMode(buffer: TextBuffer): Unit
  
  /**
    *  Convert compact tags representation into convenient, space-inefficient tokens.
    *  @param lineText The text of the tokenized line.
    *  @param tags The tags returned from a call to Grammar::tokenizeLine().
    *  @return An array of Token instances decoded from the given tags.
    */
  def decodeTokens(lineText: String, tags: js.Array[Double | String]): js.Array[GrammarToken]
  
  /**
    *  Returns a number representing how well the grammar matches the
    *  `filePath` and `contents`.
    *  @param grammar The grammar to score.
    *  @param filePath A string file path.
    *  @param contents A string of text for that file path.
    */
  def getGrammarScore(grammar: Grammar, filePath: String, contents: String): Double
  
  // Managing Grammars
  /**
    *  Get all the grammars in this registry.
    *  @return A non-empty array of Grammar instances.
    */
  def getGrammars(): js.Array[Grammar]
  
  /**
    *  Get a grammar with the given scope name.
    *  @param scopeName A string such as `source.js`.
    *  @return A Grammar or undefined.
    */
  def grammarForScopeName(scopeName: String): js.UndefOr[Grammar]
  
  /**
    *  Read a grammar asynchronously and add it to the registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @param callback The function to be invoked once the Grammar has been read in
    *  and added to the registry.
    */
  def loadGrammar(
    grammarPath: String,
    callback: js.Function2[/* error */ Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]
  ): Unit
  
  /**
    *  Read a grammar synchronously and add it to this registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @return The newly loaded Grammar.
    */
  def loadGrammarSync(grammarPath: String): Grammar
  
  /**
    *  Set a TextBuffer's language mode based on its path and content, and continue
    *  to update its language mode as grammars are added or updated, or the buffer's
    *  file path changes.
    *  @param buffer The buffer whose language mode will be maintained.
    *  @return A Disposable that can be used to stop updating the buffer's
    *  language mode.
    */
  def maintainLanguageMode(buffer: TextBuffer): Disposable
  
  // Event Subscription
  /**
    *  Invoke the given callback when a grammar is added to the registry.
    *  @param callback The callback to be invoked whenever a grammar is added.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidAddGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable
  
  /**
    *  Invoke the given callback when a grammar is removed from the registry.
    *  @param callback The callback to be invoked whenever a grammar is removed.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidRemoveGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable
  
  /**
    *  Invoke the given callback when a grammar is updated due to a grammar it
    *  depends on being added or removed from the registry.
    *  @param callback The callback to be invoked whenever a grammar is updated.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidUpdateGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable
  
  /**
    *  Read a grammar asynchronously but don't add it to the registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @param callback The function to be invoked once the Grammar has been read in.
    */
  def readGrammar(
    grammarPath: String,
    callback: js.Function2[/* error */ Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]
  ): Unit
  
  /**
    *  Read a grammar synchronously but don't add it to the registry.
    *  @param grammarPath The absolute file path to a grammar.
    *  @return The newly loaded Grammar.
    */
  def readGrammarSync(grammarPath: String): Grammar
  
  /**
    *  Remove the given grammar from this registry.
    *  @param grammar The grammar to remove. This should be a grammar previously
    *  added to the registry from ::addGrammar.
    */
  def removeGrammar(grammar: Grammar): Unit
  
  /**
    *  Remove the grammar with the given scope name.
    *  @param scopeName A string such as `source.js`.
    *  @return Returns the removed Grammar or undefined.
    */
  def removeGrammarForScopeName(scopeName: String): js.UndefOr[Grammar]
  
  /**
    *  Select a grammar for the given file path and file contents.
    *
    *  This picks the best match by checking the file path and contents against
    *  each grammar.
    *  @param filePath A string file path.
    *  @param fileContents A string of text for that file path.
    */
  def selectGrammar(filePath: String, fileContents: String): Grammar
}
object GrammarRegistry {
  
  inline def apply(
    addGrammar: Grammar => Disposable,
    assignLanguageMode: (TextBuffer, String) => Boolean,
    autoAssignLanguageMode: TextBuffer => Unit,
    decodeTokens: (String, js.Array[Double | String]) => js.Array[GrammarToken],
    getGrammarScore: (Grammar, String, String) => Double,
    getGrammars: () => js.Array[Grammar],
    grammarForScopeName: String => js.UndefOr[Grammar],
    loadGrammar: (String, js.Function2[/* error */ Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]) => Unit,
    loadGrammarSync: String => Grammar,
    maintainLanguageMode: TextBuffer => Disposable,
    onDidAddGrammar: js.Function1[/* grammar */ Grammar, Unit] => Disposable,
    onDidRemoveGrammar: js.Function1[/* grammar */ Grammar, Unit] => Disposable,
    onDidUpdateGrammar: js.Function1[/* grammar */ Grammar, Unit] => Disposable,
    readGrammar: (String, js.Function2[/* error */ Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]) => Unit,
    readGrammarSync: String => Grammar,
    removeGrammar: Grammar => Unit,
    removeGrammarForScopeName: String => js.UndefOr[Grammar],
    selectGrammar: (String, String) => Grammar
  ): GrammarRegistry = {
    val __obj = js.Dynamic.literal(addGrammar = js.Any.fromFunction1(addGrammar), assignLanguageMode = js.Any.fromFunction2(assignLanguageMode), autoAssignLanguageMode = js.Any.fromFunction1(autoAssignLanguageMode), decodeTokens = js.Any.fromFunction2(decodeTokens), getGrammarScore = js.Any.fromFunction3(getGrammarScore), getGrammars = js.Any.fromFunction0(getGrammars), grammarForScopeName = js.Any.fromFunction1(grammarForScopeName), loadGrammar = js.Any.fromFunction2(loadGrammar), loadGrammarSync = js.Any.fromFunction1(loadGrammarSync), maintainLanguageMode = js.Any.fromFunction1(maintainLanguageMode), onDidAddGrammar = js.Any.fromFunction1(onDidAddGrammar), onDidRemoveGrammar = js.Any.fromFunction1(onDidRemoveGrammar), onDidUpdateGrammar = js.Any.fromFunction1(onDidUpdateGrammar), readGrammar = js.Any.fromFunction2(readGrammar), readGrammarSync = js.Any.fromFunction1(readGrammarSync), removeGrammar = js.Any.fromFunction1(removeGrammar), removeGrammarForScopeName = js.Any.fromFunction1(removeGrammarForScopeName), selectGrammar = js.Any.fromFunction2(selectGrammar))
    __obj.asInstanceOf[GrammarRegistry]
  }
  
  extension [Self <: GrammarRegistry](x: Self) {
    
    inline def setAddGrammar(value: Grammar => Disposable): Self = StObject.set(x, "addGrammar", js.Any.fromFunction1(value))
    
    inline def setAssignLanguageMode(value: (TextBuffer, String) => Boolean): Self = StObject.set(x, "assignLanguageMode", js.Any.fromFunction2(value))
    
    inline def setAutoAssignLanguageMode(value: TextBuffer => Unit): Self = StObject.set(x, "autoAssignLanguageMode", js.Any.fromFunction1(value))
    
    inline def setDecodeTokens(value: (String, js.Array[Double | String]) => js.Array[GrammarToken]): Self = StObject.set(x, "decodeTokens", js.Any.fromFunction2(value))
    
    inline def setGetGrammarScore(value: (Grammar, String, String) => Double): Self = StObject.set(x, "getGrammarScore", js.Any.fromFunction3(value))
    
    inline def setGetGrammars(value: () => js.Array[Grammar]): Self = StObject.set(x, "getGrammars", js.Any.fromFunction0(value))
    
    inline def setGrammarForScopeName(value: String => js.UndefOr[Grammar]): Self = StObject.set(x, "grammarForScopeName", js.Any.fromFunction1(value))
    
    inline def setLoadGrammar(
      value: (String, js.Function2[/* error */ Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]) => Unit
    ): Self = StObject.set(x, "loadGrammar", js.Any.fromFunction2(value))
    
    inline def setLoadGrammarSync(value: String => Grammar): Self = StObject.set(x, "loadGrammarSync", js.Any.fromFunction1(value))
    
    inline def setMaintainLanguageMode(value: TextBuffer => Disposable): Self = StObject.set(x, "maintainLanguageMode", js.Any.fromFunction1(value))
    
    inline def setOnDidAddGrammar(value: js.Function1[/* grammar */ Grammar, Unit] => Disposable): Self = StObject.set(x, "onDidAddGrammar", js.Any.fromFunction1(value))
    
    inline def setOnDidRemoveGrammar(value: js.Function1[/* grammar */ Grammar, Unit] => Disposable): Self = StObject.set(x, "onDidRemoveGrammar", js.Any.fromFunction1(value))
    
    inline def setOnDidUpdateGrammar(value: js.Function1[/* grammar */ Grammar, Unit] => Disposable): Self = StObject.set(x, "onDidUpdateGrammar", js.Any.fromFunction1(value))
    
    inline def setReadGrammar(
      value: (String, js.Function2[/* error */ Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]) => Unit
    ): Self = StObject.set(x, "readGrammar", js.Any.fromFunction2(value))
    
    inline def setReadGrammarSync(value: String => Grammar): Self = StObject.set(x, "readGrammarSync", js.Any.fromFunction1(value))
    
    inline def setRemoveGrammar(value: Grammar => Unit): Self = StObject.set(x, "removeGrammar", js.Any.fromFunction1(value))
    
    inline def setRemoveGrammarForScopeName(value: String => js.UndefOr[Grammar]): Self = StObject.set(x, "removeGrammarForScopeName", js.Any.fromFunction1(value))
    
    inline def setSelectGrammar(value: (String, String) => Grammar): Self = StObject.set(x, "selectGrammar", js.Any.fromFunction2(value))
  }
}
