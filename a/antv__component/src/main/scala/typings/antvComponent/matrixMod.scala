package typings.antvComponent

import typings.antvComponent.anon.MaxX
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("@antv/component/lib/util/matrix", "applyMatrix2BBox")
  @js.native
  def applyMatrix2BBox(matrix: js.Array[Double], bbox: BBox): MaxX = js.native
  
  @JSImport("@antv/component/lib/util/matrix", "applyRotate")
  @js.native
  def applyRotate(shape: IElement, rotate: Double, x: Double, y: Double): Unit = js.native
  
  @JSImport("@antv/component/lib/util/matrix", "applyTranslate")
  @js.native
  def applyTranslate(shape: IElement, x: Double, y: Double): Unit = js.native
  
  @JSImport("@antv/component/lib/util/matrix", "getAngleByMatrix")
  @js.native
  def getAngleByMatrix(matrix: js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]): Double = js.native
  
  @JSImport("@antv/component/lib/util/matrix", "getMatrixByAngle")
  @js.native
  def getMatrixByAngle(point: Point, angle: Double): js.Array[Double] = js.native
  @JSImport("@antv/component/lib/util/matrix", "getMatrixByAngle")
  @js.native
  def getMatrixByAngle(point: Point, angle: Double, matrix: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@antv/component/lib/util/matrix", "getMatrixByTranslate")
  @js.native
  def getMatrixByTranslate(point: Point): js.Array[Double] = js.native
  @JSImport("@antv/component/lib/util/matrix", "getMatrixByTranslate")
  @js.native
  def getMatrixByTranslate(point: Point, currentMatrix: js.Array[Double]): js.Array[Double] = js.native
}
