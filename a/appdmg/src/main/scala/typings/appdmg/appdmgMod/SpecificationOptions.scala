package typings.appdmg.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationOptions extends js.Object {
  var app: String
  var background: String
  var icon: String
  var iconSize: Double
  var title: String
}

object SpecificationOptions {
  @scala.inline
  def apply(app: String, background: String, icon: String, iconSize: Double, title: String): SpecificationOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecificationOptions]
  }
}

