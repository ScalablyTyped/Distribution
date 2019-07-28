package typings.atAngularCompiler.srcOutputSourceUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/source_map", "SourceMapGenerator")
@js.native
class SourceMapGenerator () extends js.Object {
  def this(file: String) = this()
  val currentLine: js.Any = js.native
  var file: js.Any = js.native
  var hasMappings: js.Any = js.native
  var lastCol0: js.Any = js.native
  var lines: js.Any = js.native
  var sourcesContent: js.Any = js.native
  def addLine(): this.type = js.native
  def addMapping(col0: Double): this.type = js.native
  def addMapping(col0: Double, sourceUrl: String): this.type = js.native
  def addMapping(col0: Double, sourceUrl: String, sourceLine0: Double): this.type = js.native
  def addMapping(col0: Double, sourceUrl: String, sourceLine0: Double, sourceCol0: Double): this.type = js.native
  def addSource(url: String): this.type = js.native
  def addSource(url: String, content: String): this.type = js.native
  def toJSON(): SourceMap | Null = js.native
  def toJsComment(): String = js.native
}

