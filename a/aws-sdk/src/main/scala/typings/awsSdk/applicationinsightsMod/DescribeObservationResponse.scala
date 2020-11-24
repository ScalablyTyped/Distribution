package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeObservationResponse extends js.Object {
  
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
  implicit class DescribeObservationResponseOps[Self <: DescribeObservationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObservation(value: Observation): Self = this.set("Observation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservation: Self = this.set("Observation", js.undefined)
  }
}
