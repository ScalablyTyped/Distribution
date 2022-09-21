package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementExpressionInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression evaluating to a dictionary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html#expression)
    */
  var expression: String = js.native
  
  /**
    * The return type of the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html#returnType)
    */
  var returnType: dictionary = js.native
  
  /**
    * The title used to describe the popup element returned by the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html#title)
    */
  var title: String = js.native
}
