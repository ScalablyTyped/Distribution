package typings.antd

import typings.antd.antdStrings.`circle-outline`
import typings.antd.antdStrings.button
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.reset
import typings.antd.antdStrings.round
import typings.antd.antdStrings.small
import typings.antd.antdStrings.submit
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var block: Requireable[Boolean]
  var className: Requireable[String]
  var htmlType: Requireable[button | reset | submit]
  var icon: Requireable[String]
  var loading: Requireable[Boolean | js.Object]
  var onClick: Requireable[js.Function1[/* repeated */ _, _]]
  var shape: Requireable[circle | round | `circle-outline`]
  var size: Requireable[small | default | large]
  var title: Requireable[String]
  var `type`: Requireable[String]
}

object Anon_Args {
  @scala.inline
  def apply(
    block: Requireable[Boolean],
    className: Requireable[String],
    htmlType: Requireable[button | reset | submit],
    icon: Requireable[String],
    loading: Requireable[Boolean | js.Object],
    onClick: Requireable[js.Function1[/* repeated */ _, _]],
    shape: Requireable[circle | round | `circle-outline`],
    size: Requireable[small | default | large],
    title: Requireable[String],
    `type`: Requireable[String]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], htmlType = htmlType.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

