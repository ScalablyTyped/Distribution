package typings.antd.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyContent extends js.Object {
  var bodyContent: js.UndefOr[js.Object | ReactElement | Null] = js.undefined
  var customize: Boolean
}

object BodyContent {
  @scala.inline
  def apply(customize: Boolean, bodyContent: js.UndefOr[Null | js.Object | ReactElement] = js.undefined): BodyContent = {
    val __obj = js.Dynamic.literal(customize = customize.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyContent)) __obj.updateDynamic("bodyContent")(bodyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContent]
  }
}

