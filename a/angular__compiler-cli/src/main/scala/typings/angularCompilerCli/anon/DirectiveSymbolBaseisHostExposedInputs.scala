package typings.angularCompilerCli.anon

import typings.angularCompilerCli.angularCompilerCliBooleans.`true`
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DirectiveSymbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TcbLocation
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.std.Record
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/typecheck/api/symbols.DirectiveSymbolBase & {  isHostDirective :true,   exposedInputs :std.Record<string, string> | null,   exposedOutputs :std.Record<string, string> | null} */
trait DirectiveSymbolBaseisHostExposedInputs
  extends StObject
     with DirectiveSymbol {
  
  var exposedInputs: (Record[String, String]) | Null
  
  var exposedOutputs: (Record[String, String]) | Null
  
  /**
    * `true` if this directive is a component.
    */
  var isComponent: Boolean
  
  var isHostDirective: `true`
  
  /**
    * Whether or not this directive is in scope.
    */
  var isInScope: Boolean
  
  /**
    * `true` if this directive is a structural directive.
    */
  var isStructural: Boolean
  
  var kind: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive
  
  /**
    * The module which declares the directive.
    */
  var ngModule: ClassDeclarationDeclarati | Null
  
  var ref: Reference[ClassDeclarationDeclarati]
  
  /**
    * The selector for the directive or component.
    */
  var selector: String | Null
  
  /** The location in the shim file for the variable that holds the type of the directive. */
  var tcbLocation: TcbLocation
  
  /**
    * The `ts.Symbol` for the directive class.
    */
  var tsSymbol: SymbolWithValueDeclaration
  
  /** The `ts.Type` for the class declaration. */
  var tsType: Type
}
object DirectiveSymbolBaseisHostExposedInputs {
  
  inline def apply(
    isComponent: Boolean,
    isInScope: Boolean,
    isStructural: Boolean,
    kind: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive,
    ref: Reference[ClassDeclarationDeclarati],
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): DirectiveSymbolBaseisHostExposedInputs = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isHostDirective = true, isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], exposedInputs = null, exposedOutputs = null, ngModule = null, selector = null)
    __obj.asInstanceOf[DirectiveSymbolBaseisHostExposedInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveSymbolBaseisHostExposedInputs] (val x: Self) extends AnyVal {
    
    inline def setExposedInputs(value: Record[String, String]): Self = StObject.set(x, "exposedInputs", value.asInstanceOf[js.Any])
    
    inline def setExposedInputsNull: Self = StObject.set(x, "exposedInputs", null)
    
    inline def setExposedOutputs(value: Record[String, String]): Self = StObject.set(x, "exposedOutputs", value.asInstanceOf[js.Any])
    
    inline def setExposedOutputsNull: Self = StObject.set(x, "exposedOutputs", null)
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setIsHostDirective(value: `true`): Self = StObject.set(x, "isHostDirective", value.asInstanceOf[js.Any])
    
    inline def setIsInScope(value: Boolean): Self = StObject.set(x, "isInScope", value.asInstanceOf[js.Any])
    
    inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNgModule(value: ClassDeclarationDeclarati): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    inline def setNgModuleNull: Self = StObject.set(x, "ngModule", null)
    
    inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: SymbolWithValueDeclaration): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
