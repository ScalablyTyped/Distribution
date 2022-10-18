package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeotriggerNotificationOptions
import typings.arcgisJsApi.esri.GeotriggerNotificationOptionsConstructor
import typings.arcgisJsApi.esri.GeotriggerNotificationOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocGeotriggersInfoGeotriggerNotificationOptionsMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/GeotriggerNotificationOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeotriggerNotificationOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/GeotriggerNotificationOptions", JSImport.Namespace)
  @js.native
  /**
    * Options that control the notification information sent to a client app client when a Geotrigger condition is met.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html)
    */
  open class Class ()
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
  
  type _To = js.Object & GeotriggerNotificationOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocGeotriggersInfoGeotriggerNotificationOptionsMod.foo` */
  override def _to: js.Object & GeotriggerNotificationOptionsConstructor = ^
}
