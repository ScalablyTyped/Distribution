package typings.antvComponent

import typings.antvComponent.anon.MaxX
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/util/matrix", JSImport.Namespace)
@js.native
object matrixMod extends js.Object {
  
  def applyMatrix2BBox(matrix: js.Array[Double], bbox: BBox): MaxX = js.native
  
  def applyRotate(shape: IElement, rotate: Double, x: Double, y: Double): Unit = js.native
  
  def applyTranslate(shape: IElement, x: Double, y: Double): Unit = js.native
  
  def getAngleByMatrix(matrix: js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]): Double = js.native
  
  def getMatrixByAngle(point: Point, angle: Double): js.Array[Double] = js.native
  def getMatrixByAngle(point: Point, angle: Double, matrix: js.Array[Double]): js.Array[Double] = js.native
  
  def getMatrixByTranslate(point: Point): js.Array[Double] = js.native
  def getMatrixByTranslate(point: Point, currentMatrix: js.Array[Double]): js.Array[Double] = js.native
}
