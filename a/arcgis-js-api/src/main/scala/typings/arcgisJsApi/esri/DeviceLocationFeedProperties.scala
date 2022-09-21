package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceLocationFeedProperties extends StObject {
  
  /**
    * An optional Arcade expression that controls whether a location update will be used by a geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-DeviceLocationFeed.html#filterExpression)
    */
  var filterExpression: js.UndefOr[geotriggersInfoExpressionInfoProperties] = js.undefined
}
object DeviceLocationFeedProperties {
  
  inline def apply(): DeviceLocationFeedProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceLocationFeedProperties]
  }
  
  extension [Self <: DeviceLocationFeedProperties](x: Self) {
    
    inline def setFilterExpression(value: geotriggersInfoExpressionInfoProperties): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
  }
}
