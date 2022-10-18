package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscSourcemapsSrcRawSourceMapMod {
  
  trait MapAndPath extends StObject {
    
    /** The raw source map itself. */
    var map: RawSourceMap
    
    /** The path to the source map if it was external or `null` if it was inline. */
    var mapPath: AbsoluteFsPath | Null
  }
  object MapAndPath {
    
    inline def apply(map: RawSourceMap): MapAndPath = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], mapPath = null)
      __obj.asInstanceOf[MapAndPath]
    }
    
    extension [Self <: MapAndPath](x: Self) {
      
      inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapPath(value: AbsoluteFsPath): Self = StObject.set(x, "mapPath", value.asInstanceOf[js.Any])
      
      inline def setMapPathNull: Self = StObject.set(x, "mapPath", null)
    }
  }
  
  trait RawSourceMap extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    var version: Double | String
  }
  object RawSourceMap {
    
    inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double | String): RawSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawSourceMap]
    }
    
    extension [Self <: RawSourceMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapInfo
    extends StObject
       with MapAndPath {
    
    /** From where the content for this source-map came. */
    var origin: ContentOrigin
  }
  object SourceMapInfo {
    
    inline def apply(map: RawSourceMap, origin: ContentOrigin): SourceMapInfo = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], mapPath = null)
      __obj.asInstanceOf[SourceMapInfo]
    }
    
    extension [Self <: SourceMapInfo](x: Self) {
      
      inline def setOrigin(value: ContentOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
