package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indoordata extends js.Object {
  
  var indoor_data: Cpid = js.native
  
  var indoor_map: `true` = js.native
}
object Indoordata {
  
  @scala.inline
  def apply(indoor_data: Cpid, indoor_map: `true`): Indoordata = {
    val __obj = js.Dynamic.literal(indoor_data = indoor_data.asInstanceOf[js.Any], indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indoordata]
  }
  
  @scala.inline
  implicit class IndoordataOps[Self <: Indoordata] (val x: Self) extends AnyVal {
    
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
    def setIndoor_data(value: Cpid): Self = this.set("indoor_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndoor_map(value: `true`): Self = this.set("indoor_map", value.asInstanceOf[js.Any])
  }
}
