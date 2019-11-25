package typings.atAngularCompiler.srcOutputSourceUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMap extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var mappings: String
  var sourceRoot: String
  var sources: js.Array[String]
  var sourcesContent: js.Array[String | Null]
  var version: Double
}

object SourceMap {
  @scala.inline
  def apply(
    mappings: String,
    sourceRoot: String,
    sources: js.Array[String],
    sourcesContent: js.Array[String | Null],
    version: Double,
    file: String = null
  ): SourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMap]
  }
}

