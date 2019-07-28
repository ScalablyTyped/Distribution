package typings.androiduix.androidNs.graphicsNs

import typings.androiduix.androidNs.graphicsNs.MatrixNs.ScaleToFit
import typings.androiduix.javaNs.langNs.StringBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Matrix")
@js.native
class Matrix () extends js.Object {
  def this(src: Matrix) = this()
  def this(values: js.Array[Double]) = this()
  var mValues: js.Any = js.native
  /* private */ def computeTypeMask(): js.Any = js.native
  def equals(obj: js.Any): Boolean = js.native
  def getValues(values: js.Array[Double]): Unit = js.native
  def hasPerspective(): Boolean = js.native
  def isIdentity(): Boolean = js.native
  def mapPoints(dst: js.Array[Double]): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: Double): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double]): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double], srcIndex: Double): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.Array[Double],
    srcIndex: Double,
    pointCount: Double
  ): Unit = js.native
  def mapRadius(radius: Double): Double = js.native
  def mapRect(dst: RectF): Boolean = js.native
  def mapRect(dst: RectF, src: RectF): Boolean = js.native
  def mapVectors(dst: js.Array[Double]): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double]): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double], srcIndex: Double): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double], srcIndex: Double, ptCount: Double): Unit = js.native
  def postConcat(other: Matrix): Boolean = js.native
  def postRotate(degrees: Double): Boolean = js.native
  def postRotate(degrees: Double, px: Double): Boolean = js.native
  def postRotate(degrees: Double, px: Double, py: Double): Boolean = js.native
  def postScale(sx: Double, sy: Double): Boolean = js.native
  def postScale(sx: Double, sy: Double, px: Double): Boolean = js.native
  def postScale(sx: Double, sy: Double, px: Double, py: Double): Boolean = js.native
  def postSkew(kx: Double, ky: Double): Boolean = js.native
  def postSkew(kx: Double, ky: Double, px: Double): Boolean = js.native
  def postSkew(kx: Double, ky: Double, px: Double, py: Double): Boolean = js.native
  /* private */ def postTransform(matrix: js.Any): js.Any = js.native
  def postTranslate(dx: Double, dy: Double): Boolean = js.native
  def preConcat(other: Matrix): Boolean = js.native
  def preRotate(degrees: Double): Boolean = js.native
  def preRotate(degrees: Double, px: Double): Boolean = js.native
  def preRotate(degrees: Double, px: Double, py: Double): Boolean = js.native
  def preScale(sx: Double, sy: Double): Boolean = js.native
  def preScale(sx: Double, sy: Double, px: Double): Boolean = js.native
  def preScale(sx: Double, sy: Double, px: Double, py: Double): Boolean = js.native
  def preSkew(kx: Double, ky: Double): Boolean = js.native
  def preSkew(kx: Double, ky: Double, px: Double): Boolean = js.native
  def preSkew(kx: Double, ky: Double, px: Double, py: Double): Boolean = js.native
  /* private */ def preTransform(matrix: js.Any): js.Any = js.native
  def preTranslate(dx: Double, dy: Double): Boolean = js.native
  def rectStaysRect(): Boolean = js.native
  def reset(): Unit = js.native
  def set(src: Matrix): Unit = js.native
  def setConcat(a: Matrix, b: Matrix): Boolean = js.native
  def setRectToRect(src: RectF, dst: RectF, stf: ScaleToFit): Boolean = js.native
  def setRotate(degrees: Double): Unit = js.native
  def setRotate(degrees: Double, px: Double): Unit = js.native
  def setRotate(degrees: Double, px: Double, py: Double): Unit = js.native
  def setScale(sx: Double, sy: Double): Unit = js.native
  def setScale(sx: Double, sy: Double, px: Double): Unit = js.native
  def setScale(sx: Double, sy: Double, px: Double, py: Double): Unit = js.native
  def setSinCos(sinValue: Double, cosValue: Double): Unit = js.native
  def setSinCos(sinValue: Double, cosValue: Double, px: Double): Unit = js.native
  def setSinCos(sinValue: Double, cosValue: Double, px: Double, py: Double): Unit = js.native
  def setSkew(kx: Double, ky: Double): Unit = js.native
  def setSkew(kx: Double, ky: Double, px: Double): Unit = js.native
  def setSkew(kx: Double, ky: Double, px: Double, py: Double): Unit = js.native
  def setTranslate(dx: Double, dy: Double): Unit = js.native
  def setValues(values: js.Array[Double]): Unit = js.native
  def toShortString(sb: StringBuilder): Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.Matrix")
@js.native
object Matrix extends js.Object {
  var IDENTITY_MATRIX: Matrix = js.native
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
  /* private */ def checkPointArrays(src: js.Any, srcIndex: js.Any, dst: js.Any, dstIndex: js.Any, pointCount: js.Any): js.Any = js.native
  /* private */ def getPointLength(src: js.Any, index: js.Any): js.Any = js.native
  def getRotate_1(degrees: Double): js.Array[Double] = js.native
  def getRotate_2(sin: Double, cos: Double): js.Array[Double] = js.native
  def getRotate_3(degrees: Double, px: Double, py: Double): js.Array[Double] = js.native
  def getScale(sx: Double, sy: Double): js.Array[Double] = js.native
  def getScale(sx: Double, sy: Double, px: Double): js.Array[Double] = js.native
  def getScale(sx: Double, sy: Double, px: Double, py: Double): js.Array[Double] = js.native
  def getSkew(kx: Double, ky: Double): js.Array[Double] = js.native
  def getSkew(kx: Double, ky: Double, px: Double): js.Array[Double] = js.native
  def getSkew(kx: Double, ky: Double, px: Double, py: Double): js.Array[Double] = js.native
  def getTranslate(dx: Double, dy: Double): js.Array[Double] = js.native
  def multiply(dest: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): Unit = js.native
  /* private */ def reset(mtx: js.Any): js.Any = js.native
  def setRotate_1(dest: js.Array[Double], degrees: Double): js.Array[Double] = js.native
  def setRotate_2(dest: js.Array[Double], sin: Double, cos: Double): js.Array[Double] = js.native
  def setTranslate(dest: js.Array[Double], dx: Double, dy: Double): js.Array[Double] = js.native
}

