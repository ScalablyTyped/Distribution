package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLConfig extends StObject {
  
  /**
    * The metric to optimize.
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The list of candidate recipes.
    */
  var recipeList: js.UndefOr[ArnList] = js.undefined
}
object AutoMLConfig {
  
  inline def apply(): AutoMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLConfig] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setRecipeList(value: ArnList): Self = StObject.set(x, "recipeList", value.asInstanceOf[js.Any])
    
    inline def setRecipeListUndefined: Self = StObject.set(x, "recipeList", js.undefined)
    
    inline def setRecipeListVarargs(value: Arn*): Self = StObject.set(x, "recipeList", js.Array(value*))
  }
}
