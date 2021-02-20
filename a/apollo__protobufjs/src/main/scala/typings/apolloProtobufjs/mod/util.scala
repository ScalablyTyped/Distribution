package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("@apollo/protobufjs", "util")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@apollo/protobufjs", "util.Array")
  @js.native
  class Array protected () extends Uint8Array {
    def this(params: js.Any*) = this()
  }
  /** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
  @JSImport("@apollo/protobufjs", "util.Array")
  @js.native
  def Array: Constructor[Uint8Array] = js.native
  @scala.inline
  def Array_=(x: Constructor[Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@apollo/protobufjs", "util.Buffer")
  @js.native
  class Buffer protected () extends Uint8Array {
    def this(params: js.Any*) = this()
  }
  /** Node's Buffer class if available. */
  @JSImport("@apollo/protobufjs", "util.Buffer")
  @js.native
  def Buffer: Constructor[typings.apolloProtobufjs.mod.Buffer] = js.native
  @scala.inline
  def Buffer_=(x: Constructor[typings.apolloProtobufjs.mod.Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(x.asInstanceOf[js.Any])
  
  /** A minimal event emitter. */
  @JSImport("@apollo/protobufjs", "util.EventEmitter")
  @js.native
  /** Constructs a new event emitter instance. */
  class EventEmitter () extends StObject {
    
    /**
      * Emits an event by calling its listeners with the specified arguments.
      * @param evt Event name
      * @param args Arguments
      * @returns `this`
      */
    def emit(evt: String, args: js.Any*): this.type = js.native
    
    /**
      * Removes an event listener or any matching listeners if arguments are omitted.
      * @param [evt] Event name. Removes all listeners if omitted.
      * @param [fn] Listener to remove. Removes all listeners of `evt` if omitted.
      * @returns `this`
      */
    def off(): this.type = js.native
    def off(evt: js.UndefOr[scala.Nothing], fn: EventEmitterListener): this.type = js.native
    def off(evt: String): this.type = js.native
    def off(evt: String, fn: EventEmitterListener): this.type = js.native
    
    /**
      * Registers an event listener.
      * @param evt Event name
      * @param fn Listener
      * @param [ctx] Listener context
      * @returns `this`
      */
    def on(evt: String, fn: EventEmitterListener): this.type = js.native
    def on(evt: String, fn: EventEmitterListener, ctx: js.Any): this.type = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@apollo/protobufjs", "util.Long")
  @js.native
  class Long protected ()
    extends typings.long.mod.Long {
    def this(params: js.Any*) = this()
  }
  /** Long.js's Long class if available. */
  @JSImport("@apollo/protobufjs", "util.Long")
  @js.native
  def Long: Constructor[typings.long.mod.Long] = js.native
  
  /** Helper class for working with the low and high bits of a 64 bit value. */
  @JSImport("@apollo/protobufjs", "util.LongBits")
  @js.native
  class LongBits protected () extends StObject {
    /**
      * Constructs new long bits.
      * @param lo Low 32 bits, unsigned
      * @param hi High 32 bits, unsigned
      */
    def this(lo: Double, hi: Double) = this()
    
    /** High bits. */
    var hi: Double = js.native
    
    /**
      * Calculates the length of this longbits when encoded as a varint.
      * @returns Length
      */
    def length(): Double = js.native
    
    /** Low bits. */
    var lo: Double = js.native
    
    /**
      * Converts this long bits to a 8 characters long hash.
      * @returns Hash
      */
    def toHash(): String = js.native
    
    /**
      * Converts this long bits to a long.
      * @param [unsigned=false] Whether unsigned or not
      * @returns Long
      */
    def toLong(): typings.long.mod.Long = js.native
    def toLong(unsigned: Boolean): typings.long.mod.Long = js.native
    
    /**
      * Converts this long bits to a possibly unsafe JavaScript number.
      * @param [unsigned=false] Whether unsigned or not
      * @returns Possibly unsafe number
      */
    def toNumber(): Double = js.native
    def toNumber(unsigned: Boolean): Double = js.native
    
    /**
      * Zig-zag decodes this long bits.
      * @returns `this`
      */
    def zzDecode(): LongBits = js.native
    
    /**
      * Zig-zag encodes this long bits.
      * @returns `this`
      */
    def zzEncode(): LongBits = js.native
  }
  object LongBits {
    
    @JSImport("@apollo/protobufjs", "util.LongBits")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@apollo/protobufjs", "util.LongBits.from")
    @js.native
    def from(value: String): LongBits = js.native
    @JSImport("@apollo/protobufjs", "util.LongBits.from")
    @js.native
    def from(value: Double): LongBits = js.native
    /**
      * Constructs new long bits from a number, long or string.
      * @param value Value
      * @returns Instance
      */
    /* static member */
    @JSImport("@apollo/protobufjs", "util.LongBits.from")
    @js.native
    def from(value: typings.long.mod.Long): LongBits = js.native
    
    /**
      * Constructs new long bits from the specified 8 characters long hash.
      * @param hash Hash
      * @returns Bits
      */
    /* static member */
    @JSImport("@apollo/protobufjs", "util.LongBits.fromHash")
    @js.native
    def fromHash(hash: String): LongBits = js.native
    
    /**
      * Constructs new long bits from the specified number.
      * @param value Value
      * @returns Instance
      */
    /* static member */
    @JSImport("@apollo/protobufjs", "util.LongBits.fromNumber")
    @js.native
    def fromNumber(value: Double): LongBits = js.native
    
    /** Zero bits. */
    /* static member */
    @JSImport("@apollo/protobufjs", "util.LongBits.zero")
    @js.native
    def zero: LongBits = js.native
    
    /** Zero hash. */
    /* static member */
    @JSImport("@apollo/protobufjs", "util.LongBits.zeroHash")
    @js.native
    def zeroHash: String = js.native
    @scala.inline
    def zeroHash_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroHash")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def zero_=(x: LongBits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Long_=(x: Constructor[typings.long.mod.Long]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
  
  /** Error subclass indicating a protocol specifc error. */
  @JSImport("@apollo/protobufjs", "util.ProtocolError")
  @js.native
  class ProtocolError[T /* <: Message[T] */] protected () extends Error {
    /**
      * Constructs a new protocol error.
      * @param message Error message
      * @param [properties] Additional properties
      */
    def this(message: String) = this()
    def this(message: String, properties: StringDictionary[js.UndefOr[js.Any]]) = this()
    
    /** So far decoded message instance. */
    var instance: Message[T] = js.native
  }
  
  /**
    * Returns a promise from a node-style callback function.
    * @param fn Function to call
    * @param ctx Function context
    * @param params Function arguments
    * @returns Promisified function
    */
  @JSImport("@apollo/protobufjs", "util.asPromise")
  @js.native
  def asPromise(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[_] = js.native
  
  /** A minimal base64 implementation for number arrays. */
  object base64 {
    
    /**
      * Decodes a base64 encoded string to a buffer.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Number of bytes written
      * @throws {Error} If encoding is invalid
      */
    @JSImport("@apollo/protobufjs", "util.base64.decode")
    @js.native
    def decode(string: String, buffer: Uint8Array, offset: Double): Double = js.native
    
    /**
      * Encodes a buffer to a base64 encoded string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns Base64 encoded string
      */
    @JSImport("@apollo/protobufjs", "util.base64.encode")
    @js.native
    def encode(buffer: Uint8Array, start: Double, end: Double): String = js.native
    
    /**
      * Calculates the byte length of a base64 encoded string.
      * @param string Base64 encoded string
      * @returns Byte length
      */
    @JSImport("@apollo/protobufjs", "util.base64.length")
    @js.native
    def length(string: String): Double = js.native
    
    /**
      * Tests if the specified string appears to be base64 encoded.
      * @param string String to test
      * @returns `true` if probably base64 encoded, otherwise false
      */
    @JSImport("@apollo/protobufjs", "util.base64.test")
    @js.native
    def test(string: String): Boolean = js.native
  }
  
  /**
    * Converts a string to camel case.
    * @param str String to convert
    * @returns Converted string
    */
  @JSImport("@apollo/protobufjs", "util.camelCase")
  @js.native
  def camelCase(str: String): String = js.native
  
  object codegen {
    
    /**
      * Begins generating a function.
      * @param [functionName] Function name if not anonymous
      * @returns Appender that appends code to the function's body
      */
    @JSImport("@apollo/protobufjs", "util.codegen")
    @js.native
    def apply(): Codegen = js.native
    @JSImport("@apollo/protobufjs", "util.codegen")
    @js.native
    def apply(functionName: String): Codegen = js.native
    /**
      * Begins generating a function.
      * @param functionParams Function parameter names
      * @param [functionName] Function name if not anonymous
      * @returns Appender that appends code to the function's body
      */
    @JSImport("@apollo/protobufjs", "util.codegen")
    @js.native
    def apply(functionParams: js.Array[String]): Codegen = js.native
    @JSImport("@apollo/protobufjs", "util.codegen")
    @js.native
    def apply(functionParams: js.Array[String], functionName: String): Codegen = js.native
    @JSImport("@apollo/protobufjs", "util.codegen")
    @js.native
    val ^ : js.Any = js.native
    
    /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
    @JSImport("@apollo/protobufjs", "util.codegen.verbose")
    @js.native
    def verbose: Boolean = js.native
    @scala.inline
    def verbose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Compares reflected fields by id.
    * @param a First field
    * @param b Second field
    * @returns Comparison value
    */
  @JSImport("@apollo/protobufjs", "util.compareFieldsById")
  @js.native
  def compareFieldsById(a: Field, b: Field): Double = js.native
  
  /**
    * Decorator helper for enums (TypeScript).
    * @param object Enum object
    * @returns Reflected enum
    */
  @JSImport("@apollo/protobufjs", "util.decorateEnum")
  @js.native
  def decorateEnum(`object`: js.Object): Enum = js.native
  
  /** Decorator root (TypeScript). */
  @JSImport("@apollo/protobufjs", "util.decorateRoot")
  @js.native
  def decorateRoot: Root = js.native
  @scala.inline
  def decorateRoot_=(x: Root): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorateRoot")(x.asInstanceOf[js.Any])
  
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  @JSImport("@apollo/protobufjs", "util.decorateType")
  @js.native
  def decorateType[T /* <: Message[T] */](ctor: Constructor[T]): Type = js.native
  @JSImport("@apollo/protobufjs", "util.decorateType")
  @js.native
  def decorateType[T /* <: Message[T] */](ctor: Constructor[T], typeName: String): Type = js.native
  
  /** An immuable empty array. */
  @JSImport("@apollo/protobufjs", "util.emptyArray")
  @js.native
  val emptyArray: js.Array[js.Any] = js.native
  
  /** An immutable empty object. */
  @JSImport("@apollo/protobufjs", "util.emptyObject")
  @js.native
  val emptyObject: js.Object = js.native
  
  /**
    * Fetches the contents of a file.
    * @param filename File path or url
    * @param options Fetch options
    * @param callback Callback function
    */
  @JSImport("@apollo/protobufjs", "util.fetch")
  @js.native
  def fetch(filename: String, options: IFetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param [options] Fetch options
    * @returns Promise
    */
  @JSImport("@apollo/protobufjs", "util.fetch")
  @js.native
  def fetch(path: String): js.Promise[String | Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param callback Callback function
    */
  @JSImport("@apollo/protobufjs", "util.fetch")
  @js.native
  def fetch(path: String, callback: FetchCallback): Unit = js.native
  @JSImport("@apollo/protobufjs", "util.fetch")
  @js.native
  def fetch(path: String, options: IFetchOptions): js.Promise[String | Uint8Array] = js.native
  
  /** Reads / writes floats / doubles from / to buffers. */
  object float {
    
    /**
      * Reads a 64 bit double from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @JSImport("@apollo/protobufjs", "util.float.readDoubleBE")
    @js.native
    def readDoubleBE(buf: Uint8Array, pos: Double): Double = js.native
    
    /**
      * Reads a 64 bit double from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @JSImport("@apollo/protobufjs", "util.float.readDoubleLE")
    @js.native
    def readDoubleLE(buf: Uint8Array, pos: Double): Double = js.native
    
    /**
      * Reads a 32 bit float from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @JSImport("@apollo/protobufjs", "util.float.readFloatBE")
    @js.native
    def readFloatBE(buf: Uint8Array, pos: Double): Double = js.native
    
    /**
      * Reads a 32 bit float from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @JSImport("@apollo/protobufjs", "util.float.readFloatLE")
    @js.native
    def readFloatLE(buf: Uint8Array, pos: Double): Double = js.native
    
    /**
      * Writes a 64 bit double to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @JSImport("@apollo/protobufjs", "util.float.writeDoubleBE")
    @js.native
    def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
    
    /**
      * Writes a 64 bit double to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @JSImport("@apollo/protobufjs", "util.float.writeDoubleLE")
    @js.native
    def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
    
    /**
      * Writes a 32 bit float to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @JSImport("@apollo/protobufjs", "util.float.writeFloatBE")
    @js.native
    def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
    
    /**
      * Writes a 32 bit float to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @JSImport("@apollo/protobufjs", "util.float.writeFloatLE")
    @js.native
    def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  }
  
  /**
    * Requires a module only if available.
    * @param moduleName Module to require
    * @returns Required module if available and not empty, otherwise `null`
    */
  @JSImport("@apollo/protobufjs", "util.inquire")
  @js.native
  def inquire(moduleName: String): js.Object = js.native
  
  /**
    * Tests if the specified value is an integer.
    * @param value Value to test
    * @returns `true` if the value is an integer
    */
  @JSImport("@apollo/protobufjs", "util.isInteger")
  @js.native
  def isInteger(value: js.Any): Boolean = js.native
  
  /** Whether running within node or not. */
  @JSImport("@apollo/protobufjs", "util.isNode")
  @js.native
  val isNode: Boolean = js.native
  
  /**
    * Tests if the specified value is a non-null object.
    * @param value Value to test
    * @returns `true` if the value is a non-null object
    */
  @JSImport("@apollo/protobufjs", "util.isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  /**
    * Tests whether the specified name is a reserved word in JS.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  @JSImport("@apollo/protobufjs", "util.isReserved")
  @js.native
  def isReserved(name: String): Boolean = js.native
  
  /**
    * Checks if a property on a message is considered to be present.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  @JSImport("@apollo/protobufjs", "util.isSet")
  @js.native
  def isSet_(obj: js.Object, prop: String): Boolean = js.native
  
  /**
    * Tests if the specified value is a string.
    * @param value Value to test
    * @returns `true` if the value is a string
    */
  @JSImport("@apollo/protobufjs", "util.isString")
  @js.native
  def isString(value: js.Any): Boolean = js.native
  
  /**
    * Checks if a property on a message is considered to be present.
    * This is an alias of {@link util.isSet}.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  @JSImport("@apollo/protobufjs", "util.isset")
  @js.native
  def isset(obj: js.Object, prop: String): Boolean = js.native
  
  /** Regular expression used to verify 2 bit (`bool`) map keys. */
  @JSImport("@apollo/protobufjs", "util.key2Re")
  @js.native
  val key2Re: RegExp = js.native
  
  /** Regular expression used to verify 32 bit (`int32` etc.) map keys. */
  @JSImport("@apollo/protobufjs", "util.key32Re")
  @js.native
  val key32Re: RegExp = js.native
  
  /** Regular expression used to verify 64 bit (`int64` etc.) map keys. */
  @JSImport("@apollo/protobufjs", "util.key64Re")
  @js.native
  val key64Re: RegExp = js.native
  
  /**
    * Converts the first character of a string to lower case.
    * @param str String to convert
    * @returns Converted string
    */
  @JSImport("@apollo/protobufjs", "util.lcFirst")
  @js.native
  def lcFirst(str: String): String = js.native
  
  /**
    * Converts an 8 characters long hash string to a long or number.
    * @param hash Hash
    * @param [unsigned=false] Whether unsigned or not
    * @returns Original value
    */
  @JSImport("@apollo/protobufjs", "util.longFromHash")
  @js.native
  def longFromHash(hash: String): typings.long.mod.Long | Double = js.native
  @JSImport("@apollo/protobufjs", "util.longFromHash")
  @js.native
  def longFromHash(hash: String, unsigned: Boolean): typings.long.mod.Long | Double = js.native
  
  @JSImport("@apollo/protobufjs", "util.longToHash")
  @js.native
  def longToHash(value: Double): String = js.native
  /**
    * Converts a number or long to an 8 characters long hash string.
    * @param value Value to convert
    * @returns Hash
    */
  @JSImport("@apollo/protobufjs", "util.longToHash")
  @js.native
  def longToHash(value: typings.long.mod.Long): String = js.native
  
  /**
    * Merges the properties of the source object into the destination object.
    * @param dst Destination object
    * @param src Source object
    * @param [ifNotSet=false] Merges only if the key is not already set
    * @returns Destination object
    */
  @JSImport("@apollo/protobufjs", "util.merge")
  @js.native
  def merge(dst: StringDictionary[js.UndefOr[js.Any]], src: StringDictionary[js.UndefOr[js.Any]]): StringDictionary[js.UndefOr[js.Any]] = js.native
  @JSImport("@apollo/protobufjs", "util.merge")
  @js.native
  def merge(
    dst: StringDictionary[js.UndefOr[js.Any]],
    src: StringDictionary[js.UndefOr[js.Any]],
    ifNotSet: Boolean
  ): StringDictionary[js.UndefOr[js.Any]] = js.native
  
  /**
    * Creates a new buffer of whatever type supported by the environment.
    * @param [sizeOrArray=0] Buffer size or number array
    * @returns Buffer
    */
  @JSImport("@apollo/protobufjs", "util.newBuffer")
  @js.native
  def newBuffer(): Uint8Array | typings.apolloProtobufjs.mod.Buffer = js.native
  @JSImport("@apollo/protobufjs", "util.newBuffer")
  @js.native
  def newBuffer(sizeOrArray: js.Array[Double]): Uint8Array | typings.apolloProtobufjs.mod.Buffer = js.native
  @JSImport("@apollo/protobufjs", "util.newBuffer")
  @js.native
  def newBuffer(sizeOrArray: Double): Uint8Array | typings.apolloProtobufjs.mod.Buffer = js.native
  
  /**
    * Creates a custom error constructor.
    * @param name Error name
    * @returns Custom error constructor
    */
  @JSImport("@apollo/protobufjs", "util.newError")
  @js.native
  def newError(name: String): Constructor[Error] = js.native
  
  /**
    * Builds a getter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound getter
    */
  @JSImport("@apollo/protobufjs", "util.oneOfGetter")
  @js.native
  def oneOfGetter(fieldNames: js.Array[String]): OneOfGetter = js.native
  
  /**
    * Builds a setter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound setter
    */
  @JSImport("@apollo/protobufjs", "util.oneOfSetter")
  @js.native
  def oneOfSetter(fieldNames: js.Array[String]): OneOfSetter = js.native
  
  /** A minimal path module to resolve Unix, Windows and URL paths alike. */
  object path {
    
    /**
      * Tests if the specified path is absolute.
      * @param path Path to test
      * @returns `true` if path is absolute
      */
    @JSImport("@apollo/protobufjs", "util.path.isAbsolute")
    @js.native
    def isAbsolute(path: String): Boolean = js.native
    
    /**
      * Normalizes the specified path.
      * @param path Path to normalize
      * @returns Normalized path
      */
    @JSImport("@apollo/protobufjs", "util.path.normalize")
    @js.native
    def normalize(path: String): String = js.native
    
    /**
      * Resolves the specified include path against the specified origin path.
      * @param originPath Path to the origin file
      * @param includePath Include path relative to origin path
      * @param [alreadyNormalized=false] `true` if both paths are already known to be normalized
      * @returns Path to the include file
      */
    @JSImport("@apollo/protobufjs", "util.path.resolve")
    @js.native
    def resolve(originPath: String, includePath: String): String = js.native
    @JSImport("@apollo/protobufjs", "util.path.resolve")
    @js.native
    def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = js.native
  }
  
  /**
    * A general purpose buffer pool.
    * @param alloc Allocator
    * @param slice Slicer
    * @param [size=8192] Slab size
    * @returns Pooled allocator
    */
  @JSImport("@apollo/protobufjs", "util.pool")
  @js.native
  def pool(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = js.native
  @JSImport("@apollo/protobufjs", "util.pool")
  @js.native
  def pool(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = js.native
  
  /**
    * Returns a safe property accessor for the specified property name.
    * @param prop Property name
    * @returns Safe accessor
    */
  @JSImport("@apollo/protobufjs", "util.safeProp")
  @js.native
  def safeProp(prop: String): String = js.native
  
  /**
    * Converts an object's values to an array.
    * @param object Object to convert
    * @returns Converted array
    */
  @JSImport("@apollo/protobufjs", "util.toArray")
  @js.native
  def toArray(`object`: StringDictionary[js.UndefOr[js.Any]]): js.Array[_] = js.native
  
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
  @JSImport("@apollo/protobufjs", "util.toJSONOptions")
  @js.native
  def toJSONOptions: IConversionOptions = js.native
  @scala.inline
  def toJSONOptions_=(x: IConversionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSONOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Converts an array of keys immediately followed by their respective value to an object, omitting undefined values.
    * @param array Array to convert
    * @returns Converted object
    */
  @JSImport("@apollo/protobufjs", "util.toObject")
  @js.native
  def toObject(array: js.Array[_]): StringDictionary[js.UndefOr[js.Any]] = js.native
  
  /**
    * Converts the first character of a string to upper case.
    * @param str String to convert
    * @returns Converted string
    */
  @JSImport("@apollo/protobufjs", "util.ucFirst")
  @js.native
  def ucFirst(str: String): String = js.native
  
  /** A minimal UTF8 implementation for number arrays. */
  object utf8 {
    
    /**
      * Calculates the UTF8 byte length of a string.
      * @param string String
      * @returns Byte length
      */
    @JSImport("@apollo/protobufjs", "util.utf8.length")
    @js.native
    def length(string: String): Double = js.native
    
    /**
      * Reads UTF8 bytes as a string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns String read
      */
    @JSImport("@apollo/protobufjs", "util.utf8.read")
    @js.native
    def read(buffer: Uint8Array, start: Double, end: Double): String = js.native
    
    /**
      * Writes a string as UTF8 bytes.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Bytes written
      */
    @JSImport("@apollo/protobufjs", "util.utf8.write")
    @js.native
    def write(string: String, buffer: Uint8Array, offset: Double): Double = js.native
  }
  
  /** Node's fs module if available. */
  object fs
}
