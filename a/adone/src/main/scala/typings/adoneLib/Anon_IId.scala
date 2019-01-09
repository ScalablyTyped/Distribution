package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IId extends js.Object {
  val INs: js.Any = js.native
  var Valuable: org.scalablytyped.runtime.Instantiable4[
    /* vaule */ adoneLib.adoneNs.vaultNs.Vault[adoneLib.adoneNs.vaultNs.Valuable], 
    /* id */ scala.Double, 
    /* metaData */ js.Object, 
    /* tags */ js.Array[js.Object], 
    adoneLib.adoneNs.vaultNs.Valuable
  ] = js.native
  var Vault: org.scalablytyped.runtime.Instantiable1[
    /* options */ adoneLib.adoneNs.vaultNs.INs.VaultConstructorOptions, 
    adoneLib.adoneNs.vaultNs.Vault[adoneLib.adoneNs.vaultNs.Valuable]
  ] = js.native
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

