package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapMod {
  
  @JSImport("@angular/compiler/src/output/source_map", "SourceMapGenerator")
  @js.native
  class SourceMapGenerator () extends StObject {
    def this(file: String) = this()
    
    def addLine(): this.type = js.native
    
    def addMapping(col0: Double): this.type = js.native
    def addMapping(
      col0: Double,
      sourceUrl: js.UndefOr[scala.Nothing],
      sourceLine0: js.UndefOr[scala.Nothing],
      sourceCol0: Double
    ): this.type = js.native
    def addMapping(col0: Double, sourceUrl: js.UndefOr[scala.Nothing], sourceLine0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: js.UndefOr[scala.Nothing], sourceLine0: Double, sourceCol0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String, sourceLine0: js.UndefOr[scala.Nothing], sourceCol0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String, sourceLine0: Double): this.type = js.native
    def addMapping(col0: Double, sourceUrl: String, sourceLine0: Double, sourceCol0: Double): this.type = js.native
    
    def addSource(url: String): this.type = js.native
    def addSource(url: String, content: String): this.type = js.native
    
    var file: js.Any = js.native
    
    var hasMappings: js.Any = js.native
    
    var lastCol0: js.Any = js.native
    
    var lines: js.Any = js.native
    
    var sourcesContent: js.Any = js.native
    
    def toJSON(): SourceMap | Null = js.native
    
    def toJsComment(): String = js.native
  }
  
  @JSImport("@angular/compiler/src/output/source_map", "toBase64String")
  @js.native
  def toBase64String(value: String): String = js.native
  
  @js.native
  trait SourceMap extends StObject {
    
    var file: js.UndefOr[String] = js.native
    
    var mappings: String = js.native
    
    var sourceRoot: String = js.native
    
    var sources: js.Array[String] = js.native
    
    var sourcesContent: js.Array[String | Null] = js.native
    
    var version: Double = js.native
  }
  object SourceMap {
    
    @scala.inline
    def apply(
      mappings: String,
      sourceRoot: String,
      sources: js.Array[String],
      sourcesContent: js.Array[String | Null],
      version: Double
    ): SourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMap]
    }
    
    @scala.inline
    implicit class SourceMapMutableBuilder[Self <: SourceMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
