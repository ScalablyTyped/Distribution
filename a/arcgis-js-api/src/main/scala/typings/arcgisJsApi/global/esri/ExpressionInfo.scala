package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ExpressionInfo")
@js.native
/**
  * The `ExpressionInfo` class defines the makeup of [visibility expressions](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#visibilityExpression), [required expressions](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#requiredExpression), [editable expressions](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editableExpression), and [value expressions](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#valueExpression).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html)
  */
open class ExpressionInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.ExpressionInfo {
  def this(properties: ExpressionInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ExpressionInfo {
  
  @JSGlobal("__esri.ExpressionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ExpressionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ExpressionInfo]
}
