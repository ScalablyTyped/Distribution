package typings.antd.esFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RcBaseFormProps extends js.Object {
  var wrappedComponentRef: js.UndefOr[js.Any] = js.undefined
}

object RcBaseFormProps {
  @scala.inline
  def apply(wrappedComponentRef: js.Any = null): RcBaseFormProps = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcBaseFormProps]
  }
}

