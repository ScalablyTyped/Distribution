package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.anon.Command
import typings.atom.anon.Priority
import typings.atom.anon.PriorityNumber
import typings.atom.mod.Disposable
import typings.std.Element
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcKeymapExtensionsMod {
  
  trait AddedKeystrokeResolverEvent extends StObject {
    
    /**
      *  The raw DOM 3 `KeyboardEvent` being resolved. See the DOM API documentation
      *  for more details.
      */
    var event: KeyboardEvent
    
    /**
      *  An object mapping DOM 3 `KeyboardEvent.code` values to objects with the
      *  typed character for that key in each modifier state, based on the current
      *  operating system layout.
      */
    var keymap: js.Object
    
    /**
      *  The currently resolved keystroke string. If your function returns a falsy
      *  value, this is how Atom will resolve your keystroke.
      */
    var keystroke: String
    
    /** The OS-specific name of the current keyboard layout. */
    var layoutName: String
  }
  object AddedKeystrokeResolverEvent {
    
    inline def apply(event: KeyboardEvent, keymap: js.Object, keystroke: String, layoutName: String): AddedKeystrokeResolverEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], keystroke = keystroke.asInstanceOf[js.Any], layoutName = layoutName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddedKeystrokeResolverEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddedKeystrokeResolverEvent] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setKeymap(value: js.Object): Self = StObject.set(x, "keymap", value.asInstanceOf[js.Any])
      
      inline def setKeystroke(value: String): Self = StObject.set(x, "keystroke", value.asInstanceOf[js.Any])
      
      inline def setLayoutName(value: String): Self = StObject.set(x, "layoutName", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailedKeybindingMatchEvent extends StObject {
    
    /** The DOM element that was the target of the most recent keyboard event. */
    var keyboardEventTarget: Element
    
    /** The string of keystrokes that failed to match the binding. */
    var keystrokes: String
  }
  object FailedKeybindingMatchEvent {
    
    inline def apply(keyboardEventTarget: Element, keystrokes: String): FailedKeybindingMatchEvent = {
      val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailedKeybindingMatchEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FailedKeybindingMatchEvent] (val x: Self) extends AnyVal {
      
      inline def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailedKeymapFileReadEvent extends StObject {
    
    /** The error message. */
    var message: String
    
    /** The error stack trace. */
    var stack: String
  }
  object FailedKeymapFileReadEvent {
    
    inline def apply(message: String, stack: String): FailedKeymapFileReadEvent = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailedKeymapFileReadEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FailedKeymapFileReadEvent] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullKeybindingMatchEvent extends StObject {
    
    /** The KeyBinding that the keystrokes matched. */
    var binding: KeyBinding
    
    /** The DOM element that was the target of the most recent keyboard event. */
    var keyboardEventTarget: Element
    
    /** The string of keystrokes that matched the binding. */
    var keystrokes: String
  }
  object FullKeybindingMatchEvent {
    
    inline def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatchEvent = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullKeybindingMatchEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullKeybindingMatchEvent] (val x: Self) extends AnyVal {
      
      inline def setBinding(value: KeyBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyBinding extends StObject {
    
    var command: String
    
    /**
      *  Compare another KeyBinding to this instance.
      *  Returns <= -1 if the argument is considered lesser or of lower priority.
      *  Returns 0 if this binding is equivalent to the argument.
      *  Returns >= 1 if the argument is considered greater or of higher priority.
      */
    def compare(other: KeyBinding): Double
    
    // Properties
    var enabled: Boolean
    
    var keystrokeArray: js.Array[String]
    
    var keystrokeCount: Double
    
    var keystrokes: String
    
    // Comparison
    /** Determines whether the given keystroke matches any contained within this binding. */
    def matches(keystroke: String): Boolean
    
    var selector: String
    
    var source: String
    
    var specificity: Double
  }
  object KeyBinding {
    
    inline def apply(
      command: String,
      compare: KeyBinding => Double,
      enabled: Boolean,
      keystrokeArray: js.Array[String],
      keystrokeCount: Double,
      keystrokes: String,
      matches: String => Boolean,
      selector: String,
      source: String,
      specificity: Double
    ): KeyBinding = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), enabled = enabled.asInstanceOf[js.Any], keystrokeArray = keystrokeArray.asInstanceOf[js.Any], keystrokeCount = keystrokeCount.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyBinding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyBinding] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCompare(value: KeyBinding => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setKeystrokeArray(value: js.Array[String]): Self = StObject.set(x, "keystrokeArray", value.asInstanceOf[js.Any])
      
      inline def setKeystrokeArrayVarargs(value: String*): Self = StObject.set(x, "keystrokeArray", js.Array(value*))
      
      inline def setKeystrokeCount(value: Double): Self = StObject.set(x, "keystrokeCount", value.asInstanceOf[js.Any])
      
      inline def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSpecificity(value: Double): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeymapLoadedEvent extends StObject {
    
    /** The path of the keymap file. */
    var path: String
  }
  object KeymapLoadedEvent {
    
    inline def apply(path: String): KeymapLoadedEvent = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeymapLoadedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeymapLoadedEvent] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeymapManager extends StObject {
    
    /** Add sets of key bindings grouped by CSS selector. */
    def add(source: String, bindings: StringDictionary[StringDictionary[String]]): Disposable = js.native
    def add(source: String, bindings: StringDictionary[StringDictionary[String]], priority: Double): Disposable = js.native
    
    /** Customize translation of raw keyboard events to keystroke strings. */
    def addKeystrokeResolver(resolver: js.Function1[/* event */ AddedKeystrokeResolverEvent, String]): Disposable = js.native
    
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
    def findKeyBindings(params: Command): js.Array[KeyBinding] = js.native
    
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
    def loadKeymap(bindingsPath: String, options: Priority): Unit = js.native
    
    /** Invoke the given callback when one or more keystrokes fail to match any bindings. */
    def onDidFailToMatchBinding(callback: js.Function1[/* event */ FailedKeybindingMatchEvent, Unit]): Disposable = js.native
    
    /** Invoke the given callback when a keymap file not able to be loaded. */
    def onDidFailToReadFile(callback: js.Function1[/* error */ FailedKeymapFileReadEvent, Unit]): Disposable = js.native
    
    // Event Subscription
    /** Invoke the given callback when one or more keystrokes completely match a key binding. */
    def onDidMatchBinding(callback: js.Function1[/* event */ FullKeybindingMatchEvent, Unit]): Disposable = js.native
    
    /** Invoke the given callback when one or more keystrokes partially match a binding. */
    def onDidPartiallyMatchBindings(callback: js.Function1[/* event */ PartialKeybindingMatchEvent, Unit]): Disposable = js.native
    
    /** Invoke the given callback when a keymap file is reloaded. */
    def onDidReloadKeymap(callback: js.Function1[/* event */ KeymapLoadedEvent, Unit]): Disposable = js.native
    
    /** Invoke the given callback when a keymap file is unloaded. */
    def onDidUnloadKeymap(callback: js.Function1[/* event */ KeymapLoadedEvent, Unit]): Disposable = js.native
    
    /**
      *  Cause the keymap to reload the key bindings file at the given path whenever
      *  it changes.
      */
    def watchKeymap(filePath: String): Unit = js.native
    def watchKeymap(filePath: String, options: PriorityNumber): Unit = js.native
  }
  
  trait PartialKeybindingMatchEvent extends StObject {
    
    /** DOM element that was the target of the most recent keyboard event. */
    var keyboardEventTarget: Element
    
    /** The string of keystrokes that matched the binding. */
    var keystrokes: String
    
    /** The KeyBindings that the keystrokes partially matched. */
    var partiallyMatchedBindings: js.Array[KeyBinding]
  }
  object PartialKeybindingMatchEvent {
    
    inline def apply(keyboardEventTarget: Element, keystrokes: String, partiallyMatchedBindings: js.Array[KeyBinding]): PartialKeybindingMatchEvent = {
      val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], partiallyMatchedBindings = partiallyMatchedBindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialKeybindingMatchEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialKeybindingMatchEvent] (val x: Self) extends AnyVal {
      
      inline def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
      
      inline def setPartiallyMatchedBindings(value: js.Array[KeyBinding]): Self = StObject.set(x, "partiallyMatchedBindings", value.asInstanceOf[js.Any])
      
      inline def setPartiallyMatchedBindingsVarargs(value: KeyBinding*): Self = StObject.set(x, "partiallyMatchedBindings", js.Array(value*))
    }
  }
}
