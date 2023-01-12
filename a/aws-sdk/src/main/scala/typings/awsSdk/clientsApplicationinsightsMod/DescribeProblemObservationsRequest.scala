package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProblemObservationsRequest extends StObject {
  
  /**
    * The ID of the problem.
    */
  var ProblemId: typings.awsSdk.clientsApplicationinsightsMod.ProblemId
}
object DescribeProblemObservationsRequest {
  
  inline def apply(ProblemId: ProblemId): DescribeProblemObservationsRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProblemObservationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProblemObservationsRequest] (val x: Self) extends AnyVal {
    
    inline def setProblemId(value: ProblemId): Self = StObject.set(x, "ProblemId", value.asInstanceOf[js.Any])
  }
}
