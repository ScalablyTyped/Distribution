package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`device-location`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceLocationFeed
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * An optional Arcade expression that controls whether a location update will be used by a geotrigger.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-DeviceLocationFeed.html#filterExpression)
    */
  var filterExpression: geotriggersInfoExpressionInfo = js.native
  
  /**
    * String indicating the type of Geotrigger feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-DeviceLocationFeed.html#type)
    */
  val `type`: `device-location` = js.native
}
