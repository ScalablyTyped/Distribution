package typings.antvMatrixUtil

import typings.glMatrix.mod.mat3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extMod {
  
  @JSImport("@antv/matrix-util/lib/ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("direction")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def leftRotate(out: js.Any, a: js.Any, rad: js.Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftRotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat3]
  
  @scala.inline
  def leftScale(out: js.Any, a: js.Any, v: js.Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftScale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
  
  @scala.inline
  def leftTranslate(out: js.Any, a: js.Any, v: js.Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftTranslate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
  
  @scala.inline
  def transform(m: js.Array[Double], actions: js.Array[js.Array[js.Any]]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("vertical")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
