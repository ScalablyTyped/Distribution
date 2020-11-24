package typings.androiduix.global.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.Matrix")
@js.native
class Matrix ()
  extends typings.androiduix.android.graphics.Matrix {
  def this(src: typings.androiduix.android.graphics.Matrix) = this()
  def this(values: js.Array[Double]) = this()
}
/* static members */
@JSGlobal("android.graphics.Matrix")
@js.native
object Matrix extends js.Object {
  
  var IDENTITY_MATRIX: typings.androiduix.android.graphics.Matrix = js.native
  
  var MATRIX_SIZE: js.Any = js.native
  
  var MPERSP_0: Double = js.native
  
  var MPERSP_1: Double = js.native
  
  var MPERSP_2: Double = js.native
  
  var MSCALE_X: Double = js.native
  
  var MSCALE_Y: Double = js.native
  
  var MSKEW_X: Double = js.native
  
  var MSKEW_Y: Double = js.native
  
  var MTRANS_X: Double = js.native
  
  var MTRANS_Y: Double = js.native
  
  /* private */ def checkPointArrays(src: js.Any, srcIndex: js.Any, dst: js.Any, dstIndex: js.Any, pointCount: js.Any): js.Any = js.native
  
  /* private */ def getPointLength(src: js.Any, index: js.Any): js.Any = js.native
  
  def getRotate_1(degrees: Double): js.Array[Double] = js.native
  
  def getRotate_2(sin: Double, cos: Double): js.Array[Double] = js.native
  
  def getRotate_3(degrees: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  def getScale(sx: Double, sy: Double): js.Array[Double] = js.native
  def getScale(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  def getScale(sx: Double, sy: Double, px: Double): js.Array[Double] = js.native
  def getScale(sx: Double, sy: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  def getSkew(kx: Double, ky: Double): js.Array[Double] = js.native
  def getSkew(kx: Double, ky: Double, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  def getSkew(kx: Double, ky: Double, px: Double): js.Array[Double] = js.native
  def getSkew(kx: Double, ky: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  def getTranslate(dx: Double, dy: Double): js.Array[Double] = js.native
  
  var kAffine_Mask: js.Any = js.native
  
  var kAffine_Shift: js.Any = js.native
  
  var kAllMasks: js.Any = js.native
  
  var kIdentity_Mask: js.Any = js.native
  
  var kPerspective_Mask: js.Any = js.native
  
  var kPerspective_Shift: js.Any = js.native
  
  var kRectStaysRect_Mask: js.Any = js.native
  
  var kRectStaysRect_Shift: js.Any = js.native
  
  var kScale_Mask: js.Any = js.native
  
  var kScale_Shift: js.Any = js.native
  
  var kTranslate_Mask: js.Any = js.native
  
  var kTranslate_Shift: js.Any = js.native
  
  var kUnknown_Mask: js.Any = js.native
  
  def multiply(dest: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): Unit = js.native
  
  /* private */ def reset(mtx: js.Any): js.Any = js.native
  
  def setRotate_1(dest: js.Array[Double], degrees: Double): js.Array[Double] = js.native
  
  def setRotate_2(dest: js.Array[Double], sin: Double, cos: Double): js.Array[Double] = js.native
  
  def setTranslate(dest: js.Array[Double], dx: Double, dy: Double): js.Array[Double] = js.native
  
  @js.native
  object ScaleToFit extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.graphics.Matrix.ScaleToFit with Double] = js.native
    
    /* 2 */ val CENTER: typings.androiduix.android.graphics.Matrix.ScaleToFit.CENTER with Double = js.native
    
    /* 3 */ val END: typings.androiduix.android.graphics.Matrix.ScaleToFit.END with Double = js.native
    
    /* 0 */ val FILL: typings.androiduix.android.graphics.Matrix.ScaleToFit.FILL with Double = js.native
    
    /* 1 */ val START: typings.androiduix.android.graphics.Matrix.ScaleToFit.START with Double = js.native
  }
}
