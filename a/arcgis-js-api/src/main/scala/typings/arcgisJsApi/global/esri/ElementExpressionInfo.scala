package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ElementExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ElementExpressionInfo")
@js.native
/**
  * Defines an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression used to create an [ExpressionContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html) element in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html)
  */
open class ElementExpressionInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.ElementExpressionInfo {
  def this(properties: ElementExpressionInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ElementExpressionInfo {
  
  @JSGlobal("__esri.ElementExpressionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ElementExpressionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ElementExpressionInfo]
}
