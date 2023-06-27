package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TopFeaturesQuery
import typings.arcgisJsApi.esri.TopFeaturesQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportTopFeaturesQueryMod {
  
  @JSImport("esri/rest/support/TopFeaturesQuery", JSImport.Namespace)
  @js.native
  /**
  		 * This class defines parameters for executing [top features queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopFeatures) from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html)
  		 */
  open class ^ ()
    extends StObject
       with TopFeaturesQuery {
    def this(properties: TopFeaturesQueryProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/TopFeaturesQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TopFeaturesQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TopFeaturesQuery]
}
