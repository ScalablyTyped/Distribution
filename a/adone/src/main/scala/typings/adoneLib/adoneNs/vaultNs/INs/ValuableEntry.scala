package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableEntry extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  var value: js.Any
}

object ValuableEntry {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, value: js.Any): ValuableEntry = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValuableEntry]
  }
}

