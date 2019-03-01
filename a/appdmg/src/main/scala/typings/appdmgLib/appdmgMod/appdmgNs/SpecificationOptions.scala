package typings
package appdmgLib.appdmgMod.appdmgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationOptions extends js.Object {
  var app: java.lang.String
  var background: java.lang.String
  var icon: java.lang.String
  var iconSize: scala.Double
  var title: java.lang.String
}

object SpecificationOptions {
  @scala.inline
  def apply(
    app: java.lang.String,
    background: java.lang.String,
    icon: java.lang.String,
    iconSize: scala.Double,
    title: java.lang.String
  ): SpecificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("background")(background)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("iconSize")(iconSize)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SpecificationOptions]
  }
}

