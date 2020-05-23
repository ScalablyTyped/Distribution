package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ahead extends js.Object {
  var ahead: Double
  var behind: Double
}

object Ahead {
  @scala.inline
  def apply(ahead: Double, behind: Double): Ahead = {
    val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], behind = behind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ahead]
  }
}

