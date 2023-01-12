package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection of string-related arguments used on all canvas text interfaces.
  *
  * A possibly much larger string than later rendered is necessary here, because in several languages, glyph selection is context dependent.
  * @since OOo 2.0
  */
trait StringContext extends StObject {
  
  /**
    * Length of the substring to actually use.
    *
    * Must be within the range [0,INTMAX].
    */
  var Length: Double
  
  /**
    * Start position within the string.
    *
    * The first character has index 0.
    */
  var StartPosition: Double
  
  /** The complete text, from which a subset is selected by the parameters below. */
  var Text: String
}
object StringContext {
  
  inline def apply(Length: Double, StartPosition: Double, Text: String): StringContext = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringContext] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
