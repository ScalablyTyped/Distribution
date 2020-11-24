package typings.antvDataSet.centroidMod

import typings.antvDataSet.viewMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var field: String = js.native
  
  var geoDataView: View | String = js.native
}
object Options {
  
  @scala.inline
  def apply(field: String, geoDataView: View | String): Options = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], geoDataView = geoDataView.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoDataView(value: View | String): Self = this.set("geoDataView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: js.Tuple2[String, String]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
  }
}
