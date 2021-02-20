package typings.androiduix.global.android.graphics

import org.scalablytyped.runtime.StObject
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
object Matrix {
  
  @JSGlobal("android.graphics.Matrix")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.IDENTITY_MATRIX")
  @js.native
  def IDENTITY_MATRIX: typings.androiduix.android.graphics.Matrix = js.native
  @scala.inline
  def IDENTITY_MATRIX_=(x: typings.androiduix.android.graphics.Matrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY_MATRIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MATRIX_SIZE")
  @js.native
  def MATRIX_SIZE: js.Any = js.native
  @scala.inline
  def MATRIX_SIZE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MATRIX_SIZE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MPERSP_0")
  @js.native
  def MPERSP_0: Double = js.native
  @scala.inline
  def MPERSP_0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MPERSP_0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MPERSP_1")
  @js.native
  def MPERSP_1: Double = js.native
  @scala.inline
  def MPERSP_1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MPERSP_1")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MPERSP_2")
  @js.native
  def MPERSP_2: Double = js.native
  @scala.inline
  def MPERSP_2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MPERSP_2")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MSCALE_X")
  @js.native
  def MSCALE_X: Double = js.native
  @scala.inline
  def MSCALE_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSCALE_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MSCALE_Y")
  @js.native
  def MSCALE_Y: Double = js.native
  @scala.inline
  def MSCALE_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSCALE_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MSKEW_X")
  @js.native
  def MSKEW_X: Double = js.native
  @scala.inline
  def MSKEW_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSKEW_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MSKEW_Y")
  @js.native
  def MSKEW_Y: Double = js.native
  @scala.inline
  def MSKEW_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSKEW_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MTRANS_X")
  @js.native
  def MTRANS_X: Double = js.native
  @scala.inline
  def MTRANS_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MTRANS_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.MTRANS_Y")
  @js.native
  def MTRANS_Y: Double = js.native
  @scala.inline
  def MTRANS_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MTRANS_Y")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.graphics.Matrix.ScaleToFit")
  @js.native
  object ScaleToFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.graphics.Matrix.ScaleToFit with Double] = js.native
    
    /* 2 */ val CENTER: typings.androiduix.android.graphics.Matrix.ScaleToFit.CENTER with Double = js.native
    
    /* 3 */ val END: typings.androiduix.android.graphics.Matrix.ScaleToFit.END with Double = js.native
    
    /* 0 */ val FILL: typings.androiduix.android.graphics.Matrix.ScaleToFit.FILL with Double = js.native
    
    /* 1 */ val START: typings.androiduix.android.graphics.Matrix.ScaleToFit.START with Double = js.native
  }
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.checkPointArrays")
  @js.native
  def checkPointArrays(src: js.Any, srcIndex: js.Any, dst: js.Any, dstIndex: js.Any, pointCount: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getPointLength")
  @js.native
  def getPointLength(src: js.Any, index: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getRotate_1")
  @js.native
  def getRotate1(degrees: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getRotate_2")
  @js.native
  def getRotate2(sin: Double, cos: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getRotate_3")
  @js.native
  def getRotate3(degrees: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getScale")
  @js.native
  def getScale(sx: Double, sy: Double): js.Array[Double] = js.native
  @JSGlobal("android.graphics.Matrix.getScale")
  @js.native
  def getScale(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  @JSGlobal("android.graphics.Matrix.getScale")
  @js.native
  def getScale(sx: Double, sy: Double, px: Double): js.Array[Double] = js.native
  @JSGlobal("android.graphics.Matrix.getScale")
  @js.native
  def getScale(sx: Double, sy: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getSkew")
  @js.native
  def getSkew(kx: Double, ky: Double): js.Array[Double] = js.native
  @JSGlobal("android.graphics.Matrix.getSkew")
  @js.native
  def getSkew(kx: Double, ky: Double, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  @JSGlobal("android.graphics.Matrix.getSkew")
  @js.native
  def getSkew(kx: Double, ky: Double, px: Double): js.Array[Double] = js.native
  @JSGlobal("android.graphics.Matrix.getSkew")
  @js.native
  def getSkew(kx: Double, ky: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.getTranslate")
  @js.native
  def getTranslate(dx: Double, dy: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kAffine_Mask")
  @js.native
  def kAffineMask: js.Any = js.native
  
  @scala.inline
  def kAffineMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kAffine_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kAffine_Shift")
  @js.native
  def kAffineShift: js.Any = js.native
  
  @scala.inline
  def kAffineShift_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kAffine_Shift")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kAllMasks")
  @js.native
  def kAllMasks: js.Any = js.native
  @scala.inline
  def kAllMasks_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kAllMasks")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kIdentity_Mask")
  @js.native
  def kIdentityMask: js.Any = js.native
  
  @scala.inline
  def kIdentityMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kIdentity_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kPerspective_Mask")
  @js.native
  def kPerspectiveMask: js.Any = js.native
  
  @scala.inline
  def kPerspectiveMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kPerspective_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kPerspective_Shift")
  @js.native
  def kPerspectiveShift: js.Any = js.native
  
  @scala.inline
  def kPerspectiveShift_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kPerspective_Shift")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kRectStaysRect_Mask")
  @js.native
  def kRectStaysRectMask: js.Any = js.native
  
  @scala.inline
  def kRectStaysRectMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kRectStaysRect_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kRectStaysRect_Shift")
  @js.native
  def kRectStaysRectShift: js.Any = js.native
  
  @scala.inline
  def kRectStaysRectShift_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kRectStaysRect_Shift")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kScale_Mask")
  @js.native
  def kScaleMask: js.Any = js.native
  
  @scala.inline
  def kScaleMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kScale_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kScale_Shift")
  @js.native
  def kScaleShift: js.Any = js.native
  
  @scala.inline
  def kScaleShift_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kScale_Shift")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kTranslate_Mask")
  @js.native
  def kTranslateMask: js.Any = js.native
  
  @scala.inline
  def kTranslateMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kTranslate_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kTranslate_Shift")
  @js.native
  def kTranslateShift: js.Any = js.native
  
  @scala.inline
  def kTranslateShift_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kTranslate_Shift")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.kUnknown_Mask")
  @js.native
  def kUnknownMask: js.Any = js.native
  
  @scala.inline
  def kUnknownMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kUnknown_Mask")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.multiply")
  @js.native
  def multiply(dest: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): Unit = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.reset")
  @js.native
  def reset(mtx: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.setRotate_1")
  @js.native
  def setRotate1(dest: js.Array[Double], degrees: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.setRotate_2")
  @js.native
  def setRotate2(dest: js.Array[Double], sin: Double, cos: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Matrix.setTranslate")
  @js.native
  def setTranslate(dest: js.Array[Double], dx: Double, dy: Double): js.Array[Double] = js.native
}
