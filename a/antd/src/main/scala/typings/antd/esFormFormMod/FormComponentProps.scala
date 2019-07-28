package typings.antd.esFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormComponentProps[V]
  extends WrappedFormInternalProps[V]
     with RcBaseFormProps

object FormComponentProps {
  @scala.inline
  def apply[V](form: WrappedFormUtils[V], wrappedComponentRef: js.Any = null): FormComponentProps[V] = {
    val __obj = js.Dynamic.literal(form = form)
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef)
    __obj.asInstanceOf[FormComponentProps[V]]
  }
}

