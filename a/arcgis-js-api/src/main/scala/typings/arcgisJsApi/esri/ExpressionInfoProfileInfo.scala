package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`feature-reduction-popup-element`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-reduction-popup`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-reduction`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-z`
import typings.arcgisJsApi.arcgisJsApiStrings.`field-calculation`
import typings.arcgisJsApi.arcgisJsApiStrings.`form-calculation`
import typings.arcgisJsApi.arcgisJsApiStrings.`form-constraint`
import typings.arcgisJsApi.arcgisJsApiStrings.`popup-element`
import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import typings.arcgisJsApi.arcgisJsApiStrings.labeling
import typings.arcgisJsApi.arcgisJsApiStrings.layer
import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.popup
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import typings.arcgisJsApi.arcgisJsApiStrings.visualization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionInfoProfileInfo extends StObject {
  
  /**
  		 * Describes the context (i.e.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
  		 */
  var context: ProfileContext
  
  /**
  		 * Indicates which [profile](https://developers.arcgis.com/arcade/profiles/) is used to execute the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
  		 */
  var name: `form-constraint` | `feature-z` | `field-calculation` | `form-calculation` | labeling | popup | `popup-element` | `feature-reduction-popup` | `feature-reduction-popup-element` | visualization
  
  /**
  		 * The return type of the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
  		 */
  var returnType: js.UndefOr[boolean | date | number | string_ | dictionary] = js.undefined
  
  /**
  		 * Indicates the data source used to hydrate the expression's profile variables.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
  		 */
  var source: layer | `feature-reduction`
}
object ExpressionInfoProfileInfo {
  
  inline def apply(
    context: ProfileContext,
    name: `form-constraint` | `feature-z` | `field-calculation` | `form-calculation` | labeling | popup | `popup-element` | `feature-reduction-popup` | `feature-reduction-popup-element` | visualization,
    source: layer | `feature-reduction`
  ): ExpressionInfoProfileInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionInfoProfileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressionInfoProfileInfo] (val x: Self) extends AnyVal {
    
    inline def setContext(value: ProfileContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setName(
      value: `form-constraint` | `feature-z` | `field-calculation` | `form-calculation` | labeling | popup | `popup-element` | `feature-reduction-popup` | `feature-reduction-popup-element` | visualization
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: boolean | date | number | string_ | dictionary): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setSource(value: layer | `feature-reduction`): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
