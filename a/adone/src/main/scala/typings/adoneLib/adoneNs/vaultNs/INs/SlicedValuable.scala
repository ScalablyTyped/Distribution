package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicedValuable extends js.Object {
  def addTag(tag: java.lang.String): js.Promise[scala.Unit] = js.native
  def delete(name: java.lang.String): js.Promise[scala.Double] = js.native
  def deleteAllTags(): js.Promise[scala.Unit] = js.native
  def deleteTag(tag: java.lang.String): js.Promise[scala.Boolean] = js.native
  def entries(): js.Promise[js.Object] = js.native
  def entries(
    opts: (ValueableEntriesOptions with (adoneLib.Anon_EntriesAsArray | adoneLib.Anon_EntriesAsArrayTrue)) | ValueableEntriesOptions
  ): js.Promise[js.Array[ValuableEntry]] = js.native
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
  def setNotes(notes: java.lang.String): js.Promise[scala.Double] = js.native
  def tags(): js.Array[js.Object] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opts: ValuableToJSONOptions): js.Object = js.native
  def `type`(name: java.lang.String): js.Any = js.native
}

