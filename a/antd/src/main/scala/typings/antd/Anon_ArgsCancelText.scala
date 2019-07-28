package typings.antd

import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsCancelText extends js.Object {
  var cancelText: Requireable[ReactNodeLike]
  var centered: Requireable[Boolean]
  var closable: Requireable[Boolean]
  var confirmLoading: Requireable[Boolean]
  var footer: Requireable[ReactNodeLike]
  var okText: Requireable[ReactNodeLike]
  var onCancel: Requireable[js.Function1[/* repeated */ _, _]]
  var onOk: Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: Requireable[String]
  var title: Requireable[ReactNodeLike]
  var visible: Requireable[Boolean]
  var width: Requireable[String | Double]
}

object Anon_ArgsCancelText {
  @scala.inline
  def apply(
    cancelText: Requireable[ReactNodeLike],
    centered: Requireable[Boolean],
    closable: Requireable[Boolean],
    confirmLoading: Requireable[Boolean],
    footer: Requireable[ReactNodeLike],
    okText: Requireable[ReactNodeLike],
    onCancel: Requireable[js.Function1[/* repeated */ _, _]],
    onOk: Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: Requireable[String],
    title: Requireable[ReactNodeLike],
    visible: Requireable[Boolean],
    width: Requireable[String | Double]
  ): Anon_ArgsCancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText, centered = centered, closable = closable, confirmLoading = confirmLoading, footer = footer, okText = okText, onCancel = onCancel, onOk = onOk, prefixCls = prefixCls, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[Anon_ArgsCancelText]
  }
}

