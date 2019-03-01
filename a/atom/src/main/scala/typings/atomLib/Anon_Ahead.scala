package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ahead extends js.Object {
  var ahead: scala.Double
  var behind: scala.Double
}

object Anon_Ahead {
  @scala.inline
  def apply(ahead: scala.Double, behind: scala.Double): Anon_Ahead = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ahead")(ahead)
    __obj.updateDynamic("behind")(behind)
    __obj.asInstanceOf[Anon_Ahead]
  }
}

