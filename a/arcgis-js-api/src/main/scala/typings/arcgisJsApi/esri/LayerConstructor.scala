package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerConstructor
  extends StObject
     with Instantiable0[Layer]
     with Instantiable1[/* properties */ LayerProperties, Layer] {
  
  /**
    * Creates a new layer instance from an ArcGIS Server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    */
  def fromArcGISServerUrl(params: LayerFromArcGISServerUrlParams): js.Promise[Layer] = js.native
  
  /**
    * Creates a new layer instance of the appropriate layer class from an ArcGIS Online or ArcGIS Enterprise [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    */
  def fromPortalItem(params: LayerFromPortalItemParams): js.Promise[Layer] = js.native
}
