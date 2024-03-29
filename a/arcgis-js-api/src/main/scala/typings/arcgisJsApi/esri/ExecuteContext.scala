package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteContext extends StObject {
  
  /**
  		 * The expected spatial reference of input geometries in geometry functions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ExecuteContext)
  		 */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}
object ExecuteContext {
  
  inline def apply(): ExecuteContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteContext] (val x: Self) extends AnyVal {
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
