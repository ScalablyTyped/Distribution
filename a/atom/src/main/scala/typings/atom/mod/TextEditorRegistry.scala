package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorRegistry extends js.Object {
  /** Register a TextEditor. */
  def add(editor: TextEditor): Disposable = js.native
  // Managing Text Editors
  /** Remove all editors from the registry. */
  def clear(): Unit = js.native
  /** Remove any grammar override that has been set for the given TextEditor. */
  def clearGrammarOverride(editor: TextEditor): Unit = js.native
  /**
    *  Retrieve the grammar scope name that has been set as a grammar override
    *  for the given TextEditor.
    */
  def getGrammarOverride(editor: TextEditor): String | Null = js.native
  /** Keep a TextEditor's configuration in sync with Atom's settings. */
  def maintainConfig(editor: TextEditor): Disposable = js.native
  /**
    *  Set a TextEditor's grammar based on its path and content, and continue
    *  to update its grammar as gramamrs are added or updated, or the editor's
    *  file path changes.
    */
  def maintainGrammar(editor: TextEditor): Disposable = js.native
  // Event Subscription
  /** Invoke the given callback with all the current and future registered TextEditors. */
  def observe(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable = js.native
  /** Remove the given TextEditor from the registry. */
  def remove(editor: TextEditor): Boolean = js.native
  /**
    *  Force a TextEditor to use a different grammar than the one that would
    *  otherwise be selected for it.
    */
  def setGrammarOverride(editor: TextEditor, scopeName: String): Unit = js.native
}

object TextEditorRegistry {
  @scala.inline
  def apply(
    add: TextEditor => Disposable,
    clear: () => Unit,
    clearGrammarOverride: TextEditor => Unit,
    getGrammarOverride: TextEditor => String | Null,
    maintainConfig: TextEditor => Disposable,
    maintainGrammar: TextEditor => Disposable,
    observe: js.Function1[/* editor */ TextEditor, Unit] => Disposable,
    remove: TextEditor => Boolean,
    setGrammarOverride: (TextEditor, String) => Unit
  ): TextEditorRegistry = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), clearGrammarOverride = js.Any.fromFunction1(clearGrammarOverride), getGrammarOverride = js.Any.fromFunction1(getGrammarOverride), maintainConfig = js.Any.fromFunction1(maintainConfig), maintainGrammar = js.Any.fromFunction1(maintainGrammar), observe = js.Any.fromFunction1(observe), remove = js.Any.fromFunction1(remove), setGrammarOverride = js.Any.fromFunction2(setGrammarOverride))
    __obj.asInstanceOf[TextEditorRegistry]
  }
  @scala.inline
  implicit class TextEditorRegistryOps[Self <: TextEditorRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: TextEditor => Disposable): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClearGrammarOverride(value: TextEditor => Unit): Self = this.set("clearGrammarOverride", js.Any.fromFunction1(value))
    @scala.inline
    def setGetGrammarOverride(value: TextEditor => String | Null): Self = this.set("getGrammarOverride", js.Any.fromFunction1(value))
    @scala.inline
    def setMaintainConfig(value: TextEditor => Disposable): Self = this.set("maintainConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setMaintainGrammar(value: TextEditor => Disposable): Self = this.set("maintainGrammar", js.Any.fromFunction1(value))
    @scala.inline
    def setObserve(value: js.Function1[/* editor */ TextEditor, Unit] => Disposable): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: TextEditor => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGrammarOverride(value: (TextEditor, String) => Unit): Self = this.set("setGrammarOverride", js.Any.fromFunction2(value))
  }
  
}

