package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ASC
import typings.arcgisJsApi.arcgisJsApiStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatisticDefinitionStatisticParameters extends StObject {
  
  /**
  		 * Specify `ASC` (ascending) or `DESC` (descending) to control the order of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticParameters)
  		 */
  var orderBy: js.UndefOr[ASC | DESC] = js.undefined
  
  /**
  		 * Percentile value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticParameters)
  		 */
  var value: Double
}
object StatisticDefinitionStatisticParameters {
  
  inline def apply(value: Double): StatisticDefinitionStatisticParameters = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticDefinitionStatisticParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatisticDefinitionStatisticParameters] (val x: Self) extends AnyVal {
    
    inline def setOrderBy(value: ASC | DESC): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
