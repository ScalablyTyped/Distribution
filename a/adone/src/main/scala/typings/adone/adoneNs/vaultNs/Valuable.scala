package typings.adone.adoneNs.vaultNs

import typings.adone.Anon_EntriesAsArray
import typings.adone.Anon_EntriesAsArrayIncludeEntryId
import typings.adone.adoneNs.vaultNs.INs.ValuableClearOptions
import typings.adone.adoneNs.vaultNs.INs.ValuableEntry
import typings.adone.adoneNs.vaultNs.INs.ValuableToJSONOptions
import typings.adone.adoneNs.vaultNs.INs.ValueableEntriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.vault.Valuable")
@js.native
class Valuable protected () extends js.Object {
  def this(vaule: Vault[Valuable], id: Double, metaData: js.Object, tags: js.Array[js.Object]) = this()
  def addTag(tag: String): js.Promise[Unit] = js.native
  def clear(): js.Promise[Double] = js.native
  def clear(opts: ValuableClearOptions): js.Promise[Double] = js.native
  def delete(name: String): js.Promise[Double] = js.native
  def deleteAllTags(): js.Promise[Unit] = js.native
  def deleteTag(tag: String): js.Promise[Boolean] = js.native
  def entries(): js.Promise[js.Object] = js.native
  def entries(
    opts: (ValueableEntriesOptions with (Anon_EntriesAsArray | Anon_EntriesAsArrayIncludeEntryId)) | ValueableEntriesOptions
  ): js.Promise[js.Array[ValuableEntry]] = js.native
   // TODO
  def fromJSON(json: js.Object): js.Promise[Double] = js.native
  def get(name: String): js.Promise[_] = js.native
  def getNotes(): String = js.native
  def has(name: String): Boolean = js.native
  def hasTag(tag: String): Boolean = js.native
  def internalId(): Double = js.native
  def keys(): js.Array[String] = js.native
  def name(): String = js.native
  def set(name: String, value: js.Any): js.Promise[Double] = js.native
  def set(name: String, value: js.Any, `type`: String): js.Promise[Double] = js.native
  def setMulti(entries: js.Object): js.Promise[Unit] = js.native
  def setNotes(notes: String): js.Promise[Unit] = js.native
  def tags(): js.Array[js.Object] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opts: ValuableToJSONOptions): js.Object = js.native
  def `type`(name: String): js.Any = js.native
}

