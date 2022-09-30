package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.angularCompilerCli.angularCompilerCliInts.`0`
import typings.angularCompilerCli.angularCompilerCliInts.`1`
import typings.angularCompilerCli.angularCompilerCliStrings.unknown
import typings.angularCompilerCli.fileSystemMod.LogicalFileSystem
import typings.angularCompilerCli.interfacesMod.UnifiedModulesHost
import typings.angularCompilerCli.referencesMod.Reference
import typings.angularCompilerCli.resolverMod.ModuleResolver
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.std.Map
import typings.typescript.mod.Node
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "AbsoluteModuleStrategy")
  @js.native
  open class AbsoluteModuleStrategy protected ()
    extends StObject
       with ReferenceEmitStrategy {
    def this(
      program: Program,
      checker: TypeChecker,
      moduleResolver: ModuleResolver,
      reflectionHost: ReflectionHost
    ) = this()
    
    /* protected */ var checker: TypeChecker = js.native
    
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    /* CompleteClass */
    override def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null = js.native
    
    /* protected */ def enumerateExportsOfModule(specifier: String, fromFile: String): ModuleExports = js.native
    
    /* private */ var getExportsOfModule: Any = js.native
    
    /**
      * A cache of the exports of specific modules, because resolving a module to its exports is a
      * costly operation.
      */
    /* private */ var moduleExportsCache: Any = js.native
    
    /* protected */ var moduleResolver: ModuleResolver = js.native
    
    /* protected */ var program: Program = js.native
    
    /* private */ var reflectionHost: Any = js.native
  }
  
  @js.native
  sealed trait ImportFlags extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "ImportFlags")
  @js.native
  object ImportFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImportFlags & Double] = js.native
    
    /**
      * Indicates that importing from a declaration file using a relative import path is allowed.
      *
      * The generated imports should normally use module specifiers that are valid for use in
      * production code, where arbitrary relative imports into e.g. node_modules are not allowed. For
      * template type-checking code it is however acceptable to use relative imports, as such files are
      * never emitted to JS code.
      *
      * Non-declaration files have to be contained within a configured `rootDir` so using relative
      * paths may not be possible for those, hence this flag only applies when importing from a
      * declaration file.
      */
    @js.native
    sealed trait AllowRelativeDtsImports
      extends StObject
         with ImportFlags
    /* 8 */ val AllowRelativeDtsImports: typings.angularCompilerCli.emitterMod.ImportFlags.AllowRelativeDtsImports & Double = js.native
    
    /**
      * Indicates that an import to a type-only declaration is allowed.
      *
      * For references that occur in type-positions, the referred declaration may be a type-only
      * declaration that is not retained during emit. Including this flag allows to emit references to
      * type-only declarations as used in e.g. template type-checking.
      */
    @js.native
    sealed trait AllowTypeImports
      extends StObject
         with ImportFlags
    /* 4 */ val AllowTypeImports: typings.angularCompilerCli.emitterMod.ImportFlags.AllowTypeImports & Double = js.native
    
    /**
      * Force the generation of a new import when generating a reference, even if an identifier already
      * exists in the target file which could be used instead.
      *
      * This is sometimes required if there's a risk TypeScript might remove imports during emit.
      */
    @js.native
    sealed trait ForceNewImport
      extends StObject
         with ImportFlags
    /* 1 */ val ForceNewImport: typings.angularCompilerCli.emitterMod.ImportFlags.ForceNewImport & Double = js.native
    
    /**
      * Don't make use of any aliasing information when emitting a reference.
      *
      * This is sometimes required if emitting into a context where generated references will be fed
      * into TypeScript and type-checked (such as in template type-checking).
      */
    @js.native
    sealed trait NoAliasing
      extends StObject
         with ImportFlags
    /* 2 */ val NoAliasing: typings.angularCompilerCli.emitterMod.ImportFlags.NoAliasing & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ImportFlags
    /* 0 */ val None: typings.angularCompilerCli.emitterMod.ImportFlags.None & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "LocalIdentifierStrategy")
  @js.native
  open class LocalIdentifierStrategy ()
    extends StObject
       with ReferenceEmitStrategy {
    
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    /* CompleteClass */
    override def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "LogicalProjectStrategy")
  @js.native
  open class LogicalProjectStrategy protected ()
    extends StObject
       with ReferenceEmitStrategy {
    def this(reflector: ReflectionHost, logicalFs: LogicalFileSystem) = this()
    
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    /* CompleteClass */
    override def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null = js.native
    
    /* private */ var logicalFs: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    /* private */ var relativePathStrategy: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "ReferenceEmitter")
  @js.native
  open class ReferenceEmitter protected () extends StObject {
    def this(strategies: js.Array[ReferenceEmitStrategy]) = this()
    
    def emit(ref: Reference[Node], context: SourceFile): ReferenceEmitResult = js.native
    def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult = js.native
    
    /* private */ var strategies: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "RelativePathStrategy")
  @js.native
  open class RelativePathStrategy protected ()
    extends StObject
       with ReferenceEmitStrategy {
    def this(reflector: ReflectionHost) = this()
    
    def emit(ref: Reference[Node], context: SourceFile): ReferenceEmitResult | Null = js.native
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    /* CompleteClass */
    override def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null = js.native
    
    /* private */ var reflector: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/emitter", "UnifiedModulesStrategy")
  @js.native
  open class UnifiedModulesStrategy protected ()
    extends StObject
       with ReferenceEmitStrategy {
    def this(reflector: ReflectionHost, unifiedModulesHost: UnifiedModulesHost) = this()
    
    def emit(ref: Reference[Node], context: SourceFile): EmittedReference | Null = js.native
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    /* CompleteClass */
    override def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null = js.native
    
    /* private */ var reflector: Any = js.native
    
    /* private */ var unifiedModulesHost: Any = js.native
  }
  
  inline def assertSuccessfulReferenceEmit(result: ReferenceEmitResult, origin: Node, typeKind: String): /* asserts result is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(angular,compiler-cli), TsIdentModule(Some(angular),List(compiler-cli, src, ngtsc, imports, src, emitter)), TsIdentSimple(EmittedReference))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertSuccessfulReferenceEmit")(result.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], typeKind.asInstanceOf[js.Any])).asInstanceOf[/* asserts result is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(angular,compiler-cli), TsIdentModule(Some(angular),List(compiler-cli, src, ngtsc, imports, src, emitter)), TsIdentSimple(EmittedReference))),IArray())*/ Boolean]
  
  trait EmittedReference
    extends StObject
       with ReferenceEmitResult {
    
    /**
      * The expression that refers to `Reference`.
      */
    var expression: Expression
    
    /**
      * The `ts.SourceFile` that is imported by `expression`. This is not necessarily the source file
      * of the `Reference`'s declaration node, as the reference may have been rewritten through an
      * alias export. It could also be `null` if `expression` is a local identifier, or `'unknown'` if
      * the exact source file that is being imported is not known to the emitter.
      */
    var importedFile: ImportedFile
    
    var kind: `0`
  }
  object EmittedReference {
    
    inline def apply(expression: Expression): EmittedReference = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], kind = 0, importedFile = null)
      __obj.asInstanceOf[EmittedReference]
    }
    
    extension [Self <: EmittedReference](x: Self) {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setImportedFile(value: ImportedFile): Self = StObject.set(x, "importedFile", value.asInstanceOf[js.Any])
      
      inline def setImportedFileNull: Self = StObject.set(x, "importedFile", null)
      
      inline def setKind(value: `0`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailedEmitResult
    extends StObject
       with ReferenceEmitResult {
    
    /**
      * The source file into which the reference was requested to be emitted.
      */
    var context: SourceFile
    
    var kind: `1`
    
    /**
      * Describes why the reference could not be emitted. This may be shown in a diagnostic.
      */
    var reason: String
    
    /**
      * The reference that could not be emitted.
      */
    var ref: Reference[Node]
  }
  object FailedEmitResult {
    
    inline def apply(context: SourceFile, reason: String, ref: Reference[Node]): FailedEmitResult = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], kind = 1, reason = reason.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailedEmitResult]
    }
    
    extension [Self <: FailedEmitResult](x: Self) {
      
      inline def setContext(value: SourceFile): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setKind(value: `1`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference[Node]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  type ImportedFile = SourceFile | unknown | Null
  
  /**
    * Represents the exported declarations from a module source file.
    */
  trait ModuleExports extends StObject {
    
    /**
      * The map of declarations to their exported name.
      */
    var exportMap: (Map[DeclarationNode, String]) | Null
    
    /**
      * The source file of the module.
      */
    var module: SourceFile | Null
  }
  object ModuleExports {
    
    inline def apply(): ModuleExports = {
      val __obj = js.Dynamic.literal(exportMap = null, module = null)
      __obj.asInstanceOf[ModuleExports]
    }
    
    extension [Self <: ModuleExports](x: Self) {
      
      inline def setExportMap(value: Map[DeclarationNode, String]): Self = StObject.set(x, "exportMap", value.asInstanceOf[js.Any])
      
      inline def setExportMapNull: Self = StObject.set(x, "exportMap", null)
      
      inline def setModule(value: SourceFile): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleNull: Self = StObject.set(x, "module", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliInts.`0`
    - typings.angularCompilerCli.angularCompilerCliInts.`1`
  */
  trait ReferenceEmitKind extends StObject
  object ReferenceEmitKind {
    
    inline def Failed: `1` = 1.asInstanceOf[`1`]
    
    inline def Success: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.emitterMod.EmittedReference
    - typings.angularCompilerCli.emitterMod.FailedEmitResult
  */
  trait ReferenceEmitResult extends StObject
  object ReferenceEmitResult {
    
    inline def EmittedReference(expression: Expression): typings.angularCompilerCli.emitterMod.EmittedReference = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], kind = 0, importedFile = null)
      __obj.asInstanceOf[typings.angularCompilerCli.emitterMod.EmittedReference]
    }
    
    inline def FailedEmitResult(context: SourceFile, reason: String, ref: Reference[Node]): typings.angularCompilerCli.emitterMod.FailedEmitResult = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], kind = 1, reason = reason.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.emitterMod.FailedEmitResult]
    }
  }
  
  trait ReferenceEmitStrategy extends StObject {
    
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null
  }
  object ReferenceEmitStrategy {
    
    inline def apply(emit: (Reference[Node], SourceFile, ImportFlags) => ReferenceEmitResult | Null): ReferenceEmitStrategy = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit))
      __obj.asInstanceOf[ReferenceEmitStrategy]
    }
    
    extension [Self <: ReferenceEmitStrategy](x: Self) {
      
      inline def setEmit(value: (Reference[Node], SourceFile, ImportFlags) => ReferenceEmitResult | Null): Self = StObject.set(x, "emit", js.Any.fromFunction3(value))
    }
  }
}
