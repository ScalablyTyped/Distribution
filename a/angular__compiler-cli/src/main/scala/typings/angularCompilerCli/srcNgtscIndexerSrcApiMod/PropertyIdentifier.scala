package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyIdentifier
  extends StObject
     with ExpressionIdentifier
     with TopLevelIdentifier {
  
  @JSName("kind")
  var kind_PropertyIdentifier: Property
}
object PropertyIdentifier {
  
  inline def apply(kind: Property, name: String, span: AbsoluteSourceSpan): PropertyIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[PropertyIdentifier]
  }
  
  extension [Self <: PropertyIdentifier](x: Self) {
    
    inline def setKind(value: Property): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
