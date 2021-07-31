package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSelectResultEventResult
  extends StObject
     with Object {
  
  var extent: Extent
  
  var feature: Graphic
  
  var name: String
}
object SearchSelectResultEventResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    extent: Extent,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SearchSelectResultEventResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SearchSelectResultEventResult]
  }
  
  @scala.inline
  implicit class SearchSelectResultEventResultMutableBuilder[Self <: SearchSelectResultEventResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
