package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.adoneNs.dataNs.bsonNs.INs.DeserializeOptions
import typings.adone.adoneNs.dataNs.bsonNs.INs.SerializeOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.bson")
@js.native
object ^ extends js.Object {
  /**
    * BSON serializator instance
    */
  val serializer: BSON = js.native
  /**
    * Decodes the given buffer with enabled buffers and values promoting
    */
  def decode(buf: Buffer): js.Any = js.native
  def decode(buf: Buffer, options: DeserializeOptions): js.Any = js.native
  /**
    * Encodes the given object
    */
  def encode(obj: js.Object): Buffer = js.native
  def encode(obj: js.Object, options: SerializeOptions): Buffer = js.native
}

