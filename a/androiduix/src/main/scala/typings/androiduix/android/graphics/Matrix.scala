package typings.androiduix.android.graphics

import typings.androiduix.android.graphics.Matrix.ScaleToFit
import typings.androiduix.java_.lang.StringBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends js.Object {
  
  /* private */ def computeTypeMask(): js.Any = js.native
  
  def equals(obj: js.Any): Boolean = js.native
  
  def getValues(values: js.Array[Double]): Unit = js.native
  
  def hasPerspective(): Boolean = js.native
  
  def isIdentity(): Boolean = js.native
  
  var mValues: js.Any = js.native
  
  def mapPoints(dst: js.Array[Double]): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.UndefOr[scala.Nothing],
    srcIndex: js.UndefOr[scala.Nothing],
    pointCount: Double
  ): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.UndefOr[scala.Nothing],
    srcIndex: Double
  ): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.UndefOr[scala.Nothing],
    srcIndex: Double,
    pointCount: Double
  ): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: js.UndefOr[scala.Nothing], src: js.Array[Double]): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.Array[Double],
    srcIndex: js.UndefOr[scala.Nothing],
    pointCount: Double
  ): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.Array[Double],
    srcIndex: Double
  ): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.Array[Double],
    srcIndex: Double,
    pointCount: Double
  ): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: Double): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.UndefOr[scala.Nothing],
    srcIndex: js.UndefOr[scala.Nothing],
    pointCount: Double
  ): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: Double, src: js.UndefOr[scala.Nothing], srcIndex: Double): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.UndefOr[scala.Nothing],
    srcIndex: Double,
    pointCount: Double
  ): Unit = js.native
  def mapPoints(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double]): Unit = js.native
  def mapPoints(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.Array[Double],
    srcIndex: js.UndefOr[scala.Nothing],
    pointCount: Double
  ): Unit = js.native
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
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.UndefOr[scala.Nothing],
    srcIndex: js.UndefOr[scala.Nothing],
    ptCount: Double
  ): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.UndefOr[scala.Nothing],
    srcIndex: Double
  ): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.UndefOr[scala.Nothing],
    srcIndex: Double,
    ptCount: Double
  ): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: js.UndefOr[scala.Nothing], src: js.Array[Double]): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.Array[Double],
    srcIndex: js.UndefOr[scala.Nothing],
    ptCount: Double
  ): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.Array[Double],
    srcIndex: Double
  ): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: js.UndefOr[scala.Nothing],
    src: js.Array[Double],
    srcIndex: Double,
    ptCount: Double
  ): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.UndefOr[scala.Nothing],
    srcIndex: js.UndefOr[scala.Nothing],
    ptCount: Double
  ): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.UndefOr[scala.Nothing], srcIndex: Double): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.UndefOr[scala.Nothing],
    srcIndex: Double,
    ptCount: Double
  ): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double]): Unit = js.native
  def mapVectors(
    dst: js.Array[Double],
    dstIndex: Double,
    src: js.Array[Double],
    srcIndex: js.UndefOr[scala.Nothing],
    ptCount: Double
  ): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double], srcIndex: Double): Unit = js.native
  def mapVectors(dst: js.Array[Double], dstIndex: Double, src: js.Array[Double], srcIndex: Double, ptCount: Double): Unit = js.native
  
  def postConcat(other: Matrix): Boolean = js.native
  
  def postRotate(degrees: Double): Boolean = js.native
  def postRotate(degrees: Double, px: js.UndefOr[scala.Nothing], py: Double): Boolean = js.native
  def postRotate(degrees: Double, px: Double): Boolean = js.native
  def postRotate(degrees: Double, px: Double, py: Double): Boolean = js.native
  
  def postScale(sx: Double, sy: Double): Boolean = js.native
  def postScale(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): Boolean = js.native
  def postScale(sx: Double, sy: Double, px: Double): Boolean = js.native
  def postScale(sx: Double, sy: Double, px: Double, py: Double): Boolean = js.native
  
  def postSkew(kx: Double, ky: Double): Boolean = js.native
  def postSkew(kx: Double, ky: Double, px: js.UndefOr[scala.Nothing], py: Double): Boolean = js.native
  def postSkew(kx: Double, ky: Double, px: Double): Boolean = js.native
  def postSkew(kx: Double, ky: Double, px: Double, py: Double): Boolean = js.native
  
  /* private */ def postTransform(matrix: js.Any): js.Any = js.native
  
  def postTranslate(dx: Double, dy: Double): Boolean = js.native
  
  def preConcat(other: Matrix): Boolean = js.native
  
  def preRotate(degrees: Double): Boolean = js.native
  def preRotate(degrees: Double, px: js.UndefOr[scala.Nothing], py: Double): Boolean = js.native
  def preRotate(degrees: Double, px: Double): Boolean = js.native
  def preRotate(degrees: Double, px: Double, py: Double): Boolean = js.native
  
  def preScale(sx: Double, sy: Double): Boolean = js.native
  def preScale(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): Boolean = js.native
  def preScale(sx: Double, sy: Double, px: Double): Boolean = js.native
  def preScale(sx: Double, sy: Double, px: Double, py: Double): Boolean = js.native
  
  def preSkew(kx: Double, ky: Double): Boolean = js.native
  def preSkew(kx: Double, ky: Double, px: js.UndefOr[scala.Nothing], py: Double): Boolean = js.native
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
  def setRotate(degrees: Double, px: js.UndefOr[scala.Nothing], py: Double): Unit = js.native
  def setRotate(degrees: Double, px: Double): Unit = js.native
  def setRotate(degrees: Double, px: Double, py: Double): Unit = js.native
  
  def setScale(sx: Double, sy: Double): Unit = js.native
  def setScale(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): Unit = js.native
  def setScale(sx: Double, sy: Double, px: Double): Unit = js.native
  def setScale(sx: Double, sy: Double, px: Double, py: Double): Unit = js.native
  
  def setSinCos(sinValue: Double, cosValue: Double): Unit = js.native
  def setSinCos(sinValue: Double, cosValue: Double, px: js.UndefOr[scala.Nothing], py: Double): Unit = js.native
  def setSinCos(sinValue: Double, cosValue: Double, px: Double): Unit = js.native
  def setSinCos(sinValue: Double, cosValue: Double, px: Double, py: Double): Unit = js.native
  
  def setSkew(kx: Double, ky: Double): Unit = js.native
  def setSkew(kx: Double, ky: Double, px: js.UndefOr[scala.Nothing], py: Double): Unit = js.native
  def setSkew(kx: Double, ky: Double, px: Double): Unit = js.native
  def setSkew(kx: Double, ky: Double, px: Double, py: Double): Unit = js.native
  
  def setTranslate(dx: Double, dy: Double): Unit = js.native
  
  def setValues(values: js.Array[Double]): Unit = js.native
  
  def toShortString(sb: StringBuilder): Unit = js.native
}
@JSGlobal("android.graphics.Matrix")
@js.native
object Matrix extends js.Object {
  
  @js.native
  sealed trait ScaleToFit extends js.Object
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
  }
}
