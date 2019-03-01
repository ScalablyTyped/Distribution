package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var names: js.Array[java.lang.String]
}

object Command {
  @scala.inline
  def apply(names: js.Array[java.lang.String]): Command = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("names")(names)
    __obj.asInstanceOf[Command]
  }
}

