package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.`static fields`
import typings.angularCompilerCli.angularCompilerCliStrings.angular
import typings.angularCompilerCli.angularCompilerCliStrings.decorators
import typings.angularCompilerCli.angularCompilerCliStrings.error
import typings.angularCompilerCli.angularCompilerCliStrings.ignore
import typings.angularCompilerCli.angularCompilerCliStrings.warning
import typings.angularCompilerCli.anon.CancellationToken
import typings.angularCompilerCli.anon.FilePath
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ResourceHostContext
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.TransformResourceResult
import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.std.Set
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.EmitResult
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import typings.typescript.mod.WriteFileCallback
import typings.typescript.mod.WriteFileCallbackData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersApiMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/transformers/api", "DEFAULT_ERROR_CODE")
  @js.native
  val DEFAULT_ERROR_CODE: /* 100 */ Double = js.native
  
  @js.native
  sealed trait EmitFlags extends StObject
  @JSImport("@angular/compiler-cli/src/transformers/api", "EmitFlags")
  @js.native
  object EmitFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EmitFlags & Double] = js.native
    
    @js.native
    sealed trait All
      extends StObject
         with EmitFlags
    /* 31 */ val All: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.All & Double = js.native
    
    @js.native
    sealed trait Codegen
      extends StObject
         with EmitFlags
    /* 16 */ val Codegen: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.Codegen & Double = js.native
    
    @js.native
    sealed trait DTS
      extends StObject
         with EmitFlags
    /* 1 */ val DTS: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.DTS & Double = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with EmitFlags
    /* 19 */ val Default: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.Default & Double = js.native
    
    @js.native
    sealed trait I18nBundle
      extends StObject
         with EmitFlags
    /* 8 */ val I18nBundle: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.I18nBundle & Double = js.native
    
    @js.native
    sealed trait JS
      extends StObject
         with EmitFlags
    /* 2 */ val JS: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.JS & Double = js.native
    
    @js.native
    sealed trait Metadata
      extends StObject
         with EmitFlags
    /* 4 */ val Metadata: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.Metadata & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/transformers/api", "SOURCE")
  @js.native
  val SOURCE: angular = js.native
  
  @JSImport("@angular/compiler-cli/src/transformers/api", "UNKNOWN_ERROR_CODE")
  @js.native
  val UNKNOWN_ERROR_CODE: /* 500 */ Double = js.native
  
  inline def isTsDiagnostic(diagnostic: Any): /* is typescript.typescript.Diagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTsDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Diagnostic */ Boolean]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ExtendedTsCompilerHost because var conflicts: createHash, directoryExists, getCancellationToken, getCurrentDirectory, getDefaultLibLocation, getDirectories, getEnvironmentVariable, getModuleResolutionCache, getParsedCommandLine, getSourceFileByPath, hasInvalidatedResolutions, readDirectory, realpath, resolveModuleNames, resolveTypeReferenceDirectives, trace, useCaseSensitiveFileNames, writeFile_Original. Inlined resourceNameToFileName, readResource, getModifiedResourceFiles, transformResource, fileNameToModuleName */ @js.native
  trait CompilerHost
    extends StObject
       with typings.typescript.mod.CompilerHost {
    
    /**
      * Produce an AMD module name for the source file. Used in Bazel.
      *
      * An AMD module can have an arbitrary name, so that it is require'd by name
      * rather than by path. See https://requirejs.org/docs/whyamd.html#namedmodules
      */
    var amdModuleName: js.UndefOr[js.Function1[/* sf */ SourceFile, js.UndefOr[String]]] = js.native
    
    var fileNameToModuleName: js.UndefOr[
        js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
      ] = js.native
    
    /**
      * Converts a fileName that was processed by `toSummaryFileName` back into a real fileName
      * given the fileName of the library that is referring to it.
      */
    var fromSummaryFileName: js.UndefOr[js.Function2[/* fileName */ String, /* referringLibFileName */ String, String]] = js.native
    
    var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.native
    
    /**
      * Converts a module name that is used in an `import` to a file path.
      * I.e. `path/to/containingFile.ts` containing `import {...} from 'module-name'`.
      */
    var moduleNameToFileName: js.UndefOr[
        js.Function2[/* moduleName */ String, /* containingFile */ String, String | Null]
      ] = js.native
    
    var readResource: js.UndefOr[js.Function1[/* fileName */ String, js.Promise[String] | String]] = js.native
    
    var resourceNameToFileName: js.UndefOr[
        js.Function3[
          /* resourceName */ String, 
          /* containingFilePath */ String, 
          /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]], 
          String | Null
        ]
      ] = js.native
    
    /**
      * Converts a file name into a representation that should be stored in a summary file.
      * This has to include changing the suffix as well.
      * E.g.
      * `some_file.ts` -> `some_file.d.ts`
      *
      * @param referringSrcFileName the source file that refers to fileName
      */
    var toSummaryFileName: js.UndefOr[js.Function2[/* fileName */ String, /* referringSrcFileName */ String, String]] = js.native
    
    var transformResource: js.UndefOr[
        js.Function2[
          /* data */ String, 
          /* context */ ResourceHostContext, 
          js.Promise[TransformResourceResult | Null]
        ]
      ] = js.native
  }
  
  trait CompilerOptions
    extends StObject
       with NgCompilerOptions {
    
    var annotationsAs: js.UndefOr[decorators | (`static fields`)] = js.undefined
    
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * Whether NGC should generate re-exports for external symbols which are referenced
      * in Angular metadata (e.g. @Component, @Inject, @ViewChild). This can be enabled in
      * order to avoid dynamically generated module dependencies which can break strict
      * dependency enforcements. This is not enabled by default.
      * Read more about this here: https://github.com/angular/angular/issues/25644.
      */
    var createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.undefined
    
    var disableExpressionLowering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to replace the `templateUrl` and `styleUrls` property in all
      * @Component decorators with inlined contents in `template` and `styles`
      * properties.
      * When enabled, the .js output of ngc will have no lazy-loaded `templateUrl`
      * or `styleUrl`s. Note that this requires that resources be available to
      * load statically at compile-time.
      */
    var enableResourceInlining: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to generate .ngsummary.ts files that allow to use AOTed artifacts
      * in JIT mode. This is off by default.
      */
    var enableSummariesForJit: js.UndefOr[Boolean] = js.undefined
    
    var flatModulePrivateSymbolPrefix: js.UndefOr[String] = js.undefined
    
    var genDir: js.UndefOr[String] = js.undefined
    
    var generateCodeForLibraries: js.UndefOr[Boolean] = js.undefined
    
    var i18nInFile: js.UndefOr[String] = js.undefined
    
    var i18nInFormat: js.UndefOr[String] = js.undefined
    
    var i18nInMissingTranslations: js.UndefOr[error | warning | ignore] = js.undefined
    
    var skipMetadataEmit: js.UndefOr[Boolean] = js.undefined
    
    var skipTemplateCodegen: js.UndefOr[Boolean] = js.undefined
    
    var strictMetadataEmit: js.UndefOr[Boolean] = js.undefined
    
    var trace: js.UndefOr[Boolean] = js.undefined
  }
  object CompilerOptions {
    
    inline def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
      
      inline def setAnnotationsAs(value: decorators | (`static fields`)): Self = StObject.set(x, "annotationsAs", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsAsUndefined: Self = StObject.set(x, "annotationsAs", js.undefined)
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setCreateExternalSymbolFactoryReexports(value: Boolean): Self = StObject.set(x, "createExternalSymbolFactoryReexports", value.asInstanceOf[js.Any])
      
      inline def setCreateExternalSymbolFactoryReexportsUndefined: Self = StObject.set(x, "createExternalSymbolFactoryReexports", js.undefined)
      
      inline def setDisableExpressionLowering(value: Boolean): Self = StObject.set(x, "disableExpressionLowering", value.asInstanceOf[js.Any])
      
      inline def setDisableExpressionLoweringUndefined: Self = StObject.set(x, "disableExpressionLowering", js.undefined)
      
      inline def setEnableResourceInlining(value: Boolean): Self = StObject.set(x, "enableResourceInlining", value.asInstanceOf[js.Any])
      
      inline def setEnableResourceInliningUndefined: Self = StObject.set(x, "enableResourceInlining", js.undefined)
      
      inline def setEnableSummariesForJit(value: Boolean): Self = StObject.set(x, "enableSummariesForJit", value.asInstanceOf[js.Any])
      
      inline def setEnableSummariesForJitUndefined: Self = StObject.set(x, "enableSummariesForJit", js.undefined)
      
      inline def setFlatModulePrivateSymbolPrefix(value: String): Self = StObject.set(x, "flatModulePrivateSymbolPrefix", value.asInstanceOf[js.Any])
      
      inline def setFlatModulePrivateSymbolPrefixUndefined: Self = StObject.set(x, "flatModulePrivateSymbolPrefix", js.undefined)
      
      inline def setGenDir(value: String): Self = StObject.set(x, "genDir", value.asInstanceOf[js.Any])
      
      inline def setGenDirUndefined: Self = StObject.set(x, "genDir", js.undefined)
      
      inline def setGenerateCodeForLibraries(value: Boolean): Self = StObject.set(x, "generateCodeForLibraries", value.asInstanceOf[js.Any])
      
      inline def setGenerateCodeForLibrariesUndefined: Self = StObject.set(x, "generateCodeForLibraries", js.undefined)
      
      inline def setI18nInFile(value: String): Self = StObject.set(x, "i18nInFile", value.asInstanceOf[js.Any])
      
      inline def setI18nInFileUndefined: Self = StObject.set(x, "i18nInFile", js.undefined)
      
      inline def setI18nInFormat(value: String): Self = StObject.set(x, "i18nInFormat", value.asInstanceOf[js.Any])
      
      inline def setI18nInFormatUndefined: Self = StObject.set(x, "i18nInFormat", js.undefined)
      
      inline def setI18nInMissingTranslations(value: error | warning | ignore): Self = StObject.set(x, "i18nInMissingTranslations", value.asInstanceOf[js.Any])
      
      inline def setI18nInMissingTranslationsUndefined: Self = StObject.set(x, "i18nInMissingTranslations", js.undefined)
      
      inline def setSkipMetadataEmit(value: Boolean): Self = StObject.set(x, "skipMetadataEmit", value.asInstanceOf[js.Any])
      
      inline def setSkipMetadataEmitUndefined: Self = StObject.set(x, "skipMetadataEmit", js.undefined)
      
      inline def setSkipTemplateCodegen(value: Boolean): Self = StObject.set(x, "skipTemplateCodegen", value.asInstanceOf[js.Any])
      
      inline def setSkipTemplateCodegenUndefined: Self = StObject.set(x, "skipTemplateCodegen", js.undefined)
      
      inline def setStrictMetadataEmit(value: Boolean): Self = StObject.set(x, "strictMetadataEmit", value.asInstanceOf[js.Any])
      
      inline def setStrictMetadataEmitUndefined: Self = StObject.set(x, "strictMetadataEmit", js.undefined)
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  trait CustomTransformers extends StObject {
    
    var afterTs: js.UndefOr[js.Array[TransformerFactory[SourceFile]]] = js.undefined
    
    var beforeTs: js.UndefOr[js.Array[TransformerFactory[SourceFile]]] = js.undefined
  }
  object CustomTransformers {
    
    inline def apply(): CustomTransformers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomTransformers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomTransformers] (val x: Self) extends AnyVal {
      
      inline def setAfterTs(value: js.Array[TransformerFactory[SourceFile]]): Self = StObject.set(x, "afterTs", value.asInstanceOf[js.Any])
      
      inline def setAfterTsUndefined: Self = StObject.set(x, "afterTs", js.undefined)
      
      inline def setAfterTsVarargs(value: TransformerFactory[SourceFile]*): Self = StObject.set(x, "afterTs", js.Array(value*))
      
      inline def setBeforeTs(value: js.Array[TransformerFactory[SourceFile]]): Self = StObject.set(x, "beforeTs", value.asInstanceOf[js.Any])
      
      inline def setBeforeTsUndefined: Self = StObject.set(x, "beforeTs", js.undefined)
      
      inline def setBeforeTsVarargs(value: TransformerFactory[SourceFile]*): Self = StObject.set(x, "beforeTs", js.Array(value*))
    }
  }
  
  trait LazyRoute extends StObject {
    
    var module: FilePath
    
    var referencedModule: FilePath
    
    var route: String
  }
  object LazyRoute {
    
    inline def apply(module: FilePath, referencedModule: FilePath, route: String): LazyRoute = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], referencedModule = referencedModule.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyRoute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LazyRoute] (val x: Self) extends AnyVal {
      
      inline def setModule(value: FilePath): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setReferencedModule(value: FilePath): Self = StObject.set(x, "referencedModule", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Program extends StObject {
    
    /**
      * Emit the files requested by emitFlags implied by the program.
      *
      * Angular structural information is required to emit files.
      */
    def emit(): EmitResult = js.native
    def emit(param0: CancellationToken): EmitResult = js.native
    
    /**
      * Retrieve options diagnostics for the Angular options used to create the program.
      */
    def getNgOptionDiagnostics(): js.Array[Diagnostic] = js.native
    def getNgOptionDiagnostics(cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    
    /**
      * Retrieve the Angular semantic diagnostics.
      *
      * Angular structural information is required to produce these diagnostics.
      */
    def getNgSemanticDiagnostics(): js.Array[Diagnostic] = js.native
    def getNgSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
    def getNgSemanticDiagnostics(fileName: String, cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    def getNgSemanticDiagnostics(fileName: Unit, cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    
    /**
      * Retrieve the diagnostics for the structure of an Angular application is correctly formed.
      * This includes validating Angular annotations and the syntax of referenced and imbedded HTML
      * and CSS.
      *
      * Note it is important to displaying TypeScript semantic diagnostics along with Angular
      * structural diagnostics as an error in the program structure might cause errors detected in
      * semantic analysis and a semantic error might cause errors in specifying the program structure.
      *
      * Angular structural information is required to produce these diagnostics.
      */
    def getNgStructuralDiagnostics(): js.Array[Diagnostic] = js.native
    def getNgStructuralDiagnostics(cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    
    /**
      * Retrieve options diagnostics for the TypeScript options used to create the program. This is
      * faster than calling `getTsProgram().getOptionsDiagnostics()` since it does not need to
      * collect Angular structural information to produce the errors.
      */
    def getTsOptionDiagnostics(): js.Array[Diagnostic] = js.native
    def getTsOptionDiagnostics(cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    
    /**
      * Retrieve the TypeScript program used to produce semantic diagnostics and emit the sources.
      *
      * Angular structural information is required to produce the program.
      */
    def getTsProgram(): typings.typescript.mod.Program = js.native
    
    /**
      * Retrieve the semantic diagnostics from TypeScript. This is equivalent to calling
      * `getTsProgram().getSemanticDiagnostics()` directly and is included for completeness.
      */
    def getTsSemanticDiagnostics(): js.Array[Diagnostic] = js.native
    def getTsSemanticDiagnostics(sourceFile: Unit, cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    def getTsSemanticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
    def getTsSemanticDiagnostics(sourceFile: SourceFile, cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    
    /**
      * Retrieve the syntax diagnostics from TypeScript. This is faster than calling
      * `getTsProgram().getSyntacticDiagnostics()` since it does not need to collect Angular structural
      * information to produce the errors.
      */
    def getTsSyntacticDiagnostics(): js.Array[Diagnostic] = js.native
    def getTsSyntacticDiagnostics(sourceFile: Unit, cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    def getTsSyntacticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
    def getTsSyntacticDiagnostics(sourceFile: SourceFile, cancellationToken: typings.typescript.mod.CancellationToken): js.Array[Diagnostic] = js.native
    
    /**
      * This method is obsolete and always returns an empty array.
      */
    def listLazyRoutes(): js.Array[LazyRoute] = js.native
    def listLazyRoutes(entryRoute: String): js.Array[LazyRoute] = js.native
    
    /**
      * Load Angular structural information asynchronously. If this method is not called then the
      * Angular structural information, including referenced HTML and CSS files, are loaded
      * synchronously. If the supplied Angular compiler host returns a promise from `loadResource()`
      * will produce a diagnostic error message or, `getTsProgram()` or `emit` to throw.
      */
    def loadNgStructureAsync(): js.Promise[Unit] = js.native
  }
  
  trait TsEmitArguments extends StObject {
    
    var cancellationToken: js.UndefOr[typings.typescript.mod.CancellationToken] = js.undefined
    
    var customTransformers: js.UndefOr[typings.typescript.mod.CustomTransformers] = js.undefined
    
    var emitOnlyDtsFiles: js.UndefOr[Boolean] = js.undefined
    
    var host: CompilerHost
    
    var options: CompilerOptions
    
    var program: typings.typescript.mod.Program
    
    var targetSourceFile: js.UndefOr[SourceFile] = js.undefined
    
    var writeFile: js.UndefOr[WriteFileCallback] = js.undefined
  }
  object TsEmitArguments {
    
    inline def apply(host: CompilerHost, options: CompilerOptions, program: typings.typescript.mod.Program): TsEmitArguments = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
      __obj.asInstanceOf[TsEmitArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TsEmitArguments] (val x: Self) extends AnyVal {
      
      inline def setCancellationToken(value: typings.typescript.mod.CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
      
      inline def setCancellationTokenUndefined: Self = StObject.set(x, "cancellationToken", js.undefined)
      
      inline def setCustomTransformers(value: typings.typescript.mod.CustomTransformers): Self = StObject.set(x, "customTransformers", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformersUndefined: Self = StObject.set(x, "customTransformers", js.undefined)
      
      inline def setEmitOnlyDtsFiles(value: Boolean): Self = StObject.set(x, "emitOnlyDtsFiles", value.asInstanceOf[js.Any])
      
      inline def setEmitOnlyDtsFilesUndefined: Self = StObject.set(x, "emitOnlyDtsFiles", js.undefined)
      
      inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: typings.typescript.mod.Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setTargetSourceFile(value: SourceFile): Self = StObject.set(x, "targetSourceFile", value.asInstanceOf[js.Any])
      
      inline def setTargetSourceFileUndefined: Self = StObject.set(x, "targetSourceFile", js.undefined)
      
      inline def setWriteFile(
        value: (/* fileName */ String, /* text */ String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], /* data */ js.UndefOr[WriteFileCallbackData]) => Unit
      ): Self = StObject.set(x, "writeFile", js.Any.fromFunction6(value))
      
      inline def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
    }
  }
  
  type TsEmitCallback = js.Function1[/* args */ TsEmitArguments, EmitResult]
  
  type TsMergeEmitResultsCallback = js.Function1[/* results */ js.Array[EmitResult], EmitResult]
}
