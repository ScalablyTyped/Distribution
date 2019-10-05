package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.INode
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Node. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Node")
@js.native
/**
  * Constructs a new Node.
  * @param [properties] Properties to set
  */
class Node ()
  extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node {
  def this(properties: INode) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Node")
@js.native
object Node extends js.Object {
  /**
    * Creates a new Node instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Node instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  def create(properties: INode): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  /**
    * Decodes a Node message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Node
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  /**
    * Decodes a Node message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Node
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  /**
    * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
    * @param message Node message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: INode): Writer = js.native
  def encode(message: INode, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
    * @param message Node message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: INode): Writer = js.native
  def encodeDelimited(message: INode, writer: Writer): Writer = js.native
  /**
    * Creates a Node message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Node
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node = js.native
  /**
    * Creates a plain object from a Node message. Also converts values to other types if specified.
    * @param message Node
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Node,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Node message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

