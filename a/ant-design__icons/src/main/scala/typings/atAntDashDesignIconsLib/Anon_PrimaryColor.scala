package typings
package atAntDashDesignIconsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrimaryColor extends js.Object {
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PrimaryColor {
  @scala.inline
  def apply(primaryColor: java.lang.String = null, secondaryColor: java.lang.String = null): Anon_PrimaryColor = {
    val __obj = js.Dynamic.literal()
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    __obj.asInstanceOf[Anon_PrimaryColor]
  }
}

