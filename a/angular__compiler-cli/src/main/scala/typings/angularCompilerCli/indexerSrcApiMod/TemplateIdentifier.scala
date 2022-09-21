package typings.angularCompilerCli.indexerSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateIdentifier extends StObject {
  
  var kind: IdentifierKind
  
  var name: String
  
  var span: AbsoluteSourceSpan
}
object TemplateIdentifier {
  
  inline def apply(kind: IdentifierKind, name: String, span: AbsoluteSourceSpan): TemplateIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateIdentifier]
  }
  
  extension [Self <: TemplateIdentifier](x: Self) {
    
    inline def setKind(value: IdentifierKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: AbsoluteSourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
