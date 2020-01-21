package typings.atomKeymap.mod._Global_.AtomKeymap

import org.scalablytyped.runtime.StringDictionary
import typings.atomKeymap.AnonCommand
import typings.atomKeymap.AnonPriority
import typings.atomKeymap.AnonPriorityNumber
import typings.atomKeymap.mod._Global_.AtomKeymap.Events.AddedKeystrokeResolver
import typings.atomKeymap.mod._Global_.AtomKeymap.Events.FailedKeybindingMatch
import typings.atomKeymap.mod._Global_.AtomKeymap.Events.FailedKeymapFileRead
import typings.atomKeymap.mod._Global_.AtomKeymap.Events.FullKeybindingMatch
import typings.atomKeymap.mod._Global_.AtomKeymap.Events.KeymapLoaded
import typings.atomKeymap.mod._Global_.AtomKeymap.Events.PartialKeybindingMatch
import typings.eventKit.mod.Disposable
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Allows commands to be associated with keystrokes in a context-sensitive way.
  *  In Atom, you can access a global instance of this object via `atom.keymaps`.
  */
@js.native
trait KeymapManager extends js.Object {
  var defaultTarget: HTMLElement = js.native
  var partialMatchTimeout: Double = js.native
  /** Add sets of key bindings grouped by CSS selector. */
  def add(source: String, bindings: StringDictionary[StringDictionary[String]]): Disposable = js.native
  def add(source: String, bindings: StringDictionary[StringDictionary[String]], priority: Double): Disposable = js.native
  /** Customize translation of raw keyboard events to keystroke strings. */
  def addKeystrokeResolver(resolver: js.Function1[/* event */ AddedKeystrokeResolver, String]): Disposable = js.native
  // Adding and Removing Bindings
  /** Construct KeyBindings from an object grouping them by CSS selector. */
  def build(source: String, bindings: StringDictionary[StringDictionary[String]]): js.Array[KeyBinding] = js.native
  def build(source: String, bindings: StringDictionary[StringDictionary[String]], priority: Double): js.Array[KeyBinding] = js.native
  /** Clear all registered key bindings and enqueued keystrokes. For use in tests. */
  def clear(): Unit = js.native
  /** Unwatch all watched paths. */
  def destroy(): Unit = js.native
  /** Get the key bindings for a given command and optional target. */
  def findKeyBindings(): js.Array[KeyBinding] = js.native
  def findKeyBindings(params: AnonCommand): js.Array[KeyBinding] = js.native
  // Accessing Bindings
  /** Get all current key bindings. */
  def getKeyBindings(): js.Array[KeyBinding] = js.native
  /**
    *  Get the number of milliseconds allowed before pending states caused by
    *  partial matches of multi-keystroke bindings are terminated.
    */
  def getPartialMatchTimeout(): Double = js.native
  // Managing Keyboard Events
  /**
    *  Dispatch a custom event associated with the matching key binding for the
    *  given `KeyboardEvent` if one can be found.
    */
  def handleKeyboardEvent(event: KeyboardEvent): Unit = js.native
  /** Translates a keydown event to a keystroke string. */
  def keystrokeForKeyboardEvent(event: KeyboardEvent): String = js.native
  // Managing Keymap Files
  /** Load the key bindings from the given path. */
  def loadKeymap(bindingsPath: String): Unit = js.native
  def loadKeymap(bindingsPath: String, options: AnonPriority): Unit = js.native
  /** Invoke the given callback when one or more keystrokes fail to match any bindings. */
  def onDidFailToMatchBinding(callback: js.Function1[/* event */ FailedKeybindingMatch, Unit]): Disposable = js.native
  /** Invoke the given callback when a keymap file not able to be loaded. */
  def onDidFailToReadFile(callback: js.Function1[/* error */ FailedKeymapFileRead, Unit]): Disposable = js.native
  // Event Subscription
  /**
    *  Invoke the given callback when one or more keystrokes completely match a
    *  key binding.
    */
  def onDidMatchBinding(callback: js.Function1[/* event */ FullKeybindingMatch, Unit]): Disposable = js.native
  /** Invoke the given callback when one or more keystrokes partially match a binding. */
  def onDidPartiallyMatchBindings(callback: js.Function1[/* event */ PartialKeybindingMatch, Unit]): Disposable = js.native
  /** Invoke the given callback when a keymap file is reloaded. */
  def onDidReloadKeymap(callback: js.Function1[/* event */ KeymapLoaded, Unit]): Disposable = js.native
  /** Invoke the given callback when a keymap file is unloaded. */
  def onDidUnloadKeymap(callback: js.Function1[/* event */ KeymapLoaded, Unit]): Disposable = js.native
  /**
    *  Cause the keymap to reload the key bindings file at the given path whenever
    *  it changes.
    */
  def watchKeymap(filePath: String): Unit = js.native
  def watchKeymap(filePath: String, options: AnonPriorityNumber): Unit = js.native
}

