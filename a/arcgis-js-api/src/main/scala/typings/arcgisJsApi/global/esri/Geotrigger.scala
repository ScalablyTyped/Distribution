package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeotriggerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Geotrigger")
@js.native
/**
  * A Geotrigger is a condition that will be monitored against dynamic GIS data - for example using a spatial operation to check for enter/exit.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-Geotrigger.html)
  */
open class Geotrigger ()
  extends StObject
     with typings.arcgisJsApi.esri.Geotrigger {
  def this(properties: GeotriggerProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Geotrigger {
  
  @JSGlobal("__esri.Geotrigger")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Geotrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Geotrigger]
}
