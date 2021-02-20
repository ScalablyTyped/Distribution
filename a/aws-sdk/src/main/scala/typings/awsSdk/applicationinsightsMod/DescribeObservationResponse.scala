package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeObservationResponse extends StObject {
  
  /**
    * Information about the observation.
    */
  var Observation: js.UndefOr[typings.awsSdk.applicationinsightsMod.Observation] = js.native
}
object DescribeObservationResponse {
  
  @scala.inline
  def apply(): DescribeObservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeObservationResponse]
  }
  
  @scala.inline
  implicit class DescribeObservationResponseMutableBuilder[Self <: DescribeObservationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObservation(value: Observation): Self = StObject.set(x, "Observation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservationUndefined: Self = StObject.set(x, "Observation", js.undefined)
  }
}
