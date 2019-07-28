package typings.adone.adoneNs.vaultNs.INs

import typings.adone.Anon_EntriesAsArray
import typings.adone.Anon_EntriesAsArrayIncludeEntryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicedValuable extends js.Object {
  def addTag(tag: String): js.Promise[Unit] = js.native
  def delete(name: String): js.Promise[Double] = js.native
  def deleteAllTags(): js.Promise[Unit] = js.native
  def deleteTag(tag: String): js.Promise[Boolean] = js.native
  def entries(): js.Promise[js.Object] = js.native
  def entries(
    opts: (ValueableEntriesOptions with (Anon_EntriesAsArray | Anon_EntriesAsArrayIncludeEntryId)) | ValueableEntriesOptions
  ): js.Promise[js.Array[ValuableEntry]] = js.native
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
  def setNotes(notes: String): js.Promise[Double] = js.native
  def tags(): js.Array[js.Object] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opts: ValuableToJSONOptions): js.Object = js.native
  def `type`(name: String): js.Any = js.native
}

