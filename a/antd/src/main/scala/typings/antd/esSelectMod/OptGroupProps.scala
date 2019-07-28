package typings.antd.esSelectMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupProps extends js.Object {
  var label: js.UndefOr[ReactNode] = js.undefined
}

object OptGroupProps {
  @scala.inline
  def apply(label: ReactNode = null): OptGroupProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupProps]
  }
}

