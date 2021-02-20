package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait District extends StObject {
  
  var adcode: String = js.native
  
  var boundaries: js.Array[LngLat] = js.native
  
  var center: LngLat = js.native
  
  var citycode: String = js.native
  
  var districtList: js.Array[District] = js.native
  
  var level: String = js.native
  
  var name: String = js.native
}
object District {
  
  @scala.inline
  def apply(
    adcode: String,
    boundaries: js.Array[LngLat],
    center: LngLat,
    citycode: String,
    districtList: js.Array[District],
    level: String,
    name: String
  ): District = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districtList = districtList.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[District]
  }
  
  @scala.inline
  implicit class DistrictMutableBuilder[Self <: District] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaries(value: js.Array[LngLat]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundariesVarargs(value: LngLat*): Self = StObject.set(x, "boundaries", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: LngLat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictList(value: js.Array[District]): Self = StObject.set(x, "districtList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictListVarargs(value: District*): Self = StObject.set(x, "districtList", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
