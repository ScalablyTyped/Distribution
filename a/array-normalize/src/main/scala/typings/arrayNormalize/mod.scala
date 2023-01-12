package typings.arrayNormalize

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Normalize array to unit length, that is 0..1 range, in-place.
    * See [feature scaling](https://en.wikipedia.org/wiki/Feature_scaling).
    *
    * @param array The array to normalize.
    * @param [stride=1] The `array` stride for n-dimensions, ie. for 2d data layout is `[x, y, x, y, ...]`.
    * Every dimension is normalized independently, eg. 2d array is normalized to unit square `[0, 0, 1, 1]`.
    * @param bounds `bounds` box can predefine min/max to skip bounds detection.
    *
    * @example
    * import normalize = require('array-normalize')
    *
    * normalize([0, 50, 100]) // [0, .5, 1]
    * normalize([0, 0, .1, .2, 1, 2], 2) // [0, 0, .1, .1, 1, 1]
    * normalize([0, .25, 1, .25], 2, [0, .5, 1, .5]) // [0, .5, 1, .5])
    */
  inline def apply(array: MutableArrayLike[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def apply(array: MutableArrayLike[Double], stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(array: MutableArrayLike[Double], stride: Double, bounds: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(array: MutableArrayLike[Double], stride: Unit, bounds: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("array-normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MutableArrayLike[T]
    extends StObject
       with /* n */ NumberDictionary[T] {
    
    var length: Double
  }
  object MutableArrayLike {
    
    inline def apply[T](length: Double): MutableArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableArrayLike[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutableArrayLike[?], T] (val x: Self & MutableArrayLike[T]) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
