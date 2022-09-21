package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3NgModuleMetadata extends StObject {
  
  /**
    * An expression intended for use by statements that are adjacent (i.e. tightly coupled) to but
    * not internal to a class definition.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var adjacentType: Expression
  
  /**
    * An array of expressions representing the bootstrap components specified by the module.
    */
  var bootstrap: js.Array[R3Reference]
  
  /**
    * Whether to generate closure wrappers for bootstrap, declarations, imports, and exports.
    */
  var containsForwardDecls: Boolean
  
  /**
    * An array of expressions representing the directives and pipes declared by the module.
    */
  var declarations: js.Array[R3Reference]
  
  /**
    * An array of expressions representing the exports of the module.
    */
  var exports: js.Array[R3Reference]
  
  /** Unique ID or expression representing the unique ID of an NgModule. */
  var id: Expression | Null
  
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.Array[R3Reference]
  
  /**
    * Whether or not to include `imports` in generated type declarations.
    */
  var includeImportTypes: Boolean
  
  /**
    * An expression representing the module type being compiled, intended for use within a class
    * definition itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var internalType: Expression
  
  /**
    * Those declarations which should be visible to downstream consumers. If not specified, all
    * declarations are made visible to downstream consumers.
    */
  var publicDeclarationTypes: js.Array[Expression] | Null
  
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    */
  var schemas: js.Array[R3Reference] | Null
  
  /**
    * How to emit the selector scope values (declarations, imports, exports).
    */
  var selectorScopeMode: R3SelectorScopeMode
  
  /**
    * An expression representing the module type being compiled.
    */
  var `type`: R3Reference
}
object R3NgModuleMetadata {
  
  inline def apply(
    adjacentType: Expression,
    bootstrap: js.Array[R3Reference],
    containsForwardDecls: Boolean,
    declarations: js.Array[R3Reference],
    exports: js.Array[R3Reference],
    imports: js.Array[R3Reference],
    includeImportTypes: Boolean,
    internalType: Expression,
    selectorScopeMode: R3SelectorScopeMode,
    `type`: R3Reference
  ): R3NgModuleMetadata = {
    val __obj = js.Dynamic.literal(adjacentType = adjacentType.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any], containsForwardDecls = containsForwardDecls.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], includeImportTypes = includeImportTypes.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], selectorScopeMode = selectorScopeMode.asInstanceOf[js.Any], id = null, publicDeclarationTypes = null, schemas = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadata]
  }
  
  extension [Self <: R3NgModuleMetadata](x: Self) {
    
    inline def setAdjacentType(value: Expression): Self = StObject.set(x, "adjacentType", value.asInstanceOf[js.Any])
    
    inline def setBootstrap(value: js.Array[R3Reference]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapVarargs(value: R3Reference*): Self = StObject.set(x, "bootstrap", js.Array(value*))
    
    inline def setContainsForwardDecls(value: Boolean): Self = StObject.set(x, "containsForwardDecls", value.asInstanceOf[js.Any])
    
    inline def setDeclarations(value: js.Array[R3Reference]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: R3Reference*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setExports(value: js.Array[R3Reference]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: R3Reference*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setImports(value: js.Array[R3Reference]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: R3Reference*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setIncludeImportTypes(value: Boolean): Self = StObject.set(x, "includeImportTypes", value.asInstanceOf[js.Any])
    
    inline def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
    
    inline def setPublicDeclarationTypes(value: js.Array[Expression]): Self = StObject.set(x, "publicDeclarationTypes", value.asInstanceOf[js.Any])
    
    inline def setPublicDeclarationTypesNull: Self = StObject.set(x, "publicDeclarationTypes", null)
    
    inline def setPublicDeclarationTypesVarargs(value: Expression*): Self = StObject.set(x, "publicDeclarationTypes", js.Array(value*))
    
    inline def setSchemas(value: js.Array[R3Reference]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasVarargs(value: R3Reference*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setSelectorScopeMode(value: R3SelectorScopeMode): Self = StObject.set(x, "selectorScopeMode", value.asInstanceOf[js.Any])
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
