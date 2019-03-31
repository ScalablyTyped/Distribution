package typings
package antdDashMobileLib.libAccordionPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPropsTypes extends js.Object {
  var activeKey: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var defaultActiveKey: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* x */ js.Any, scala.Unit]] = js.undefined
}

object AccordionPropsTypes {
  @scala.inline
  def apply(
    activeKey: java.lang.String | js.Array[java.lang.String] = null,
    defaultActiveKey: java.lang.String | js.Array[java.lang.String] = null,
    onChange: /* x */ js.Any => scala.Unit = null
  ): AccordionPropsTypes = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AccordionPropsTypes]
  }
}

