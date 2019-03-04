package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableJSON extends js.Object {
  var entries: js.Array[ValuableEntry]
  var name: java.lang.String
  var notes: java.lang.String
}

object ValuableJSON {
  @scala.inline
  def apply(entries: js.Array[ValuableEntry], name: java.lang.String, notes: java.lang.String): ValuableJSON = {
    val __obj = js.Dynamic.literal(entries = entries, name = name, notes = notes)
  
    __obj.asInstanceOf[ValuableJSON]
  }
}

