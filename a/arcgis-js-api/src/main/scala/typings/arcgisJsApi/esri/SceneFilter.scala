package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.contains
import typings.arcgisJsApi.arcgisJsApiStrings.disjoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneFilter
  extends StObject
     with Accessor {
  
  /**
  		 * The geometries to apply to the spatial filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html#geometries)
  		 */
  var geometries: Collection[Any] = js.native
  
  /**
  		 * The type of masking to perform.
  		 *
  		 * @default "disjoint"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html#spatialRelationship)
  		 */
  var spatialRelationship: disjoint | contains = js.native
}
