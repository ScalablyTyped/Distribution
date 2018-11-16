package typings
package arrayDotPrototypeDotFlatmapLib.arrayDotPrototypeDotFlatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMap extends js.Object {
  var implementation: js.Any = js.native
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
  def getPolyfill(): js.Any = js.native
  def shim(): js.Any = js.native
}

