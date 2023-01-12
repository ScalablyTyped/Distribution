package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.contains
import typings.arcgisJsApi.arcgisJsApiStrings.disjoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneFilterProperties extends StObject {
  
  /**
    * The geometries to apply to the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html#geometries)
    */
  var geometries: js.UndefOr[CollectionProperties[Any]] = js.undefined
  
  /**
    * The type of masking to perform.
    *
    * @default "disjoint"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html#spatialRelationship)
    */
  var spatialRelationship: js.UndefOr[disjoint | contains] = js.undefined
}
object SceneFilterProperties {
  
  inline def apply(): SceneFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneFilterProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneFilterProperties] (val x: Self) extends AnyVal {
    
    inline def setGeometries(value: CollectionProperties[Any]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: Any*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setSpatialRelationship(value: disjoint | contains): Self = StObject.set(x, "spatialRelationship", value.asInstanceOf[js.Any])
    
    inline def setSpatialRelationshipUndefined: Self = StObject.set(x, "spatialRelationship", js.undefined)
  }
}
