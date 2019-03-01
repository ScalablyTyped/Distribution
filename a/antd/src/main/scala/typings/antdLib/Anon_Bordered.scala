package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bordered extends js.Object {
  var bordered: scala.Boolean
  var openAnimation: Anon_Appear
}

object Anon_Bordered {
  @scala.inline
  def apply(bordered: scala.Boolean, openAnimation: Anon_Appear): Anon_Bordered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bordered")(bordered)
    __obj.updateDynamic("openAnimation")(openAnimation)
    __obj.asInstanceOf[Anon_Bordered]
  }
}

