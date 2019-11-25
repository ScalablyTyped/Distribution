package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: String
  var disableDelete: Boolean
  var files: js.Array[scala.Nothing]
  var length: Double
  var multiple: Boolean
  var onAddImageClick: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onFail: js.Function0[Unit]
  var onImageClick: js.Function0[Unit]
  var prefixCls: String
  var selectable: Boolean
}

object Anon_Accept {
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
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], disableDelete = disableDelete.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onAddImageClick = js.Any.fromFunction0(onAddImageClick), onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), onImageClick = js.Any.fromFunction0(onImageClick), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Accept]
  }
}

