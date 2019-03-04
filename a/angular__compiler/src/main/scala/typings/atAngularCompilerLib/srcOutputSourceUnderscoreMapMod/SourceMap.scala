package typings
package atAngularCompilerLib.srcOutputSourceUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMap extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var mappings: java.lang.String
  var sourceRoot: java.lang.String
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.Array[java.lang.String | scala.Null]
  var version: scala.Double
}

object SourceMap {
  @scala.inline
  def apply(
    mappings: java.lang.String,
    sourceRoot: java.lang.String,
    sources: js.Array[java.lang.String],
    sourcesContent: js.Array[java.lang.String | scala.Null],
    version: scala.Double,
    file: java.lang.String = null
  ): SourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings, sourceRoot = sourceRoot, sources = sources, sourcesContent = sourcesContent, version = version)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[SourceMap]
  }
}

