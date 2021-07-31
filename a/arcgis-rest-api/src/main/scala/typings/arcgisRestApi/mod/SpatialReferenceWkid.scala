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
  
  @scala.inline
  def apply(): SpatialReferenceWkid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkid]
  }
  
  @scala.inline
  implicit class SpatialReferenceWkidMutableBuilder[Self <: SpatialReferenceWkid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestVcsWkid(value: Double): Self = StObject.set(x, "latestVcsWkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVcsWkidUndefined: Self = StObject.set(x, "latestVcsWkid", js.undefined)
    
    @scala.inline
    def setLatestWkid(value: Double): Self = StObject.set(x, "latestWkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestWkidUndefined: Self = StObject.set(x, "latestWkid", js.undefined)
    
    @scala.inline
    def setVcsWkid(value: Double): Self = StObject.set(x, "vcsWkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcsWkidUndefined: Self = StObject.set(x, "vcsWkid", js.undefined)
    
    @scala.inline
    def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
  }
}
