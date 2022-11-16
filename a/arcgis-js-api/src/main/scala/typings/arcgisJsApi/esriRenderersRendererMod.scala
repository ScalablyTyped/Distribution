package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Renderer
import typings.arcgisJsApi.esri.RendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersRendererMod {
  
  @JSImport("esri/renderers/Renderer", JSImport.Namespace)
  @js.native
  /**
    * Renderers define how to visually represent each feature in one of the following layer types:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html)
    */
  open class ^ ()
    extends StObject
       with Renderer {
    def this(properties: RendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/Renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Renderer]
}
