package typings.angularCompilerCli

import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.rawSourceMapMod.SourceMapInfo
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngtscSourcemapsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps", "ContentOrigin")
  @js.native
  object ContentOrigin extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.contentOriginMod.ContentOrigin & Double] = js.native
    
    /* 2 */ val FileSystem: typings.angularCompilerCli.contentOriginMod.ContentOrigin.FileSystem & Double = js.native
    
    /* 1 */ val Inline: typings.angularCompilerCli.contentOriginMod.ContentOrigin.Inline & Double = js.native
    
    /* 0 */ val Provided: typings.angularCompilerCli.contentOriginMod.ContentOrigin.Provided & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps", "SourceFile")
  @js.native
  open class SourceFile protected ()
    extends typings.angularCompilerCli.sourceFileMod.SourceFile {
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: Null,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[typings.angularCompilerCli.sourceFileMod.SourceFile | Null],
      fs: PathManipulation
    ) = this()
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: SourceMapInfo,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[typings.angularCompilerCli.sourceFileMod.SourceFile | Null],
      fs: PathManipulation
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps", "SourceFileLoader")
  @js.native
  open class SourceFileLoader protected ()
    extends typings.angularCompilerCli.sourceFileLoaderMod.SourceFileLoader {
    def this(
      fs: ReadonlyFileSystem,
      logger: Logger,
      /** A map of URL schemes to base paths. The scheme name should be lowercase. */
    schemeMap: Record[String, AbsoluteFsPath]
    ) = this()
  }
}
