package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait geotriggersInfoFeatureFilterProperties extends StObject {
  
  /**
  		 * An optional geometry used to filter the features from a feature table.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html#geometry)
  		 */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
  		 * An optional SQL-based definition expression string that narrows the data to be used.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html#where)
  		 */
  var where: js.UndefOr[String] = js.undefined
}
object geotriggersInfoFeatureFilterProperties {
  
  inline def apply(): geotriggersInfoFeatureFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[geotriggersInfoFeatureFilterProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: geotriggersInfoFeatureFilterProperties] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: GeometryProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
