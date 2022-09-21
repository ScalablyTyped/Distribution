package typings.angularCompilerCli

import typings.angularCompilerCli.adapterMod.NgCompilerAdapter
import typings.angularCompilerCli.anon.Transformers
import typings.angularCompilerCli.checkerMod.OptimizeFor
import typings.angularCompilerCli.checkerMod.TemplateTypeChecker
import typings.angularCompilerCli.compilerMod.CompilationTicketKind.Fresh
import typings.angularCompilerCli.compilerMod.CompilationTicketKind.IncrementalResource
import typings.angularCompilerCli.compilerMod.CompilationTicketKind.IncrementalTypeScript
import typings.angularCompilerCli.incrementalMod.IncrementalCompilation
import typings.angularCompilerCli.indexerSrcApiMod.IndexedComponent
import typings.angularCompilerCli.metadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.metadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.optionsMod.NgCompilerOptions
import typings.angularCompilerCli.perfMod.ActivePerfRecorder
import typings.angularCompilerCli.programDriverSrcApiMod.ProgramDriver
import typings.angularCompilerCli.resourceRegistryMod.ComponentResources
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.stateMod.IncrementalState
import typings.angularCompilerCli.strategyMod.IncrementalBuildStrategy
import typings.angularCompilerCli.xi18nSrcContextMod.Xi18nContext
import typings.std.Map
import typings.std.ReadonlySet
import typings.std.Set
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core/src/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CompilationTicketKind extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/core/src/compiler", "CompilationTicketKind")
  @js.native
  object CompilationTicketKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompilationTicketKind & Double] = js.native
    
    @js.native
    sealed trait Fresh
      extends StObject
         with CompilationTicketKind
    /* 0 */ val Fresh: typings.angularCompilerCli.compilerMod.CompilationTicketKind.Fresh & Double = js.native
    
    @js.native
    sealed trait IncrementalResource
      extends StObject
         with CompilationTicketKind
    /* 2 */ val IncrementalResource: typings.angularCompilerCli.compilerMod.CompilationTicketKind.IncrementalResource & Double = js.native
    
    @js.native
    sealed trait IncrementalTypeScript
      extends StObject
         with CompilationTicketKind
    /* 1 */ val IncrementalTypeScript: typings.angularCompilerCli.compilerMod.CompilationTicketKind.IncrementalTypeScript & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/core/src/compiler", "NgCompiler")
  @js.native
  /* private */ open class NgCompiler () extends StObject {
    
    /* private */ var adapter: Any = js.native
    
    /**
      * Add Angular.io error guide links to diagnostics for this compilation.
      */
    /* private */ var addMessageTextDetails: Any = js.native
    
    /**
      * Perform Angular's analysis step (as a precursor to `getDiagnostics` or `prepareEmit`)
      * asynchronously.
      *
      * Normally, this operation happens lazily whenever `getDiagnostics` or `prepareEmit` are called.
      * However, certain consumers may wish to allow for an asynchronous phase of analysis, where
      * resources such as `styleUrls` are resolved asynchronously. In these cases `analyzeAsync` must
      * be called first, and its `Promise` awaited prior to calling any other APIs of `NgCompiler`.
      */
    def analyzeAsync(): js.Promise[Unit] = js.native
    
    /* private */ var analyzeSync: Any = js.native
    
    /* private */ var closureCompilerEnabled: Any = js.native
    
    /**
      * Lazily evaluated state of the compilation.
      *
      * This is created on demand by calling `ensureAnalyzed`.
      */
    /* private */ var compilation: Any = js.native
    
    /**
      * Any diagnostics related to the construction of the compilation.
      *
      * These are diagnostics which arose during setup of the host and/or program.
      */
    /* private */ var constructionDiagnostics: Any = js.native
    
    /* private */ var currentProgram: Any = js.native
    
    /* private */ var cycleAnalyzer: Any = js.native
    
    /**
      * `NgCompiler` can be reused for multiple compilations (for resource-only changes), and each
      * new compilation uses a fresh `PerfRecorder`. Thus, classes created with a lifespan of the
      * `NgCompiler` use a `DelegatingPerfRecorder` so the `PerfRecorder` they write to can be updated
      * with each fresh compilation.
      */
    /* private */ var delegatingPerfRecorder: Any = js.native
    
    val enableTemplateTypeChecker: Boolean = js.native
    
    /* private */ var ensureAnalyzed: Any = js.native
    
    /* private */ var entryPoint: Any = js.native
    
    /* private */ def fullTemplateTypeCheck: Any = js.native
    
    /**
      * Retrieves external resources for the given component.
      */
    def getComponentResources(classDecl: DeclarationNode): ComponentResources | Null = js.native
    
    /**
      * Retrieves the `ts.Declaration`s for any component(s) which use the given template file.
      */
    def getComponentsWithStyleFile(styleFilePath: String): ReadonlySet[DeclarationNode] = js.native
    
    /**
      * Retrieves the `ts.Declaration`s for any component(s) which use the given template file.
      */
    def getComponentsWithTemplateFile(templateFilePath: String): ReadonlySet[DeclarationNode] = js.native
    
    /**
      * Get the current `ts.Program` known to this `NgCompiler`.
      *
      * Compilation begins with an input `ts.Program`, and during template type-checking operations new
      * `ts.Program`s may be produced using the `ProgramDriver`. The most recent such `ts.Program` to
      * be produced is available here.
      *
      * This `ts.Program` serves two key purposes:
      *
      * * As an incremental starting point for creating the next `ts.Program` based on files that the
      *   user has changed (for clients using the TS compiler program APIs).
      *
      * * As the "before" point for an incremental compilation invocation, to determine what's changed
      *   between the old and new programs (for all compilations).
      */
    def getCurrentProgram(): Program = js.native
    
    /**
      * Get all Angular-related diagnostics for this compilation.
      */
    def getDiagnostics(): js.Array[Diagnostic] = js.native
    
    /**
      * Get all `ts.Diagnostic`s currently available that pertain to the given component.
      */
    def getDiagnosticsForComponent(component: ClassDeclaration): js.Array[Diagnostic] = js.native
    
    /**
      * Get all Angular-related diagnostics for this compilation.
      *
      * If a `ts.SourceFile` is passed, only diagnostics related to that file are returned.
      */
    def getDiagnosticsForFile(file: SourceFile, optimizeFor: OptimizeFor): js.Array[Diagnostic] = js.native
    
    /**
      * Calls the `extendedTemplateCheck` phase of the trait compiler
      * @param sf optional parameter to get diagnostics for a certain file
      *     or all files in the program if `sf` is undefined
      * @returns generated extended template diagnostics
      */
    /* private */ var getExtendedTemplateDiagnostics: Any = js.native
    
    /**
      * Run the indexing process and return a `Map` of all indexed components.
      *
      * See the `indexing` package for more details.
      */
    def getIndexedComponents(): Map[DeclarationNode, IndexedComponent] = js.native
    
    def getMeta(classDecl: DeclarationNode): PipeMeta | DirectiveMeta | Null = js.native
    
    /* private */ var getNonTemplateDiagnostics: Any = js.native
    
    /**
      * Get all setup-related diagnostics for this compilation.
      */
    def getOptionDiagnostics(): js.Array[Diagnostic] = js.native
    
    /**
      * Get the resource dependencies of a file.
      *
      * If the file is not part of the compilation, an empty array will be returned.
      */
    def getResourceDependencies(file: SourceFile): js.Array[String] = js.native
    
    /* private */ var getTemplateDiagnostics: Any = js.native
    
    /* private */ var getTemplateDiagnosticsForFile: Any = js.native
    
    def getTemplateTypeChecker(): TemplateTypeChecker = js.native
    
    /* private */ var getTypeCheckingConfig: Any = js.native
    
    val ignoreForDiagnostics: Set[SourceFile] = js.native
    
    val ignoreForEmit: Set[SourceFile] = js.native
    
    val incrementalCompilation: IncrementalCompilation = js.native
    
    /**
      * Exposes the `IncrementalCompilation` under an old property name that the CLI uses, avoiding a
      * chicken-and-egg problem with the rename to `incrementalCompilation`.
      *
      * TODO(alxhub): remove when the CLI uses the new name.
      */
    def incrementalDriver: IncrementalCompilation = js.native
    
    val incrementalStrategy: IncrementalBuildStrategy = js.native
    
    /* private */ var inputProgram: Any = js.native
    
    /* private */ var livePerfRecorder: Any = js.native
    
    /* private */ var makeCompilation: Any = js.native
    
    /* private */ var moduleResolver: Any = js.native
    
    /**
      * Non-template diagnostics related to the program itself. Does not include template
      * diagnostics because the template type checker memoizes them itself.
      *
      * This is set by (and memoizes) `getNonTemplateDiagnostics`.
      */
    /* private */ var nonTemplateDiagnostics: Any = js.native
    
    val options: NgCompilerOptions = js.native
    
    def perfRecorder: ActivePerfRecorder = js.native
    
    /**
      * Fetch transformers and other information which is necessary for a consumer to `emit` the
      * program with Angular-added definitions.
      */
    def prepareEmit(): Transformers = js.native
    
    val programDriver: ProgramDriver = js.native
    
    /* private */ var resolveCompilation: Any = js.native
    
    /* private */ var resourceManager: Any = js.native
    
    /* private */ var updateWithChangedResources: Any = js.native
    
    val usePoisonedData: Boolean = js.native
    
    /**
      * Collect i18n messages into the `Xi18nContext`.
      */
    def xi18n(ctx: Xi18nContext): Unit = js.native
  }
  /* static members */
  object NgCompiler {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/core/src/compiler", "NgCompiler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert a `CompilationTicket` into an `NgCompiler` instance for the requested compilation.
      *
      * Depending on the nature of the compilation request, the `NgCompiler` instance may be reused
      * from a previous compilation and updated with any changes, it may be a new instance which
      * incrementally reuses state from a previous compilation, or it may represent a fresh
      * compilation entirely.
      */
    inline def fromTicket(ticket: CompilationTicket, adapter: NgCompilerAdapter): NgCompiler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTicket")(ticket.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[NgCompiler]
  }
  
  inline def freshCompilationTicket(
    tsProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    perfRecorder: Null,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("freshCompilationTicket")(tsProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  inline def freshCompilationTicket(
    tsProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    perfRecorder: ActivePerfRecorder,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("freshCompilationTicket")(tsProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  
  inline def incrementalFromCompilerTicket(
    oldCompiler: NgCompiler,
    newProgram: Program,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath]
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromCompilerTicket")(oldCompiler.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  inline def incrementalFromCompilerTicket(
    oldCompiler: NgCompiler,
    newProgram: Program,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath],
    perfRecorder: ActivePerfRecorder
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromCompilerTicket")(oldCompiler.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  
  inline def incrementalFromStateTicket(
    oldProgram: Program,
    oldState: IncrementalState,
    newProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath],
    perfRecorder: Null,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromStateTicket")(oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  inline def incrementalFromStateTicket(
    oldProgram: Program,
    oldState: IncrementalState,
    newProgram: Program,
    options: NgCompilerOptions,
    incrementalBuildStrategy: IncrementalBuildStrategy,
    programDriver: ProgramDriver,
    modifiedResourceFiles: Set[AbsoluteFsPath],
    perfRecorder: ActivePerfRecorder,
    enableTemplateTypeChecker: Boolean,
    usePoisonedData: Boolean
  ): CompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalFromStateTicket")(oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], newProgram.asInstanceOf[js.Any], options.asInstanceOf[js.Any], incrementalBuildStrategy.asInstanceOf[js.Any], programDriver.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder.asInstanceOf[js.Any], enableTemplateTypeChecker.asInstanceOf[js.Any], usePoisonedData.asInstanceOf[js.Any])).asInstanceOf[CompilationTicket]
  
  inline def isAngularCorePackage(program: Program): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngularCorePackage")(program.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resourceChangeTicket(compiler: NgCompiler, modifiedResourceFiles: Set[String]): IncrementalResourceCompilationTicket = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceChangeTicket")(compiler.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any])).asInstanceOf[IncrementalResourceCompilationTicket]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.compilerMod.FreshCompilationTicket_
    - typings.angularCompilerCli.compilerMod.IncrementalTypeScriptCompilationTicket
    - typings.angularCompilerCli.compilerMod.IncrementalResourceCompilationTicket
  */
  trait CompilationTicket extends StObject
  object CompilationTicket {
    
    inline def FreshCompilationTicket_(
      enableTemplateTypeChecker: Boolean,
      incrementalBuildStrategy: IncrementalBuildStrategy,
      kind: Fresh,
      options: NgCompilerOptions,
      perfRecorder: ActivePerfRecorder,
      programDriver: ProgramDriver,
      tsProgram: Program,
      usePoisonedData: Boolean
    ): typings.angularCompilerCli.compilerMod.FreshCompilationTicket_ = {
      val __obj = js.Dynamic.literal(enableTemplateTypeChecker = enableTemplateTypeChecker.asInstanceOf[js.Any], incrementalBuildStrategy = incrementalBuildStrategy.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], perfRecorder = perfRecorder.asInstanceOf[js.Any], programDriver = programDriver.asInstanceOf[js.Any], tsProgram = tsProgram.asInstanceOf[js.Any], usePoisonedData = usePoisonedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.compilerMod.FreshCompilationTicket_]
    }
    
    inline def IncrementalResourceCompilationTicket(
      compiler: NgCompiler,
      kind: IncrementalResource,
      modifiedResourceFiles: Set[String],
      perfRecorder: ActivePerfRecorder
    ): typings.angularCompilerCli.compilerMod.IncrementalResourceCompilationTicket = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], modifiedResourceFiles = modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder = perfRecorder.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.compilerMod.IncrementalResourceCompilationTicket]
    }
    
    inline def IncrementalTypeScriptCompilationTicket(
      enableTemplateTypeChecker: Boolean,
      incrementalBuildStrategy: IncrementalBuildStrategy,
      incrementalCompilation: IncrementalCompilation,
      kind: IncrementalTypeScript,
      newProgram: Program,
      options: NgCompilerOptions,
      perfRecorder: ActivePerfRecorder,
      programDriver: ProgramDriver,
      usePoisonedData: Boolean
    ): typings.angularCompilerCli.compilerMod.IncrementalTypeScriptCompilationTicket = {
      val __obj = js.Dynamic.literal(enableTemplateTypeChecker = enableTemplateTypeChecker.asInstanceOf[js.Any], incrementalBuildStrategy = incrementalBuildStrategy.asInstanceOf[js.Any], incrementalCompilation = incrementalCompilation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], newProgram = newProgram.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], perfRecorder = perfRecorder.asInstanceOf[js.Any], programDriver = programDriver.asInstanceOf[js.Any], usePoisonedData = usePoisonedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.compilerMod.IncrementalTypeScriptCompilationTicket]
    }
  }
  
  trait FreshCompilationTicket_
    extends StObject
       with CompilationTicket {
    
    var enableTemplateTypeChecker: Boolean
    
    var incrementalBuildStrategy: IncrementalBuildStrategy
    
    var kind: Fresh
    
    var options: NgCompilerOptions
    
    var perfRecorder: ActivePerfRecorder
    
    var programDriver: ProgramDriver
    
    var tsProgram: Program
    
    var usePoisonedData: Boolean
  }
  object FreshCompilationTicket_ {
    
    inline def apply(
      enableTemplateTypeChecker: Boolean,
      incrementalBuildStrategy: IncrementalBuildStrategy,
      kind: Fresh,
      options: NgCompilerOptions,
      perfRecorder: ActivePerfRecorder,
      programDriver: ProgramDriver,
      tsProgram: Program,
      usePoisonedData: Boolean
    ): FreshCompilationTicket_ = {
      val __obj = js.Dynamic.literal(enableTemplateTypeChecker = enableTemplateTypeChecker.asInstanceOf[js.Any], incrementalBuildStrategy = incrementalBuildStrategy.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], perfRecorder = perfRecorder.asInstanceOf[js.Any], programDriver = programDriver.asInstanceOf[js.Any], tsProgram = tsProgram.asInstanceOf[js.Any], usePoisonedData = usePoisonedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FreshCompilationTicket_]
    }
    
    extension [Self <: FreshCompilationTicket_](x: Self) {
      
      inline def setEnableTemplateTypeChecker(value: Boolean): Self = StObject.set(x, "enableTemplateTypeChecker", value.asInstanceOf[js.Any])
      
      inline def setIncrementalBuildStrategy(value: IncrementalBuildStrategy): Self = StObject.set(x, "incrementalBuildStrategy", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Fresh): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: NgCompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPerfRecorder(value: ActivePerfRecorder): Self = StObject.set(x, "perfRecorder", value.asInstanceOf[js.Any])
      
      inline def setProgramDriver(value: ProgramDriver): Self = StObject.set(x, "programDriver", value.asInstanceOf[js.Any])
      
      inline def setTsProgram(value: Program): Self = StObject.set(x, "tsProgram", value.asInstanceOf[js.Any])
      
      inline def setUsePoisonedData(value: Boolean): Self = StObject.set(x, "usePoisonedData", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncrementalResourceCompilationTicket
    extends StObject
       with CompilationTicket {
    
    var compiler: NgCompiler
    
    var kind: IncrementalResource
    
    var modifiedResourceFiles: Set[String]
    
    var perfRecorder: ActivePerfRecorder
  }
  object IncrementalResourceCompilationTicket {
    
    inline def apply(
      compiler: NgCompiler,
      kind: IncrementalResource,
      modifiedResourceFiles: Set[String],
      perfRecorder: ActivePerfRecorder
    ): IncrementalResourceCompilationTicket = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], modifiedResourceFiles = modifiedResourceFiles.asInstanceOf[js.Any], perfRecorder = perfRecorder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncrementalResourceCompilationTicket]
    }
    
    extension [Self <: IncrementalResourceCompilationTicket](x: Self) {
      
      inline def setCompiler(value: NgCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setKind(value: IncrementalResource): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModifiedResourceFiles(value: Set[String]): Self = StObject.set(x, "modifiedResourceFiles", value.asInstanceOf[js.Any])
      
      inline def setPerfRecorder(value: ActivePerfRecorder): Self = StObject.set(x, "perfRecorder", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncrementalTypeScriptCompilationTicket
    extends StObject
       with CompilationTicket {
    
    var enableTemplateTypeChecker: Boolean
    
    var incrementalBuildStrategy: IncrementalBuildStrategy
    
    var incrementalCompilation: IncrementalCompilation
    
    var kind: IncrementalTypeScript
    
    var newProgram: Program
    
    var options: NgCompilerOptions
    
    var perfRecorder: ActivePerfRecorder
    
    var programDriver: ProgramDriver
    
    var usePoisonedData: Boolean
  }
  object IncrementalTypeScriptCompilationTicket {
    
    inline def apply(
      enableTemplateTypeChecker: Boolean,
      incrementalBuildStrategy: IncrementalBuildStrategy,
      incrementalCompilation: IncrementalCompilation,
      kind: IncrementalTypeScript,
      newProgram: Program,
      options: NgCompilerOptions,
      perfRecorder: ActivePerfRecorder,
      programDriver: ProgramDriver,
      usePoisonedData: Boolean
    ): IncrementalTypeScriptCompilationTicket = {
      val __obj = js.Dynamic.literal(enableTemplateTypeChecker = enableTemplateTypeChecker.asInstanceOf[js.Any], incrementalBuildStrategy = incrementalBuildStrategy.asInstanceOf[js.Any], incrementalCompilation = incrementalCompilation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], newProgram = newProgram.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], perfRecorder = perfRecorder.asInstanceOf[js.Any], programDriver = programDriver.asInstanceOf[js.Any], usePoisonedData = usePoisonedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncrementalTypeScriptCompilationTicket]
    }
    
    extension [Self <: IncrementalTypeScriptCompilationTicket](x: Self) {
      
      inline def setEnableTemplateTypeChecker(value: Boolean): Self = StObject.set(x, "enableTemplateTypeChecker", value.asInstanceOf[js.Any])
      
      inline def setIncrementalBuildStrategy(value: IncrementalBuildStrategy): Self = StObject.set(x, "incrementalBuildStrategy", value.asInstanceOf[js.Any])
      
      inline def setIncrementalCompilation(value: IncrementalCompilation): Self = StObject.set(x, "incrementalCompilation", value.asInstanceOf[js.Any])
      
      inline def setKind(value: IncrementalTypeScript): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setNewProgram(value: Program): Self = StObject.set(x, "newProgram", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: NgCompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPerfRecorder(value: ActivePerfRecorder): Self = StObject.set(x, "perfRecorder", value.asInstanceOf[js.Any])
      
      inline def setProgramDriver(value: ProgramDriver): Self = StObject.set(x, "programDriver", value.asInstanceOf[js.Any])
      
      inline def setUsePoisonedData(value: Boolean): Self = StObject.set(x, "usePoisonedData", value.asInstanceOf[js.Any])
    }
  }
}
