package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MapFloorInfo
import typings.arcgisJsApi.esri.MapFloorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSupportMapFloorInfoMod {
  
  @JSImport("esri/support/MapFloorInfo", JSImport.Namespace)
  @js.native
  /**
    * Floor-aware maps facilitate visualizing, editing, and analyzing indoor data and they allow for fast navigation of buildings in maps and scenes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html)
    */
  open class ^ ()
    extends StObject
       with MapFloorInfo {
    def this(properties: MapFloorInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/support/MapFloorInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MapFloorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MapFloorInfo]
}
