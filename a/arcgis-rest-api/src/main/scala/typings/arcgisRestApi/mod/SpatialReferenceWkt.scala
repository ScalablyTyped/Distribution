package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReferenceWkt extends SpatialReference {
  
  var latestWkt: js.UndefOr[String] = js.native
  
  var wkt: js.UndefOr[String] = js.native
}
object SpatialReferenceWkt {
  
  @scala.inline
  def apply(): SpatialReferenceWkt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkt]
  }
  
  @scala.inline
  implicit class SpatialReferenceWktMutableBuilder[Self <: SpatialReferenceWkt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestWkt(value: String): Self = StObject.set(x, "latestWkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestWktUndefined: Self = StObject.set(x, "latestWkt", js.undefined)
    
    @scala.inline
    def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
