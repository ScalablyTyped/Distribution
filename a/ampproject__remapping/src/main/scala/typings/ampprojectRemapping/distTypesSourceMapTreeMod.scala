package typings.ampprojectRemapping

import typings.jridgewellGenMapping.mod.GenMapping
import typings.jridgewellTraceMapping.mod.TraceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSourceMapTreeMod {
  
  @JSImport("@ampproject/remapping/dist/types/source-map-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MapSource
    extends StObject
       with Sources {
    
    var content: Null
    
    var map: TraceMap
    
    var source: String
    
    var sources: js.Array[Sources]
  }
  object MapSource {
    
    @JSImport("@ampproject/remapping/dist/types/source-map-tree", "MapSource")
    @js.native
    def apply(map: TraceMap, sources: js.Array[Sources]): MapSource = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapSource] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMap(value: TraceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[Sources]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: Sources*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  trait OriginalSource
    extends StObject
       with Sources {
    
    var content: String | Null
    
    var map: Null
    
    var source: String
    
    var sources: js.Array[Sources]
  }
  object OriginalSource {
    
    @JSImport("@ampproject/remapping/dist/types/source-map-tree", "OriginalSource")
    @js.native
    def apply(source: String): OriginalSource = js.native
    @JSImport("@ampproject/remapping/dist/types/source-map-tree", "OriginalSource")
    @js.native
    def apply(source: String, content: String): OriginalSource = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OriginalSource] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setMap(value: Null): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[Sources]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: Sources*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  inline def originalPositionFor(source: Sources, line: Double, column: Double, name: String): SourceMapSegmentObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("originalPositionFor")(source.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SourceMapSegmentObject | Null]
  
  inline def traceMappings(tree: MapSource): GenMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("traceMappings")(tree.asInstanceOf[js.Any]).asInstanceOf[GenMapping]
  
  trait SourceMapSegmentObject extends StObject {
    
    var column: Double
    
    var content: String | Null
    
    var line: Double
    
    var name: String
    
    var source: String
  }
  object SourceMapSegmentObject {
    
    inline def apply(column: Double, line: Double, name: String, source: String): SourceMapSegmentObject = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[SourceMapSegmentObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapSegmentObject] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ampprojectRemapping.distTypesSourceMapTreeMod.OriginalSource
    - typings.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource
  */
  trait Sources extends StObject
  object Sources {
    
    inline def MapSource(content: Null, map: TraceMap, source: String, sources: js.Array[Sources]): typings.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource]
    }
    
    inline def OriginalSource(map: Null, source: String, sources: js.Array[Sources]): typings.ampprojectRemapping.distTypesSourceMapTreeMod.OriginalSource = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[typings.ampprojectRemapping.distTypesSourceMapTreeMod.OriginalSource]
    }
  }
}
