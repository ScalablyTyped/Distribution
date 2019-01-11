package typings
package adoneLib.adoneNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.vault")
@js.native
object ^ extends js.Object {
  def open(): js.Promise[adoneLib.adoneNs.vaultNs.Vault[adoneLib.adoneNs.vaultNs.Valuable]] = js.native
  def open(options: adoneLib.adoneNs.vaultNs.INs.VaultConstructorOptions): js.Promise[adoneLib.adoneNs.vaultNs.Vault[adoneLib.adoneNs.vaultNs.Valuable]] = js.native
  def slice(valuable: adoneLib.adoneNs.vaultNs.Valuable, prefix: java.lang.String): adoneLib.adoneNs.vaultNs.INs.SlicedValuable = js.native
  def slice(valuable: adoneLib.adoneNs.vaultNs.Valuable, prefix: java.lang.String, separator: java.lang.String): adoneLib.adoneNs.vaultNs.INs.SlicedValuable = js.native
  def slice(valuable: adoneLib.adoneNs.vaultNs.Valuable, prefix: js.Array[java.lang.String]): adoneLib.adoneNs.vaultNs.INs.SlicedValuable = js.native
  def slice(
    valuable: adoneLib.adoneNs.vaultNs.Valuable,
    prefix: js.Array[java.lang.String],
    separator: java.lang.String
  ): adoneLib.adoneNs.vaultNs.INs.SlicedValuable = js.native
}

