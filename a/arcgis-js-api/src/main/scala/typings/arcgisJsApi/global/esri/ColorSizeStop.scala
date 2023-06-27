package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColorSizeStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorSizeStop")
@js.native
/**
		 * Defines how to data values should be represented in the [ColorSizeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html) with an associated color and size.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html)
		 */
open class ColorSizeStop ()
  extends StObject
     with typings.arcgisJsApi.esri.ColorSizeStop {
  def this(properties: ColorSizeStopProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ColorSizeStop {
  
  @JSGlobal("__esri.ColorSizeStop")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ColorSizeStop = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColorSizeStop]
}
