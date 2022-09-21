package typings.angularCompilerCli

import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.rawSourceMapMod.MapAndPath
import typings.angularCompilerCli.sourceFileMod.SourceFile
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceFileLoaderMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps/src/source_file_loader", "SourceFileLoader")
  @js.native
  open class SourceFileLoader protected () extends StObject {
    def this(
      fs: ReadonlyFileSystem,
      logger: Logger,
      /** A map of URL schemes to base paths. The scheme name should be lowercase. */
    schemeMap: Record[String, AbsoluteFsPath]
    ) = this()
    
    /* private */ var currentPaths: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var getLastNonEmptyLine: Any = js.native
    
    /**
      * Load a source file from the file-system, compute its source map, and recursively load any
      * referenced source files.
      *
      * @param sourcePath The path to the source file to load.
      * @returns a SourceFile object if its contents could be loaded from disk, or null otherwise.
      */
    def loadSourceFile(sourcePath: AbsoluteFsPath): SourceFile | Null = js.native
    /**
      * Load a source file from the provided content, compute its source map, and recursively load any
      * referenced source files.
      *
      * @param sourcePath The path to the source file to load.
      * @param contents The contents of the source file to load.
      * @returns a SourceFile object created from the `contents` and computed source-map info.
      */
    def loadSourceFile(sourcePath: AbsoluteFsPath, contents: String): SourceFile = js.native
    /**
      * Load a source file from the provided content and source map, and recursively load any
      * referenced source files.
      *
      * @param sourcePath The path to the source file to load.
      * @param contents The contents of the source file to load.
      * @param mapAndPath The raw source-map and the path to the source-map file.
      * @returns a SourceFile object created from the `contents` and provided source-map info.
      */
    def loadSourceFile(sourcePath: AbsoluteFsPath, contents: String, mapAndPath: MapAndPath): SourceFile = js.native
    
    /**
      * The overload used internally to load source files referenced in a source-map.
      *
      * In this case there is no guarantee that it will return a non-null SourceMap.
      *
      * @param sourcePath The path to the source file to load.
      * @param contents The contents of the source file to load, if provided inline. If `null`,
      *     the contents will be read from the file at the `sourcePath`.
      * @param sourceOrigin Describes where the source content came from.
      * @param sourceMapInfo The raw contents and path of the source-map file. If `null` the
      *     source-map will be computed from the contents of the source file, either inline or loaded
      *     from the file-system.
      *
      * @returns a SourceFile if the content for one was provided or was able to be loaded from disk,
      * `null` otherwise.
      */
    /* private */ var loadSourceFileInternal: Any = js.native
    
    /**
      * Find the source map associated with the source file whose `sourcePath` and `contents` are
      * provided.
      *
      * Source maps can be inline, as part of a base64 encoded comment, or external as a separate file
      * whose path is indicated in a comment or implied from the name of the source file itself.
      *
      * @param sourcePath the path to the source file.
      * @param sourceContents the contents of the source file.
      * @param sourceOrigin where the content of the source file came from.
      * @returns the parsed contents and path of the source-map, if loading was successful, null
      *     otherwise.
      */
    /* private */ var loadSourceMap: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Iterate over each of the "sources" for this source file's source map, recursively loading each
      * source file and its associated source map.
      */
    /* private */ var processSources: Any = js.native
    
    /**
      * Load the source map from the file at `mapPath`, parsing its JSON contents into a `RawSourceMap`
      * object.
      *
      * @param mapPath The path to the source-map file.
      */
    /* private */ var readRawSourceMap: Any = js.native
    
    /**
      * Load the contents of the source file from disk.
      *
      * @param sourcePath The path to the source file.
      */
    /* private */ var readSourceFile: Any = js.native
    
    /**
      * Replace any matched URL schemes with their corresponding path held in the schemeMap.
      *
      * Some build tools replace real file paths with scheme prefixed paths - e.g. `webpack://`.
      * We use the `schemeMap` passed to this class to convert such paths to "real" file paths.
      * In some cases, this is not possible, since the file was actually synthesized by the build tool.
      * But the end result is better than prefixing the sourceRoot in front of the scheme.
      */
    /* private */ var replaceSchemeWithPath: Any = js.native
    
    /** A map of URL schemes to base paths. The scheme name should be lowercase. */
    /* private */ var schemeMap: Any = js.native
    
    /**
      * Track source file paths if we have loaded them from disk so that we don't get into an infinite
      * recursion.
      */
    /* private */ var trackPath: Any = js.native
  }
}
