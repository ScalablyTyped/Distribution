package typings
package adoneLib.adoneNs.dataNs.mpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.mpak")
@js.native
object mpakNsMembers extends js.Object {
  /**
               * An instance of default adone serializer with registered encoders/decoders for standard js/adone types like
               * x.Exception, Error, Date, Map, Set, math.Long
               */
  val serializer: Serializer = js.native
  /**
               * Decoder the given buffer
               */
  def decode(buf: adoneLib.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable): js.Any = js.native
  /**
               * Encodes the given object
               */
  def encode(obj: js.Any): nodeLib.Buffer = js.native
  def registerCommonTypesFor(s: Serializer): scala.Unit = js.native
  def tryDecode(buf: adoneLib.adoneNs.collectionNs.ByteArray): js.Any = js.native
}

