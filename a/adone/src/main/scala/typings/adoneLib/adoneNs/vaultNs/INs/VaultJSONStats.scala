package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultJSONStats extends js.Object {
  var created: scala.Double
  var location: java.lang.String
  var updated: scala.Double
}

object VaultJSONStats {
  @scala.inline
  def apply(created: scala.Double, location: java.lang.String, updated: scala.Double): VaultJSONStats = {
    val __obj = js.Dynamic.literal(created = created, location = location, updated = updated)
  
    __obj.asInstanceOf[VaultJSONStats]
  }
}

