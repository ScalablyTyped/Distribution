package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PickCompilerHostgetSource
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscShimsApiMod.PerFileShimGenerator
import typings.angularCompilerCli.srcNgtscShimsApiMod.TopLevelShimGenerator
import typings.std.Set
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscShimsSrcAdapterMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/adapter", "ShimAdapter")
  @js.native
  open class ShimAdapter protected () extends StObject {
    def this(
      delegate: PickCompilerHostgetSource,
      tsRootFiles: js.Array[AbsoluteFsPath],
      topLevelGenerators: js.Array[TopLevelShimGenerator],
      perFileGenerators: js.Array[PerFileShimGenerator]
    ) = this()
    def this(
      delegate: PickCompilerHostgetSource,
      tsRootFiles: js.Array[AbsoluteFsPath],
      topLevelGenerators: js.Array[TopLevelShimGenerator],
      perFileGenerators: js.Array[PerFileShimGenerator],
      oldProgram: Program
    ) = this()
    
    /* private */ var delegate: Any = js.native
    
    /**
      * Extension prefixes of all installed per-file shims.
      */
    val extensionPrefixes: js.Array[String] = js.native
    
    /**
      * A list of extra filenames which should be considered inputs to program creation.
      *
      * This includes any top-level shims generated for the program, as well as per-file shim names for
      * those files which are included in the root files of the program.
      */
    val extraInputFiles: js.Array[AbsoluteFsPath] = js.native
    
    /* private */ var generateSpecific: Any = js.native
    
    /**
      * The shim generators supported by this adapter as well as extra precalculated data facilitating
      * their use.
      */
    /* private */ var generators: Any = js.native
    
    /**
      * A `Set` of shim `ts.SourceFile`s which should not be emitted.
      */
    val ignoreForEmit: Set[SourceFile] = js.native
    
    /**
      * Produce a shim `ts.SourceFile` if `fileName` refers to a shim file which should exist in the
      * program.
      *
      * If `fileName` does not refer to a potential shim file, `null` is returned. If a corresponding
      * base file could not be determined, `undefined` is returned instead.
      */
    def maybeGenerate(fileName: AbsoluteFsPath): js.UndefOr[SourceFile | Null] = js.native
    
    /**
      * File names which are already known to not be shims.
      *
      * This allows for short-circuit returns without the expense of running regular expressions
      * against the filename repeatedly.
      */
    /* private */ var notShims: Any = js.native
    
    /**
      * A map of shim file names to existing shims which were part of a previous iteration of this
      * program.
      *
      * Not all of these shims will be inherited into this program.
      */
    /* private */ var priorShims: Any = js.native
    
    /**
      * A map of shim file names to the `ts.SourceFile` generated for those shims.
      */
    /* private */ var shims: Any = js.native
  }
}
