package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var attributes: js.Any
  
  var geometry: Geometry
}
object Feature {
  
  @scala.inline
  def apply(attributes: js.Any, geometry: Geometry): Feature = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
