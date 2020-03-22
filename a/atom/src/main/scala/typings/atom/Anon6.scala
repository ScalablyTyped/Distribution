package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  var newValue: String | Double
  var oldValue: js.UndefOr[String | Double] = js.undefined
}

object Anon6 {
  @scala.inline
  def apply(newValue: String | Double, oldValue: String | Double = null): Anon6 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon6]
  }
}

