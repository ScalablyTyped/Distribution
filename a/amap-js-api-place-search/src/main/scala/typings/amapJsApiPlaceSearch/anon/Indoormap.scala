package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indoormap extends js.Object {
  
  var indoor_map: `false` = js.native
}
object Indoormap {
  
  @scala.inline
  def apply(indoor_map: `false`): Indoormap = {
    val __obj = js.Dynamic.literal(indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indoormap]
  }
  
  @scala.inline
  implicit class IndoormapOps[Self <: Indoormap] (val x: Self) extends AnyVal {
    
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
    def setIndoor_map(value: `false`): Self = this.set("indoor_map", value.asInstanceOf[js.Any])
  }
}
