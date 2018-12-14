package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeymapManager extends js.Object {
  /** Add sets of key bindings grouped by CSS selector. */
  def add(
    source: java.lang.String,
    bindings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ): Disposable = js.native
  /** Add sets of key bindings grouped by CSS selector. */
  def add(
    source: java.lang.String,
    bindings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    priority: scala.Double
  ): Disposable = js.native
  /** Customize translation of raw keyboard events to keystroke strings. */
  def addKeystrokeResolver(resolver: js.Function1[/* event */ AddedKeystrokeResolverEvent, java.lang.String]): Disposable = js.native
  // Adding and Removing Bindings
  /** Construct KeyBindings from an object grouping them by CSS selector. */
  def build(
    source: java.lang.String,
    bindings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ): js.Array[KeyBinding] = js.native
  // Adding and Removing Bindings
  /** Construct KeyBindings from an object grouping them by CSS selector. */
  def build(
    source: java.lang.String,
    bindings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    priority: scala.Double
  ): js.Array[KeyBinding] = js.native
  /** Clear all registered key bindings and enqueued keystrokes. For use in tests. */
  def clear(): scala.Unit = js.native
  /** Unwatch all watched paths. */
  def destroy(): scala.Unit = js.native
  /** Get the key bindings for a given command and optional target. */
  def findKeyBindings(): js.Array[KeyBinding] = js.native
  /** Get the key bindings for a given command and optional target. */
  def findKeyBindings(params: atomLib.Anon_Keystrokes): js.Array[KeyBinding] = js.native
  // Accessing Bindings
  /** Get all current key bindings. */
  def getKeyBindings(): js.Array[KeyBinding] = js.native
  /**
       *  Get the number of milliseconds allowed before pending states caused by
       *  partial matches of multi-keystroke bindings are terminated.
       */
  def getPartialMatchTimeout(): scala.Double = js.native
  // Managing Keyboard Events
  /**
       *  Dispatch a custom event associated with the matching key binding for the
       *  given `KeyboardEvent` if one can be found.
       */
  def handleKeyboardEvent(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /** Translates a keydown event to a keystroke string. */
  def keystrokeForKeyboardEvent(event: stdLib.KeyboardEvent): java.lang.String = js.native
  // Managing Keymap Files
  /** Load the key bindings from the given path. */
  def loadKeymap(bindingsPath: java.lang.String): scala.Unit = js.native
  // Managing Keymap Files
  /** Load the key bindings from the given path. */
  def loadKeymap(bindingsPath: java.lang.String, options: atomLib.Anon_Watch): scala.Unit = js.native
  /** Invoke the given callback when one or more keystrokes fail to match any bindings. */
  def onDidFailToMatchBinding(callback: js.Function1[/* event */ FailedKeybindingMatchEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when a keymap file not able to be loaded. */
  def onDidFailToReadFile(callback: js.Function1[/* error */ FailedKeymapFileReadEvent, scala.Unit]): Disposable = js.native
  // Event Subscription
  /** Invoke the given callback when one or more keystrokes completely match a key binding. */
  def onDidMatchBinding(callback: js.Function1[/* event */ FullKeybindingMatchEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when one or more keystrokes partially match a binding. */
  def onDidPartiallyMatchBindings(callback: js.Function1[/* event */ PartialKeybindingMatchEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when a keymap file is reloaded. */
  def onDidReloadKeymap(callback: js.Function1[/* event */ KeymapLoadedEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when a keymap file is unloaded. */
  def onDidUnloadKeymap(callback: js.Function1[/* event */ KeymapLoadedEvent, scala.Unit]): Disposable = js.native
  /**
       *  Cause the keymap to reload the key bindings file at the given path whenever
       *  it changes.
       */
  def watchKeymap(filePath: java.lang.String): scala.Unit = js.native
  /**
       *  Cause the keymap to reload the key bindings file at the given path whenever
       *  it changes.
       */
  def watchKeymap(filePath: java.lang.String, options: atomLib.Anon_Priority): scala.Unit = js.native
}

