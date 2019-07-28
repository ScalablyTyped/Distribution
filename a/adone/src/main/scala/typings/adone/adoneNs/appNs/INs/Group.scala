package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object Group {
  @scala.inline
  def apply(name: String, description: String = null): Group = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Group]
  }
}

