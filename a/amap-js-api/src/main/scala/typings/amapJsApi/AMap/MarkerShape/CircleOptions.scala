package typings.amapJsApi.AMap.MarkerShape

import typings.amapJsApi.amapJsApiStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleOptions extends Options {
  
  var coords: js.Tuple3[Double, Double, Double] = js.native
  
  var `type`: circle = js.native
}
object CircleOptions {
  
  @scala.inline
  def apply(coords: js.Tuple3[Double, Double, Double], `type`: circle): CircleOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit class CircleOptionsOps[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
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
    def setCoords(value: js.Tuple3[Double, Double, Double]): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: circle): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
