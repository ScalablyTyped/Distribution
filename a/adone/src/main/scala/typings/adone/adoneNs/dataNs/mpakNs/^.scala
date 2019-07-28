package typings.adone.adoneNs.dataNs.mpakNs

import typings.adone.adoneNs.collectionNs.ByteArray
import typings.adone.adoneNs.collectionNs.INs.ByteArrayNs.Wrappable
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.mpak")
@js.native
object ^ extends js.Object {
  /**
    * An instance of default adone serializer with registered encoders/decoders for standard js/adone types like
    * x.Exception, Error, Date, Map, Set, math.Long
    */
  val serializer: Serializer = js.native
  /**
    * Decoder the given buffer
    */
  def decode(buf: Wrappable): js.Any = js.native
  /**
    * Encodes the given object
    */
  def encode(obj: js.Any): Buffer = js.native
  def registerCommonTypesFor(s: Serializer): Unit = js.native
  def tryDecode(buf: ByteArray): js.Any = js.native
}

