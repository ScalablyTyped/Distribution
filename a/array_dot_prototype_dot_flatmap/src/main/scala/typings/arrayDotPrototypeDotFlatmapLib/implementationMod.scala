package typings
package arrayDotPrototypeDotFlatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array.prototype.flatmap/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[
      /* this */ T, 
      /* x */ A, 
      /* index */ scala.Double, 
      /* array */ arrayDotPrototypeDotFlatmapLib.Array[A], 
      arrayDotPrototypeDotFlatmapLib.Array[B]
    ]
  ): arrayDotPrototypeDotFlatmapLib.Array[B] = js.native
  def apply[A, B, T /* <: js.UndefOr[js.Object] */](
    xs: js.Array[A],
    fn: js.ThisFunction3[
      /* this */ T, 
      /* x */ A, 
      /* index */ scala.Double, 
      /* array */ arrayDotPrototypeDotFlatmapLib.Array[A], 
      arrayDotPrototypeDotFlatmapLib.Array[B]
    ],
    thisArg: T
  ): arrayDotPrototypeDotFlatmapLib.Array[B] = js.native
}

