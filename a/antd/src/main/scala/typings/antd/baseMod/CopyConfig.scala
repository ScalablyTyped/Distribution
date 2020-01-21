package typings.antd.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyConfig extends js.Object {
  var onCopy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object CopyConfig {
  @scala.inline
  def apply(onCopy: () => Unit = null, text: String = null): CopyConfig = {
    val __obj = js.Dynamic.literal()
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction0(onCopy))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyConfig]
  }
}

