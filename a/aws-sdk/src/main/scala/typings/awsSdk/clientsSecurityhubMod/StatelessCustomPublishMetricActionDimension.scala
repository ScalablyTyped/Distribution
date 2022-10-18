package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessCustomPublishMetricActionDimension extends StObject {
  
  /**
    * The value to use for the custom metric dimension.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object StatelessCustomPublishMetricActionDimension {
  
  inline def apply(): StatelessCustomPublishMetricActionDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessCustomPublishMetricActionDimension]
  }
  
  extension [Self <: StatelessCustomPublishMetricActionDimension](x: Self) {
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
