package typings.antdMobileRn.propsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionPropsTypes extends js.Object {
  var activeKey: js.UndefOr[String | js.Array[String]] = js.native
  var defaultActiveKey: js.UndefOr[String | js.Array[String]] = js.native
  var onChange: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.native
}

object AccordionPropsTypes {
  @scala.inline
  def apply(): AccordionPropsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionPropsTypes]
  }
  @scala.inline
  implicit class AccordionPropsTypesOps[Self <: AccordionPropsTypes] (val x: Self) extends AnyVal {
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
    def setActiveKeyVarargs(value: String*): Self = this.set("activeKey", js.Array(value :_*))
    @scala.inline
    def setActiveKey(value: String | js.Array[String]): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setDefaultActiveKeyVarargs(value: String*): Self = this.set("defaultActiveKey", js.Array(value :_*))
    @scala.inline
    def setDefaultActiveKey(value: String | js.Array[String]): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    @scala.inline
    def setOnChange(value: /* x */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

