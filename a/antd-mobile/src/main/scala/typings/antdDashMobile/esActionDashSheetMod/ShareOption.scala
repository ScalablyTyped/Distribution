package typings.antdDashMobile.esActionDashSheetMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOption extends js.Object {
  var icon: ReactNode
  var title: String
}

object ShareOption {
  @scala.inline
  def apply(icon: ReactNode, title: String): ShareOption = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[ShareOption]
  }
}

