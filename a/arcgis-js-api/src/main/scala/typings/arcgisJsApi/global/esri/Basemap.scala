package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BasemapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Basemap")
@js.native
/**
  * Creates a new basemap object.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
  */
open class Basemap ()
  extends StObject
     with typings.arcgisJsApi.esri.Basemap {
  def this(properties: BasemapProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Basemap {
  
  @JSGlobal("__esri.Basemap")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new basemap instance from a [well known basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId)
    */
  inline def fromId(id: String): typings.arcgisJsApi.esri.Basemap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Basemap]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Basemap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Basemap]
}
