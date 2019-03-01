package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextField extends js.Object {
  var text: java.lang.String
  var `type`: java.lang.String
}

object TextField {
  @scala.inline
  def apply(text: java.lang.String, `type`: java.lang.String): TextField = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextField]
  }
}

