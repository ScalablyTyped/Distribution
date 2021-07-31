package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait websceneInitialViewProperties
  extends StObject
     with Accessor {
  
  /**
    * The initial environment settings of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment)
    */
  var environment: Environment = js.native
  
  /**
    * The spatial reference of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The viewing mode of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode)
    */
  var viewingMode: global | local = js.native
  
  /**
    * The initial viewpoint of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
}
