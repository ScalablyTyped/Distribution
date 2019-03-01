package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLinks extends js.Object {
  var next: java.lang.String
}

object ListLinks {
  @scala.inline
  def apply(next: java.lang.String): ListLinks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[ListLinks]
  }
}

