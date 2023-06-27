package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapFloorInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Contains the facility features of a floor plan, which describe the footprints of managed buildings and other structures.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html#facilityLayer)
  		 */
  var facilityLayer: FacilityLayerInfo = js.native
  
  /**
  		 * Contains the level features of a floor plan, which describe the footprint of each occupiable floor contained in a managed facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html#levelLayer)
  		 */
  var levelLayer: LevelLayerInfo = js.native
  
  /**
  		 * Contains the site features of a floor plan, which describe the boundaries of managed sites and is used for visualization in mapmaking.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html#siteLayer)
  		 */
  var siteLayer: SiteLayerInfo = js.native
}
