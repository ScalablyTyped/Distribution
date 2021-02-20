package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalReferenceSpatialReference extends StObject {
  
  var latestVcsWkid: js.UndefOr[Double] = js.native
  
  var latestWkid: js.UndefOr[Double] = js.native
  
  var vcsWkid: js.UndefOr[Double] = js.native
  
  var wkid: js.UndefOr[Double] = js.native
}
object ExternalReferenceSpatialReference {
  
  @scala.inline
  def apply(): ExternalReferenceSpatialReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalReferenceSpatialReference]
  }
  
  @scala.inline
  implicit class ExternalReferenceSpatialReferenceMutableBuilder[Self <: ExternalReferenceSpatialReference] (val x: Self) extends AnyVal {
    
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
