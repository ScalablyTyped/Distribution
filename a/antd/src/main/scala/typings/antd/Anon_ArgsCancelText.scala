package typings.antd

import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.react.reactMod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsCancelText extends js.Object {
  var cancelText: Requireable[ReactNodeLike]
  var centered: Requireable[Boolean]
  var closable: Requireable[Boolean]
  var closeIcon: Requireable[ReactNodeLike]
  var confirmLoading: Requireable[Boolean]
  var footer: Requireable[ReactNodeLike]
  var okText: Requireable[ReactNodeLike]
  var onCancel: Requireable[js.Function1[/* repeated */ _, _]]
  var onOk: Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: Requireable[String]
  var title: Requireable[ReactNodeLike]
  var visible: Requireable[Boolean]
  var width: Requireable[ReactText]
}

object Anon_ArgsCancelText {
  @scala.inline
  def apply(
    cancelText: Requireable[ReactNodeLike],
    centered: Requireable[Boolean],
    closable: Requireable[Boolean],
    closeIcon: Requireable[ReactNodeLike],
    confirmLoading: Requireable[Boolean],
    footer: Requireable[ReactNodeLike],
    okText: Requireable[ReactNodeLike],
    onCancel: Requireable[js.Function1[/* repeated */ _, _]],
    onOk: Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: Requireable[String],
    title: Requireable[ReactNodeLike],
    visible: Requireable[Boolean],
    width: Requireable[ReactText]
  ): Anon_ArgsCancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], centered = centered.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], closeIcon = closeIcon.asInstanceOf[js.Any], confirmLoading = confirmLoading.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsCancelText]
  }
}

