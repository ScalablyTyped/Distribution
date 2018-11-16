package typings
package atAngularCompilerLib.srcOutputSourceUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/source_map", "SourceMapGenerator")
@js.native
class SourceMapGenerator () extends js.Object {
  def this(file: java.lang.String) = this()
  val currentLine: js.Any = js.native
  var file: js.Any = js.native
  var hasMappings: js.Any = js.native
  var lastCol0: js.Any = js.native
  var lines: js.Any = js.native
  var sourcesContent: js.Any = js.native
  def addLine(): this.type = js.native
  def addMapping(col0: scala.Double): this.type = js.native
  def addMapping(col0: scala.Double, sourceUrl: java.lang.String): this.type = js.native
  def addMapping(col0: scala.Double, sourceUrl: java.lang.String, sourceLine0: scala.Double): this.type = js.native
  def addMapping(
    col0: scala.Double,
    sourceUrl: java.lang.String,
    sourceLine0: scala.Double,
    sourceCol0: scala.Double
  ): this.type = js.native
  def addSource(url: java.lang.String): this.type = js.native
  def addSource(url: java.lang.String, content: java.lang.String): this.type = js.native
  def toJSON(): SourceMap | scala.Null = js.native
  def toJsComment(): java.lang.String = js.native
}

