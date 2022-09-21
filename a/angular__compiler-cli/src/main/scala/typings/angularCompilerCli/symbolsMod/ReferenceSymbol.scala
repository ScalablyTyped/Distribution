package typings.angularCompilerCli.symbolsMod

import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompilerCli.symbolsMod.SymbolKind.Reference
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceSymbol
  extends StObject
     with Symbol
     with TemplateDeclarationSymbol {
  
  /**
    * The node in the `TemplateAst` where the symbol is declared. That is, node for the `#ref` or
    * `#ref="exportAs"`.
    */
  var declaration: TmplAstReference
  
  var kind: Reference
  
  /**
    * The location in the TCB for the identifier node in the reference variable declaration.
    * For example, given a variable declaration statement for a template reference:
    * `var _t2 = _t1`, this location is `[_t2 node].getStart()`. This location can
    * be used to find references to the variable within the template.
    */
  var referenceVarLocation: TcbLocation
  
  /**
    * Depending on the type of the reference, this is one of the following:
    *  - `TmplAstElement` when the local ref refers to the HTML element
    *  - `TmplAstTemplate` when the ref refers to an `ng-template`
    *  - `ts.ClassDeclaration` when the local ref refers to a Directive instance (#ref="myExportAs")
    */
  var target: TmplAstElement | TmplAstTemplate | ClassDeclaration
  
  /**
    * The location in the shim file of a variable that holds the type of the local ref.
    * For example, a reference declaration like the following:
    * ```
    * var _t1 = document.createElement('div');
    * var _t2 = _t1; // This is the reference declaration
    * ```
    * This `targetLocation` is `[_t1 variable declaration].getStart()`.
    */
  var targetLocation: TcbLocation
  
  /**
    * The `ts.Symbol` for the Reference value.
    *
    * `TmplAstTemplate` - A `TemplateRef` symbol.
    * `TmplAstElement` - The symbol for the `HTMLElement`.
    * Directive - The symbol for the class declaration of the directive.
    */
  var tsSymbol: typings.typescript.mod.Symbol
  
  /**
    * The `ts.Type` of the Reference value.
    *
    * `TmplAstTemplate` - The type of the `TemplateRef`
    * `TmplAstElement` - The `ts.Type` for the `HTMLElement`.
    * Directive - The `ts.Type` for the class declaration.
    */
  var tsType: Type
}
object ReferenceSymbol {
  
  inline def apply(
    declaration: TmplAstReference,
    kind: Reference,
    referenceVarLocation: TcbLocation,
    target: TmplAstElement | TmplAstTemplate | ClassDeclaration,
    targetLocation: TcbLocation,
    tsSymbol: typings.typescript.mod.Symbol,
    tsType: Type
  ): ReferenceSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], referenceVarLocation = referenceVarLocation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceSymbol]
  }
  
  extension [Self <: ReferenceSymbol](x: Self) {
    
    inline def setDeclaration(value: TmplAstReference): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Reference): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReferenceVarLocation(value: TcbLocation): Self = StObject.set(x, "referenceVarLocation", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: TmplAstElement | TmplAstTemplate | ClassDeclaration): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetLocation(value: TcbLocation): Self = StObject.set(x, "targetLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
