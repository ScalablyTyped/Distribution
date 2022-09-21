package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the text contents of a placeholder as it appears in an ICU expression, including its
  * source span information.
  */
trait MessagePlaceholder extends StObject {
  
  /** The source span of the placeholder */
  var sourceSpan: ParseSourceSpan
  
  /** The text contents of the placeholder */
  var text: String
}
object MessagePlaceholder {
  
  inline def apply(sourceSpan: ParseSourceSpan, text: String): MessagePlaceholder = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePlaceholder]
  }
  
  extension [Self <: MessagePlaceholder](x: Self) {
    
    inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
