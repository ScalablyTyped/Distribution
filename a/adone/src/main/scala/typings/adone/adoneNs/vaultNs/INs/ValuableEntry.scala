package typings.adone.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableEntry extends js.Object {
  var name: String
  var `type`: String
  var value: js.Any
}

object ValuableEntry {
  @scala.inline
  def apply(name: String, `type`: String, value: js.Any): ValuableEntry = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValuableEntry]
  }
}

