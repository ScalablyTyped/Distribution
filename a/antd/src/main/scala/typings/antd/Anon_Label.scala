package typings.antd

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: ReactNode
  var style: CSSProperties
}

object Anon_Label {
  @scala.inline
  def apply(style: CSSProperties, label: ReactNode = null): Anon_Label = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

