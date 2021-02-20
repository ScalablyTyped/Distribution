package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistrictSearchResult extends StObject {
  
  var districtList: js.Array[District] = js.native
  
  var info: String = js.native
}
object DistrictSearchResult {
  
  @scala.inline
  def apply(districtList: js.Array[District], info: String): DistrictSearchResult = {
    val __obj = js.Dynamic.literal(districtList = districtList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchResult]
  }
  
  @scala.inline
  implicit class DistrictSearchResultMutableBuilder[Self <: DistrictSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistrictList(value: js.Array[District]): Self = StObject.set(x, "districtList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictListVarargs(value: District*): Self = StObject.set(x, "districtList", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
