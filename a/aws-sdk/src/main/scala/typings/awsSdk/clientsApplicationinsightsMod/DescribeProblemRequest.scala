package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProblemRequest extends StObject {
  
  /**
    * The ID of the problem.
    */
  var ProblemId: typings.awsSdk.clientsApplicationinsightsMod.ProblemId
}
object DescribeProblemRequest {
  
  inline def apply(ProblemId: ProblemId): DescribeProblemRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProblemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProblemRequest] (val x: Self) extends AnyVal {
    
    inline def setProblemId(value: ProblemId): Self = StObject.set(x, "ProblemId", value.asInstanceOf[js.Any])
  }
}
