package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indoordata extends StObject {
  
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
  implicit class IndoordataMutableBuilder[Self <: Indoordata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndoor_data(value: Cpid): Self = StObject.set(x, "indoor_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndoor_map(value: `true`): Self = StObject.set(x, "indoor_map", value.asInstanceOf[js.Any])
  }
}
