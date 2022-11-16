package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`stay-above`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundNavigationConstraintProperties extends StObject {
  
  /**
    * The type of the constraint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: js.UndefOr[`stay-above` | none_] = js.undefined
}
object GroundNavigationConstraintProperties {
  
  inline def apply(): GroundNavigationConstraintProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundNavigationConstraintProperties]
  }
  
  extension [Self <: GroundNavigationConstraintProperties](x: Self) {
    
    inline def setType(value: `stay-above` | none_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
