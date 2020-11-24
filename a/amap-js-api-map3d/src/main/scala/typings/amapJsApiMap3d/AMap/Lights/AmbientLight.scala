package typings.amapJsApiMap3d.AMap.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmbientLight extends js.Object {
  
  def setColor(color: js.Tuple3[Double, Double, Double]): Unit = js.native
  
  def setIntensity(intensity: Double): Unit = js.native
}
object AmbientLight {
  
  @scala.inline
  def apply(setColor: js.Tuple3[Double, Double, Double] => Unit, setIntensity: Double => Unit): AmbientLight = {
    val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setIntensity = js.Any.fromFunction1(setIntensity))
    __obj.asInstanceOf[AmbientLight]
  }
  
  @scala.inline
  implicit class AmbientLightOps[Self <: AmbientLight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetColor(value: js.Tuple3[Double, Double, Double] => Unit): Self = this.set("setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIntensity(value: Double => Unit): Self = this.set("setIntensity", js.Any.fromFunction1(value))
  }
}
