package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait popupExpressionInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Popup Profile](https://developers.arcgis.com/javascript/latest/arcade/#popup).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#expression)
  		 */
  var expression: String = js.native
  
  /**
  		 * The name of the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * Indicates the return type of the Arcade expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#returnType)
  		 */
  var returnType: string_ | number = js.native
  
  /**
  		 * The title used to describe the value returned by the expression in the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#title)
  		 */
  var title: String = js.native
}
