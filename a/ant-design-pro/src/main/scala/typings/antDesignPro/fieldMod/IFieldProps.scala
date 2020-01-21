package typings.antDesignPro.fieldMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldProps extends js.Object {
  var label: ReactNode
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: ReactNode
}

object IFieldProps {
  @scala.inline
  def apply(label: ReactNode = null, style: CSSProperties = null, value: ReactNode = null): IFieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldProps]
  }
}

