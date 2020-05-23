package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import typings.atom.anon.DisplayName
import typings.atom.anon.Target
import typings.atom.atomStrings.`atom-text-editor`
import typings.std.EventTarget
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandRegistry extends js.Object {
  /** Register a single command. */
  def add[T /* <: Node */](target: T, commandName: String, listener: CommandRegistryListener[T]): Disposable = js.native
  /** Register multiple commands. */
  def add[T /* <: Node */](target: T, commands: StringDictionary[CommandRegistryListener[T]]): CompositeDisposable = js.native
  /** Register a single command. */
  @JSName("add")
  def add_atomtexteditor(
    target: `atom-text-editor`,
    commandName: String,
    listener: CommandRegistryListener[TextEditorElement]
  ): Disposable = js.native
  /** Register multiple commands. */
  @JSName("add")
  def add_atomtexteditor(target: `atom-text-editor`, commands: StringDictionary[CommandRegistryListener[TextEditorElement]]): CompositeDisposable = js.native
  /**
    *  Simulate the dispatch of a command on a DOM node.
    *  @return Either a Promise that resolves after all handlers complete or null if
    *  no handlers were matched.
    */
  def dispatch(target: Node, commandName: String): js.Promise[Unit] | Null = js.native
  /** Find all registered commands matching a query. */
  def findCommands(params: Target): js.Array[DisplayName] = js.native
  /** Invoke the given callback after dispatching a command event. */
  def onDidDispatch(callback: js.Function1[/* event */ CommandEvent[EventTarget], Unit]): Disposable = js.native
  /** Invoke the given callback before dispatching a command event. */
  def onWillDispatch(callback: js.Function1[/* event */ CommandEvent[EventTarget], Unit]): Disposable = js.native
}

