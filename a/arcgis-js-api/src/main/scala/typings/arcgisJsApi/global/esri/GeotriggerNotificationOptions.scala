package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeotriggerNotificationOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GeotriggerNotificationOptions")
@js.native
/**
  * Options that control the notification information sent to a client app client when a Geotrigger condition is met.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html)
  */
open class GeotriggerNotificationOptions ()
  extends StObject
     with typings.arcgisJsApi.esri.GeotriggerNotificationOptions {
  def this(properties: GeotriggerNotificationOptionsProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object GeotriggerNotificationOptions {
  
  @JSGlobal("__esri.GeotriggerNotificationOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.GeotriggerNotificationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.GeotriggerNotificationOptions]
}
