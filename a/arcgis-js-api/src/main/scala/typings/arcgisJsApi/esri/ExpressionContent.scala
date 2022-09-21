package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.expression
import typings.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionContent
  extends StObject
     with Content_
     with Content
     with contentContent {
  
  /**
    * Contains the Arcade expression used to create a popup content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html#expressionInfo)
    */
  var expressionInfo: ElementExpressionInfo = js.native
  
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html#type)
    */
  @JSName("type")
  val type_ExpressionContent: expression = js.native
}
