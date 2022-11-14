package typings.arrayRearrange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Reorder elements within array by index.
    *
    * Permutes original array.
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
  inline def apply[TArr /* <: js.Array[Any] */](array: TArr, index: js.Array[Double]): TArr = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[TArr]
  inline def apply[TArr /* <: js.Array[Any] */](array: TArr, index: js.Array[Double], stride: Double): TArr = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[TArr]
  
  @JSImport("array-rearrange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
