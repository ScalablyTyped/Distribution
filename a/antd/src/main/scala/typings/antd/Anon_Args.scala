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
  var shape: Requireable[round | circle | `circle-outline`]
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
    shape: Requireable[round | circle | `circle-outline`],
    size: Requireable[small | default | large],
    title: Requireable[String],
    `type`: Requireable[String]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(block = block, className = className, htmlType = htmlType, icon = icon, loading = loading, onClick = onClick, shape = shape, size = size, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Args]
  }
}

