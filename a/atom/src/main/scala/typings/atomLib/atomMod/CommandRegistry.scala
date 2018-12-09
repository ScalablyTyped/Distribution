package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandRegistry extends js.Object {
  /** Register a single command. */
  def add[T /* <: stdLib.Node */](target: T, commandName: java.lang.String, listener: CommandRegistryListener[T]): Disposable = js.native
  /** Register multiple commands. */
  def add[T /* <: stdLib.Node */](target: T, commands: ScalablyTyped.runtime.StringDictionary[CommandRegistryListener[T]]): CompositeDisposable = js.native
  /** Register a single command. */
  @JSName("add")
  def `add_atom-text-editor`(
    target: atomLib.atomLibStrings.`atom-text-editor`,
    commandName: java.lang.String,
    listener: CommandRegistryListener[TextEditorElement]
  ): Disposable = js.native
  /** Register multiple commands. */
  @JSName("add")
  def `add_atom-text-editor`(
    target: atomLib.atomLibStrings.`atom-text-editor`,
    commands: ScalablyTyped.runtime.StringDictionary[CommandRegistryListener[TextEditorElement]]
  ): CompositeDisposable = js.native
  /**
       *  Simulate the dispatch of a command on a DOM node.
       *  @return Either a Promise that resolves after all handlers complete or null if
       *  no handlers were matched.
       */
  def dispatch(target: stdLib.Node, commandName: java.lang.String): js.Promise[scala.Unit] | scala.Null = js.native
  /** Find all registered commands matching a query. */
  def findCommands(params: atomLib.Anon_Target): js.Array[atomLib.Anon_DisplayName] = js.native
  /** Invoke the given callback after dispatching a command event. */
  def onDidDispatch(callback: js.Function1[/* event */ CommandEvent[stdLib.EventTarget], scala.Unit]): Disposable = js.native
  /** Invoke the given callback before dispatching a command event. */
  def onWillDispatch(callback: js.Function1[/* event */ CommandEvent[stdLib.EventTarget], scala.Unit]): Disposable = js.native
}

