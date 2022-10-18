package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProblemObservationsResponse extends StObject {
  
  /**
    * Observations related to the problem.
    */
  var RelatedObservations: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.RelatedObservations] = js.undefined
}
object DescribeProblemObservationsResponse {
  
  inline def apply(): DescribeProblemObservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemObservationsResponse]
  }
  
  extension [Self <: DescribeProblemObservationsResponse](x: Self) {
    
    inline def setRelatedObservations(value: RelatedObservations): Self = StObject.set(x, "RelatedObservations", value.asInstanceOf[js.Any])
    
    inline def setRelatedObservationsUndefined: Self = StObject.set(x, "RelatedObservations", js.undefined)
  }
}
