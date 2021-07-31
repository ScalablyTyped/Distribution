package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMapConstructor
  extends StObject
     with /**
  * Loads a [WebMap](https://doc.arcgis.com/en/arcgis-online/create-maps/make-your-first-map.htm) from [ArcGIS Online](https://www.arcgis.com/home/) or [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/latest/administer/windows/what-is-portal-for-arcgis-.htm) into a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html)
  */
Instantiable0[WebMap]
     with Instantiable1[/* properties */ WebMapProperties, WebMap] {
  
  /**
    * Creates a new instance of [this class]() and initializes it with values from a JSON object generated from a product in the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#fromJSON)
    */
  def fromJSON(json: js.Any): js.Any = js.native
}
