package typings.assemblyscriptLoader

import org.scalablytyped.runtime.StringDictionary
import typings.assemblyscriptLoader.anon.Abort
import typings.assemblyscriptLoader.anon.Exports
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.BufferSource
import typings.std.PromiseLike
import typings.std.Record
import typings.std.Response
import typings.std.WebAssembly.Instance
import typings.std.WebAssembly.Memory
import typings.std.WebAssembly.Module
import typings.std.WebAssembly.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@assemblyscript/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def demangle[T /* <: Record[String, Any] */](exports: Record[String, Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("demangle")(exports.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def demangle[T /* <: Record[String, Any] */](exports: Record[String, Any], extendedExports: Record[String, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("demangle")(exports.asInstanceOf[js.Any], extendedExports.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def instantiate[T /* <: Record[String, Any] */](source: BufferSource): js.Promise[ResultObject & Exports[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: BufferSource, imports: Imports): js.Promise[ResultObject & Exports[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: PromiseLike[Module | BufferSource | Response]): js.Promise[ResultObject & Exports[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: PromiseLike[Module | BufferSource | Response], imports: Imports): js.Promise[ResultObject & Exports[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: Response): js.Promise[ResultObject & Exports[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: Response, imports: Imports): js.Promise[ResultObject & Exports[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: Module): js.Promise[ResultObject & Exports[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiate[T /* <: Record[String, Any] */](source: Module, imports: Imports): js.Promise[ResultObject & Exports[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  
  inline def instantiateStreaming[T /* <: Record[String, Any] */](source: PromiseLike[Response]): js.Promise[ResultObject & Exports[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiateStreaming[T /* <: Record[String, Any] */](source: PromiseLike[Response], imports: Imports): js.Promise[ResultObject & Exports[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiateStreaming[T /* <: Record[String, Any] */](source: Response): js.Promise[ResultObject & Exports[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  inline def instantiateStreaming[T /* <: Record[String, Any] */](source: Response, imports: Imports): js.Promise[ResultObject & Exports[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject & Exports[T]]]
  
  inline def instantiateSync[T /* <: Record[String, Any] */](source: BufferSource): ResultObject & Exports[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateSync")(source.asInstanceOf[js.Any]).asInstanceOf[ResultObject & Exports[T]]
  inline def instantiateSync[T /* <: Record[String, Any] */](source: BufferSource, imports: Imports): ResultObject & Exports[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateSync")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[ResultObject & Exports[T]]
  inline def instantiateSync[T /* <: Record[String, Any] */](source: Module): ResultObject & Exports[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateSync")(source.asInstanceOf[js.Any]).asInstanceOf[ResultObject & Exports[T]]
  inline def instantiateSync[T /* <: Record[String, Any] */](source: Module, imports: Imports): ResultObject & Exports[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateSync")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[ResultObject & Exports[T]]
  
  @js.native
  trait ASUtil extends StObject {
    
    /** Performs a full garbage collection cycle. */
    def __collect(): Unit = js.native
    def __collect(incremental: Boolean): Unit = js.native
    
    /** Copies an array's values from the module's memory. Infers the array type from RTTI. */
    def __getArray(ptr: Double): js.Array[Double] = js.native
    
    /** Copies an ArrayBuffer's value from the module's memory. */
    def __getArrayBuffer(ptr: Double): js.typedarray.ArrayBuffer = js.native
    
    /** Gets a live view on an array's values in the module's memory. Infers the array type from RTTI. */
    def __getArrayView(ptr: Double): js.typedarray.ArrayBufferView = js.native
    
    /** Copies a Float32Array's values from the module's memory. */
    def __getFloat32Array(ptr: Double): js.typedarray.Float32Array = js.native
    
    /** Gets a live view on a Float32Array's values in the module's memory. */
    def __getFloat32ArrayView(ptr: Double): js.typedarray.Float32Array = js.native
    
    /** Copies a Float64Array's values from the module's memory. */
    def __getFloat64Array(ptr: Double): js.typedarray.Float64Array = js.native
    
    /** Gets a live view on a Float64Array's values in the module's memory. */
    def __getFloat64ArrayView(ptr: Double): js.typedarray.Float64Array = js.native
    
    /** Gets a function from poiner which contain table's index. */
    def __getFunction(ptr: Double): (js.Function1[/* repeated */ Any, Any]) | Null = js.native
    
    /** Copies an Int16Array's values from the module's memory. */
    def __getInt16Array(ptr: Double): js.typedarray.Int16Array = js.native
    
    /** Gets a live view on an Int16Array's values in the module's memory. */
    def __getInt16ArrayView(ptr: Double): js.typedarray.Int16Array = js.native
    
    /** Copies an Int32Array's values from the module's memory. */
    def __getInt32Array(ptr: Double): js.typedarray.Int32Array = js.native
    
    /** Gets a live view on an Int32Array's values in the module's memory. */
    def __getInt32ArrayView(ptr: Double): js.typedarray.Int32Array = js.native
    
    /** Copies an Int32Array's values from the module's memory. */
    var __getInt64Array: js.UndefOr[js.Function1[/* ptr */ Double, BigInt64Array]] = js.native
    
    /** Gets a live view on an Int32Array's values in the module's memory. */
    var __getInt64ArrayView: js.UndefOr[js.Function1[/* ptr */ Double, BigInt64Array]] = js.native
    
    /** Copies an Int8Array's values from the module's memory. */
    def __getInt8Array(ptr: Double): js.typedarray.Int8Array = js.native
    
    /** Gets a live view on an Int8Array's values in the module's memory. */
    def __getInt8ArrayView(ptr: Double): js.typedarray.Int8Array = js.native
    
    /** Copies a string's value from the module's memory. */
    def __getString(ptr: Double): String = js.native
    
    /** Copies an Uint16Array's values from the module's memory. */
    def __getUint16Array(ptr: Double): js.typedarray.Uint16Array = js.native
    
    /** Gets a live view on an Uint16Array's values in the module's memory. */
    def __getUint16ArrayView(ptr: Double): js.typedarray.Uint16Array = js.native
    
    /** Copies an Uint32Array's values from the module's memory. */
    def __getUint32Array(ptr: Double): js.typedarray.Uint32Array = js.native
    
    /** Gets a live view on an Uint32Array's values in the module's memory. */
    def __getUint32ArrayView(ptr: Double): js.typedarray.Uint32Array = js.native
    
    /** Copies an Uint32Array's values from the module's memory. */
    var __getUint64Array: js.UndefOr[js.Function1[/* ptr */ Double, BigUint64Array]] = js.native
    
    /** Gets a live view on an Uint32Array's values in the module's memory. */
    var __getUint64ArrayView: js.UndefOr[js.Function1[/* ptr */ Double, BigUint64Array]] = js.native
    
    /** Copies an Uint8Array's values from the module's memory. */
    def __getUint8Array(ptr: Double): js.typedarray.Uint8Array = js.native
    
    /** Gets a live view on an Uint8Array's values in the module's memory. */
    def __getUint8ArrayView(ptr: Double): js.typedarray.Uint8Array = js.native
    
    /** Copies an Uint8ClampedArray's values from the module's memory. */
    def __getUint8ClampedArray(ptr: Double): js.typedarray.Uint8ClampedArray = js.native
    
    /** Gets a live view on an Uint8ClampedArray's values in the module's memory. */
    def __getUint8ClampedArrayView(ptr: Double): js.typedarray.Uint8ClampedArray = js.native
    
    /** Tests whether a managed object is an instance of the class represented by the specified base id. */
    def __instanceof(ptr: Double, baseId: Double): Boolean = js.native
    
    /** Allocates an instance of the class represented by the specified id. */
    def __new(size: Double, id: Double): Double = js.native
    
    /** Allocates a new array in the module's memory and returns a reference (pointer) to it. */
    def __newArray(id: Double): Double = js.native
    def __newArray(id: Double, valuesOrCapacity: js.Array[Double]): Double = js.native
    def __newArray(id: Double, valuesOrCapacity: js.typedarray.ArrayBufferView): Double = js.native
    def __newArray(id: Double, valuesOrCapacity: Double): Double = js.native
    
    /** Allocates a new ArrayBuffer in the module's memory and returns a reference (pointer) to it. */
    def __newArrayBuffer(buf: js.typedarray.ArrayBuffer): Double = js.native
    
    /** Allocates a new string in the module's memory and returns a reference (pointer) to it. */
    def __newString(str: String): Double = js.native
    
    /** Pins a managed object externally, preventing it from becoming garbage collected. */
    def __pin(ptr: Double): Double = js.native
    
    /** Unpins a managed object externally, allowing it to become garbage collected. */
    def __unpin(ptr: Double): Unit = js.native
    
    var memory: js.UndefOr[Memory] = js.native
    
    var table: js.UndefOr[Table] = js.native
  }
  
  trait Imports
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[Record[String, Any]]] {
    
    var env: js.UndefOr[Abort] = js.undefined
  }
  object Imports {
    
    inline def apply(): Imports = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Imports] (val x: Self) extends AnyVal {
      
      inline def setEnv(value: Abort): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  trait ResultObject extends StObject {
    
    var instance: Instance
    
    var module: Module
  }
  object ResultObject {
    
    inline def apply(instance: Instance, module: Module): ResultObject = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultObject] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
}
