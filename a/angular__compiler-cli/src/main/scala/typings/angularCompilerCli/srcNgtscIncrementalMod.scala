package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalState
import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.std.Map
import typings.std.Set
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalCompilation")
  @js.native
  /* private */ open class IncrementalCompilation ()
    extends typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation
  /* static members */
  object IncrementalCompilation {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalCompilation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Begin a fresh `IncrementalCompilation`.
      */
    inline def fresh(program: Program): typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = ^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def fresh(program: Program, versions: Map[AbsoluteFsPath, String]): typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscIncrementalSrcIncrementalMod.IncrementalCompilation]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalStateKind")
  @js.native
  object IncrementalStateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind & Double
      ] = js.native
    
    /* 2 */ val Analyzed: typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Analyzed & Double = js.native
    
    /* 1 */ val Delta: typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Delta & Double = js.native
    
    /* 0 */ val Fresh: typings.angularCompilerCli.srcNgtscIncrementalSrcStateMod.IncrementalStateKind.Fresh & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "NOOP_INCREMENTAL_BUILD")
  @js.native
  val NOOP_INCREMENTAL_BUILD: IncrementalBuild[Any, Any] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "NoopIncrementalBuildStrategy")
  @js.native
  open class NoopIncrementalBuildStrategy ()
    extends typings.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.NoopIncrementalBuildStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "PatchedProgramIncrementalBuildStrategy")
  @js.native
  open class PatchedProgramIncrementalBuildStrategy ()
    extends typings.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.PatchedProgramIncrementalBuildStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "TrackedIncrementalBuildStrategy")
  @js.native
  open class TrackedIncrementalBuildStrategy ()
    extends typings.angularCompilerCli.srcNgtscIncrementalSrcStrategyMod.TrackedIncrementalBuildStrategy
}
