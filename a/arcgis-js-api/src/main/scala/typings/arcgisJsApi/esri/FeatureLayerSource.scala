package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`feature-layer`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerSource
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A unique identifying string that must match the `id` property of a feature layer in an associated map.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html#layerId)
    */
  var layerId: String = js.native
  
  /**
    * A URL to a service that will be used for all queries against the layer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html#layerUrl)
    */
  var layerUrl: String = js.native
  
  /**
    * String indicating the type of source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html#type)
    */
  val `type`: `feature-layer` = js.native
}
