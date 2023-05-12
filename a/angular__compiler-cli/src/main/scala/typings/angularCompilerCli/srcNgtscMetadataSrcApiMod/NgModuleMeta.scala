package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.NgModule
import typings.typescript.mod.Decorator
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgModuleMeta extends StObject {
  
  var declarations: js.Array[Reference[ClassDeclarationDeclarati]]
  
  /**
    * The primary decorator associated with this `ngModule`.
    *
    * If this is `null`, no decorator exists, meaning it's probably from a .d.ts file.
    */
  var decorator: Decorator | Null
  
  var exports: js.Array[Reference[ClassDeclarationDeclarati]]
  
  var imports: js.Array[Reference[ClassDeclarationDeclarati]]
  
  var kind: NgModule
  
  /**
    * Whether this NgModule may declare providers.
    *
    * If the compiler does not know if the NgModule may declare providers, this will be `true` (for
    * example, NgModules declared outside the current compilation are assumed to declare providers).
    */
  var mayDeclareProviders: Boolean
  
  /**
    * The raw `ts.Expression` which gave rise to `declarations`, if one exists.
    *
    * If this is `null`, then either no declarations exist, or no expression was available (likely
    * because the module came from a .d.ts file).
    */
  var rawDeclarations: Expression | Null
  
  /**
    * The raw `ts.Expression` which gave rise to `exports`, if one exists.
    *
    * If this is `null`, then either no exports exist, or no expression was available (likely
    * because the module came from a .d.ts file).
    */
  var rawExports: Expression | Null
  
  /**
    * The raw `ts.Expression` which gave rise to `imports`, if one exists.
    *
    * If this is `null`, then either no imports exist, or no expression was available (likely
    * because the module came from a .d.ts file).
    */
  var rawImports: Expression | Null
  
  var ref: Reference[ClassDeclarationDeclarati]
  
  var schemas: js.Array[SchemaMetadata]
}
object NgModuleMeta {
  
  inline def apply(
    declarations: js.Array[Reference[ClassDeclarationDeclarati]],
    exports: js.Array[Reference[ClassDeclarationDeclarati]],
    imports: js.Array[Reference[ClassDeclarationDeclarati]],
    kind: NgModule,
    mayDeclareProviders: Boolean,
    ref: Reference[ClassDeclarationDeclarati],
    schemas: js.Array[SchemaMetadata]
  ): NgModuleMeta = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], mayDeclareProviders = mayDeclareProviders.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], decorator = null, rawDeclarations = null, rawExports = null, rawImports = null)
    __obj.asInstanceOf[NgModuleMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgModuleMeta] (val x: Self) extends AnyVal {
    
    inline def setDeclarations(value: js.Array[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: Reference[ClassDeclarationDeclarati]*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setExports(value: js.Array[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: Reference[ClassDeclarationDeclarati]*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setImports(value: js.Array[Reference[ClassDeclarationDeclarati]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Reference[ClassDeclarationDeclarati]*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setKind(value: NgModule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMayDeclareProviders(value: Boolean): Self = StObject.set(x, "mayDeclareProviders", value.asInstanceOf[js.Any])
    
    inline def setRawDeclarations(value: Expression): Self = StObject.set(x, "rawDeclarations", value.asInstanceOf[js.Any])
    
    inline def setRawDeclarationsNull: Self = StObject.set(x, "rawDeclarations", null)
    
    inline def setRawExports(value: Expression): Self = StObject.set(x, "rawExports", value.asInstanceOf[js.Any])
    
    inline def setRawExportsNull: Self = StObject.set(x, "rawExports", null)
    
    inline def setRawImports(value: Expression): Self = StObject.set(x, "rawImports", value.asInstanceOf[js.Any])
    
    inline def setRawImportsNull: Self = StObject.set(x, "rawImports", null)
    
    inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
