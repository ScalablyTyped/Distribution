package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedObservations extends StObject {
  
  /**
    * The list of observations related to the problem.
    */
  var ObservationList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ObservationList] = js.undefined
}
object RelatedObservations {
  
  @scala.inline
  def apply(): RelatedObservations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedObservations]
  }
  
  @scala.inline
  implicit class RelatedObservationsMutableBuilder[Self <: RelatedObservations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObservationList(value: ObservationList): Self = StObject.set(x, "ObservationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservationListUndefined: Self = StObject.set(x, "ObservationList", js.undefined)
    
    @scala.inline
    def setObservationListVarargs(value: Observation*): Self = StObject.set(x, "ObservationList", js.Array(value :_*))
  }
}
