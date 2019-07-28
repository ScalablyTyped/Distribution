package typings.adone.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultJSONStats extends js.Object {
  var created: Double
  var location: String
  var updated: Double
}

object VaultJSONStats {
  @scala.inline
  def apply(created: Double, location: String, updated: Double): VaultJSONStats = {
    val __obj = js.Dynamic.literal(created = created, location = location, updated = updated)
  
    __obj.asInstanceOf[VaultJSONStats]
  }
}

