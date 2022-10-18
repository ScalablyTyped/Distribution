package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobFlowsInput extends StObject {
  
  /**
    * Return only job flows created after this date and time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return only job flows created before this date and time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return only job flows whose job flow ID is contained in this list.
    */
  var JobFlowIds: js.UndefOr[XmlStringList] = js.undefined
  
  /**
    * Return only job flows whose state is contained in this list.
    */
  var JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.undefined
}
object DescribeJobFlowsInput {
  
  inline def apply(): DescribeJobFlowsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobFlowsInput]
  }
  
  extension [Self <: DescribeJobFlowsInput](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setJobFlowIds(value: XmlStringList): Self = StObject.set(x, "JobFlowIds", value.asInstanceOf[js.Any])
    
    inline def setJobFlowIdsUndefined: Self = StObject.set(x, "JobFlowIds", js.undefined)
    
    inline def setJobFlowIdsVarargs(value: XmlString*): Self = StObject.set(x, "JobFlowIds", js.Array(value*))
    
    inline def setJobFlowStates(value: JobFlowExecutionStateList): Self = StObject.set(x, "JobFlowStates", value.asInstanceOf[js.Any])
    
    inline def setJobFlowStatesUndefined: Self = StObject.set(x, "JobFlowStates", js.undefined)
    
    inline def setJobFlowStatesVarargs(value: JobFlowExecutionState*): Self = StObject.set(x, "JobFlowStates", js.Array(value*))
  }
}
