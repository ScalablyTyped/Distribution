package typings.adone.adoneNs.vaultNs

import typings.adone.adoneNs.vaultNs.INs.SlicedValuable
import typings.adone.adoneNs.vaultNs.INs.VaultConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.vault")
@js.native
object ^ extends js.Object {
  def open(): js.Promise[Vault[Valuable]] = js.native
  def open(options: VaultConstructorOptions): js.Promise[Vault[Valuable]] = js.native
  def slice(valuable: Valuable, prefix: String): SlicedValuable = js.native
  def slice(valuable: Valuable, prefix: String, separator: String): SlicedValuable = js.native
  def slice(valuable: Valuable, prefix: js.Array[String]): SlicedValuable = js.native
  def slice(valuable: Valuable, prefix: js.Array[String], separator: String): SlicedValuable = js.native
}

