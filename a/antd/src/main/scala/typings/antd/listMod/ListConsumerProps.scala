package typings.antd.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConsumerProps extends js.Object {
  var grid: js.UndefOr[js.Any] = js.undefined
  var itemLayout: js.UndefOr[String] = js.undefined
}

object ListConsumerProps {
  @scala.inline
  def apply(grid: js.Any = null, itemLayout: String = null): ListConsumerProps = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConsumerProps]
  }
}

