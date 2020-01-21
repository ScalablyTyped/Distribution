package typings.antdMobileRn.stepsItemNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsItemProps extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var errorTail: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StepsItemProps {
  @scala.inline
  def apply(
    current: Int | Double = null,
    description: String = null,
    direction: String = null,
    errorTail: Int | Double = null,
    icon: String = null,
    index: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    status: String = null,
    styles: js.Any = null,
    title: String = null,
    width: Int | Double = null
  ): StepsItemProps = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (errorTail != null) __obj.updateDynamic("errorTail")(errorTail.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsItemProps]
  }
}

