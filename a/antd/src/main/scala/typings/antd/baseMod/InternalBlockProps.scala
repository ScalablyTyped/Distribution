package typings.antd.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalBlockProps extends BlockProps {
  var component: String = js.native
}

object InternalBlockProps {
  @scala.inline
  def apply(component: String): InternalBlockProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalBlockProps]
  }
  @scala.inline
  implicit class InternalBlockPropsOps[Self <: InternalBlockProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
  }
  
}

