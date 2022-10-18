package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Column
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscSourcemapsSrcRawSourceMapMod.RawSourceMap
import typings.angularCompilerCli.srcNgtscSourcemapsSrcRawSourceMapMod.SourceMapInfo
import typings.angularCompilerCli.srcNgtscSourcemapsSrcSegmentMarkerMod.SegmentMarker
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscSourcemapsSrcSourceFileMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps/src/source_file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps/src/source_file", "SourceFile")
  @js.native
  open class SourceFile protected () extends StObject {
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: Null,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[SourceFile | Null],
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
    sources: js.Array[SourceFile | Null],
      fs: PathManipulation
    ) = this()
    
    /** The contents of this source file. */
    val contents: String = js.native
    
    /**
      * Flatten the parsed mappings for this source file, so that all the mappings are to pure original
      * source files with no transitive source maps.
      */
    /* private */ var flattenMappings: Any = js.native
    
    /**
      * The parsed mappings that have been flattened so that any intermediate source mappings have been
      * flattened.
      *
      * The result is that any source file mentioned in the flattened mappings have no source map (are
      * pure original source files).
      */
    val flattenedMappings: js.Array[Mapping] = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Find the original mapped location for the given `line` and `column` in the generated file.
      *
      * First we search for a mapping whose generated segment is at or directly before the given
      * location. Then we compute the offset between the given location and the matching generated
      * segment. Finally we apply this offset to the original source segment to get the desired
      * original location.
      */
    def getOriginalLocation(line: Double, column: Double): Column | Null = js.native
    
    /** The raw source map (if any) referenced by this source file. */
    val rawMap: SourceMapInfo | Null = js.native
    
    /**
      * Render the raw source map generated from the flattened mappings.
      */
    def renderFlattenedSourceMap(): RawSourceMap = js.native
    
    /** The path to this source file. */
    val sourcePath: AbsoluteFsPath = js.native
    
    /** Any source files referenced by the raw source map associated with this source file. */
    val sources: js.Array[SourceFile | Null] = js.native
    
    val startOfLinePositions: js.Array[Double] = js.native
  }
  
  inline def computeStartOfLinePositions(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeStartOfLinePositions")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def ensureOriginalSegmentLinks(mappings: js.Array[Mapping]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureOriginalSegmentLinks")(mappings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def extractOriginalSegments(mappings: js.Array[Mapping]): Map[SourceFile, js.Array[SegmentMarker]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractOriginalSegments")(mappings.asInstanceOf[js.Any]).asInstanceOf[Map[SourceFile, js.Array[SegmentMarker]]]
  
  inline def findLastMappingIndexBefore(mappings: js.Array[Mapping], marker: SegmentMarker, exclusive: Boolean, lowerIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastMappingIndexBefore")(mappings.asInstanceOf[js.Any], marker.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], lowerIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mergeMappings(generatedSource: SourceFile, ab: Mapping, bc: Mapping): Mapping = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMappings")(generatedSource.asInstanceOf[js.Any], ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[Mapping]
  
  inline def parseMappings(
    rawMap: Null,
    sources: js.Array[SourceFile | Null],
    generatedSourceStartOfLinePositions: js.Array[Double]
  ): js.Array[Mapping] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMappings")(rawMap.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], generatedSourceStartOfLinePositions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Mapping]]
  inline def parseMappings(
    rawMap: RawSourceMap,
    sources: js.Array[SourceFile | Null],
    generatedSourceStartOfLinePositions: js.Array[Double]
  ): js.Array[Mapping] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMappings")(rawMap.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], generatedSourceStartOfLinePositions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Mapping]]
  
  inline def removeSourceMapComments(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSourceMapComments")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Mapping extends StObject {
    
    val generatedSegment: SegmentMarker
    
    val name: js.UndefOr[String] = js.undefined
    
    val originalSegment: SegmentMarker
    
    val originalSource: SourceFile
  }
  object Mapping {
    
    inline def apply(generatedSegment: SegmentMarker, originalSegment: SegmentMarker, originalSource: SourceFile): Mapping = {
      val __obj = js.Dynamic.literal(generatedSegment = generatedSegment.asInstanceOf[js.Any], originalSegment = originalSegment.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapping]
    }
    
    extension [Self <: Mapping](x: Self) {
      
      inline def setGeneratedSegment(value: SegmentMarker): Self = StObject.set(x, "generatedSegment", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOriginalSegment(value: SegmentMarker): Self = StObject.set(x, "originalSegment", value.asInstanceOf[js.Any])
      
      inline def setOriginalSource(value: SourceFile): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    }
  }
}
