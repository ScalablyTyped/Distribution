package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Basemap
import typings.arcgisJsApi.esri.BasemapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriBasemapMod {
  
  @JSImport("esri/Basemap", JSImport.Namespace)
  @js.native
  /**
    * Creates a new basemap object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
    */
  open class ^ ()
    extends StObject
       with Basemap {
    def this(properties: BasemapProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/Basemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new basemap instance from a [well known basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId)
    */
  inline def fromId(id: String): Basemap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[Basemap]
  
  inline def fromJSON(json: Any): Basemap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Basemap]
}
