package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Group {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null): Group = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Group]
  }
}

