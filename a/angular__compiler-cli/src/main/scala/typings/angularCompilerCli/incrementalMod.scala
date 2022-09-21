package typings.angularCompilerCli

import typings.angularCompilerCli.incrementalApiMod.IncrementalBuild
import typings.angularCompilerCli.perfSrcApiMod.PerfRecorder
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.stateMod.IncrementalState
import typings.std.Map
import typings.std.Set
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incrementalMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalCompilation")
  @js.native
  /* private */ open class IncrementalCompilation ()
    extends typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation
  /* static members */
  object IncrementalCompilation {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalCompilation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Begin a fresh `IncrementalCompilation`.
      */
    inline def fresh(program: Program): typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation = ^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation]
    inline def fresh(program: Program, versions: Map[AbsoluteFsPath, String]): typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("fresh")(program.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation]
    
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Null,
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Null,
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation]
    inline def incremental(
      program: Program,
      newVersions: Map[AbsoluteFsPath, String],
      oldProgram: Program,
      oldState: IncrementalState,
      modifiedResourceFiles: Set[AbsoluteFsPath],
      perf: PerfRecorder
    ): typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation = (^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(program.asInstanceOf[js.Any], newVersions.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any], modifiedResourceFiles.asInstanceOf[js.Any], perf.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcIncrementalMod.IncrementalCompilation]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "IncrementalStateKind")
  @js.native
  object IncrementalStateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.stateMod.IncrementalStateKind & Double] = js.native
    
    /* 2 */ val Analyzed: typings.angularCompilerCli.stateMod.IncrementalStateKind.Analyzed & Double = js.native
    
    /* 1 */ val Delta: typings.angularCompilerCli.stateMod.IncrementalStateKind.Delta & Double = js.native
    
    /* 0 */ val Fresh: typings.angularCompilerCli.stateMod.IncrementalStateKind.Fresh & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "NOOP_INCREMENTAL_BUILD")
  @js.native
  val NOOP_INCREMENTAL_BUILD: IncrementalBuild[Any, Any] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "NoopIncrementalBuildStrategy")
  @js.native
  open class NoopIncrementalBuildStrategy ()
    extends typings.angularCompilerCli.strategyMod.NoopIncrementalBuildStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "PatchedProgramIncrementalBuildStrategy")
  @js.native
  open class PatchedProgramIncrementalBuildStrategy ()
    extends typings.angularCompilerCli.strategyMod.PatchedProgramIncrementalBuildStrategy
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental", "TrackedIncrementalBuildStrategy")
  @js.native
  open class TrackedIncrementalBuildStrategy ()
    extends typings.angularCompilerCli.strategyMod.TrackedIncrementalBuildStrategy
}
