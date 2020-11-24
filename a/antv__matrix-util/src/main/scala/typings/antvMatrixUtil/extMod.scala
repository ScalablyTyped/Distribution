package typings.antvMatrixUtil

import typings.glMatrix.mod.mat3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/matrix-util/lib/ext", JSImport.Namespace)
@js.native
object extMod extends js.Object {
  
  def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = js.native
  
  def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = js.native
  
  def leftRotate(out: js.Any, a: js.Any, rad: js.Any): mat3 = js.native
  
  def leftScale(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
  
  def leftTranslate(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
  
  def transform(m: js.Array[Double], actions: js.Array[js.Array[_]]): js.Array[_] = js.native
  
  def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = js.native
}
