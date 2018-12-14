package typings
package adoneLib.adoneNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.vault.Vault")
@js.native
class Vault[T /* <: Valuable */] protected () extends js.Object {
  def this(options: adoneLib.adoneNs.vaultNs.INs.VaultConstructorOptions) = this()
  def addTag(tag: java.lang.String): js.Promise[scala.Double | scala.Null] = js.native
  def addTag(tag: java.lang.String, vid: scala.Double): js.Promise[scala.Double | scala.Null] = js.native
  def clear(): js.Promise[scala.Double] = js.native
  def clear(options: adoneLib.adoneNs.vaultNs.INs.VaultClearOptions): js.Promise[scala.Double] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def create(name: java.lang.String): js.Promise[T] = js.native
  def create(name: java.lang.String, tags: js.Array[java.lang.String]): js.Promise[T] = js.native
  def delete(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteTag(tag: java.lang.String): js.Promise[scala.Boolean] = js.native
  def entries(): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def get(name: java.lang.String): js.Promise[T] = js.native
  def getNotes(): java.lang.String = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def location(): java.lang.String = js.native
  def open(): js.Promise[scala.Unit] = js.native
  def release(name: java.lang.String): scala.Unit = js.native
  def setNotes(notes: java.lang.String): js.Promise[scala.Unit] = js.native
  def tagNames(): js.Array[java.lang.String] = js.native
  def tagNames(ids: js.Array[scala.Double]): js.Array[java.lang.String] = js.native
  def tags(): js.Array[js.Object] = js.native
  def tags(ids: js.Array[scala.Double]): js.Array[js.Object] = js.native
  def tags(ids: js.Array[scala.Double], opts: adoneLib.Anon_PrivateProps): js.Array[js.Object] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(
    options: adoneLib.adoneNs.vaultNs.INs.VaultToJSONOptions with (adoneLib.Anon_IncludeStats | adoneLib.Anon_Valuable | adoneLib.Anon_ValuableObject)
  ): js.Promise[adoneLib.Anon_Valuables] = js.native
  def values(): js.Promise[js.Array[_]] = js.native
}

