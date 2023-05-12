package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialDirective
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface shared between host and non-host directives. */
trait DirectiveSymbolBase
  extends StObject
     with PotentialDirective {
  
  var kind: Directive
  
  /** The location in the shim file for the variable that holds the type of the directive. */
  var tcbLocation: TcbLocation
  
  /** The `ts.Type` for the class declaration. */
  var tsType: Type
}
object DirectiveSymbolBase {
  
  inline def apply(
    isComponent: Boolean,
    isInScope: Boolean,
    isStructural: Boolean,
    kind: Directive,
    ref: Reference[ClassDeclarationDeclarati],
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): DirectiveSymbolBase = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], ngModule = null, selector = null)
    __obj.asInstanceOf[DirectiveSymbolBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveSymbolBase] (val x: Self) extends AnyVal {
    
    inline def setKind(value: Directive): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
