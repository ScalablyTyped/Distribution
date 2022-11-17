package typings.angularCompilerCli

import typings.angularCompiler.mod.InputOutputPropertySet
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Directive
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.NgModule
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Pipe
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.std.Set
import typings.typescript.mod.Decorator
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcApiMod {
  
  @js.native
  sealed trait MetaKind extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/api", "MetaKind")
  @js.native
  object MetaKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MetaKind & Double] = js.native
    
    @js.native
    sealed trait Directive
      extends StObject
         with MetaKind
    /* 0 */ val Directive: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Directive & Double = js.native
    
    @js.native
    sealed trait NgModule
      extends StObject
         with MetaKind
    /* 2 */ val NgModule: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.NgModule & Double = js.native
    
    @js.native
    sealed trait Pipe
      extends StObject
         with MetaKind
    /* 1 */ val Pipe: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Pipe & Double = js.native
  }
  
  trait DirectiveMeta
    extends StObject
       with typings.angularCompiler.mod.DirectiveMeta
       with DirectiveTypeCheckMeta {
    
    /**
      * A `Reference` to the base class for the directive, if one was detected.
      *
      * A value of `'dynamic'` indicates that while the analyzer detected that this directive extends
      * another type, it could not statically determine the base class.
      */
    var baseClass: Reference[ClassDeclaration[DeclarationNode]] | "dynamic" | Null
    
    /**
      * The primary decorator associated with this directive.
      *
      * If this is `null`, no decorator exists, meaning it's probably from a .d.ts file.
      */
    var decorator: Decorator | Null
    
    /**
      * For standalone components, the list of imported types.
      */
    var imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]] | Null
    
    /**
      * Whether the directive had some issue with its declaration that means it might not have complete
      * and reliable metadata.
      */
    var isPoisoned: Boolean
    
    /**
      * Whether the directive is a standalone entity.
      */
    var isStandalone: Boolean
    
    var kind: Directive
    
    var queries: js.Array[String]
    
    var ref: Reference[ClassDeclaration[DeclarationNode]]
    
    /**
      * For standalone components, the list of schemas declared.
      */
    var schemas: js.Array[SchemaMetadata] | Null
  }
  object DirectiveMeta {
    
    inline def apply(
      coercedInputFields: Set[ClassPropertyName],
      hasNgTemplateContextGuard: Boolean,
      inputs: InputOutputPropertySet,
      isComponent: Boolean,
      isGeneric: Boolean,
      isPoisoned: Boolean,
      isStandalone: Boolean,
      isStructural: Boolean,
      kind: Directive,
      name: String,
      ngTemplateGuards: js.Array[TemplateGuardMeta],
      outputs: InputOutputPropertySet,
      queries: js.Array[String],
      ref: Reference[ClassDeclaration[DeclarationNode]],
      restrictedInputFields: Set[ClassPropertyName],
      stringLiteralInputFields: Set[ClassPropertyName],
      undeclaredInputFields: Set[ClassPropertyName]
    ): DirectiveMeta = {
      val __obj = js.Dynamic.literal(coercedInputFields = coercedInputFields.asInstanceOf[js.Any], hasNgTemplateContextGuard = hasNgTemplateContextGuard.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ngTemplateGuards = ngTemplateGuards.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], restrictedInputFields = restrictedInputFields.asInstanceOf[js.Any], stringLiteralInputFields = stringLiteralInputFields.asInstanceOf[js.Any], undeclaredInputFields = undeclaredInputFields.asInstanceOf[js.Any], animationTriggerNames = null, baseClass = null, decorator = null, exportAs = null, imports = null, schemas = null, selector = null)
      __obj.asInstanceOf[DirectiveMeta]
    }
    
    extension [Self <: DirectiveMeta](x: Self) {
      
      inline def setBaseClass(value: Reference[ClassDeclaration[DeclarationNode]] | "dynamic"): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassNull: Self = StObject.set(x, "baseClass", null)
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setImports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsNull: Self = StObject.set(x, "imports", null)
      
      inline def setImportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
      
      inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Directive): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setRef(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
  
  trait DirectiveTypeCheckMeta extends StObject {
    
    /**
      * The set of input fields which have a corresponding static `ngAcceptInputType_` on the
      * Directive's class. This allows inputs to accept a wider range of types and coerce the input to
      * a narrower type with a getter/setter. See https://angular.io/guide/template-typecheck.
      */
    var coercedInputFields: Set[ClassPropertyName]
    
    /**
      * Whether the Directive's class has a static ngTemplateContextGuard function.
      */
    var hasNgTemplateContextGuard: Boolean
    
    /**
      * Whether the Directive's class is generic, i.e. `class MyDir<T> {...}`.
      */
    var isGeneric: Boolean
    
    /**
      * List of static `ngTemplateGuard_xx` members found on the Directive's class.
      * @see `TemplateGuardMeta`
      */
    var ngTemplateGuards: js.Array[TemplateGuardMeta]
    
    /**
      * The set of input fields which map to `readonly`, `private`, or `protected` members in the
      * Directive's class.
      */
    var restrictedInputFields: Set[ClassPropertyName]
    
    /**
      * The set of input fields which are declared as string literal members in the Directive's class.
      * We need to track these separately because these fields may not be valid JS identifiers so
      * we cannot use them with property access expressions when assigning inputs.
      */
    var stringLiteralInputFields: Set[ClassPropertyName]
    
    /**
      * The set of input fields which do not have corresponding members in the Directive's class.
      */
    var undeclaredInputFields: Set[ClassPropertyName]
  }
  object DirectiveTypeCheckMeta {
    
    inline def apply(
      coercedInputFields: Set[ClassPropertyName],
      hasNgTemplateContextGuard: Boolean,
      isGeneric: Boolean,
      ngTemplateGuards: js.Array[TemplateGuardMeta],
      restrictedInputFields: Set[ClassPropertyName],
      stringLiteralInputFields: Set[ClassPropertyName],
      undeclaredInputFields: Set[ClassPropertyName]
    ): DirectiveTypeCheckMeta = {
      val __obj = js.Dynamic.literal(coercedInputFields = coercedInputFields.asInstanceOf[js.Any], hasNgTemplateContextGuard = hasNgTemplateContextGuard.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], ngTemplateGuards = ngTemplateGuards.asInstanceOf[js.Any], restrictedInputFields = restrictedInputFields.asInstanceOf[js.Any], stringLiteralInputFields = stringLiteralInputFields.asInstanceOf[js.Any], undeclaredInputFields = undeclaredInputFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectiveTypeCheckMeta]
    }
    
    extension [Self <: DirectiveTypeCheckMeta](x: Self) {
      
      inline def setCoercedInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "coercedInputFields", value.asInstanceOf[js.Any])
      
      inline def setHasNgTemplateContextGuard(value: Boolean): Self = StObject.set(x, "hasNgTemplateContextGuard", value.asInstanceOf[js.Any])
      
      inline def setIsGeneric(value: Boolean): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      inline def setNgTemplateGuards(value: js.Array[TemplateGuardMeta]): Self = StObject.set(x, "ngTemplateGuards", value.asInstanceOf[js.Any])
      
      inline def setNgTemplateGuardsVarargs(value: TemplateGuardMeta*): Self = StObject.set(x, "ngTemplateGuards", js.Array(value*))
      
      inline def setRestrictedInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "restrictedInputFields", value.asInstanceOf[js.Any])
      
      inline def setStringLiteralInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "stringLiteralInputFields", value.asInstanceOf[js.Any])
      
      inline def setUndeclaredInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "undeclaredInputFields", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataReader extends StObject {
    
    def getDirectiveMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta | Null
    
    def getNgModuleMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): NgModuleMeta | Null
    
    def getPipeMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta | Null
  }
  object MetadataReader {
    
    inline def apply(
      getDirectiveMetadata: Reference[ClassDeclaration[DeclarationNode]] => DirectiveMeta | Null,
      getNgModuleMetadata: Reference[ClassDeclaration[DeclarationNode]] => NgModuleMeta | Null,
      getPipeMetadata: Reference[ClassDeclaration[DeclarationNode]] => PipeMeta | Null
    ): MetadataReader = {
      val __obj = js.Dynamic.literal(getDirectiveMetadata = js.Any.fromFunction1(getDirectiveMetadata), getNgModuleMetadata = js.Any.fromFunction1(getNgModuleMetadata), getPipeMetadata = js.Any.fromFunction1(getPipeMetadata))
      __obj.asInstanceOf[MetadataReader]
    }
    
    extension [Self <: MetadataReader](x: Self) {
      
      inline def setGetDirectiveMetadata(value: Reference[ClassDeclaration[DeclarationNode]] => DirectiveMeta | Null): Self = StObject.set(x, "getDirectiveMetadata", js.Any.fromFunction1(value))
      
      inline def setGetNgModuleMetadata(value: Reference[ClassDeclaration[DeclarationNode]] => NgModuleMeta | Null): Self = StObject.set(x, "getNgModuleMetadata", js.Any.fromFunction1(value))
      
      inline def setGetPipeMetadata(value: Reference[ClassDeclaration[DeclarationNode]] => PipeMeta | Null): Self = StObject.set(x, "getPipeMetadata", js.Any.fromFunction1(value))
    }
  }
  
  trait MetadataRegistry extends StObject {
    
    def registerDirectiveMetadata(meta: DirectiveMeta): Unit
    
    def registerNgModuleMetadata(meta: NgModuleMeta): Unit
    
    def registerPipeMetadata(meta: PipeMeta): Unit
  }
  object MetadataRegistry {
    
    inline def apply(
      registerDirectiveMetadata: DirectiveMeta => Unit,
      registerNgModuleMetadata: NgModuleMeta => Unit,
      registerPipeMetadata: PipeMeta => Unit
    ): MetadataRegistry = {
      val __obj = js.Dynamic.literal(registerDirectiveMetadata = js.Any.fromFunction1(registerDirectiveMetadata), registerNgModuleMetadata = js.Any.fromFunction1(registerNgModuleMetadata), registerPipeMetadata = js.Any.fromFunction1(registerPipeMetadata))
      __obj.asInstanceOf[MetadataRegistry]
    }
    
    extension [Self <: MetadataRegistry](x: Self) {
      
      inline def setRegisterDirectiveMetadata(value: DirectiveMeta => Unit): Self = StObject.set(x, "registerDirectiveMetadata", js.Any.fromFunction1(value))
      
      inline def setRegisterNgModuleMetadata(value: NgModuleMeta => Unit): Self = StObject.set(x, "registerNgModuleMetadata", js.Any.fromFunction1(value))
      
      inline def setRegisterPipeMetadata(value: PipeMeta => Unit): Self = StObject.set(x, "registerPipeMetadata", js.Any.fromFunction1(value))
    }
  }
  
  trait NgModuleMeta extends StObject {
    
    var declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    /**
      * The primary decorator associated with this `ngModule`.
      *
      * If this is `null`, no decorator exists, meaning it's probably from a .d.ts file.
      */
    var decorator: Decorator | Null
    
    var exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var kind: NgModule
    
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
    
    var ref: Reference[ClassDeclaration[DeclarationNode]]
    
    var schemas: js.Array[SchemaMetadata]
  }
  object NgModuleMeta {
    
    inline def apply(
      declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      kind: NgModule,
      ref: Reference[ClassDeclaration[DeclarationNode]],
      schemas: js.Array[SchemaMetadata]
    ): NgModuleMeta = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], decorator = null, rawDeclarations = null, rawExports = null, rawImports = null)
      __obj.asInstanceOf[NgModuleMeta]
    }
    
    extension [Self <: NgModuleMeta](x: Self) {
      
      inline def setDeclarations(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "declarations", js.Array(value*))
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setExports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "exports", js.Array(value*))
      
      inline def setImports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setKind(value: NgModule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setRawDeclarations(value: Expression): Self = StObject.set(x, "rawDeclarations", value.asInstanceOf[js.Any])
      
      inline def setRawDeclarationsNull: Self = StObject.set(x, "rawDeclarations", null)
      
      inline def setRawExports(value: Expression): Self = StObject.set(x, "rawExports", value.asInstanceOf[js.Any])
      
      inline def setRawExportsNull: Self = StObject.set(x, "rawExports", null)
      
      inline def setRawImports(value: Expression): Self = StObject.set(x, "rawImports", value.asInstanceOf[js.Any])
      
      inline def setRawImportsNull: Self = StObject.set(x, "rawImports", null)
      
      inline def setRef(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
  
  trait PipeMeta extends StObject {
    
    var decorator: Decorator | Null
    
    var isStandalone: Boolean
    
    var kind: Pipe
    
    var name: String
    
    var nameExpr: Expression | Null
    
    var ref: Reference[ClassDeclaration[DeclarationNode]]
  }
  object PipeMeta {
    
    inline def apply(isStandalone: Boolean, kind: Pipe, name: String, ref: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta = {
      val __obj = js.Dynamic.literal(isStandalone = isStandalone.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], decorator = null, nameExpr = null)
      __obj.asInstanceOf[PipeMeta]
    }
    
    extension [Self <: PipeMeta](x: Self) {
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
      
      inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Pipe): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameExpr(value: Expression): Self = StObject.set(x, "nameExpr", value.asInstanceOf[js.Any])
      
      inline def setNameExprNull: Self = StObject.set(x, "nameExpr", null)
      
      inline def setRef(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateGuardMeta extends StObject {
    
    /**
      * The input name that this guard should be applied to.
      */
    var inputName: String
    
    /**
      * Represents the type of the template guard.
      *
      * - 'invocation' means that a call to the template guard function is emitted so that its return
      *   type can result in narrowing of the input type.
      * - 'binding' means that the input binding expression itself is used as template guard.
      */
    var `type`: "invocation" | "binding"
  }
  object TemplateGuardMeta {
    
    inline def apply(inputName: String, `type`: "invocation" | "binding"): TemplateGuardMeta = {
      val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateGuardMeta]
    }
    
    extension [Self <: TemplateGuardMeta](x: Self) {
      
      inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      inline def setType(value: "invocation" | "binding"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
