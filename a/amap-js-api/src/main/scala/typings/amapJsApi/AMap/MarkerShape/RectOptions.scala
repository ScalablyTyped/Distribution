package typings.amapJsApi.AMap.MarkerShape

import typings.amapJsApi.amapJsApiStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectOptions extends Options {
  
  var coords: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var `type`: rect = js.native
}
object RectOptions {
  
  @scala.inline
  def apply(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): RectOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectOptions]
  }
  
  @scala.inline
  implicit class RectOptionsOps[Self <: RectOptions] (val x: Self) extends AnyVal {
    
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
    def setCoords(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: rect): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
