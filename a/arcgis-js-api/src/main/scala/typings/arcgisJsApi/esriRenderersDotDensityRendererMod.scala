package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DotDensityRenderer
import typings.arcgisJsApi.esri.DotDensityRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersDotDensityRendererMod {
  
  @JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
  @js.native
  /**
    * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
    */
  open class ^ ()
    extends StObject
       with DotDensityRenderer {
    def this(properties: DotDensityRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): DotDensityRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DotDensityRenderer]
}
