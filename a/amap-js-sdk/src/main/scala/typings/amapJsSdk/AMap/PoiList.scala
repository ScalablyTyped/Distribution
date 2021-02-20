package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoiList extends StObject {
  
  var count: Double = js.native
  
  var pageIndex: Double = js.native
  
  var pageSize: Double = js.native
  
  var pois: js.Array[Poi] = js.native
}
object PoiList {
  
  @scala.inline
  def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiList]
  }
  
  @scala.inline
  implicit class PoiListMutableBuilder[Self <: PoiList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPois(value: js.Array[Poi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoisVarargs(value: Poi*): Self = StObject.set(x, "pois", js.Array(value :_*))
  }
}
