package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.backgroundColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.backgroundColorBackground")
@js.native
/**
  * This type of [Background](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html) allows to set a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) as the background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html)
  */
open class backgroundColorBackground ()
  extends StObject
     with typings.arcgisJsApi.esri.backgroundColorBackground {
  def this(properties: backgroundColorBackgroundProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object backgroundColorBackground {
  
  @JSGlobal("__esri.backgroundColorBackground")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.backgroundColorBackground = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.backgroundColorBackground]
}
