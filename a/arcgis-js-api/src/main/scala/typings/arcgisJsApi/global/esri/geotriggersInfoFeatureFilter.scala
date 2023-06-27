package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.geotriggersInfoFeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.geotriggersInfoFeatureFilter")
@js.native
/**
		 * Description of spatial and attribute filters that will be applied to Feature data.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html)
		 */
open class geotriggersInfoFeatureFilter ()
  extends StObject
     with typings.arcgisJsApi.esri.geotriggersInfoFeatureFilter {
  def this(properties: geotriggersInfoFeatureFilterProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object geotriggersInfoFeatureFilter {
  
  @JSGlobal("__esri.geotriggersInfoFeatureFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.geotriggersInfoFeatureFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.geotriggersInfoFeatureFilter]
}
