package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.Anon_ArgsAny
import typings.adone.Anon_IgnoreUndefined
import typings.adone.Anon_IndexNumber
import typings.adone.adoneNs.dataNs.bsonNs.INs.DeserializeOptions
import typings.adone.adoneNs.dataNs.bsonNs.INs.SerializeOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a BSON serializer
  */
@JSGlobal("adone.data.bson.BSON")
@js.native
class BSON () extends js.Object {
  def this(types: js.Array[Anon_ArgsAny]) = this()
  /**
    * Calculates the size BSON object for the given object
    */
  def calculateObjectSize(`object`: js.Object): scala.Double = js.native
  def calculateObjectSize(`object`: js.Object, options: Anon_IgnoreUndefined): scala.Double = js.native
  /**
    * Deserializes the given buffer into an object
    */
  def deserialize(buf: Buffer): js.Any = js.native
  def deserialize(buf: Buffer, options: DeserializeOptions): js.Any = js.native
  /**
    * Takes a node.js Buffer, startIndex and allow more control over deserialization of a Buffer containing concatenated BSON documents
    */
  def deserializeStream(
    buf: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  def deserializeStream(
    buf: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = js.native
  /**
    * Serializes a js object into a buffer
    */
  def serialize(`object`: js.Object): Buffer = js.native
  def serialize(`object`: js.Object, options: SerializeOptions): Buffer = js.native
  /**
    * Takes an object, a target buffer instance and an optional options object and returns the end serialization index
    * in the final buffer
    */
  def serializeWithBufferAndIndex(`object`: js.Object, buffer: Buffer): scala.Double = js.native
  def serializeWithBufferAndIndex(`object`: js.Object, buffer: Buffer, options: SerializeOptions with Anon_IndexNumber): scala.Double = js.native
}

