package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GeotriggerNotificationOptions
import typings.arcgisJsApi.esri.GeotriggerNotificationOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebdocGeotriggersInfoGeotriggerNotificationOptionsMod {
  
  @JSImport("esri/webdoc/geotriggersInfo/GeotriggerNotificationOptions", JSImport.Namespace)
  @js.native
  /**
  		 * Options that control the notification information sent to a client app client when a Geotrigger condition is met.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html)
  		 */
  open class ^ ()
    extends StObject
       with GeotriggerNotificationOptions {
    def this(properties: GeotriggerNotificationOptionsProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webdoc/geotriggersInfo/GeotriggerNotificationOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): GeotriggerNotificationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[GeotriggerNotificationOptions]
}
