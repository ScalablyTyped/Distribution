package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`stay-above`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundNavigationConstraint
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The type of the constraint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: `stay-above` | none_
}
object GroundNavigationConstraint {
  
  inline def apply(`type`: `stay-above` | none_): GroundNavigationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundNavigationConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroundNavigationConstraint] (val x: Self) extends AnyVal {
    
    inline def setType(value: `stay-above` | none_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
