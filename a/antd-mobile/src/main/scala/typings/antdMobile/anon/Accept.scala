package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var accept: String = js.native
  var disableDelete: Boolean = js.native
  var files: js.Array[scala.Nothing] = js.native
  var length: Double = js.native
  var multiple: Boolean = js.native
  var onAddImageClick: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onFail: js.Function0[Unit] = js.native
  var onImageClick: js.Function0[Unit] = js.native
  var prefixCls: String = js.native
  var selectable: Boolean = js.native
}

object Accept {
  @scala.inline
  def apply(
    accept: String,
    disableDelete: Boolean,
    files: js.Array[scala.Nothing],
    length: Double,
    multiple: Boolean,
    onAddImageClick: () => Unit,
    onChange: () => Unit,
    onFail: () => Unit,
    onImageClick: () => Unit,
    prefixCls: String,
    selectable: Boolean
  ): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], disableDelete = disableDelete.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onAddImageClick = js.Any.fromFunction0(onAddImageClick), onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), onImageClick = js.Any.fromFunction0(onImageClick), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableDelete(value: Boolean): Self = this.set("disableDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: scala.Nothing*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[scala.Nothing]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAddImageClick(value: () => Unit): Self = this.set("onAddImageClick", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFail(value: () => Unit): Self = this.set("onFail", js.Any.fromFunction0(value))
    @scala.inline
    def setOnImageClick(value: () => Unit): Self = this.set("onImageClick", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
  }
  
}

