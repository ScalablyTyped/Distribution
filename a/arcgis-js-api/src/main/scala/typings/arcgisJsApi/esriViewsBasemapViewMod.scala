package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BasemapView
import typings.arcgisJsApi.esri.BasemapViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsBasemapViewMod {
  
  @JSImport("esri/views/BasemapView", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the view for a single basemap after it has been added to either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BasemapView.html)
  		 */
  open class ^ ()
    extends StObject
       with BasemapView {
    def this(properties: BasemapViewProperties) = this()
  }
}
