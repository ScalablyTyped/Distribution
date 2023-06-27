package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopFilterProperties extends StObject {
  
  /**
  		 * When one or more field names are provided in this property, the output result will be grouped based on unique values from those fields.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#groupByFields)
  		 */
  var groupByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * One or more field names used to order the query results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#orderByFields)
  		 */
  var orderByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Defines the number of features to be returned from the top features query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#topCount)
  		 */
  var topCount: js.UndefOr[Double] = js.undefined
}
object TopFilterProperties {
  
  inline def apply(): TopFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopFilterProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopFilterProperties] (val x: Self) extends AnyVal {
    
    inline def setGroupByFields(value: js.Array[String]): Self = StObject.set(x, "groupByFields", value.asInstanceOf[js.Any])
    
    inline def setGroupByFieldsUndefined: Self = StObject.set(x, "groupByFields", js.undefined)
    
    inline def setGroupByFieldsVarargs(value: String*): Self = StObject.set(x, "groupByFields", js.Array(value*))
    
    inline def setOrderByFields(value: js.Array[String]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    inline def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    inline def setOrderByFieldsVarargs(value: String*): Self = StObject.set(x, "orderByFields", js.Array(value*))
    
    inline def setTopCount(value: Double): Self = StObject.set(x, "topCount", value.asInstanceOf[js.Any])
    
    inline def setTopCountUndefined: Self = StObject.set(x, "topCount", js.undefined)
  }
}
