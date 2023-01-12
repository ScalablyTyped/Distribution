package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialReferenceWkid
  extends StObject
     with SpatialReference {
  
  var latestVcsWkid: js.UndefOr[Double] = js.undefined
  
  var latestWkid: js.UndefOr[Double] = js.undefined
  
  var vcsWkid: js.UndefOr[Double] = js.undefined
  
  var wkid: js.UndefOr[Double] = js.undefined
}
object SpatialReferenceWkid {
  
  inline def apply(): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialReferenceWkid] (val x: Self) extends AnyVal {
    
    inline def setLatestVcsWkid(value: Double): Self = StObject.set(x, "latestVcsWkid", value.asInstanceOf[js.Any])
    
    inline def setLatestVcsWkidUndefined: Self = StObject.set(x, "latestVcsWkid", js.undefined)
    
    inline def setLatestWkid(value: Double): Self = StObject.set(x, "latestWkid", value.asInstanceOf[js.Any])
    
    inline def setLatestWkidUndefined: Self = StObject.set(x, "latestWkid", js.undefined)
    
    inline def setVcsWkid(value: Double): Self = StObject.set(x, "vcsWkid", value.asInstanceOf[js.Any])
    
    inline def setVcsWkidUndefined: Self = StObject.set(x, "vcsWkid", js.undefined)
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    inline def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
  }
}
