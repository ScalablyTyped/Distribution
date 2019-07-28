package typings.androiduix.androidNs.graphicsNs.MatrixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleToFit extends js.Object

@JSGlobal("android.graphics.Matrix.ScaleToFit")
@js.native
object ScaleToFit extends js.Object {
  @js.native
  sealed trait CENTER extends ScaleToFit
  
  @js.native
  sealed trait END extends ScaleToFit
  
  @js.native
  sealed trait FILL extends ScaleToFit
  
  @js.native
  sealed trait START extends ScaleToFit
  
  /* 2 */ val CENTER: typings.androiduix.androidNs.graphicsNs.MatrixNs.ScaleToFit.CENTER with Double = js.native
  /* 3 */ val END: typings.androiduix.androidNs.graphicsNs.MatrixNs.ScaleToFit.END with Double = js.native
  /* 0 */ val FILL: typings.androiduix.androidNs.graphicsNs.MatrixNs.ScaleToFit.FILL with Double = js.native
  /* 1 */ val START: typings.androiduix.androidNs.graphicsNs.MatrixNs.ScaleToFit.START with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleToFit with Double] = js.native
}

