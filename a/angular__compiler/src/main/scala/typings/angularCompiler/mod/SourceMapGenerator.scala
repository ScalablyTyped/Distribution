package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapGenerator extends StObject {
  
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
  
  /* private */ var file: Any = js.native
  
  /* private */ var hasMappings: Any = js.native
  
  /* private */ var lastCol0: Any = js.native
  
  /* private */ var lines: Any = js.native
  
  /* private */ var sourcesContent: Any = js.native
  
  def toJSON(): SourceMap | Null = js.native
  
  def toJsComment(): String = js.native
}
