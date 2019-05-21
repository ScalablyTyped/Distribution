package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(backgroundColor: java.lang.String = null): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

