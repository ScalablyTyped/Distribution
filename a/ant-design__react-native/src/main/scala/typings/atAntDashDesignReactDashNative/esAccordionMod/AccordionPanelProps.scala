package typings.atAntDashDesignReactDashNative.esAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPanelProps extends js.Object {
  var header: js.Any
  var key: js.UndefOr[String] = js.undefined
}

object AccordionPanelProps {
  @scala.inline
  def apply(header: js.Any, key: String = null): AccordionPanelProps = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionPanelProps]
  }
}

