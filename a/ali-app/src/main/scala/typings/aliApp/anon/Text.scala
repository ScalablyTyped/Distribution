package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  /**
    * 经过处理过后得到的文本，加密为Base64编码文本，解密为原始文本
    */
  var text: String
}

object Text {
  @scala.inline
  def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

