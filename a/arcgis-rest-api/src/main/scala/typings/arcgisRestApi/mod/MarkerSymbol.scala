package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerSymbol extends Symbol {
  
  var angle: js.UndefOr[Double] = js.native
  
  var xoffset: js.UndefOr[Double] = js.native
  
  var yoffset: js.UndefOr[Double] = js.native
}
object MarkerSymbol {
  
  @scala.inline
  def apply(`type`: SymbolType): MarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbol]
  }
  
  @scala.inline
  implicit class MarkerSymbolOps[Self <: MarkerSymbol] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setXoffset(value: Double): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXoffset: Self = this.set("xoffset", js.undefined)
    
    @scala.inline
    def setYoffset(value: Double): Self = this.set("yoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoffset: Self = this.set("yoffset", js.undefined)
  }
}
