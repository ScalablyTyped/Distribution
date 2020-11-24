package typings.assemblyscriptLoader.mod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import typings.std.WebAssembly.Memory
import typings.std.WebAssembly.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Utility mixed in by the loader. */
@js.native
trait ASUtil extends js.Object {
  
  /** Allocates an instance of the class represented by the specified id. */
  def __alloc(size: Double, id: Double): Double = js.native
  
  /** Allocates a new array in the module's memory and returns a reference (pointer) to it. */
  def __allocArray(id: Double, values: ArrayLike[Double]): Double = js.native
  
  /** Allocates a new string in the module's memory and returns a reference (pointer) to it. */
  def __allocString(str: String): Double = js.native
  
  /** Forces a cycle collection. Only relevant if objects potentially forming reference cycles are used. */
  def __collect(): Unit = js.native
  
  /** Copies an array's values from the module's memory. Infers the array type from RTTI. */
  def __getArray(ptr: Double): js.Array[Double] = js.native
  
  /** Copies an ArrayBuffer's value from the module's memory. */
  def __getArrayBuffer(ptr: Double): ArrayBuffer = js.native
  
  /** Gets a live view on an array's values in the module's memory. Infers the array type from RTTI. */
  def __getArrayView(ptr: Double): ArrayBufferView = js.native
  
  /** Copies a Float32Array's values from the module's memory. */
  def __getFloat32Array(ptr: Double): Float32Array = js.native
  
  /** Gets a live view on a Float32Array's values in the module's memory. */
  def __getFloat32ArrayView(ptr: Double): Float32Array = js.native
  
  /** Copies a Float64Array's values from the module's memory. */
  def __getFloat64Array(ptr: Double): Float64Array = js.native
  
  /** Gets a live view on a Float64Array's values in the module's memory. */
  def __getFloat64ArrayView(ptr: Double): Float64Array = js.native
  
  /** Copies an Int16Array's values from the module's memory. */
  def __getInt16Array(ptr: Double): Int16Array = js.native
  
  /** Gets a live view on an Int16Array's values in the module's memory. */
  def __getInt16ArrayView(ptr: Double): Int16Array = js.native
  
  /** Copies an Int32Array's values from the module's memory. */
  def __getInt32Array(ptr: Double): Int32Array = js.native
  
  /** Gets a live view on an Int32Array's values in the module's memory. */
  def __getInt32ArrayView(ptr: Double): Int32Array = js.native
  
  /** Copies an Int32Array's values from the module's memory. */
  var __getInt64Array: js.UndefOr[js.Function1[/* ptr */ Double, BigInt64Array]] = js.native
  
  /** Gets a live view on an Int32Array's values in the module's memory. */
  var __getInt64ArrayView: js.UndefOr[js.Function1[/* ptr */ Double, BigInt64Array]] = js.native
  
  /** Copies an Int8Array's values from the module's memory. */
  def __getInt8Array(ptr: Double): Int8Array = js.native
  
  /** Gets a live view on an Int8Array's values in the module's memory. */
  def __getInt8ArrayView(ptr: Double): Int8Array = js.native
  
  /** Copies a string's value from the module's memory. */
  def __getString(ptr: Double): String = js.native
  
  /** Copies an Uint16Array's values from the module's memory. */
  def __getUint16Array(ptr: Double): Uint16Array = js.native
  
  /** Gets a live view on an Uint16Array's values in the module's memory. */
  def __getUint16ArrayView(ptr: Double): Uint16Array = js.native
  
  /** Copies an Uint32Array's values from the module's memory. */
  def __getUint32Array(ptr: Double): Uint32Array = js.native
  
  /** Gets a live view on an Uint32Array's values in the module's memory. */
  def __getUint32ArrayView(ptr: Double): Uint32Array = js.native
  
  /** Copies an Uint32Array's values from the module's memory. */
  var __getUint64Array: js.UndefOr[js.Function1[/* ptr */ Double, BigUint64Array]] = js.native
  
  /** Gets a live view on an Uint32Array's values in the module's memory. */
  var __getUint64ArrayView: js.UndefOr[js.Function1[/* ptr */ Double, BigUint64Array]] = js.native
  
  /** Copies an Uint8Array's values from the module's memory. */
  def __getUint8Array(ptr: Double): Uint8Array = js.native
  
  /** Gets a live view on an Uint8Array's values in the module's memory. */
  def __getUint8ArrayView(ptr: Double): Uint8Array = js.native
  
  /** Copies an Uint8ClampedArray's values from the module's memory. */
  def __getUint8ClampedArray(ptr: Double): Uint8ClampedArray = js.native
  
  /** Gets a live view on an Uint8ClampedArray's values in the module's memory. */
  def __getUint8ClampedArrayView(ptr: Double): Uint8ClampedArray = js.native
  
  /** Tests whether a managed object is an instance of the class represented by the specified base id. */
  def __instanceof(ptr: Double, baseId: Double): Boolean = js.native
  
  /** Releases a previously retained reference to a managed object, allowing the runtime to collect it once its reference count reaches zero. */
  def __release(ptr: Double): Unit = js.native
  
  /** Forcefully resets the heap to its initial offset, effectively clearing dynamic memory. Stub runtime only. */
  var __reset: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Retains a reference to a managed object externally, making sure that it doesn't become collected prematurely. Returns the pointer. */
  def __retain(ptr: Double): Double = js.native
  
  /** Explicit start function, if requested. */
  def _start(): Unit = js.native
  
  var memory: js.UndefOr[Memory] = js.native
  
  var table: js.UndefOr[Table] = js.native
}
object ASUtil {
  
  @scala.inline
  def apply(
    __alloc: (Double, Double) => Double,
    __allocArray: (Double, ArrayLike[Double]) => Double,
    __allocString: String => Double,
    __collect: () => Unit,
    __getArray: Double => js.Array[Double],
    __getArrayBuffer: Double => ArrayBuffer,
    __getArrayView: Double => ArrayBufferView,
    __getFloat32Array: Double => Float32Array,
    __getFloat32ArrayView: Double => Float32Array,
    __getFloat64Array: Double => Float64Array,
    __getFloat64ArrayView: Double => Float64Array,
    __getInt16Array: Double => Int16Array,
    __getInt16ArrayView: Double => Int16Array,
    __getInt32Array: Double => Int32Array,
    __getInt32ArrayView: Double => Int32Array,
    __getInt8Array: Double => Int8Array,
    __getInt8ArrayView: Double => Int8Array,
    __getString: Double => String,
    __getUint16Array: Double => Uint16Array,
    __getUint16ArrayView: Double => Uint16Array,
    __getUint32Array: Double => Uint32Array,
    __getUint32ArrayView: Double => Uint32Array,
    __getUint8Array: Double => Uint8Array,
    __getUint8ArrayView: Double => Uint8Array,
    __getUint8ClampedArray: Double => Uint8ClampedArray,
    __getUint8ClampedArrayView: Double => Uint8ClampedArray,
    __instanceof: (Double, Double) => Boolean,
    __release: Double => Unit,
    __retain: Double => Double,
    _start: () => Unit
  ): ASUtil = {
    val __obj = js.Dynamic.literal(__alloc = js.Any.fromFunction2(__alloc), __allocArray = js.Any.fromFunction2(__allocArray), __allocString = js.Any.fromFunction1(__allocString), __collect = js.Any.fromFunction0(__collect), __getArray = js.Any.fromFunction1(__getArray), __getArrayBuffer = js.Any.fromFunction1(__getArrayBuffer), __getArrayView = js.Any.fromFunction1(__getArrayView), __getFloat32Array = js.Any.fromFunction1(__getFloat32Array), __getFloat32ArrayView = js.Any.fromFunction1(__getFloat32ArrayView), __getFloat64Array = js.Any.fromFunction1(__getFloat64Array), __getFloat64ArrayView = js.Any.fromFunction1(__getFloat64ArrayView), __getInt16Array = js.Any.fromFunction1(__getInt16Array), __getInt16ArrayView = js.Any.fromFunction1(__getInt16ArrayView), __getInt32Array = js.Any.fromFunction1(__getInt32Array), __getInt32ArrayView = js.Any.fromFunction1(__getInt32ArrayView), __getInt8Array = js.Any.fromFunction1(__getInt8Array), __getInt8ArrayView = js.Any.fromFunction1(__getInt8ArrayView), __getString = js.Any.fromFunction1(__getString), __getUint16Array = js.Any.fromFunction1(__getUint16Array), __getUint16ArrayView = js.Any.fromFunction1(__getUint16ArrayView), __getUint32Array = js.Any.fromFunction1(__getUint32Array), __getUint32ArrayView = js.Any.fromFunction1(__getUint32ArrayView), __getUint8Array = js.Any.fromFunction1(__getUint8Array), __getUint8ArrayView = js.Any.fromFunction1(__getUint8ArrayView), __getUint8ClampedArray = js.Any.fromFunction1(__getUint8ClampedArray), __getUint8ClampedArrayView = js.Any.fromFunction1(__getUint8ClampedArrayView), __instanceof = js.Any.fromFunction2(__instanceof), __release = js.Any.fromFunction1(__release), __retain = js.Any.fromFunction1(__retain), _start = js.Any.fromFunction0(_start))
    __obj.asInstanceOf[ASUtil]
  }
  
  @scala.inline
  implicit class ASUtilOps[Self <: ASUtil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__alloc(value: (Double, Double) => Double): Self = this.set("__alloc", js.Any.fromFunction2(value))
    
    @scala.inline
    def set__allocArray(value: (Double, ArrayLike[Double]) => Double): Self = this.set("__allocArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def set__allocString(value: String => Double): Self = this.set("__allocString", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__collect(value: () => Unit): Self = this.set("__collect", js.Any.fromFunction0(value))
    
    @scala.inline
    def set__getArray(value: Double => js.Array[Double]): Self = this.set("__getArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getArrayBuffer(value: Double => ArrayBuffer): Self = this.set("__getArrayBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getArrayView(value: Double => ArrayBufferView): Self = this.set("__getArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getFloat32Array(value: Double => Float32Array): Self = this.set("__getFloat32Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getFloat32ArrayView(value: Double => Float32Array): Self = this.set("__getFloat32ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getFloat64Array(value: Double => Float64Array): Self = this.set("__getFloat64Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getFloat64ArrayView(value: Double => Float64Array): Self = this.set("__getFloat64ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getInt16Array(value: Double => Int16Array): Self = this.set("__getInt16Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getInt16ArrayView(value: Double => Int16Array): Self = this.set("__getInt16ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getInt32Array(value: Double => Int32Array): Self = this.set("__getInt32Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getInt32ArrayView(value: Double => Int32Array): Self = this.set("__getInt32ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getInt8Array(value: Double => Int8Array): Self = this.set("__getInt8Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getInt8ArrayView(value: Double => Int8Array): Self = this.set("__getInt8ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getString(value: Double => String): Self = this.set("__getString", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint16Array(value: Double => Uint16Array): Self = this.set("__getUint16Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint16ArrayView(value: Double => Uint16Array): Self = this.set("__getUint16ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint32Array(value: Double => Uint32Array): Self = this.set("__getUint32Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint32ArrayView(value: Double => Uint32Array): Self = this.set("__getUint32ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint8Array(value: Double => Uint8Array): Self = this.set("__getUint8Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint8ArrayView(value: Double => Uint8Array): Self = this.set("__getUint8ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint8ClampedArray(value: Double => Uint8ClampedArray): Self = this.set("__getUint8ClampedArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__getUint8ClampedArrayView(value: Double => Uint8ClampedArray): Self = this.set("__getUint8ClampedArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__instanceof(value: (Double, Double) => Boolean): Self = this.set("__instanceof", js.Any.fromFunction2(value))
    
    @scala.inline
    def set__release(value: Double => Unit): Self = this.set("__release", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__retain(value: Double => Double): Self = this.set("__retain", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_start(value: () => Unit): Self = this.set("_start", js.Any.fromFunction0(value))
    
    @scala.inline
    def set__getInt64Array(value: /* ptr */ Double => BigInt64Array): Self = this.set("__getInt64Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete__getInt64Array: Self = this.set("__getInt64Array", js.undefined)
    
    @scala.inline
    def set__getInt64ArrayView(value: /* ptr */ Double => BigInt64Array): Self = this.set("__getInt64ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete__getInt64ArrayView: Self = this.set("__getInt64ArrayView", js.undefined)
    
    @scala.inline
    def set__getUint64Array(value: /* ptr */ Double => BigUint64Array): Self = this.set("__getUint64Array", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete__getUint64Array: Self = this.set("__getUint64Array", js.undefined)
    
    @scala.inline
    def set__getUint64ArrayView(value: /* ptr */ Double => BigUint64Array): Self = this.set("__getUint64ArrayView", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete__getUint64ArrayView: Self = this.set("__getUint64ArrayView", js.undefined)
    
    @scala.inline
    def set__reset(value: () => Unit): Self = this.set("__reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def delete__reset: Self = this.set("__reset", js.undefined)
    
    @scala.inline
    def setMemory(value: Memory): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
