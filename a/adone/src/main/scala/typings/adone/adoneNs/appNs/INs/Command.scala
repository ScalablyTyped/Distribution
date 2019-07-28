package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var names: js.Array[String]
}

object Command {
  @scala.inline
  def apply(names: js.Array[String]): Command = {
    val __obj = js.Dynamic.literal(names = names)
  
    __obj.asInstanceOf[Command]
  }
}

