package typings.asar.mod

import typings.glob.mod.IOptions
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions extends js.Object {
  var dot: js.UndefOr[Boolean] = js.native
  var globOptions: js.UndefOr[IOptions] = js.native
  var ordering: js.UndefOr[String] = js.native
  var pattern: js.UndefOr[String] = js.native
  var transform: js.UndefOr[js.Function1[/* filePath */ String, ReadWriteStream | Unit]] = js.native
  var unpack: js.UndefOr[String] = js.native
  var unpackDir: js.UndefOr[String] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
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
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setGlobOptions(value: IOptions): Self = this.set("globOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobOptions: Self = this.set("globOptions", js.undefined)
    @scala.inline
    def setOrdering(value: String): Self = this.set("ordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdering: Self = this.set("ordering", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setTransform(value: /* filePath */ String => ReadWriteStream | Unit): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setUnpack(value: String): Self = this.set("unpack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpack: Self = this.set("unpack", js.undefined)
    @scala.inline
    def setUnpackDir(value: String): Self = this.set("unpackDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpackDir: Self = this.set("unpackDir", js.undefined)
  }
  
}

