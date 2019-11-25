package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ahead extends js.Object {
  var ahead: Double
  var behind: Double
}

object Anon_Ahead {
  @scala.inline
  def apply(ahead: Double, behind: Double): Anon_Ahead = {
    val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], behind = behind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ahead]
  }
}

