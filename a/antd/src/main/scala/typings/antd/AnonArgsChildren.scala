package typings.antd

import typings.antd.antdStrings.`inline`
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.vertical
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsChildren extends js.Object {
  var children: Requireable[_]
  var colon: Requireable[Boolean]
  var hideRequiredMark: Requireable[Boolean]
  var layout: Requireable[`inline` | horizontal | vertical]
  var onSubmit: Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: Requireable[String]
}

object AnonArgsChildren {
  @scala.inline
  def apply(
    children: Requireable[_],
    colon: Requireable[Boolean],
    hideRequiredMark: Requireable[Boolean],
    layout: Requireable[`inline` | horizontal | vertical],
    onSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: Requireable[String]
  ): AnonArgsChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any], hideRequiredMark = hideRequiredMark.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsChildren]
  }
}

