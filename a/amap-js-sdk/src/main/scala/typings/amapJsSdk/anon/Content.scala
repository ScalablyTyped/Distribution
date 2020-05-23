package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: String
  var offset: Pixel
}

object Content {
  @scala.inline
  def apply(content: String, offset: Pixel): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

