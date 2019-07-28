package typings.antdDashMobile.esAccordionPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPropsTypes extends js.Object {
  var activeKey: js.UndefOr[String | js.Array[String]] = js.undefined
  var defaultActiveKey: js.UndefOr[String | js.Array[String]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.undefined
}

object AccordionPropsTypes {
  @scala.inline
  def apply(
    activeKey: String | js.Array[String] = null,
    defaultActiveKey: String | js.Array[String] = null,
    onChange: /* x */ js.Any => Unit = null
  ): AccordionPropsTypes = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AccordionPropsTypes]
  }
}

