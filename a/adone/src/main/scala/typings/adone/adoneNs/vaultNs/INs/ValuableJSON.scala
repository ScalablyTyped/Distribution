package typings.adone.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableJSON extends js.Object {
  var entries: js.Array[ValuableEntry]
  var name: String
  var notes: String
}

object ValuableJSON {
  @scala.inline
  def apply(entries: js.Array[ValuableEntry], name: String, notes: String): ValuableJSON = {
    val __obj = js.Dynamic.literal(entries = entries, name = name, notes = notes)
  
    __obj.asInstanceOf[ValuableJSON]
  }
}

