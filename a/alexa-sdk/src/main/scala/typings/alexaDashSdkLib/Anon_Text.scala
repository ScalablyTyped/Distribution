package typings
package alexaDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: java.lang.String
  var `type`: alexaDashSdkLib.alexaDashSdkMod.TextContentType
}

object Anon_Text {
  @scala.inline
  def apply(text: java.lang.String, `type`: alexaDashSdkLib.alexaDashSdkMod.TextContentType): Anon_Text = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Text]
  }
}

