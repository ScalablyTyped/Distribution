package typings.atAntDashDesignIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrimaryColor extends js.Object {
  var primaryColor: js.UndefOr[String] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
}

object Anon_PrimaryColor {
  @scala.inline
  def apply(primaryColor: String = null, secondaryColor: String = null): Anon_PrimaryColor = {
    val __obj = js.Dynamic.literal()
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    __obj.asInstanceOf[Anon_PrimaryColor]
  }
}

