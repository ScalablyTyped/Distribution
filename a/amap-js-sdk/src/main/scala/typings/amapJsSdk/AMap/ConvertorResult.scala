package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 坐标转换结果
  */
trait ConvertorResult extends StObject {
  
  var info: String
  
  var locations: js.Array[LngLat]
}
object ConvertorResult {
  
  @scala.inline
  def apply(info: String, locations: js.Array[LngLat]): ConvertorResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertorResult]
  }
  
  @scala.inline
  implicit class ConvertorResultMutableBuilder[Self <: ConvertorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: js.Array[LngLat]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: LngLat*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}
