package typings.alexaDashSdk

import typings.alexaDashSdk.alexaDashSdkMod.TextContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: String
  var `type`: TextContentType
}

object Anon_Text {
  @scala.inline
  def apply(text: String, `type`: TextContentType): Anon_Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Text]
  }
}

