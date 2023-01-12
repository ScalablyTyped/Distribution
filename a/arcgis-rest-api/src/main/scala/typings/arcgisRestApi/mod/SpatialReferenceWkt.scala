package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialReferenceWkt
  extends StObject
     with SpatialReference {
  
  var latestWkt: js.UndefOr[String] = js.undefined
  
  var wkt: js.UndefOr[String] = js.undefined
}
object SpatialReferenceWkt {
  
  inline def apply(): SpatialReferenceWkt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialReferenceWkt] (val x: Self) extends AnyVal {
    
    inline def setLatestWkt(value: String): Self = StObject.set(x, "latestWkt", value.asInstanceOf[js.Any])
    
    inline def setLatestWktUndefined: Self = StObject.set(x, "latestWkt", js.undefined)
    
    inline def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    inline def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
