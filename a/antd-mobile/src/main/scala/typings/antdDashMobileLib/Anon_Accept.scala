package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: java.lang.String
  var disableDelete: scala.Boolean
  var files: js.Array[scala.Nothing]
  var length: scala.Double
  var multiple: scala.Boolean
  var onAddImageClick: js.Function0[scala.Unit]
  var onChange: js.Function0[scala.Unit]
  var onFail: js.Function0[scala.Unit]
  var onImageClick: js.Function0[scala.Unit]
  var prefixCls: java.lang.String
  var selectable: scala.Boolean
}

object Anon_Accept {
  @scala.inline
  def apply(
    accept: java.lang.String,
    disableDelete: scala.Boolean,
    files: js.Array[scala.Nothing],
    length: scala.Double,
    multiple: scala.Boolean,
    onAddImageClick: () => scala.Unit,
    onChange: () => scala.Unit,
    onFail: () => scala.Unit,
    onImageClick: () => scala.Unit,
    prefixCls: java.lang.String,
    selectable: scala.Boolean
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept, disableDelete = disableDelete, files = files, length = length, multiple = multiple, onAddImageClick = js.Any.fromFunction0(onAddImageClick), onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), onImageClick = js.Any.fromFunction0(onImageClick), prefixCls = prefixCls, selectable = selectable)
  
    __obj.asInstanceOf[Anon_Accept]
  }
}

