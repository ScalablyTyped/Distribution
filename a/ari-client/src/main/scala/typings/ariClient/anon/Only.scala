package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Only extends js.Object {
  var only: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Only {
  @scala.inline
  def apply(only: String | js.Array[String] = null): Only = {
    val __obj = js.Dynamic.literal()
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[Only]
  }
}

