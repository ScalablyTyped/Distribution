package typings.adone

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.adone.adoneNs.vaultNs.INs.SlicedValuable
import typings.adone.adoneNs.vaultNs.INs.VaultConstructorOptions
import typings.adone.adoneNs.vaultNs.Valuable
import typings.adone.adoneNs.vaultNs.Vault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofvault extends js.Object {
  val INs: js.Any = js.native
  var Valuable: Instantiable4[
    /* vaule */ Vault[typings.adone.adoneNs.vaultNs.Valuable], 
    /* id */ Double, 
    /* metaData */ js.Object, 
    /* tags */ js.Array[js.Object], 
    typings.adone.adoneNs.vaultNs.Valuable
  ] = js.native
  var Vault: Instantiable1[
    /* options */ VaultConstructorOptions, 
    typings.adone.adoneNs.vaultNs.Vault[Valuable]
  ] = js.native
  def open(): js.Promise[Vault[Valuable]] = js.native
  def open(options: VaultConstructorOptions): js.Promise[Vault[Valuable]] = js.native
  def slice(valuable: Valuable, prefix: String): SlicedValuable = js.native
  def slice(valuable: Valuable, prefix: String, separator: String): SlicedValuable = js.native
  def slice(valuable: Valuable, prefix: js.Array[String]): SlicedValuable = js.native
  def slice(valuable: Valuable, prefix: js.Array[String], separator: String): SlicedValuable = js.native
}

