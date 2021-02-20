package typings.aframe.anon

import typings.tweenjsTweenJs.anon.Bernstein
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInterpolation extends StObject {
  
  def Bezier(v: js.Array[Double], k: Double): Double = js.native
  
  def CatmullRom(v: js.Array[Double], k: Double): Double = js.native
  
  def Linear(v: js.Array[Double], k: Double): Double = js.native
  
  var Utils: Bernstein = js.native
}
object TypeofInterpolation {
  
  @scala.inline
  def apply(
    Bezier: (js.Array[Double], Double) => Double,
    CatmullRom: (js.Array[Double], Double) => Double,
    Linear: (js.Array[Double], Double) => Double,
    Utils: Bernstein
  ): TypeofInterpolation = {
    val __obj = js.Dynamic.literal(Bezier = js.Any.fromFunction2(Bezier), CatmullRom = js.Any.fromFunction2(CatmullRom), Linear = js.Any.fromFunction2(Linear), Utils = Utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInterpolation]
  }
  
  @scala.inline
  implicit class TypeofInterpolationMutableBuilder[Self <: TypeofInterpolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBezier(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "Bezier", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCatmullRom(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "CatmullRom", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLinear(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "Linear", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUtils(value: Bernstein): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
  }
}
