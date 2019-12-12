package typings.atApolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Codegen
import typings.atApolloProtobufjs.atApolloProtobufjsMod.Constructor
import typings.atApolloProtobufjs.atApolloProtobufjsMod.FetchCallback
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IConversionOptions
import typings.atApolloProtobufjs.atApolloProtobufjsMod.IFetchOptions
import typings.atApolloProtobufjs.atApolloProtobufjsMod.OneOfGetter
import typings.atApolloProtobufjs.atApolloProtobufjsMod.OneOfSetter
import typings.atApolloProtobufjs.atApolloProtobufjsMod.PoolAllocator
import typings.atApolloProtobufjs.atApolloProtobufjsMod.PoolSlicer
import typings.atApolloProtobufjs.atApolloProtobufjsMod.asPromiseCallback
import typings.long.longMod.^
import typings.std.Error
import typings.std.RegExp
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/minimal", "util")
@js.native
object util extends js.Object {
  @js.native
  class Array protected () extends Uint8Array {
    def this(params: js.Any*) = this()
  }
  
  @js.native
  class Buffer protected () extends Uint8Array {
    def this(params: js.Any*) = this()
  }
  
  /** A minimal event emitter. */
  @js.native
  /** Constructs a new event emitter instance. */
  class EventEmitter ()
    extends typings.atApolloProtobufjs.atApolloProtobufjsMod.util.EventEmitter
  
  @js.native
  class Long protected () extends ^ {
    def this(params: js.Any*) = this()
  }
  
  /** Helper class for working with the low and high bits of a 64 bit value. */
  @js.native
  class LongBits protected ()
    extends typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits {
    /**
      * Constructs new long bits.
      * @param lo Low 32 bits, unsigned
      * @param hi High 32 bits, unsigned
      */
    def this(lo: Double, hi: Double) = this()
  }
  
  /** Error subclass indicating a protocol specifc error. */
  @js.native
  class ProtocolError[T /* <: typings.atApolloProtobufjs.atApolloProtobufjsMod.Message[T] */] protected ()
    extends typings.atApolloProtobufjs.atApolloProtobufjsMod.util.ProtocolError[T] {
    /**
      * Constructs a new protocol error.
      * @param message Error message
      * @param [properties] Additional properties
      */
    def this(message: String) = this()
    def this(message: String, properties: StringDictionary[js.Any]) = this()
  }
  
  /** Decorator root (TypeScript). */
  var decorateRoot: typings.atApolloProtobufjs.atApolloProtobufjsMod.Root = js.native
  /** An immuable empty array. */
  val emptyArray: js.Array[js.Any] = js.native
  /** An immutable empty object. */
  val emptyObject: js.Object = js.native
  /** Whether running within node or not. */
  val isNode: Boolean = js.native
  /** Regular expression used to verify 2 bit (`bool`) map keys. */
  val key2Re: RegExp = js.native
  /** Regular expression used to verify 32 bit (`int32` etc.) map keys. */
  val key32Re: RegExp = js.native
  /** Regular expression used to verify 64 bit (`int64` etc.) map keys. */
  val key64Re: RegExp = js.native
  /**
    * Default conversion options used for {@link Message#toJSON} implementations.
    *
    * These options are close to proto3's JSON mapping with the exception that internal types like Any are handled just like messages. More precisely:
    *
    * - Longs become strings
    * - Enums become string keys
    * - Bytes become base64 encoded strings
    * - (Sub-)Messages become plain objects
    * - Maps become plain objects with all string keys
    * - Repeated fields become arrays
    * - NaN and Infinity for float and double fields become strings
    *
    * @see https://developers.google.com/protocol-buffers/docs/proto3?hl=en#json
    */
  var toJSONOptions: IConversionOptions = js.native
  /**
    * Returns a promise from a node-style callback function.
    * @param fn Function to call
    * @param ctx Function context
    * @param params Function arguments
    * @returns Promisified function
    */
  def asPromise(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[_] = js.native
  /**
    * Converts a string to camel case.
    * @param str String to convert
    * @returns Converted string
    */
  def camelCase(str: String): String = js.native
  /**
    * Compares reflected fields by id.
    * @param a First field
    * @param b Second field
    * @returns Comparison value
    */
  def compareFieldsById(
    a: typings.atApolloProtobufjs.atApolloProtobufjsMod.Field,
    b: typings.atApolloProtobufjs.atApolloProtobufjsMod.Field
  ): Double = js.native
  /**
    * Decorator helper for enums (TypeScript).
    * @param object Enum object
    * @returns Reflected enum
    */
  def decorateEnum(`object`: js.Object): typings.atApolloProtobufjs.atApolloProtobufjsMod.Enum = js.native
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  def decorateType[T /* <: typings.atApolloProtobufjs.atApolloProtobufjsMod.Message[T] */](ctor: Constructor[T]): typings.atApolloProtobufjs.atApolloProtobufjsMod.Type = js.native
  def decorateType[T /* <: typings.atApolloProtobufjs.atApolloProtobufjsMod.Message[T] */](ctor: Constructor[T], typeName: String): typings.atApolloProtobufjs.atApolloProtobufjsMod.Type = js.native
  /**
    * Fetches the contents of a file.
    * @param filename File path or url
    * @param options Fetch options
    * @param callback Callback function
    */
  def fetch(filename: String, options: IFetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param [options] Fetch options
    * @returns Promise
    */
  def fetch(path: String): js.Promise[String | Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param callback Callback function
    */
  def fetch(path: String, callback: FetchCallback): Unit = js.native
  def fetch(path: String, options: IFetchOptions): js.Promise[String | Uint8Array] = js.native
  /**
    * Requires a module only if available.
    * @param moduleName Module to require
    * @returns Required module if available and not empty, otherwise `null`
    */
  def inquire(moduleName: String): js.Object = js.native
  /**
    * Tests if the specified value is an integer.
    * @param value Value to test
    * @returns `true` if the value is an integer
    */
  def isInteger(value: js.Any): Boolean = js.native
  /**
    * Tests if the specified value is a non-null object.
    * @param value Value to test
    * @returns `true` if the value is a non-null object
    */
  def isObject(value: js.Any): Boolean = js.native
  /**
    * Tests whether the specified name is a reserved word in JS.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReserved(name: String): Boolean = js.native
  /**
    * Checks if a property on a message is considered to be present.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  def isSet(obj: js.Object, prop: String): Boolean = js.native
  /**
    * Tests if the specified value is a string.
    * @param value Value to test
    * @returns `true` if the value is a string
    */
  def isString(value: js.Any): Boolean = js.native
  /**
    * Checks if a property on a message is considered to be present.
    * This is an alias of {@link util.isSet}.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  def isset(obj: js.Object, prop: String): Boolean = js.native
  /**
    * Converts the first character of a string to lower case.
    * @param str String to convert
    * @returns Converted string
    */
  def lcFirst(str: String): String = js.native
  /**
    * Converts an 8 characters long hash string to a long or number.
    * @param hash Hash
    * @param [unsigned=false] Whether unsigned or not
    * @returns Original value
    */
  def longFromHash(hash: String): ^  | Double = js.native
  def longFromHash(hash: String, unsigned: Boolean): ^  | Double = js.native
  def longToHash(value: Double): String = js.native
  /**
    * Converts a number or long to an 8 characters long hash string.
    * @param value Value to convert
    * @returns Hash
    */
  def longToHash(value: ^): String = js.native
  /**
    * Merges the properties of the source object into the destination object.
    * @param dst Destination object
    * @param src Source object
    * @param [ifNotSet=false] Merges only if the key is not already set
    * @returns Destination object
    */
  def merge(dst: StringDictionary[js.Any], src: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def merge(dst: StringDictionary[js.Any], src: StringDictionary[js.Any], ifNotSet: Boolean): StringDictionary[js.Any] = js.native
  /**
    * Creates a new buffer of whatever type supported by the environment.
    * @param [sizeOrArray=0] Buffer size or number array
    * @returns Buffer
    */
  def newBuffer(): Uint8Array | typings.atApolloProtobufjs.atApolloProtobufjsMod.Buffer = js.native
  def newBuffer(sizeOrArray: js.Array[Double]): Uint8Array | typings.atApolloProtobufjs.atApolloProtobufjsMod.Buffer = js.native
  def newBuffer(sizeOrArray: Double): Uint8Array | typings.atApolloProtobufjs.atApolloProtobufjsMod.Buffer = js.native
  /**
    * Creates a custom error constructor.
    * @param name Error name
    * @returns Custom error constructor
    */
  def newError(name: String): Constructor[Error] = js.native
  /**
    * Builds a getter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound getter
    */
  def oneOfGetter(fieldNames: js.Array[String]): OneOfGetter = js.native
  /**
    * Builds a setter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound setter
    */
  def oneOfSetter(fieldNames: js.Array[String]): OneOfSetter = js.native
  /**
    * A general purpose buffer pool.
    * @param alloc Allocator
    * @param slice Slicer
    * @param [size=8192] Slab size
    * @returns Pooled allocator
    */
  def pool(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = js.native
  def pool(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = js.native
  /**
    * Returns a safe property accessor for the specified property name.
    * @param prop Property name
    * @returns Safe accessor
    */
  def safeProp(prop: String): String = js.native
  /**
    * Converts an object's values to an array.
    * @param object Object to convert
    * @returns Converted array
    */
  def toArray(`object`: StringDictionary[js.Any]): js.Array[_] = js.native
  /**
    * Converts an array of keys immediately followed by their respective value to an object, omitting undefined values.
    * @param array Array to convert
    * @returns Converted object
    */
  def toObject(array: js.Array[_]): StringDictionary[js.Any] = js.native
  /**
    * Converts the first character of a string to upper case.
    * @param str String to convert
    * @returns Converted string
    */
  def ucFirst(str: String): String = js.native
  /** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
  @js.native
  object Array extends TopLevel[Constructor[Uint8Array]]
  
  /** Node's Buffer class if available. */
  @js.native
  object Buffer
    extends TopLevel[Constructor[typings.atApolloProtobufjs.atApolloProtobufjsMod.Buffer]]
  
  /** Long.js's Long class if available. */
  @js.native
  object Long extends TopLevel[Constructor[^]]
  
  /* static members */
  @js.native
  object LongBits extends js.Object {
    /** Zero bits. */
    var zero: typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits = js.native
    /** Zero hash. */
    var zeroHash: String = js.native
    def from(value: String): typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits = js.native
    def from(value: Double): typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits = js.native
    /**
      * Constructs new long bits from a number, long or string.
      * @param value Value
      * @returns Instance
      */
    def from(value: ^): typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits = js.native
    /**
      * Constructs new long bits from the specified 8 characters long hash.
      * @param hash Hash
      * @returns Bits
      */
    def fromHash(hash: String): typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits = js.native
    /**
      * Constructs new long bits from the specified number.
      * @param value Value
      * @returns Instance
      */
    def fromNumber(value: Double): typings.atApolloProtobufjs.atApolloProtobufjsMod.util.LongBits = js.native
  }
  
  /** A minimal base64 implementation for number arrays. */
  @js.native
  object base64 extends js.Object {
    /**
      * Decodes a base64 encoded string to a buffer.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Number of bytes written
      * @throws {Error} If encoding is invalid
      */
    def decode(string: String, buffer: Uint8Array, offset: Double): Double = js.native
    /**
      * Encodes a buffer to a base64 encoded string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns Base64 encoded string
      */
    def encode(buffer: Uint8Array, start: Double, end: Double): String = js.native
    /**
      * Calculates the byte length of a base64 encoded string.
      * @param string Base64 encoded string
      * @returns Byte length
      */
    def length(string: String): Double = js.native
    /**
      * Tests if the specified string appears to be base64 encoded.
      * @param string String to test
      * @returns `true` if probably base64 encoded, otherwise false
      */
    def test(string: String): Boolean = js.native
  }
  
  @js.native
  object codegen extends js.Object {
    /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
    var verbose: Boolean = js.native
    /**
      * Begins generating a function.
      * @param [functionName] Function name if not anonymous
      * @returns Appender that appends code to the function's body
      */
    def apply(): Codegen = js.native
    def apply(functionName: String): Codegen = js.native
    /**
      * Begins generating a function.
      * @param functionParams Function parameter names
      * @param [functionName] Function name if not anonymous
      * @returns Appender that appends code to the function's body
      */
    def apply(functionParams: js.Array[String]): Codegen = js.native
    def apply(functionParams: js.Array[String], functionName: String): Codegen = js.native
  }
  
  /** Reads / writes floats / doubles from / to buffers. */
  @js.native
  object float extends js.Object {
    /**
      * Reads a 64 bit double from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readDoubleBE(buf: Uint8Array, pos: Double): Double = js.native
    /**
      * Reads a 64 bit double from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readDoubleLE(buf: Uint8Array, pos: Double): Double = js.native
    /**
      * Reads a 32 bit float from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readFloatBE(buf: Uint8Array, pos: Double): Double = js.native
    /**
      * Reads a 32 bit float from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readFloatLE(buf: Uint8Array, pos: Double): Double = js.native
    /**
      * Writes a 64 bit double to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
    /**
      * Writes a 64 bit double to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
    /**
      * Writes a 32 bit float to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
    /**
      * Writes a 32 bit float to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  }
  
  /** Node's fs module if available. */
  @js.native
  object fs
    extends /* k */ StringDictionary[js.Any]
  
  /** A minimal path module to resolve Unix, Windows and URL paths alike. */
  @js.native
  object path extends js.Object {
    /**
      * Tests if the specified path is absolute.
      * @param path Path to test
      * @returns `true` if path is absolute
      */
    def isAbsolute(path: String): Boolean = js.native
    /**
      * Normalizes the specified path.
      * @param path Path to normalize
      * @returns Normalized path
      */
    def normalize(path: String): String = js.native
    /**
      * Resolves the specified include path against the specified origin path.
      * @param originPath Path to the origin file
      * @param includePath Include path relative to origin path
      * @param [alreadyNormalized=false] `true` if both paths are already known to be normalized
      * @returns Path to the include file
      */
    def resolve(originPath: String, includePath: String): String = js.native
    def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = js.native
  }
  
  /** A minimal UTF8 implementation for number arrays. */
  @js.native
  object utf8 extends js.Object {
    /**
      * Calculates the UTF8 byte length of a string.
      * @param string String
      * @returns Byte length
      */
    def length(string: String): Double = js.native
    /**
      * Reads UTF8 bytes as a string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns String read
      */
    def read(buffer: Uint8Array, start: Double, end: Double): String = js.native
    /**
      * Writes a string as UTF8 bytes.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Bytes written
      */
    def write(string: String, buffer: Uint8Array, offset: Double): Double = js.native
  }
  
}

