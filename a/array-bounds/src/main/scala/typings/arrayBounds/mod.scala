package typings.arrayBounds

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Find min and max values of a sequence of values/coordinates.
    * @param array
    * @param [stride=1] The stride to use, ie. for 1d values expected data layout is
    * `[x, x, x, ...]` for 2d is `[x, y, x, y, ...]`, etc.
    * @returns An array that contains bounds for every dimension as `[minX, minY, ..., maxX, maxY]`, eg.
    * ```
    * //get bounding box
    * let [minX, minY, maxX, maxY] = bounds([x1, y1, x2, y2, x3, y3, ...], 2)
    *
    * //get bounding cube
    * let [minX, minY, minZ, maxX, maxY, maxZ] = bounds([x1, y1, z1, x2, y2, z2, ...], 3)
    * ```
    *
    * @example
    * import getBounds = require('array-bounds')
    *
    * const bounds = getBounds([0, 25, 50, 75, 100]) // [0, 100]
    */
  inline def apply(array: ArrayLike[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def apply(array: ArrayLike[Double], stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("array-bounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
