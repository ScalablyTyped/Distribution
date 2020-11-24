package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedObservations extends js.Object {
  
  /**
    * The list of observations related to the problem.
    */
  var ObservationList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ObservationList] = js.native
}
object RelatedObservations {
  
  @scala.inline
  def apply(): RelatedObservations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedObservations]
  }
  
  @scala.inline
  implicit class RelatedObservationsOps[Self <: RelatedObservations] (val x: Self) extends AnyVal {
    
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
    def setObservationListVarargs(value: Observation*): Self = this.set("ObservationList", js.Array(value :_*))
    
    @scala.inline
    def setObservationList(value: ObservationList): Self = this.set("ObservationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservationList: Self = this.set("ObservationList", js.undefined)
  }
}
