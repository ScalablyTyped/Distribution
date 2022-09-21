package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFenceParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * An optional buffer distance to apply to fence features in meters.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#bufferDistance)
    */
  var bufferDistance: Double = js.native
  
  /**
    * An object defining the source for a feature layer to be used as fences.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#fenceSource)
    */
  var fenceSource: FeatureLayerSource = js.native
  
  /**
    * An optional filter to reduce the features used for the parameters.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#filter)
    */
  var filter: geotriggersInfoFeatureFilter = js.native
  
  /**
    * String indicating the fence parameters type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#type)
    */
  val `type`: features = js.native
}
