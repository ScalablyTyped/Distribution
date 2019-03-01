package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stats extends js.Object {
  var stats: adoneLib.adoneNs.vaultNs.INs.VaultJSONStats
  var valuables: js.Array[js.Object]
}

object Anon_Stats {
  @scala.inline
  def apply(stats: adoneLib.adoneNs.vaultNs.INs.VaultJSONStats, valuables: js.Array[js.Object]): Anon_Stats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("valuables")(valuables)
    __obj.asInstanceOf[Anon_Stats]
  }
}

