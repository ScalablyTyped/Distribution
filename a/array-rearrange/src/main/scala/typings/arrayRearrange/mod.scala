package typings.arrayRearrange

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Reorder elements within array by index. Mutates original array in-place.
    *
    * @param array The array to shuffle.
    * @param index The indexes according to which to shuffle elements in `array`. Should contain unique indexes.
    * @param [stride=1] Indicate groups of elements to shuffle.
    *
    * @example
    * import reorder = require('array-rearrange')
    *
    * const arr = reorder([9,8,7,6], [3,2,1,0]) // [6,7,8,9]
    * const arr2 = reorder([3,3, 2,2, 1,1], [2,1,0]) // [1,1, 2,2, 3,3]
    */
  inline def apply[TArr /* <: MutableArrayLike[Any] */](array: TArr, index: MutableArrayLike[Double]): TArr = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[TArr]
  inline def apply[TArr /* <: MutableArrayLike[Any] */](array: TArr, index: MutableArrayLike[Double], stride: Double): TArr = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[TArr]
  
  @JSImport("array-rearrange", JSImport.Namespace)
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
