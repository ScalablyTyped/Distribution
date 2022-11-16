package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorRamp")
@js.native
/**
  * A ColorRamp object is used to specify a range of colors that are applied to a group of symbols or pixels.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ColorRamp.html)
  */
open class ColorRamp ()
  extends StObject
     with typings.arcgisJsApi.esri.ColorRamp {
  def this(properties: ColorRampProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ColorRamp {
  
  @JSGlobal("__esri.ColorRamp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ColorRamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColorRamp]
}
