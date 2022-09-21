package typings.angularCompilerCli.symbolsMod

import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.symbolsMod.SymbolKind.Variable
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableSymbol
  extends StObject
     with Symbol
     with TemplateDeclarationSymbol {
  
  /**
    * The node in the `TemplateAst` where the variable is declared. That is, the node for the `let-`
    * node in the template.
    */
  var declaration: TmplAstVariable
  
  /**
    * The location in the shim file for the initializer node of the variable that represents the
    * template variable.
    */
  var initializerLocation: TcbLocation
  
  var kind: Variable
  
  /**
    * The location in the shim file for the identifier that was declared for the template variable.
    */
  var localVarLocation: TcbLocation
  
  /**
    * The `ts.Symbol` for the context variable.
    *
    * This will be `null` if there is no `ngTemplateContextGuard`.
    */
  var tsSymbol: typings.typescript.mod.Symbol | Null
  
  /**
    * The `ts.Type` of the entity.
    *
    * This will be `any` if there is no `ngTemplateContextGuard`.
    */
  var tsType: Type
}
object VariableSymbol {
  
  inline def apply(
    declaration: TmplAstVariable,
    initializerLocation: TcbLocation,
    kind: Variable,
    localVarLocation: TcbLocation,
    tsType: Type
  ): VariableSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], initializerLocation = initializerLocation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localVarLocation = localVarLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[VariableSymbol]
  }
  
  extension [Self <: VariableSymbol](x: Self) {
    
    inline def setDeclaration(value: TmplAstVariable): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setInitializerLocation(value: TcbLocation): Self = StObject.set(x, "initializerLocation", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Variable): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLocalVarLocation(value: TcbLocation): Self = StObject.set(x, "localVarLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsSymbolNull: Self = StObject.set(x, "tsSymbol", null)
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
