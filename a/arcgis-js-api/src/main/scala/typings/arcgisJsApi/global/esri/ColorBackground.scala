package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorBackground")
@js.native
/**
  * Represents the background color of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) when displayed in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-background-ColorBackground.html)
  */
open class ColorBackground ()
  extends StObject
     with typings.arcgisJsApi.esri.ColorBackground {
  def this(properties: ColorBackgroundProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ColorBackground {
  
  @JSGlobal("__esri.ColorBackground")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ColorBackground = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColorBackground]
}
