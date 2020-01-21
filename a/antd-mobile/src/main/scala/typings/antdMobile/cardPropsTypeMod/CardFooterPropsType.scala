package typings.antdMobile.cardPropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterPropsType extends js.Object {
  var content: js.UndefOr[ReactNode] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
}

object CardFooterPropsType {
  @scala.inline
  def apply(content: ReactNode = null, extra: ReactNode = null): CardFooterPropsType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterPropsType]
  }
}

