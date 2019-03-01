package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueArray extends js.Object {
  var value: js.UndefOr[java.lang.String | scala.Double | js.Array[java.lang.String]]
}

object Anon_ValueArray {
  @scala.inline
  def apply(value: java.lang.String | scala.Double | js.Array[java.lang.String] = null): Anon_ValueArray = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ValueArray]
  }
}

