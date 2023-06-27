package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geotriggersInfoFeatureFilter
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * An optional geometry used to filter the features from a feature table.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html#geometry)
  		 */
  var geometry: Geometry_ = js.native
  
  /**
  		 * An optional SQL-based definition expression string that narrows the data to be used.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html#where)
  		 */
  var where: String = js.native
}
