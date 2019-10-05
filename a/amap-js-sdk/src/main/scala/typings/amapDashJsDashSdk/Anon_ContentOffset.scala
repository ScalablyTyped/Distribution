package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentOffset extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
}

object Anon_ContentOffset {
  @scala.inline
  def apply(content: String = null, offset: Pixel = null): Anon_ContentOffset = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_ContentOffset]
  }
}

