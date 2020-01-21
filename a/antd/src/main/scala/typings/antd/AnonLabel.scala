package typings.antd

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: ReactNode
  var style: CSSProperties
}

object AnonLabel {
  @scala.inline
  def apply(style: CSSProperties, label: ReactNode = null): AnonLabel = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

