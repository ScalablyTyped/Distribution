package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateBindingIdentifier extends StObject {
  
  var source: String
  
  var span: AbsoluteSourceSpan
}
object TemplateBindingIdentifier {
  
  inline def apply(source: String, span: AbsoluteSourceSpan): TemplateBindingIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateBindingIdentifier]
  }
  
  extension [Self <: TemplateBindingIdentifier](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: AbsoluteSourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
