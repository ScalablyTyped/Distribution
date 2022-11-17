package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputBindingSymbol extends StObject {
  
  /** A single input may be bound to multiple components or directives. */
  var bindings: js.Array[BindingSymbol]
  
  var kind: Input
}
object InputBindingSymbol {
  
  inline def apply(bindings: js.Array[BindingSymbol], kind: Input): InputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputBindingSymbol]
  }
  
  extension [Self <: InputBindingSymbol](x: Self) {
    
    inline def setBindings(value: js.Array[BindingSymbol]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsVarargs(value: BindingSymbol*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setKind(value: Input): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
