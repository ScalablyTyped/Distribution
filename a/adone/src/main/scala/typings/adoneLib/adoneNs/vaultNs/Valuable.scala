package typings
package adoneLib.adoneNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.vault.Valuable")
@js.native
class Valuable protected () extends js.Object {
  def this(vaule: Vault[Valuable], id: scala.Double, metaData: js.Object, tags: js.Array[js.Object]) = this()
  def addTag(tag: java.lang.String): js.Promise[scala.Unit] = js.native
  def clear(): js.Promise[scala.Double] = js.native
  def clear(opts: adoneLib.adoneNs.vaultNs.INs.ValuableClearOptions): js.Promise[scala.Double] = js.native
  def delete(name: java.lang.String): js.Promise[scala.Double] = js.native
  def deleteAllTags(): js.Promise[scala.Unit] = js.native
  def deleteTag(tag: java.lang.String): js.Promise[scala.Boolean] = js.native
  def entries(): js.Promise[js.Object] = js.native
  def entries(
    opts: (adoneLib.adoneNs.vaultNs.INs.ValueableEntriesOptions with (adoneLib.Anon_EntriesAsArray | adoneLib.Anon_EntriesAsArrayTrue)) | adoneLib.adoneNs.vaultNs.INs.ValueableEntriesOptions
  ): js.Promise[js.Array[adoneLib.adoneNs.vaultNs.INs.ValuableEntry]] = js.native
   // TODO
  def fromJSON(json: js.Object): js.Promise[scala.Double] = js.native
  def get(name: java.lang.String): js.Promise[_] = js.native
  def getNotes(): java.lang.String = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def hasTag(tag: java.lang.String): scala.Boolean = js.native
  def internalId(): scala.Double = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def name(): java.lang.String = js.native
  def set(name: java.lang.String, value: js.Any): js.Promise[scala.Double] = js.native
  def set(name: java.lang.String, value: js.Any, `type`: java.lang.String): js.Promise[scala.Double] = js.native
  def setMulti(entries: js.Object): js.Promise[scala.Unit] = js.native
  def setNotes(notes: java.lang.String): js.Promise[scala.Unit] = js.native
  def tags(): js.Array[js.Object] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opts: adoneLib.adoneNs.vaultNs.INs.ValuableToJSONOptions): js.Object = js.native
  def `type`(name: java.lang.String): js.Any = js.native
}

