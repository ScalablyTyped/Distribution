package typings.accessibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var dimensions: js.UndefOr[typings.accessibility.mod.Dimensions] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
}

object Dimensions {
  @scala.inline
  def apply(dimensions: typings.accessibility.mod.Dimensions = null, fontFamily: String = null): Dimensions = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

