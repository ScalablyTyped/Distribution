package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorRegistry extends js.Object {
  /** Register a TextEditor. */
  def add(editor: TextEditor): Disposable
  // Managing Text Editors
  /** Remove all editors from the registry. */
  def clear(): scala.Unit
  /** Remove any grammar override that has been set for the given TextEditor. */
  def clearGrammarOverride(editor: TextEditor): scala.Unit
  /**
    *  Retrieve the grammar scope name that has been set as a grammar override
    *  for the given TextEditor.
    */
  def getGrammarOverride(editor: TextEditor): java.lang.String | scala.Null
  /** Keep a TextEditor's configuration in sync with Atom's settings. */
  def maintainConfig(editor: TextEditor): Disposable
  /**
    *  Set a TextEditor's grammar based on its path and content, and continue
    *  to update its grammar as gramamrs are added or updated, or the editor's
    *  file path changes.
    */
  def maintainGrammar(editor: TextEditor): Disposable
  // Event Subscription
  /** Invoke the given callback with all the current and future registered TextEditors. */
  def observe(callback: js.Function1[/* editor */ TextEditor, scala.Unit]): Disposable
  /** Remove the given TextEditor from the registry. */
  def remove(editor: TextEditor): scala.Boolean
  /**
    *  Force a TextEditor to use a different grammar than the one that would
    *  otherwise be selected for it.
    */
  def setGrammarOverride(editor: TextEditor, scopeName: java.lang.String): scala.Unit
}

object TextEditorRegistry {
  @scala.inline
  def apply(
    add: TextEditor => Disposable,
    clear: () => scala.Unit,
    clearGrammarOverride: TextEditor => scala.Unit,
    getGrammarOverride: TextEditor => java.lang.String | scala.Null,
    maintainConfig: TextEditor => Disposable,
    maintainGrammar: TextEditor => Disposable,
    observe: js.Function1[/* editor */ TextEditor, scala.Unit] => Disposable,
    remove: TextEditor => scala.Boolean,
    setGrammarOverride: (TextEditor, java.lang.String) => scala.Unit
  ): TextEditorRegistry = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), clearGrammarOverride = js.Any.fromFunction1(clearGrammarOverride), getGrammarOverride = js.Any.fromFunction1(getGrammarOverride), maintainConfig = js.Any.fromFunction1(maintainConfig), maintainGrammar = js.Any.fromFunction1(maintainGrammar), observe = js.Any.fromFunction1(observe), remove = js.Any.fromFunction1(remove), setGrammarOverride = js.Any.fromFunction2(setGrammarOverride))
  
    __obj.asInstanceOf[TextEditorRegistry]
  }
}

