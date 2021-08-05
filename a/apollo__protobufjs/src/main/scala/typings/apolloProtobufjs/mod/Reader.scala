package typings.apolloProtobufjs.mod

import typings.long.mod.Long
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Reader")
@js.native
class Reader protected () extends StObject {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: Uint8Array) = this()
  
  /**
    * Reads a varint as a boolean.
    * @returns Value read
    */
  def bool(): Boolean = js.native
  
  /** Read buffer. */
  var buf: Uint8Array = js.native
  
  /**
    * Reads a sequence of bytes preceeded by its length as a varint.
    * @returns Value read
    */
  def bytes(): Uint8Array = js.native
  
  /**
    * Reads a double (64 bit float) as a number.
    * @returns Value read
    */
  def double(): Double = js.native
  
  /**
    * Reads fixed 32 bits as an unsigned 32 bit integer.
    * @returns Value read
    */
  def fixed32(): Double = js.native
  
  /**
    * Reads fixed 64 bits.
    * @returns Value read
    */
  def fixed64(): Long = js.native
  
  /**
    * Reads a float (32 bit) as a number.
    * @returns Value read
    */
  def float(): Double = js.native
  
  /**
    * Reads a varint as a signed 32 bit value.
    * @returns Value read
    */
  def int32(): Double = js.native
  
  /**
    * Reads a varint as a signed 64 bit value.
    * @returns Value read
    */
  def int64(): Long = js.native
  
  /** Read buffer length. */
  var len: Double = js.native
  
  /** Read buffer position. */
  var pos: Double = js.native
  
  /**
    * Reads fixed 32 bits as a signed 32 bit integer.
    * @returns Value read
    */
  def sfixed32(): Double = js.native
  
  /**
    * Reads zig-zag encoded fixed 64 bits.
    * @returns Value read
    */
  def sfixed64(): Long = js.native
  
  /**
    * Reads a zig-zag encoded varint as a signed 32 bit value.
    * @returns Value read
    */
  def sint32(): Double = js.native
  
  /**
    * Reads a zig-zag encoded varint as a signed 64 bit value.
    * @returns Value read
    */
  def sint64(): Long = js.native
  
  /**
    * Skips the specified number of bytes if specified, otherwise skips a varint.
    * @param [length] Length if known, otherwise a varint is assumed
    * @returns `this`
    */
  def skip(): Reader = js.native
  def skip(length: Double): Reader = js.native
  
  /**
    * Skips the next element of the specified wire type.
    * @param wireType Wire type received
    * @returns `this`
    */
  def skipType(wireType: Double): Reader = js.native
  
  /**
    * Reads a string preceeded by its byte length as a varint.
    * @returns Value read
    */
  def string(): String = js.native
  
  /**
    * Reads a varint as an unsigned 32 bit value.
    * @returns Value read
    */
  def uint32(): Double = js.native
  
  /**
    * Reads a varint as an unsigned 64 bit value.
    * @returns Value read
    */
  def uint64(): Long = js.native
}
/* static members */
object Reader {
  
  @JSImport("@apollo/protobufjs", "Reader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  inline def create(buffer: Buffer | Uint8Array): Reader | BufferReader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any]).asInstanceOf[Reader | BufferReader]
}
