package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3FactoryMetadata
import typings.angularCompiler.mod.R3NgModuleMetadata
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.srcNgtscAnnotationsNgModuleSrcHandlerMod.TopLevelImportedExpression
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/handler.NgModuleAnalysis> */
trait ReadonlyNgModuleAnalysis extends StObject {
  
  val classMetadata: js.UndefOr[R3ClassMetadata | Null] = js.undefined
  
  val declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
  
  val decorator: js.UndefOr[typings.typescript.mod.Decorator | Null] = js.undefined
  
  val exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
  
  val fac: R3FactoryMetadata
  
  val factorySymbolName: String
  
  val id: js.UndefOr[Expression | Null] = js.undefined
  
  val importRefs: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
  
  val imports: js.Array[TopLevelImportedExpression]
  
  val inj: OmitR3InjectorMetadataimp
  
  val mod: R3NgModuleMetadata
  
  val providers: js.UndefOr[typings.typescript.mod.Expression | Null] = js.undefined
  
  val providersRequiringFactory: js.UndefOr[Set[Reference[ClassDeclaration[DeclarationNode]]] | Null] = js.undefined
  
  val rawDeclarations: js.UndefOr[typings.typescript.mod.Expression | Null] = js.undefined
  
  val rawExports: js.UndefOr[typings.typescript.mod.Expression | Null] = js.undefined
  
  val rawImports: js.UndefOr[typings.typescript.mod.Expression | Null] = js.undefined
  
  val remoteScopesMayRequireCycleProtection: Boolean
  
  val schemas: js.Array[SchemaMetadata]
}
object ReadonlyNgModuleAnalysis {
  
  inline def apply(
    declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
    exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
    fac: R3FactoryMetadata,
    factorySymbolName: String,
    importRefs: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
    imports: js.Array[TopLevelImportedExpression],
    inj: OmitR3InjectorMetadataimp,
    mod: R3NgModuleMetadata,
    remoteScopesMayRequireCycleProtection: Boolean,
    schemas: js.Array[SchemaMetadata]
  ): ReadonlyNgModuleAnalysis = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fac = fac.asInstanceOf[js.Any], factorySymbolName = factorySymbolName.asInstanceOf[js.Any], importRefs = importRefs.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], inj = inj.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], remoteScopesMayRequireCycleProtection = remoteScopesMayRequireCycleProtection.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyNgModuleAnalysis]
  }
  
  extension [Self <: ReadonlyNgModuleAnalysis](x: Self) {
    
    inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
    
    inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
    
    inline def setClassMetadataUndefined: Self = StObject.set(x, "classMetadata", js.undefined)
    
    inline def setDeclarations(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setDecorator(value: typings.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    inline def setExports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFac(value: R3FactoryMetadata): Self = StObject.set(x, "fac", value.asInstanceOf[js.Any])
    
    inline def setFactorySymbolName(value: String): Self = StObject.set(x, "factorySymbolName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImportRefs(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "importRefs", value.asInstanceOf[js.Any])
    
    inline def setImportRefsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "importRefs", js.Array(value*))
    
    inline def setImports(value: js.Array[TopLevelImportedExpression]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: TopLevelImportedExpression*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInj(value: OmitR3InjectorMetadataimp): Self = StObject.set(x, "inj", value.asInstanceOf[js.Any])
    
    inline def setMod(value: R3NgModuleMetadata): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: typings.typescript.mod.Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    inline def setProvidersRequiringFactory(value: Set[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "providersRequiringFactory", value.asInstanceOf[js.Any])
    
    inline def setProvidersRequiringFactoryNull: Self = StObject.set(x, "providersRequiringFactory", null)
    
    inline def setProvidersRequiringFactoryUndefined: Self = StObject.set(x, "providersRequiringFactory", js.undefined)
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setRawDeclarations(value: typings.typescript.mod.Expression): Self = StObject.set(x, "rawDeclarations", value.asInstanceOf[js.Any])
    
    inline def setRawDeclarationsNull: Self = StObject.set(x, "rawDeclarations", null)
    
    inline def setRawDeclarationsUndefined: Self = StObject.set(x, "rawDeclarations", js.undefined)
    
    inline def setRawExports(value: typings.typescript.mod.Expression): Self = StObject.set(x, "rawExports", value.asInstanceOf[js.Any])
    
    inline def setRawExportsNull: Self = StObject.set(x, "rawExports", null)
    
    inline def setRawExportsUndefined: Self = StObject.set(x, "rawExports", js.undefined)
    
    inline def setRawImports(value: typings.typescript.mod.Expression): Self = StObject.set(x, "rawImports", value.asInstanceOf[js.Any])
    
    inline def setRawImportsNull: Self = StObject.set(x, "rawImports", null)
    
    inline def setRawImportsUndefined: Self = StObject.set(x, "rawImports", js.undefined)
    
    inline def setRemoteScopesMayRequireCycleProtection(value: Boolean): Self = StObject.set(x, "remoteScopesMayRequireCycleProtection", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
