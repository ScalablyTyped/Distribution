package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessCustomPublishMetricAction extends StObject {
  
  /**
    * Defines CloudWatch dimension values to publish.
    */
  var Dimensions: js.UndefOr[StatelessCustomPublishMetricActionDimensionsList] = js.undefined
}
object StatelessCustomPublishMetricAction {
  
  inline def apply(): StatelessCustomPublishMetricAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessCustomPublishMetricAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatelessCustomPublishMetricAction] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: StatelessCustomPublishMetricActionDimensionsList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: StatelessCustomPublishMetricActionDimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
  }
}
