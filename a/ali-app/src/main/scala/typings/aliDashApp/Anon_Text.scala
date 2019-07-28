package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  /**
  			 * 经过处理过后得到的文本，加密为Base64编码文本，解密为原始文本
  			 */
  var text: String
}

object Anon_Text {
  @scala.inline
  def apply(text: String): Anon_Text = {
    val __obj = js.Dynamic.literal(text = text)
  
    __obj.asInstanceOf[Anon_Text]
  }
}

