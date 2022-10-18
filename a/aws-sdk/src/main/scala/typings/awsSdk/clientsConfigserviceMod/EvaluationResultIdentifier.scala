package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResultIdentifier extends StObject {
  
  /**
    * Identifies an Config rule used to evaluate an Amazon Web Services resource, and provides the type and ID of the evaluated resource.
    */
  var EvaluationResultQualifier: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationResultQualifier] = js.undefined
  
  /**
    * The time of the event that triggered the evaluation of your Amazon Web Services resources. The time can indicate when Config delivered a configuration item change notification, or it can indicate when Config delivered the configuration snapshot, depending on which event triggered the evaluation.
    */
  var OrderingTimestamp: js.UndefOr[js.Date] = js.undefined
}
object EvaluationResultIdentifier {
  
  inline def apply(): EvaluationResultIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultIdentifier]
  }
  
  extension [Self <: EvaluationResultIdentifier](x: Self) {
    
    inline def setEvaluationResultQualifier(value: EvaluationResultQualifier): Self = StObject.set(x, "EvaluationResultQualifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultQualifierUndefined: Self = StObject.set(x, "EvaluationResultQualifier", js.undefined)
    
    inline def setOrderingTimestamp(value: js.Date): Self = StObject.set(x, "OrderingTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOrderingTimestampUndefined: Self = StObject.set(x, "OrderingTimestamp", js.undefined)
  }
}
