package typings.angularCompiler.sourceMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/source_map", "SourceMapGenerator")
@js.native
class SourceMapGenerator () extends js.Object {
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
