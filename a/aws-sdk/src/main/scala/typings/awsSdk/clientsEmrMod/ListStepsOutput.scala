package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStepsOutput extends StObject {
  
  /**
    * The maximum number of steps that a single ListSteps action returns is 50. To return a longer list of steps, use multiple ListSteps actions along with the Marker parameter, which is a pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
  
  /**
    * The filtered list of steps for the cluster.
    */
  var Steps: js.UndefOr[StepSummaryList] = js.undefined
}
object ListStepsOutput {
  
  inline def apply(): ListStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStepsOutput] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setSteps(value: StepSummaryList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: StepSummary*): Self = StObject.set(x, "Steps", js.Array(value*))
  }
}
