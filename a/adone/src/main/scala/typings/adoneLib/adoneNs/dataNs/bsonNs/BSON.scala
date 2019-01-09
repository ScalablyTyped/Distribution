package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a BSON serializer
  */
@JSGlobal("adone.data.bson.BSON")
@js.native
class BSON () extends js.Object {
  def this(types: js.Array[adoneLib.Anon_ArgsAnyType]) = this()
  /**
    * Calculates the size BSON object for the given object
    */
  def calculateObjectSize(`object`: js.Object): scala.Double = js.native
  def calculateObjectSize(`object`: js.Object, options: adoneLib.Anon_IgnoreUndefined): scala.Double = js.native
  /**
    * Deserializes the given buffer into an object
    */
  def deserialize(buf: nodeLib.Buffer): js.Any = js.native
  def deserialize(buf: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.bsonNs.INs.DeserializeOptions): js.Any = js.native
  /**
    * Takes a node.js Buffer, startIndex and allow more control over deserialization of a Buffer containing concatenated BSON documents
    */
  def deserializeStream(
    buf: nodeLib.Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  def deserializeStream(
    buf: nodeLib.Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: adoneLib.adoneNs.dataNs.bsonNs.INs.DeserializeOptions
  ): scala.Double = js.native
  /**
    * Serializes a js object into a buffer
    */
  def serialize(`object`: js.Object): nodeLib.Buffer = js.native
  def serialize(`object`: js.Object, options: adoneLib.adoneNs.dataNs.bsonNs.INs.SerializeOptions): nodeLib.Buffer = js.native
  /**
    * Takes an object, a target buffer instance and an optional options object and returns the end serialization index
    * in the final buffer
    */
  def serializeWithBufferAndIndex(`object`: js.Object, buffer: nodeLib.Buffer): scala.Double = js.native
  def serializeWithBufferAndIndex(
    `object`: js.Object,
    buffer: nodeLib.Buffer,
    options: adoneLib.adoneNs.dataNs.bsonNs.INs.SerializeOptions with adoneLib.Anon_IndexNumber
  ): scala.Double = js.native
}

