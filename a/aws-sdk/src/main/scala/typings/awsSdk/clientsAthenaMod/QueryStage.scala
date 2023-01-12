package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStage extends StObject {
  
  /**
    * Time taken to execute this stage.
    */
  var ExecutionTime: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of bytes input into the stage for execution.
    */
  var InputBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of rows input into the stage for execution.
    */
  var InputRows: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of bytes output from the stage after execution.
    */
  var OutputBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of rows output from the stage after execution.
    */
  var OutputRows: js.UndefOr[Long] = js.undefined
  
  /**
    * Stage plan information such as name, identifier, sub plans, and source stages.
    */
  var QueryStagePlan: js.UndefOr[QueryStagePlanNode] = js.undefined
  
  /**
    * The identifier for a stage.
    */
  var StageId: js.UndefOr[Long] = js.undefined
  
  /**
    * State of the stage after query execution.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * List of sub query stages that form this stage execution plan.
    */
  var SubStages: js.UndefOr[QueryStages] = js.undefined
}
object QueryStage {
  
  inline def apply(): QueryStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryStage] (val x: Self) extends AnyVal {
    
    inline def setExecutionTime(value: Long): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    inline def setInputBytes(value: Long): Self = StObject.set(x, "InputBytes", value.asInstanceOf[js.Any])
    
    inline def setInputBytesUndefined: Self = StObject.set(x, "InputBytes", js.undefined)
    
    inline def setInputRows(value: Long): Self = StObject.set(x, "InputRows", value.asInstanceOf[js.Any])
    
    inline def setInputRowsUndefined: Self = StObject.set(x, "InputRows", js.undefined)
    
    inline def setOutputBytes(value: Long): Self = StObject.set(x, "OutputBytes", value.asInstanceOf[js.Any])
    
    inline def setOutputBytesUndefined: Self = StObject.set(x, "OutputBytes", js.undefined)
    
    inline def setOutputRows(value: Long): Self = StObject.set(x, "OutputRows", value.asInstanceOf[js.Any])
    
    inline def setOutputRowsUndefined: Self = StObject.set(x, "OutputRows", js.undefined)
    
    inline def setQueryStagePlan(value: QueryStagePlanNode): Self = StObject.set(x, "QueryStagePlan", value.asInstanceOf[js.Any])
    
    inline def setQueryStagePlanUndefined: Self = StObject.set(x, "QueryStagePlan", js.undefined)
    
    inline def setStageId(value: Long): Self = StObject.set(x, "StageId", value.asInstanceOf[js.Any])
    
    inline def setStageIdUndefined: Self = StObject.set(x, "StageId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubStages(value: QueryStages): Self = StObject.set(x, "SubStages", value.asInstanceOf[js.Any])
    
    inline def setSubStagesUndefined: Self = StObject.set(x, "SubStages", js.undefined)
    
    inline def setSubStagesVarargs(value: QueryStage*): Self = StObject.set(x, "SubStages", js.Array(value*))
  }
}
