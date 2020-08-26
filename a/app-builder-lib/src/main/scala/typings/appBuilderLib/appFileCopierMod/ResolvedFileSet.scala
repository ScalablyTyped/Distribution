package typings.appBuilderLib.appFileCopierMod

import typings.fsExtra.mod.Stats
import typings.node.Buffer
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedFileSet extends js.Object {
  var destination: String = js.native
  var files: js.Array[String] = js.native
  var metadata: Map[String, Stats] = js.native
  var src: String = js.native
  var transformedFiles: js.UndefOr[(Map[Double, String | Buffer]) | Null] = js.native
}

object ResolvedFileSet {
  @scala.inline
  def apply(destination: String, files: js.Array[String], metadata: Map[String, Stats], src: String): ResolvedFileSet = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedFileSet]
  }
  @scala.inline
  implicit class ResolvedFileSetOps[Self <: ResolvedFileSet] (val x: Self) extends AnyVal {
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Map[String, Stats]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformedFiles(value: Map[Double, String | Buffer]): Self = this.set("transformedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformedFiles: Self = this.set("transformedFiles", js.undefined)
    @scala.inline
    def setTransformedFilesNull: Self = this.set("transformedFiles", null)
  }
  
}

