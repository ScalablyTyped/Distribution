package typings
package atAtlaskitSingleDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]
  var isOpen: scala.Boolean
}

object Anon_Event {
  @scala.inline
  def apply(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], isOpen: scala.Boolean): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event, isOpen = isOpen)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

