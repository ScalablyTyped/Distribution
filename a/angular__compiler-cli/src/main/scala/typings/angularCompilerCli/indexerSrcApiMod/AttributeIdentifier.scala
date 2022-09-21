package typings.angularCompilerCli.indexerSrcApiMod

import typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeIdentifier
  extends StObject
     with TemplateIdentifier {
  
  @JSName("kind")
  var kind_AttributeIdentifier: Attribute
}
object AttributeIdentifier {
  
  inline def apply(kind: Attribute, name: String, span: AbsoluteSourceSpan): AttributeIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeIdentifier]
  }
  
  extension [Self <: AttributeIdentifier](x: Self) {
    
    inline def setKind(value: Attribute): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
