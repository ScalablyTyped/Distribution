package typings.amapJsSdk

import typings.amapJsSdk.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var offset: Pixel
}

object AnonContent {
  @scala.inline
  def apply(content: String, offset: Pixel): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

