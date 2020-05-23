package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
}

object Offset {
  @scala.inline
  def apply(content: String = null, offset: Pixel = null): Offset = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

