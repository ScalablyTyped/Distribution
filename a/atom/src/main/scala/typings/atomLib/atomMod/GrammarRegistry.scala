package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarRegistry extends js.Object {
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
  def assignLanguageMode(buffer: TextBuffer, languageId: java.lang.String): scala.Boolean
  /**
    *  Remove any language mode override that has been set for the given TextBuffer.
    *  This will assign to the buffer the best language mode available.
    */
  def autoAssignLanguageMode(buffer: TextBuffer): scala.Unit
  /**
    *  Convert compact tags representation into convenient, space-inefficient tokens.
    *  @param lineText The text of the tokenized line.
    *  @param tags The tags returned from a call to Grammar::tokenizeLine().
    *  @return An array of Token instances decoded from the given tags.
    */
  def decodeTokens(lineText: java.lang.String, tags: js.Array[scala.Double | java.lang.String]): js.Array[GrammarToken]
  /**
    *  Returns a number representing how well the grammar matches the
    *  `filePath` and `contents`.
    *  @param grammar The grammar to score.
    *  @param filePath A string file path.
    *  @param contents A string of text for that file path.
    */
  def getGrammarScore(grammar: Grammar, filePath: java.lang.String, contents: java.lang.String): scala.Double
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
  def grammarForScopeName(scopeName: java.lang.String): js.UndefOr[Grammar]
  /**
    *  Read a grammar asynchronously and add it to the registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @param callback The function to be invoked once the Grammar has been read in
    *  and added to the registry.
    */
  def loadGrammar(
    grammarPath: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* grammar */ js.UndefOr[Grammar], 
      scala.Unit
    ]
  ): scala.Unit
  /**
    *  Read a grammar synchronously and add it to this registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @return The newly loaded Grammar.
    */
  def loadGrammarSync(grammarPath: java.lang.String): Grammar
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
  def onDidAddGrammar(callback: js.Function1[/* grammar */ Grammar, scala.Unit]): Disposable
  /**
    *  Invoke the given callback when a grammar is removed from the registry.
    *  @param callback The callback to be invoked whenever a grammar is removed.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidRemoveGrammar(callback: js.Function1[/* grammar */ Grammar, scala.Unit]): Disposable
  /**
    *  Invoke the given callback when a grammar is updated due to a grammar it
    *  depends on being added or removed from the registry.
    *  @param callback The callback to be invoked whenever a grammar is updated.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidUpdateGrammar(callback: js.Function1[/* grammar */ Grammar, scala.Unit]): Disposable
  /**
    *  Read a grammar asynchronously but don't add it to the registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @param callback The function to be invoked once the Grammar has been read in.
    */
  def readGrammar(
    grammarPath: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error | scala.Null, 
      /* grammar */ js.UndefOr[Grammar], 
      scala.Unit
    ]
  ): scala.Unit
  /**
    *  Read a grammar synchronously but don't add it to the registry.
    *  @param grammarPath The absolute file path to a grammar.
    *  @return The newly loaded Grammar.
    */
  def readGrammarSync(grammarPath: java.lang.String): Grammar
  /**
    *  Remove the given grammar from this registry.
    *  @param grammar The grammar to remove. This should be a grammar previously
    *  added to the registry from ::addGrammar.
    */
  def removeGrammar(grammar: Grammar): scala.Unit
  /**
    *  Remove the grammar with the given scope name.
    *  @param scopeName A string such as `source.js`.
    *  @return Returns the removed Grammar or undefined.
    */
  def removeGrammarForScopeName(scopeName: java.lang.String): js.UndefOr[Grammar]
  /**
    *  Select a grammar for the given file path and file contents.
    *
    *  This picks the best match by checking the file path and contents against
    *  each grammar.
    *  @param filePath A string file path.
    *  @param fileContents A string of text for that file path.
    */
  def selectGrammar(filePath: java.lang.String, fileContents: java.lang.String): Grammar
}

object GrammarRegistry {
  @scala.inline
  def apply(
    addGrammar: js.Function1[Grammar, Disposable],
    assignLanguageMode: js.Function2[TextBuffer, java.lang.String, scala.Boolean],
    autoAssignLanguageMode: js.Function1[TextBuffer, scala.Unit],
    decodeTokens: js.Function2[java.lang.String, js.Array[scala.Double | java.lang.String], js.Array[GrammarToken]],
    getGrammarScore: js.Function3[Grammar, java.lang.String, java.lang.String, scala.Double],
    getGrammars: js.Function0[js.Array[Grammar]],
    grammarForScopeName: js.Function1[java.lang.String, js.UndefOr[Grammar]],
    loadGrammar: js.Function2[
      java.lang.String, 
      js.Function2[
        /* error */ nodeLib.Error | scala.Null, 
        /* grammar */ js.UndefOr[Grammar], 
        scala.Unit
      ], 
      scala.Unit
    ],
    loadGrammarSync: js.Function1[java.lang.String, Grammar],
    maintainLanguageMode: js.Function1[TextBuffer, Disposable],
    onDidAddGrammar: js.Function1[js.Function1[/* grammar */ Grammar, scala.Unit], Disposable],
    onDidRemoveGrammar: js.Function1[js.Function1[/* grammar */ Grammar, scala.Unit], Disposable],
    onDidUpdateGrammar: js.Function1[js.Function1[/* grammar */ Grammar, scala.Unit], Disposable],
    readGrammar: js.Function2[
      java.lang.String, 
      js.Function2[
        /* error */ nodeLib.Error | scala.Null, 
        /* grammar */ js.UndefOr[Grammar], 
        scala.Unit
      ], 
      scala.Unit
    ],
    readGrammarSync: js.Function1[java.lang.String, Grammar],
    removeGrammar: js.Function1[Grammar, scala.Unit],
    removeGrammarForScopeName: js.Function1[java.lang.String, js.UndefOr[Grammar]],
    selectGrammar: js.Function2[java.lang.String, java.lang.String, Grammar]
  ): GrammarRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addGrammar")(addGrammar)
    __obj.updateDynamic("assignLanguageMode")(assignLanguageMode)
    __obj.updateDynamic("autoAssignLanguageMode")(autoAssignLanguageMode)
    __obj.updateDynamic("decodeTokens")(decodeTokens)
    __obj.updateDynamic("getGrammarScore")(getGrammarScore)
    __obj.updateDynamic("getGrammars")(getGrammars)
    __obj.updateDynamic("grammarForScopeName")(grammarForScopeName)
    __obj.updateDynamic("loadGrammar")(loadGrammar)
    __obj.updateDynamic("loadGrammarSync")(loadGrammarSync)
    __obj.updateDynamic("maintainLanguageMode")(maintainLanguageMode)
    __obj.updateDynamic("onDidAddGrammar")(onDidAddGrammar)
    __obj.updateDynamic("onDidRemoveGrammar")(onDidRemoveGrammar)
    __obj.updateDynamic("onDidUpdateGrammar")(onDidUpdateGrammar)
    __obj.updateDynamic("readGrammar")(readGrammar)
    __obj.updateDynamic("readGrammarSync")(readGrammarSync)
    __obj.updateDynamic("removeGrammar")(removeGrammar)
    __obj.updateDynamic("removeGrammarForScopeName")(removeGrammarForScopeName)
    __obj.updateDynamic("selectGrammar")(selectGrammar)
    __obj.asInstanceOf[GrammarRegistry]
  }
}

