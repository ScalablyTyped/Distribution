package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColorSizeStop
import typings.arcgisJsApi.esri.ColorSizeStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersVisualVariablesSupportColorSizeStopMod {
  
  @JSImport("esri/renderers/visualVariables/support/ColorSizeStop", JSImport.Namespace)
  @js.native
  /**
    * Defines how to data values should be represented in the [ColorSizeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html) with an associated color and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html)
    */
  open class ^ ()
    extends StObject
       with ColorSizeStop {
    def this(properties: ColorSizeStopProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/visualVariables/support/ColorSizeStop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ColorSizeStop = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ColorSizeStop]
}
