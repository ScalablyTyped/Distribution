package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.DirectiveInScope
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveSymbol
  extends StObject
     with DirectiveInScope
     with Symbol {
  
  var kind: Directive
  
  /** The location in the shim file for the variable that holds the type of the directive. */
  var tcbLocation: TcbLocation
  
  /** The `ts.Type` for the class declaration. */
  var tsType: Type
}
object DirectiveSymbol {
  
  inline def apply(
    isComponent: Boolean,
    isStructural: Boolean,
    kind: Directive,
    selector: String,
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): DirectiveSymbol = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], ngModule = null)
    __obj.asInstanceOf[DirectiveSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveSymbol] (val x: Self) extends AnyVal {
    
    inline def setKind(value: Directive): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
