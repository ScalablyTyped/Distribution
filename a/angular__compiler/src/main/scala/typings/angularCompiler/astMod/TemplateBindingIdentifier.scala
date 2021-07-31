package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateBindingIdentifier extends StObject {
  
  var source: String
  
  var span: AbsoluteSourceSpan
}
object TemplateBindingIdentifier {
  
  @scala.inline
  def apply(source: String, span: AbsoluteSourceSpan): TemplateBindingIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateBindingIdentifier]
  }
  
  @scala.inline
  implicit class TemplateBindingIdentifierMutableBuilder[Self <: TemplateBindingIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: AbsoluteSourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
