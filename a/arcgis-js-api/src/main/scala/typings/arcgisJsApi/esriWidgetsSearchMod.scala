package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import typings.arcgisJsApi.esri.widgetsSearch
import typings.arcgisJsApi.esri.widgetsSearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSearchMod {
  
  @JSImport("esri/widgets/Search", JSImport.Namespace)
  @js.native
  /**
  		 * The Search widget provides a way to perform search operations on [locator service(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html), [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)/[feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) service feature layer(s), [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) with an associated feature layer, [BuildingComponentSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html) with an associated feature layer, [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html), and/or [table(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html)
  		 */
  open class ^ ()
    extends StObject
       with widgetsSearch {
    def this(properties: widgetsSearchProperties) = this()
    
    /**
    		 * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    		 */
    /* CompleteClass */
    override def goToOverride(view: MapView, goToParameters: Any): Unit = js.native
    /* CompleteClass */
    override def goToOverride(view: SceneView, goToParameters: Any): Unit = js.native
    /**
    		 * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    		 */
    /* CompleteClass */
    @JSName("goToOverride")
    var goToOverride_Original: GoToOverride = js.native
  }
}
