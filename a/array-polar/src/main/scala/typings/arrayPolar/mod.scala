package typings.arrayPolar

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Convert array with cartesian coordinates to polar.
    *
    * `array` is modified in-place, so do slice if you need immutable behaviour.
    *
    * @param array A 2-dimensional array with `[x, y, x, y, ...]` layout.
    * @param [center=[0,0]] The center point to convert the `array`, so that result is `[r, θ, r, θ, ...]` `array`.
    * You may want to calculate `center` as average or median of data.
    *
    * @example
    * import polar = require('array-polar')
    *
    * const polarCoords = polar([0,1, 1,0]) // [1,0, 1,Math.PI/2]
    */
  inline def apply[TArr /* <: MutableArrayLike[Double] */](array: TArr): TArr = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[TArr]
  inline def apply[TArr /* <: MutableArrayLike[Double] */](array: TArr, center: js.Tuple2[Double, Double]): TArr = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[TArr]
  
  @JSImport("array-polar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert array with polar coordinates to cartesian.
    *
    * `array` is modified in-place, so do slice if you need immutable behaviour.
    *
    * @param array A 2-dimensional array with `[x, y, x, y, ...]` layout.
    * @param [center=[0,0]] The center point to convert the `array`, so that result is `[r, θ, r, θ, ...]` `array`.
    * You may want to calculate `center` as average or median of data.
    *
    * @example
    * import polar = require('array-polar')
    *
    * const cartesianCoords = polar.cartesian([1,0, 1,Math.PI/2]) // [0,1, 1,0]
    */
  inline def cartesian[TArr /* <: MutableArrayLike[Double] */](array: TArr): TArr = ^.asInstanceOf[js.Dynamic].applyDynamic("cartesian")(array.asInstanceOf[js.Any]).asInstanceOf[TArr]
  inline def cartesian[TArr /* <: MutableArrayLike[Double] */](array: TArr, center: js.Tuple2[Double, Double]): TArr = (^.asInstanceOf[js.Dynamic].applyDynamic("cartesian")(array.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[TArr]
  
  @JSImport("array-polar", "polar")
  @js.native
  val polar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof toPolar */ Any = js.native
  
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
