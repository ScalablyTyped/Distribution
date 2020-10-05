package typings.angularCompiler.sourceMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMap extends js.Object {
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
  implicit class SourceMapOps[Self <: SourceMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMappings(value: String): Self = this.set("mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesContentVarargs(value: (String | Null)*): Self = this.set("sourcesContent", js.Array(value :_*))
    @scala.inline
    def setSourcesContent(value: js.Array[String | Null]): Self = this.set("sourcesContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

