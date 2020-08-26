package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files extends js.Object {
  var files: js.Array[scala.Nothing] = js.native
  var selectable: Boolean = js.native
  def onChange(): Unit = js.native
  def onFail(): Unit = js.native
}

object Files {
  @scala.inline
  def apply(files: js.Array[scala.Nothing], onChange: () => Unit, onFail: () => Unit, selectable: Boolean): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: scala.Nothing*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[scala.Nothing]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFail(value: () => Unit): Self = this.set("onFail", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
  }
  
}

