package typings
package antdLib.esTypographyBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyConfig extends js.Object {
  var onCopy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CopyConfig {
  @scala.inline
  def apply(onCopy: () => scala.Unit = null, text: java.lang.String = null): CopyConfig = {
    val __obj = js.Dynamic.literal()
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction0(onCopy))
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CopyConfig]
  }
}

