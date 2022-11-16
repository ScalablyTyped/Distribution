package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.popupExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.popupExpressionInfo")
@js.native
/**
  * The `ExpressionInfo` class references [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions following the specification defined by the [Arcade Popup Profile](https://developers.arcgis.com/javascript/latest/arcade/#popup).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html)
  */
open class popupExpressionInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.popupExpressionInfo {
  def this(properties: popupExpressionInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object popupExpressionInfo {
  
  @JSGlobal("__esri.popupExpressionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.popupExpressionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.popupExpressionInfo]
}
