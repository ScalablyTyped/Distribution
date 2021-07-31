package typings.atomKeymap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.atomKeymap.anon.Command
import typings.atomKeymap.anon.DefaultTarget
import typings.atomKeymap.anon.Priority
import typings.atomKeymap.anon.PriorityNumber
import typings.atomKeymap.mod.global.AtomKeymap.Events.AddedKeystrokeResolver
import typings.atomKeymap.mod.global.AtomKeymap.Events.FailedKeybindingMatch
import typings.atomKeymap.mod.global.AtomKeymap.Events.FailedKeymapFileRead
import typings.atomKeymap.mod.global.AtomKeymap.Events.FullKeybindingMatch
import typings.atomKeymap.mod.global.AtomKeymap.Events.KeymapLoaded
import typings.atomKeymap.mod.global.AtomKeymap.Events.PartialKeybindingMatch
import typings.atomKeymap.mod.global.AtomKeymap.KeymapManager
import typings.atomKeymap.mod.global.AtomKeymap.KeymapManagerStatic
import typings.atomKeymap.mod.global.AtomKeymap.Options.BuildKeyEvent
import typings.eventKit.mod.Disposable
import typings.std.CustomEvent
import typings.std.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("atom-keymap", JSImport.Namespace)
  @js.native
  /** Create a new KeymapManager. */
  class ^ ()
    extends StObject
       with KeymapManager {
    def this(options: DefaultTarget) = this()
  }
  @JSImport("atom-keymap", JSImport.Namespace)
  @js.native
  val ^ : js.Object & KeymapManagerStatic = js.native
  
  type _To = js.Object & KeymapManagerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & KeymapManagerStatic = ^
  
  object global {
    
    object AtomKeymap {
      
      /**
        *  The event objects that are passed into the callbacks which the user provides to
        *  specific API calls.
        */
      object Events {
        
        trait AddedKeystrokeResolver extends StObject {
          
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
        object AddedKeystrokeResolver {
          
          @scala.inline
          def apply(event: KeyboardEvent, keymap: js.Object, keystroke: String, layoutName: String): AddedKeystrokeResolver = {
            val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], keystroke = keystroke.asInstanceOf[js.Any], layoutName = layoutName.asInstanceOf[js.Any])
            __obj.asInstanceOf[AddedKeystrokeResolver]
          }
          
          @scala.inline
          implicit class AddedKeystrokeResolverMutableBuilder[Self <: AddedKeystrokeResolver] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeymap(value: js.Object): Self = StObject.set(x, "keymap", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeystroke(value: String): Self = StObject.set(x, "keystroke", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLayoutName(value: String): Self = StObject.set(x, "layoutName", value.asInstanceOf[js.Any])
          }
        }
        
        /**
          *  This custom subclass of CustomEvent exists to provide the ::abortKeyBinding
          *  method, as well as versions of the ::stopPropagation methods that record the
          *  intent to stop propagation so event bubbling can be properly simulated for
          *  detached elements.
          */
        @js.native
        trait CommandEvent
          extends StObject
             with CustomEvent[js.Any] {
          
          def abortKeyBinding(): Unit = js.native
          
          var keyBindingAborted: Boolean = js.native
          
          var propagationStopped: Boolean = js.native
        }
        
        trait FailedKeybindingMatch extends StObject {
          
          /** The DOM element that was the target of the most recent keyboard event. */
          var keyboardEventTarget: Element
          
          /** The string of keystrokes that failed to match the binding. */
          var keystrokes: String
        }
        object FailedKeybindingMatch {
          
          @scala.inline
          def apply(keyboardEventTarget: Element, keystrokes: String): FailedKeybindingMatch = {
            val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
            __obj.asInstanceOf[FailedKeybindingMatch]
          }
          
          @scala.inline
          implicit class FailedKeybindingMatchMutableBuilder[Self <: FailedKeybindingMatch] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
          }
        }
        
        trait FailedKeymapFileRead extends StObject {
          
          /** The error message. */
          var message: String
          
          /** The error stack trace. */
          var stack: String
        }
        object FailedKeymapFileRead {
          
          @scala.inline
          def apply(message: String, stack: String): FailedKeymapFileRead = {
            val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
            __obj.asInstanceOf[FailedKeymapFileRead]
          }
          
          @scala.inline
          implicit class FailedKeymapFileReadMutableBuilder[Self <: FailedKeymapFileRead] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
          }
        }
        
        trait FullKeybindingMatch extends StObject {
          
          /** The KeyBinding that the keystrokes matched. */
          var binding: KeyBinding
          
          /** The DOM element that was the target of the most recent keyboard event. */
          var keyboardEventTarget: Element
          
          /** The string of keystrokes that matched the binding. */
          var keystrokes: String
        }
        object FullKeybindingMatch {
          
          @scala.inline
          def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatch = {
            val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
            __obj.asInstanceOf[FullKeybindingMatch]
          }
          
          @scala.inline
          implicit class FullKeybindingMatchMutableBuilder[Self <: FullKeybindingMatch] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setBinding(value: KeyBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
          }
        }
        
        trait KeymapLoaded extends StObject {
          
          /** The path of the keymap file. */
          var path: String
        }
        object KeymapLoaded {
          
          @scala.inline
          def apply(path: String): KeymapLoaded = {
            val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
            __obj.asInstanceOf[KeymapLoaded]
          }
          
          @scala.inline
          implicit class KeymapLoadedMutableBuilder[Self <: KeymapLoaded] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          }
        }
        
        trait PartialKeybindingMatch extends StObject {
          
          /** DOM element that was the target of the most recent keyboard event. */
          var keyboardEventTarget: Element
          
          /** The string of keystrokes that matched the binding. */
          var keystrokes: String
          
          /** The KeyBindings that the keystrokes partially matched. */
          var partiallyMatchedBindings: js.Array[KeyBinding]
        }
        object PartialKeybindingMatch {
          
          @scala.inline
          def apply(keyboardEventTarget: Element, keystrokes: String, partiallyMatchedBindings: js.Array[KeyBinding]): PartialKeybindingMatch = {
            val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], partiallyMatchedBindings = partiallyMatchedBindings.asInstanceOf[js.Any])
            __obj.asInstanceOf[PartialKeybindingMatch]
          }
          
          @scala.inline
          implicit class PartialKeybindingMatchMutableBuilder[Self <: PartialKeybindingMatch] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPartiallyMatchedBindings(value: js.Array[KeyBinding]): Self = StObject.set(x, "partiallyMatchedBindings", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPartiallyMatchedBindingsVarargs(value: KeyBinding*): Self = StObject.set(x, "partiallyMatchedBindings", js.Array(value :_*))
          }
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
        
        @scala.inline
        def apply(
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
        implicit class KeyBindingMutableBuilder[Self <: KeyBinding] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCompare(value: KeyBinding => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
          
          @scala.inline
          def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeystrokeArray(value: js.Array[String]): Self = StObject.set(x, "keystrokeArray", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeystrokeArrayVarargs(value: String*): Self = StObject.set(x, "keystrokeArray", js.Array(value :_*))
          
          @scala.inline
          def setKeystrokeCount(value: Double): Self = StObject.set(x, "keystrokeCount", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMatches(value: String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpecificity(value: Double): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        *  Allows commands to be associated with keystrokes in a context-sensitive way.
        *  In Atom, you can access a global instance of this object via `atom.keymaps`.
        */
      @js.native
      trait KeymapManager extends StObject {
        
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
        
        var defaultTarget: HTMLElement = js.native
        
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
        
        var partialMatchTimeout: Double = js.native
        
        /**
          *  Cause the keymap to reload the key bindings file at the given path whenever
          *  it changes.
          */
        def watchKeymap(filePath: String): Unit = js.native
        def watchKeymap(filePath: String, options: PriorityNumber): Unit = js.native
      }
      
      /** The static side to the KeymapManager class. */
      @js.native
      trait KeymapManagerStatic
        extends StObject
           with /** Create a new KeymapManager. */
      Instantiable0[KeymapManager]
           with Instantiable1[/* options */ DefaultTarget, KeymapManager] {
        
        /** Create a keydown DOM event. */
        def buildKeydownEvent(key: String): Unit = js.native
        def buildKeydownEvent(key: String, options: BuildKeyEvent): Unit = js.native
        
        /** Create a keyup DOM event. */
        def buildKeyupEvent(key: String): Unit = js.native
        def buildKeyupEvent(key: String, options: BuildKeyEvent): Unit = js.native
      }
      
      /**
        *  The option objects that the user is expected to fill out and provide to
        *  specific API calls.
        */
      object Options {
        
        trait BuildKeyEvent extends StObject {
          
          var alt: js.UndefOr[Boolean] = js.undefined
          
          var cmd: js.UndefOr[Boolean] = js.undefined
          
          var ctrl: js.UndefOr[Boolean] = js.undefined
          
          var shift: js.UndefOr[Boolean] = js.undefined
          
          var target: js.UndefOr[Element] = js.undefined
          
          var which: js.UndefOr[Double] = js.undefined
        }
        object BuildKeyEvent {
          
          @scala.inline
          def apply(): BuildKeyEvent = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[BuildKeyEvent]
          }
          
          @scala.inline
          implicit class BuildKeyEventMutableBuilder[Self <: BuildKeyEvent] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
            
            @scala.inline
            def setCmd(value: Boolean): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
            
            @scala.inline
            def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
            
            @scala.inline
            def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
            
            @scala.inline
            def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
            
            @scala.inline
            def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
          }
        }
      }
    }
  }
}
