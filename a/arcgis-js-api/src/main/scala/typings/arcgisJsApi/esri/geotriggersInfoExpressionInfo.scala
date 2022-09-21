package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geotriggersInfoExpressionInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Optional expression in the [Arcade expression](https://developers.arcgis.com/arcade/) language.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html#expression)
    */
  var expression: String = js.native
  
  /**
    * Optional return type of the Arcade expression.
    *
    * @default string
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html#returnType)
    */
  var returnType: number | string_ = js.native
  
  /**
    * Optional title of the expression.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html#title)
    */
  var title: String = js.native
}
