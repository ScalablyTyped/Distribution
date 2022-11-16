package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DeviceLocationFeedProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DeviceLocationFeed")
@js.native
/**
  * A Geotrigger feed which uses the device location to provide updates.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-DeviceLocationFeed.html)
  */
open class DeviceLocationFeed ()
  extends StObject
     with typings.arcgisJsApi.esri.DeviceLocationFeed {
  def this(properties: DeviceLocationFeedProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DeviceLocationFeed {
  
  @JSGlobal("__esri.DeviceLocationFeed")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DeviceLocationFeed = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DeviceLocationFeed]
}
