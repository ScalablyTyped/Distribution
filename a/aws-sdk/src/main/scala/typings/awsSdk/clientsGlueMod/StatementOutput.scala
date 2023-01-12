package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatementOutput extends StObject {
  
  /**
    * The code execution output.
    */
  var Data: js.UndefOr[StatementOutputData] = js.undefined
  
  /**
    * The name of the error in the output.
    */
  var ErrorName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The error value of the output.
    */
  var ErrorValue: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The execution count of the output.
    */
  var ExecutionCount: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * The status of the code execution output.
    */
  var Status: js.UndefOr[StatementState] = js.undefined
  
  /**
    * The traceback of the output.
    */
  var Traceback: js.UndefOr[OrchestrationStringList] = js.undefined
}
object StatementOutput {
  
  inline def apply(): StatementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatementOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatementOutput] (val x: Self) extends AnyVal {
    
    inline def setData(value: StatementOutputData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setErrorName(value: GenericString): Self = StObject.set(x, "ErrorName", value.asInstanceOf[js.Any])
    
    inline def setErrorNameUndefined: Self = StObject.set(x, "ErrorName", js.undefined)
    
    inline def setErrorValue(value: GenericString): Self = StObject.set(x, "ErrorValue", value.asInstanceOf[js.Any])
    
    inline def setErrorValueUndefined: Self = StObject.set(x, "ErrorValue", js.undefined)
    
    inline def setExecutionCount(value: IntegerValue): Self = StObject.set(x, "ExecutionCount", value.asInstanceOf[js.Any])
    
    inline def setExecutionCountUndefined: Self = StObject.set(x, "ExecutionCount", js.undefined)
    
    inline def setStatus(value: StatementState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTraceback(value: OrchestrationStringList): Self = StObject.set(x, "Traceback", value.asInstanceOf[js.Any])
    
    inline def setTracebackUndefined: Self = StObject.set(x, "Traceback", js.undefined)
    
    inline def setTracebackVarargs(value: GenericString*): Self = StObject.set(x, "Traceback", js.Array(value*))
  }
}
