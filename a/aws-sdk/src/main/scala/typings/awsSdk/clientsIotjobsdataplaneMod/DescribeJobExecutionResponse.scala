package typings.awsSdk.clientsIotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobExecutionResponse extends StObject {
  
  /**
    * Contains data about a job execution.
    */
  var execution: js.UndefOr[JobExecution] = js.undefined
}
object DescribeJobExecutionResponse {
  
  inline def apply(): DescribeJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setExecution(value: JobExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
  }
}
