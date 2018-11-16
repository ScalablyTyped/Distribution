package typings
package androiduixLib.androidNs.graphicsNs.MatrixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleToFit extends js.Object

@JSGlobal("android.graphics.Matrix.ScaleToFit")
@js.native
object ScaleToFit extends js.Object {
  @js.native
  sealed trait CENTER
    extends androiduixLib.androidNs.graphicsNs.MatrixNs.ScaleToFit
  
  @js.native
  sealed trait END
    extends androiduixLib.androidNs.graphicsNs.MatrixNs.ScaleToFit
  
  @js.native
  sealed trait FILL
    extends androiduixLib.androidNs.graphicsNs.MatrixNs.ScaleToFit
  
  @js.native
  sealed trait START
    extends androiduixLib.androidNs.graphicsNs.MatrixNs.ScaleToFit
  
  /* 2 */ val CENTER: CENTER with scala.Double = js.native
  /* 3 */ val END: END with scala.Double = js.native
  /* 0 */ val FILL: FILL with scala.Double = js.native
  /* 1 */ val START: START with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.graphicsNs.MatrixNs.ScaleToFit with scala.Double] = js.native
}

