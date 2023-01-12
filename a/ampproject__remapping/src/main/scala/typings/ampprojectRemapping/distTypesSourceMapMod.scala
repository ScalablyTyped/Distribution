package typings.ampprojectRemapping

import typings.ampprojectRemapping.ampprojectRemappingInts.`3`
import typings.ampprojectRemapping.distTypesTypesMod.Options
import typings.jridgewellGenMapping.mod.GenMapping
import typings.jridgewellTraceMapping.distTypesSourcemapSegmentMod.SourceMapSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSourceMapMod {
  
  @JSImport("@ampproject/remapping/dist/types/source-map", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SourceMap {
    def this(map: GenMapping, options: Options) = this()
    
    /* CompleteClass */
    var mappings: String | js.Array[js.Array[SourceMapSegment]] = js.native
    
    /* CompleteClass */
    var names: js.Array[String] = js.native
    
    /* CompleteClass */
    var sources: js.Array[String | Null] = js.native
    
    /* CompleteClass */
    var version: `3` = js.native
  }
  
  trait SourceMap extends StObject {
    
    var file: js.UndefOr[String | Null] = js.undefined
    
    var mappings: String | js.Array[js.Array[SourceMapSegment]]
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String | Null]
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    var version: `3`
  }
  object SourceMap {
    
    inline def apply(
      mappings: String | js.Array[js.Array[SourceMapSegment]],
      names: js.Array[String],
      sources: js.Array[String | Null]
    ): SourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[SourceMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMap] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: String | js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value*))
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String | Null]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: (String | Null)*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
