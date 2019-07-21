package typings
package atAntDashDesignReactDashNativeLib.libAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPanelProps extends js.Object {
  var header: js.Any
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object AccordionPanelProps {
  @scala.inline
  def apply(header: js.Any, key: java.lang.String = null): AccordionPanelProps = {
    val __obj = js.Dynamic.literal(header = header)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[AccordionPanelProps]
  }
}

