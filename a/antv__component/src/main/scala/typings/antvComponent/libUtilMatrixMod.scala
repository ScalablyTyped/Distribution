package typings.antvComponent

import typings.antvComponent.anon.MaxX
import typings.antvGBase.libInterfacesMod.IElement
import typings.antvGBase.libTypesMod.BBox
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMatrixMod {
  
  @JSImport("@antv/component/lib/util/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyMatrix2BBox(matrix: js.Array[Double], bbox: BBox): MaxX = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMatrix2BBox")(matrix.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[MaxX]
  
  inline def applyRotate(shape: IElement, rotate: Double, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRotate")(shape.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyTranslate(shape: IElement, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTranslate")(shape.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAngleByMatrix(matrix: js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngleByMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMatrixByAngle(point: Point, angle: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatrixByAngle")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getMatrixByAngle(point: Point, angle: Double, matrix: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatrixByAngle")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getMatrixByTranslate(point: Point): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMatrixByTranslate")(point.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getMatrixByTranslate(point: Point, currentMatrix: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatrixByTranslate")(point.asInstanceOf[js.Any], currentMatrix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
