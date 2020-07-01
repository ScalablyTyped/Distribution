package typings.antd.baseMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyConfig extends js.Object {
  var icon: js.UndefOr[ReactNode] = js.undefined
  var onCopy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var tooltips: js.UndefOr[js.Tuple2[ReactNode, ReactNode]] = js.undefined
}

object CopyConfig {
  @scala.inline
  def apply(
    icon: ReactNode = null,
    onCopy: () => Unit = null,
    text: String = null,
    tooltips: js.Tuple2[ReactNode, ReactNode] = null
  ): CopyConfig = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction0(onCopy))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyConfig]
  }
}

