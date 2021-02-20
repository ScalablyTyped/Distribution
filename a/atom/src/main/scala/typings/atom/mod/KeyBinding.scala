package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBinding extends StObject {
  
  var command: String = js.native
  
  /**
    *  Compare another KeyBinding to this instance.
    *  Returns <= -1 if the argument is considered lesser or of lower priority.
    *  Returns 0 if this binding is equivalent to the argument.
    *  Returns >= 1 if the argument is considered greater or of higher priority.
    */
  def compare(other: KeyBinding): Double = js.native
  
  // Properties
  var enabled: Boolean = js.native
  
  var keystrokeArray: js.Array[String] = js.native
  
  var keystrokeCount: Double = js.native
  
  var keystrokes: String = js.native
  
  // Comparison
  /** Determines whether the given keystroke matches any contained within this binding. */
  def matches(keystroke: String): Boolean = js.native
  
  var selector: String = js.native
  
  var source: String = js.native
  
  var specificity: Double = js.native
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
