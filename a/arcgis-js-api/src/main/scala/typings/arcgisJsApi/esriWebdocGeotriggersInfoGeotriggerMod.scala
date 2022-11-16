package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Geotrigger
import typings.arcgisJsApi.esri.GeotriggerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebdocGeotriggersInfoGeotriggerMod {
  
  @JSImport("esri/webdoc/geotriggersInfo/Geotrigger", JSImport.Namespace)
  @js.native
  /**
    * A Geotrigger is a condition that will be monitored against dynamic GIS data - for example using a spatial operation to check for enter/exit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-Geotrigger.html)
    */
  open class ^ ()
    extends StObject
       with Geotrigger {
    def this(properties: GeotriggerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webdoc/geotriggersInfo/Geotrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Geotrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Geotrigger]
}
