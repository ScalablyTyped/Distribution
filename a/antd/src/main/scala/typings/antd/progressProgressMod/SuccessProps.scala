package typings.antd.progressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessProps extends js.Object {
  var progress: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
}

object SuccessProps {
  @scala.inline
  def apply(progress: js.UndefOr[Double] = js.undefined, strokeColor: String = null): SuccessProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessProps]
  }
}

