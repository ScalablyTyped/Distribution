package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSelectResultEventResult extends StObject {
  
  var extent: Extent
  
  var feature: Graphic
  
  var name: String
}
object SearchSelectResultEventResult {
  
  inline def apply(extent: Extent, feature: Graphic, name: String): SearchSelectResultEventResult = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSelectResultEventResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSelectResultEventResult] (val x: Self) extends AnyVal {
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
