package typings.angularCompilerCli

import typings.angularCompiler.mod.BoundTarget
import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckableDirectiveMeta
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckingConfig
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCtorMetadata
import typings.angularCompilerCli.srcNgtscTypecheckApiContextMod.TypeCheckContext
import typings.angularCompilerCli.srcNgtscTypecheckSrcDomMod.DomSchemaChecker
import typings.angularCompilerCli.srcNgtscTypecheckSrcOobMod.OutOfBandDiagnosticRecorder
import typings.angularCompilerCli.srcNgtscTypecheckSrcSourceMod.TemplateSourceManager
import typings.angularCompilerCli.srcNgtscTypecheckSrcTypeCheckFileMod.TypeCheckFile
import typings.std.Map
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcContextMod {
  
  @js.native
  sealed trait InliningMode extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/context", "InliningMode")
  @js.native
  object InliningMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InliningMode & Double] = js.native
    
    /**
      * Produce diagnostics if an operation would require inlining.
      */
    @js.native
    sealed trait Error
      extends StObject
         with InliningMode
    /* 1 */ val Error: typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.InliningMode.Error & Double = js.native
    
    /**
      * Use inlining operations when required.
      */
    @js.native
    sealed trait InlineOps
      extends StObject
         with InliningMode
    /* 0 */ val InlineOps: typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.InliningMode.InlineOps & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/context", "TypeCheckContextImpl")
  @js.native
  open class TypeCheckContextImpl protected ()
    extends StObject
       with TypeCheckContext {
    def this(
      config: TypeCheckingConfig,
      compilerHost: PickCompilerHostgetCanoni,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      host: TypeCheckingHost,
      inlining: InliningMode,
      perf: PerfRecorder
    ) = this()
    
    /* private */ var addInlineTypeCheckBlock: Any = js.native
    
    /**
      * Record a type constructor for the given `node` with the given `ctorMetadata`.
      */
    def addInlineTypeCtor(
      fileData: PendingFileTypeCheckingData,
      sf: SourceFile,
      ref: Reference[ClassDeclarationClassDecl],
      ctorMeta: TypeCtorMetadata
    ): Unit = js.native
    
    /* private */ var compilerHost: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var dataForFile: Any = js.native
    
    /* private */ var fileMap: Any = js.native
    
    /* private */ var getTemplateDiagnostics: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var inlining: Any = js.native
    
    /**
      * A `Map` of `ts.SourceFile`s that the context has seen to the operations (additions of methods
      * or type-check blocks) that need to be eventually performed on that file.
      */
    /* private */ var opMap: Any = js.native
    
    /* private */ var pendingShimForComponent: Any = js.native
    
    /* private */ var perf: Any = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    /**
      * Transform a `ts.SourceFile` into a version that includes type checking code.
      *
      * If this particular `ts.SourceFile` requires changes, the text representing its new contents
      * will be returned. Otherwise, a `null` return indicates no changes were necessary.
      */
    def transform(sf: SourceFile): String | Null = js.native
    
    /**
      * Tracks when an a particular class has a pending type constructor patching operation already
      * queued.
      */
    /* private */ var typeCtorPending: Any = js.native
  }
  
  trait PendingFileTypeCheckingData extends StObject {
    
    /**
      * Whether any inline code has been required by the shim yet.
      */
    var hasInlines: Boolean
    
    /**
      * Map of in-progress shim data for shims generated from this input file.
      */
    var shimData: Map[AbsoluteFsPath, PendingShimData]
    
    /**
      * Source mapping information for mapping diagnostics from inlined type check blocks back to the
      * original template.
      */
    var sourceManager: TemplateSourceManager
  }
  object PendingFileTypeCheckingData {
    
    inline def apply(
      hasInlines: Boolean,
      shimData: Map[AbsoluteFsPath, PendingShimData],
      sourceManager: TemplateSourceManager
    ): PendingFileTypeCheckingData = {
      val __obj = js.Dynamic.literal(hasInlines = hasInlines.asInstanceOf[js.Any], shimData = shimData.asInstanceOf[js.Any], sourceManager = sourceManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingFileTypeCheckingData]
    }
    
    extension [Self <: PendingFileTypeCheckingData](x: Self) {
      
      inline def setHasInlines(value: Boolean): Self = StObject.set(x, "hasInlines", value.asInstanceOf[js.Any])
      
      inline def setShimData(value: Map[AbsoluteFsPath, PendingShimData]): Self = StObject.set(x, "shimData", value.asInstanceOf[js.Any])
      
      inline def setSourceManager(value: TemplateSourceManager): Self = StObject.set(x, "sourceManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait PendingShimData extends StObject {
    
    /**
      * The `DomSchemaChecker` in use for this template, which records any schema-related diagnostics.
      */
    var domSchemaChecker: DomSchemaChecker
    
    /**
      * Shim file in the process of being generated.
      */
    var file: TypeCheckFile
    
    /**
      * Recorder for out-of-band diagnostics which are raised during generation.
      */
    var oobRecorder: OutOfBandDiagnosticRecorder
    
    /**
      * Map of `TemplateId` to information collected about the template as it's ingested.
      */
    var templates: Map[TemplateId, TemplateData]
  }
  object PendingShimData {
    
    inline def apply(
      domSchemaChecker: DomSchemaChecker,
      file: TypeCheckFile,
      oobRecorder: OutOfBandDiagnosticRecorder,
      templates: Map[TemplateId, TemplateData]
    ): PendingShimData = {
      val __obj = js.Dynamic.literal(domSchemaChecker = domSchemaChecker.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], oobRecorder = oobRecorder.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingShimData]
    }
    
    extension [Self <: PendingShimData](x: Self) {
      
      inline def setDomSchemaChecker(value: DomSchemaChecker): Self = StObject.set(x, "domSchemaChecker", value.asInstanceOf[js.Any])
      
      inline def setFile(value: TypeCheckFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setOobRecorder(value: OutOfBandDiagnosticRecorder): Self = StObject.set(x, "oobRecorder", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: Map[TemplateId, TemplateData]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShimTypeCheckingData extends StObject {
    
    /**
      * Any `ts.Diagnostic`s which were produced during the generation of this shim.
      *
      * Some diagnostics are produced during creation time and are tracked here.
      */
    var genesisDiagnostics: js.Array[TemplateDiagnostic]
    
    /**
      * Whether any inline operations for the input file were required to generate this shim.
      */
    var hasInlines: Boolean
    
    /**
      * Path to the shim file.
      */
    var path: AbsoluteFsPath
    
    /**
      * Map of `TemplateId` to information collected about the template during the template
      * type-checking process.
      */
    var templates: Map[TemplateId, TemplateData]
  }
  object ShimTypeCheckingData {
    
    inline def apply(
      genesisDiagnostics: js.Array[TemplateDiagnostic],
      hasInlines: Boolean,
      path: AbsoluteFsPath,
      templates: Map[TemplateId, TemplateData]
    ): ShimTypeCheckingData = {
      val __obj = js.Dynamic.literal(genesisDiagnostics = genesisDiagnostics.asInstanceOf[js.Any], hasInlines = hasInlines.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShimTypeCheckingData]
    }
    
    extension [Self <: ShimTypeCheckingData](x: Self) {
      
      inline def setGenesisDiagnostics(value: js.Array[TemplateDiagnostic]): Self = StObject.set(x, "genesisDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setGenesisDiagnosticsVarargs(value: TemplateDiagnostic*): Self = StObject.set(x, "genesisDiagnostics", js.Array(value*))
      
      inline def setHasInlines(value: Boolean): Self = StObject.set(x, "hasInlines", value.asInstanceOf[js.Any])
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: Map[TemplateId, TemplateData]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateData extends StObject {
    
    /**
      * `BoundTarget` which was used to generate the TCB, and contains bindings for the associated
      * template nodes.
      */
    var boundTarget: BoundTarget[TypeCheckableDirectiveMeta]
    
    /**
      * Template nodes for which the TCB was generated.
      */
    var template: js.Array[TmplAstNode]
    
    /**
      * Errors found while parsing them template, which have been converted to diagnostics.
      */
    var templateDiagnostics: js.Array[TemplateDiagnostic]
  }
  object TemplateData {
    
    inline def apply(
      boundTarget: BoundTarget[TypeCheckableDirectiveMeta],
      template: js.Array[TmplAstNode],
      templateDiagnostics: js.Array[TemplateDiagnostic]
    ): TemplateData = {
      val __obj = js.Dynamic.literal(boundTarget = boundTarget.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateDiagnostics = templateDiagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateData]
    }
    
    extension [Self <: TemplateData](x: Self) {
      
      inline def setBoundTarget(value: BoundTarget[TypeCheckableDirectiveMeta]): Self = StObject.set(x, "boundTarget", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: js.Array[TmplAstNode]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateDiagnostics(value: js.Array[TemplateDiagnostic]): Self = StObject.set(x, "templateDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setTemplateDiagnosticsVarargs(value: TemplateDiagnostic*): Self = StObject.set(x, "templateDiagnostics", js.Array(value*))
      
      inline def setTemplateVarargs(value: TmplAstNode*): Self = StObject.set(x, "template", js.Array(value*))
    }
  }
  
  trait TypeCheckingHost extends StObject {
    
    /**
      * Retrieve the `TemplateSourceManager` responsible for components in the given input file path.
      */
    def getSourceManager(sfPath: AbsoluteFsPath): TemplateSourceManager
    
    /**
      * Record that all of the components within the given input file path had code generated - that
      * is, coverage for the file can be considered complete.
      */
    def recordComplete(sfPath: AbsoluteFsPath): Unit
    
    /**
      * Report data from a shim generated from the given input file path.
      */
    def recordShimData(sfPath: AbsoluteFsPath, data: ShimTypeCheckingData): Unit
    
    /**
      * Whether a particular component class should be included in the current type-checking pass.
      *
      * Not all components offered to the `TypeCheckContext` for checking may require processing. For
      * example, the component may have results already available from a prior pass or from a previous
      * program.
      */
    def shouldCheckComponent(node: ClassDeclaration): Boolean
  }
  object TypeCheckingHost {
    
    inline def apply(
      getSourceManager: AbsoluteFsPath => TemplateSourceManager,
      recordComplete: AbsoluteFsPath => Unit,
      recordShimData: (AbsoluteFsPath, ShimTypeCheckingData) => Unit,
      shouldCheckComponent: ClassDeclaration => Boolean
    ): TypeCheckingHost = {
      val __obj = js.Dynamic.literal(getSourceManager = js.Any.fromFunction1(getSourceManager), recordComplete = js.Any.fromFunction1(recordComplete), recordShimData = js.Any.fromFunction2(recordShimData), shouldCheckComponent = js.Any.fromFunction1(shouldCheckComponent))
      __obj.asInstanceOf[TypeCheckingHost]
    }
    
    extension [Self <: TypeCheckingHost](x: Self) {
      
      inline def setGetSourceManager(value: AbsoluteFsPath => TemplateSourceManager): Self = StObject.set(x, "getSourceManager", js.Any.fromFunction1(value))
      
      inline def setRecordComplete(value: AbsoluteFsPath => Unit): Self = StObject.set(x, "recordComplete", js.Any.fromFunction1(value))
      
      inline def setRecordShimData(value: (AbsoluteFsPath, ShimTypeCheckingData) => Unit): Self = StObject.set(x, "recordShimData", js.Any.fromFunction2(value))
      
      inline def setShouldCheckComponent(value: ClassDeclaration => Boolean): Self = StObject.set(x, "shouldCheckComponent", js.Any.fromFunction1(value))
    }
  }
}
