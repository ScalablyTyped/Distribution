package typings.arcgisJsApi

import typings.arcgisJsApi.esri.HeightModelInfo
import typings.arcgisJsApi.esri.HeightModelInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometryHeightModelInfoMod {
  
  @JSImport("esri/geometry/HeightModelInfo", JSImport.Namespace)
  @js.native
  /**
    * The height model info defines the characteristics of a vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html)
    */
  open class ^ ()
    extends StObject
       with HeightModelInfo {
    def this(properties: HeightModelInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/HeightModelInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): HeightModelInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[HeightModelInfo]
}
