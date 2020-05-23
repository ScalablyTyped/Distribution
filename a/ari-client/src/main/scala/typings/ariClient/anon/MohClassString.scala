package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MohClassString extends js.Object {
  var mohClass: js.UndefOr[String] = js.undefined
}

object MohClassString {
  @scala.inline
  def apply(mohClass: String = null): MohClassString = {
    val __obj = js.Dynamic.literal()
    if (mohClass != null) __obj.updateDynamic("mohClass")(mohClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MohClassString]
  }
}

