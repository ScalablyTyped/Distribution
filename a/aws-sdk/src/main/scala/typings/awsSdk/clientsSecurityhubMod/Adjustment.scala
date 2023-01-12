package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjustment extends StObject {
  
  /**
    * The metric to adjust.
    */
  var Metric: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The reason for the adjustment.
    */
  var Reason: js.UndefOr[NonEmptyString] = js.undefined
}
object Adjustment {
  
  inline def apply(): Adjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adjustment] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: NonEmptyString): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
