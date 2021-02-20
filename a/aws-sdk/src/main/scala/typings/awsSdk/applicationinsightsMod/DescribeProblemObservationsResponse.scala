package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProblemObservationsResponse extends StObject {
  
  /**
    * Observations related to the problem.
    */
  var RelatedObservations: js.UndefOr[typings.awsSdk.applicationinsightsMod.RelatedObservations] = js.native
}
object DescribeProblemObservationsResponse {
  
  @scala.inline
  def apply(): DescribeProblemObservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemObservationsResponse]
  }
  
  @scala.inline
  implicit class DescribeProblemObservationsResponseMutableBuilder[Self <: DescribeProblemObservationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedObservations(value: RelatedObservations): Self = StObject.set(x, "RelatedObservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedObservationsUndefined: Self = StObject.set(x, "RelatedObservations", js.undefined)
  }
}
