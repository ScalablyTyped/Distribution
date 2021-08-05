package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapMod {
  
  @JSImport("@angular/compiler/src/output/source_map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/output/source_map", "SourceMapGenerator")
  @js.native
  class SourceMapGenerator () extends StObject {
    def this(file: String) = this()
    
    def addLine(): this.type = js.native
    
    def addMapping(col0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String, sourceLine0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String, sourceLine0: Double, sourceCol0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String, sourceLine0: Unit, sourceCol0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: Unit, sourceLine0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: Unit, sourceLine0: Double, sourceCol0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: Unit, sourceLine0: Unit, sourceCol0: Double): this.type = js.native
    
    def addSource(url: String): this.type = js.native
    def addSource(url: String, content: String): this.type = js.native
    
    /* private */ var file: js.Any = js.native
    
    /* private */ var hasMappings: js.Any = js.native
    
    /* private */ var lastCol0: js.Any = js.native
    
    /* private */ var lines: js.Any = js.native
    
    /* private */ var sourcesContent: js.Any = js.native
    
    def toJSON(): SourceMap | Null = js.native
    
    def toJsComment(): String = js.native
  }
  
  inline def toBase64String(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64String")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SourceMap extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var mappings: String
    
    var sourceRoot: String
    
    var sources: js.Array[String]
    
    var sourcesContent: js.Array[String | Null]
    
    var version: Double
  }
  object SourceMap {
    
    inline def apply(
      mappings: String,
      sourceRoot: String,
      sources: js.Array[String],
      sourcesContent: js.Array[String | Null],
      version: Double
    ): SourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMap]
    }
    
    extension [Self <: SourceMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
