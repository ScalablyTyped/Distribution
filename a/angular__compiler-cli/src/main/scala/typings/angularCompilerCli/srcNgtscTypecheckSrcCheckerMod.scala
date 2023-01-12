package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.ProgramDriver
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.TypeCheckScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckingConfig
import typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.TemplateTypeChecker
import typings.angularCompilerCli.srcNgtscTypecheckApiContextMod.ProgramTypeCheckAdapter
import typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.ShimTypeCheckingData
import typings.angularCompilerCli.srcNgtscTypecheckSrcSourceMod.TemplateSourceManager
import typings.std.Map
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcCheckerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/checker", "TemplateTypeCheckerImpl")
  @js.native
  open class TemplateTypeCheckerImpl protected ()
    extends StObject
       with TemplateTypeChecker {
    def this(
      originalProgram: Program,
      programDriver: ProgramDriver,
      typeCheckAdapter: ProgramTypeCheckAdapter,
      config: TypeCheckingConfig,
      refEmitter: ReferenceEmitter,
      reflector: ReflectionHost,
      compilerHost: PickCompilerHostgetCanoni,
      priorBuild: IncrementalBuild[Any, FileTypeCheckingData],
      metaReader: MetadataReader,
      componentScopeReader: ComponentScopeReader,
      typeCheckScopeRegistry: TypeCheckScopeRegistry,
      perf: PerfRecorder
    ) = this()
    
    /**
      * Remove any shim data that depends on inline operations applied to the type-checking program.
      *
      * This can be useful if new inlines need to be applied, and it's not possible to guarantee that
      * they won't overwrite or corrupt existing inlines that are used by such shims.
      */
    def clearAllShimDataUsingInlines(): Unit = js.native
    
    /* private */ var compilerHost: Any = js.native
    
    /**
      * Stores the `CompletionEngine` which powers autocompletion for each component class.
      *
      * Must be invalidated whenever the component's template or the `ts.Program` changes. Invalidation
      * on template changes is performed within this `TemplateTypeCheckerImpl` instance. When the
      * `ts.Program` changes, the `TemplateTypeCheckerImpl` as a whole is destroyed and replaced.
      */
    /* private */ var completionCache: Any = js.native
    
    /* private */ val componentScopeReader: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /**
      * Stores potential element tags for each component (a union of DOM tags as well as directive
      * tags).
      *
      * Unlike other caches, the scope of a component is not affected by its template. It will be
      * destroyed when the `ts.Program` changes and the `TemplateTypeCheckerImpl` as a whole is
      * destroyed and replaced.
      */
    /* private */ var elementTagCache: Any = js.native
    
    /* private */ var ensureAllShimsForAllFiles: Any = js.native
    
    /* private */ var ensureAllShimsForOneFile: Any = js.native
    
    /* private */ var ensureShimForComponent: Any = js.native
    
    /* private */ var getFileAndShimRecordsForPath: Any = js.native
    
    def getFileData(path: AbsoluteFsPath): FileTypeCheckingData = js.native
    
    /* private */ var getFileRecordForTcbLocation: Any = js.native
    
    /* private */ var getLatestComponentState: Any = js.native
    
    /* private */ var getOrCreateCompletionEngine: Any = js.native
    
    /* private */ var getOrCreateSymbolBuilder: Any = js.native
    
    /* private */ var getScopeData: Any = js.native
    
    /* private */ var isComplete: Any = js.native
    
    /* private */ var maybeAdoptPriorResultsForFile: Any = js.native
    
    /* private */ val metaReader: Any = js.native
    
    /* private */ var newContext: Any = js.native
    
    /* private */ var originalProgram: Any = js.native
    
    /* private */ val perf: Any = js.native
    
    /* private */ var priorBuild: Any = js.native
    
    val programDriver: ProgramDriver = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var reflector: Any = js.native
    
    /**
      * Stores directives and pipes that are in scope for each component.
      *
      * Unlike other caches, the scope of a component is not affected by its template. It will be
      * destroyed when the `ts.Program` changes and the `TemplateTypeCheckerImpl` as a whole is
      * destroyed and replaced.
      */
    /* private */ var scopeCache: Any = js.native
    
    /* private */ var state: Any = js.native
    
    /**
      * Stores the `SymbolBuilder` which creates symbols for each component class.
      *
      * Must be invalidated whenever the component's template or the `ts.Program` changes. Invalidation
      * on template changes is performed within this `TemplateTypeCheckerImpl` instance. When the
      * `ts.Program` changes, the `TemplateTypeCheckerImpl` as a whole is destroyed and replaced.
      */
    /* private */ var symbolBuilderCache: Any = js.native
    
    /* private */ var typeCheckAdapter: Any = js.native
    
    /* private */ val typeCheckScopeRegistry: Any = js.native
    
    /* private */ var updateFromContext: Any = js.native
  }
  
  trait FileTypeCheckingData extends StObject {
    
    /**
      * Whether the type-checking shim required any inline changes to the original file, which affects
      * whether the shim can be reused.
      */
    var hasInlines: Boolean
    
    /**
      * Whether the template type-checker is certain that all components from this input file have had
      * type-checking code generated into shims.
      */
    var isComplete: Boolean
    
    /**
      * Data for each shim generated from this input file.
      *
      * A single input file will generate one or more shim files that actually contain template
      * type-checking code.
      */
    var shimData: Map[AbsoluteFsPath, ShimTypeCheckingData]
    
    /**
      * Source mapping information for mapping diagnostics from inlined type check blocks back to the
      * original template.
      */
    var sourceManager: TemplateSourceManager
  }
  object FileTypeCheckingData {
    
    inline def apply(
      hasInlines: Boolean,
      isComplete: Boolean,
      shimData: Map[AbsoluteFsPath, ShimTypeCheckingData],
      sourceManager: TemplateSourceManager
    ): FileTypeCheckingData = {
      val __obj = js.Dynamic.literal(hasInlines = hasInlines.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], shimData = shimData.asInstanceOf[js.Any], sourceManager = sourceManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeCheckingData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileTypeCheckingData] (val x: Self) extends AnyVal {
      
      inline def setHasInlines(value: Boolean): Self = StObject.set(x, "hasInlines", value.asInstanceOf[js.Any])
      
      inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
      
      inline def setShimData(value: Map[AbsoluteFsPath, ShimTypeCheckingData]): Self = StObject.set(x, "shimData", value.asInstanceOf[js.Any])
      
      inline def setSourceManager(value: TemplateSourceManager): Self = StObject.set(x, "sourceManager", value.asInstanceOf[js.Any])
    }
  }
}
