package typings.adone

import typings.adone.adoneNs.vaultNs.INs.VaultJSONStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stats extends js.Object {
  var stats: VaultJSONStats
  var valuables: js.Array[js.Object]
}

object Anon_Stats {
  @scala.inline
  def apply(stats: VaultJSONStats, valuables: js.Array[js.Object]): Anon_Stats = {
    val __obj = js.Dynamic.literal(stats = stats, valuables = valuables)
  
    __obj.asInstanceOf[Anon_Stats]
  }
}

