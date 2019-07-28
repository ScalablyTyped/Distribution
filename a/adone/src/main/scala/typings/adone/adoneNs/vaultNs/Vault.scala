package typings.adone.adoneNs.vaultNs

import org.scalablytyped.runtime.StringDictionary
import typings.adone.Anon_IncludeStats
import typings.adone.Anon_IncludeStatsTrue
import typings.adone.Anon_PrivateProps
import typings.adone.Anon_Stats
import typings.adone.Anon_Valuable
import typings.adone.adoneNs.vaultNs.INs.VaultClearOptions
import typings.adone.adoneNs.vaultNs.INs.VaultConstructorOptions
import typings.adone.adoneNs.vaultNs.INs.VaultToJSONOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.vault.Vault")
@js.native
class Vault[T /* <: Valuable */] protected () extends js.Object {
  def this(options: VaultConstructorOptions) = this()
  def addTag(tag: String): js.Promise[Double | Null] = js.native
  def addTag(tag: String, vid: Double): js.Promise[Double | Null] = js.native
  def clear(): js.Promise[Double] = js.native
  def clear(options: VaultClearOptions): js.Promise[Double] = js.native
  def close(): js.Promise[Unit] = js.native
  def create(name: String): js.Promise[T] = js.native
  def create(name: String, tags: js.Array[String]): js.Promise[T] = js.native
  def delete(name: String): js.Promise[Unit] = js.native
  def deleteTag(tag: String): js.Promise[Boolean] = js.native
  def entries(): js.Promise[StringDictionary[_]] = js.native
  def get(name: String): js.Promise[T] = js.native
  def getNotes(): String = js.native
  def has(name: String): Boolean = js.native
  def keys(): js.Array[String] = js.native
  def location(): String = js.native
  def open(): js.Promise[Unit] = js.native
  def release(name: String): Unit = js.native
  def setNotes(notes: String): js.Promise[Unit] = js.native
  def tagNames(): js.Array[String] = js.native
  def tagNames(ids: js.Array[Double]): js.Array[String] = js.native
  def tags(): js.Array[js.Object] = js.native
  def tags(ids: js.Array[Double]): js.Array[js.Object] = js.native
  def tags(ids: js.Array[Double], opts: Anon_PrivateProps): js.Array[js.Object] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(options: VaultToJSONOptions with (Anon_IncludeStats | Anon_IncludeStatsTrue | Anon_Valuable)): js.Promise[Anon_Stats] = js.native
  def values(): js.Promise[js.Array[_]] = js.native
}

