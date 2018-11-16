package typings
package androiduixLib.androidNs.graphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Matrix")
@js.native
class Matrix () extends js.Object {
  def this(src: Matrix) = this()
  def this(values: js.Array[scala.Double]) = this()
  var mValues: js.Any = js.native
  /* private */ def computeTypeMask(): js.Any = js.native
  def equals(obj: js.Any): scala.Boolean = js.native
  def getValues(values: js.Array[scala.Double]): scala.Unit = js.native
  def hasPerspective(): scala.Boolean = js.native
  def isIdentity(): scala.Boolean = js.native
  def mapPoints(dst: js.Array[scala.Double]): scala.Unit = js.native
  def mapPoints(dst: js.Array[scala.Double], dstIndex: scala.Double): scala.Unit = js.native
  def mapPoints(dst: js.Array[scala.Double], dstIndex: scala.Double, src: js.Array[scala.Double]): scala.Unit = js.native
  def mapPoints(
    dst: js.Array[scala.Double],
    dstIndex: scala.Double,
    src: js.Array[scala.Double],
    srcIndex: scala.Double
  ): scala.Unit = js.native
  def mapPoints(
    dst: js.Array[scala.Double],
    dstIndex: scala.Double,
    src: js.Array[scala.Double],
    srcIndex: scala.Double,
    pointCount: scala.Double
  ): scala.Unit = js.native
  def mapRadius(radius: scala.Double): scala.Double = js.native
  def mapRect(dst: RectF): scala.Boolean = js.native
  def mapRect(dst: RectF, src: RectF): scala.Boolean = js.native
  def mapVectors(dst: js.Array[scala.Double]): scala.Unit = js.native
  def mapVectors(dst: js.Array[scala.Double], dstIndex: scala.Double): scala.Unit = js.native
  def mapVectors(dst: js.Array[scala.Double], dstIndex: scala.Double, src: js.Array[scala.Double]): scala.Unit = js.native
  def mapVectors(
    dst: js.Array[scala.Double],
    dstIndex: scala.Double,
    src: js.Array[scala.Double],
    srcIndex: scala.Double
  ): scala.Unit = js.native
  def mapVectors(
    dst: js.Array[scala.Double],
    dstIndex: scala.Double,
    src: js.Array[scala.Double],
    srcIndex: scala.Double,
    ptCount: scala.Double
  ): scala.Unit = js.native
  def postConcat(other: Matrix): scala.Boolean = js.native
  def postRotate(degrees: scala.Double): scala.Boolean = js.native
  def postRotate(degrees: scala.Double, px: scala.Double): scala.Boolean = js.native
  def postRotate(degrees: scala.Double, px: scala.Double, py: scala.Double): scala.Boolean = js.native
  def postScale(sx: scala.Double, sy: scala.Double): scala.Boolean = js.native
  def postScale(sx: scala.Double, sy: scala.Double, px: scala.Double): scala.Boolean = js.native
  def postScale(sx: scala.Double, sy: scala.Double, px: scala.Double, py: scala.Double): scala.Boolean = js.native
  def postSkew(kx: scala.Double, ky: scala.Double): scala.Boolean = js.native
  def postSkew(kx: scala.Double, ky: scala.Double, px: scala.Double): scala.Boolean = js.native
  def postSkew(kx: scala.Double, ky: scala.Double, px: scala.Double, py: scala.Double): scala.Boolean = js.native
  /* private */ def postTransform(matrix: js.Any): js.Any = js.native
  def postTranslate(dx: scala.Double, dy: scala.Double): scala.Boolean = js.native
  def preConcat(other: Matrix): scala.Boolean = js.native
  def preRotate(degrees: scala.Double): scala.Boolean = js.native
  def preRotate(degrees: scala.Double, px: scala.Double): scala.Boolean = js.native
  def preRotate(degrees: scala.Double, px: scala.Double, py: scala.Double): scala.Boolean = js.native
  def preScale(sx: scala.Double, sy: scala.Double): scala.Boolean = js.native
  def preScale(sx: scala.Double, sy: scala.Double, px: scala.Double): scala.Boolean = js.native
  def preScale(sx: scala.Double, sy: scala.Double, px: scala.Double, py: scala.Double): scala.Boolean = js.native
  def preSkew(kx: scala.Double, ky: scala.Double): scala.Boolean = js.native
  def preSkew(kx: scala.Double, ky: scala.Double, px: scala.Double): scala.Boolean = js.native
  def preSkew(kx: scala.Double, ky: scala.Double, px: scala.Double, py: scala.Double): scala.Boolean = js.native
  /* private */ def preTransform(matrix: js.Any): js.Any = js.native
  def preTranslate(dx: scala.Double, dy: scala.Double): scala.Boolean = js.native
  def rectStaysRect(): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
  def set(src: Matrix): scala.Unit = js.native
  def setConcat(a: Matrix, b: Matrix): scala.Boolean = js.native
  def setRectToRect(src: RectF, dst: RectF, stf: androiduixLib.androidNs.graphicsNs.MatrixNs.ScaleToFit): scala.Boolean = js.native
  def setRotate(degrees: scala.Double): scala.Unit = js.native
  def setRotate(degrees: scala.Double, px: scala.Double): scala.Unit = js.native
  def setRotate(degrees: scala.Double, px: scala.Double, py: scala.Double): scala.Unit = js.native
  def setScale(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  def setScale(sx: scala.Double, sy: scala.Double, px: scala.Double): scala.Unit = js.native
  def setScale(sx: scala.Double, sy: scala.Double, px: scala.Double, py: scala.Double): scala.Unit = js.native
  def setSinCos(sinValue: scala.Double, cosValue: scala.Double): scala.Unit = js.native
  def setSinCos(sinValue: scala.Double, cosValue: scala.Double, px: scala.Double): scala.Unit = js.native
  def setSinCos(sinValue: scala.Double, cosValue: scala.Double, px: scala.Double, py: scala.Double): scala.Unit = js.native
  def setSkew(kx: scala.Double, ky: scala.Double): scala.Unit = js.native
  def setSkew(kx: scala.Double, ky: scala.Double, px: scala.Double): scala.Unit = js.native
  def setSkew(kx: scala.Double, ky: scala.Double, px: scala.Double, py: scala.Double): scala.Unit = js.native
  def setTranslate(dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def setValues(values: js.Array[scala.Double]): scala.Unit = js.native
  def toShortString(sb: androiduixLib.javaNs.langNs.StringBuilder): scala.Unit = js.native
}

@JSGlobal("android.graphics.Matrix")
@js.native
object Matrix extends js.Object {
  var IDENTITY_MATRIX: androiduixLib.androidNs.graphicsNs.Matrix = js.native
  var MATRIX_SIZE: js.Any = js.native
  var MPERSP_0: scala.Double = js.native
  var MPERSP_1: scala.Double = js.native
  var MPERSP_2: scala.Double = js.native
  var MSCALE_X: scala.Double = js.native
  var MSCALE_Y: scala.Double = js.native
  var MSKEW_X: scala.Double = js.native
  var MSKEW_Y: scala.Double = js.native
  var MTRANS_X: scala.Double = js.native
  var MTRANS_Y: scala.Double = js.native
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
  def getRotate_1(degrees: scala.Double): js.Array[scala.Double] = js.native
  def getRotate_2(sin: scala.Double, cos: scala.Double): js.Array[scala.Double] = js.native
  def getRotate_3(degrees: scala.Double, px: scala.Double, py: scala.Double): js.Array[scala.Double] = js.native
  def getScale(sx: scala.Double, sy: scala.Double): js.Array[scala.Double] = js.native
  def getScale(sx: scala.Double, sy: scala.Double, px: scala.Double): js.Array[scala.Double] = js.native
  def getScale(sx: scala.Double, sy: scala.Double, px: scala.Double, py: scala.Double): js.Array[scala.Double] = js.native
  def getSkew(kx: scala.Double, ky: scala.Double): js.Array[scala.Double] = js.native
  def getSkew(kx: scala.Double, ky: scala.Double, px: scala.Double): js.Array[scala.Double] = js.native
  def getSkew(kx: scala.Double, ky: scala.Double, px: scala.Double, py: scala.Double): js.Array[scala.Double] = js.native
  def getTranslate(dx: scala.Double, dy: scala.Double): js.Array[scala.Double] = js.native
  def multiply(dest: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Unit = js.native
  /* private */ def reset(mtx: js.Any): js.Any = js.native
  def setRotate_1(dest: js.Array[scala.Double], degrees: scala.Double): js.Array[scala.Double] = js.native
  def setRotate_2(dest: js.Array[scala.Double], sin: scala.Double, cos: scala.Double): js.Array[scala.Double] = js.native
  def setTranslate(dest: js.Array[scala.Double], dx: scala.Double, dy: scala.Double): js.Array[scala.Double] = js.native
}

