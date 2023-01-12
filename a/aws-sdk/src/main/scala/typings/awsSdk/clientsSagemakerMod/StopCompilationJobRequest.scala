package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopCompilationJobRequest extends StObject {
  
  /**
    * The name of the model compilation job to stop.
    */
  var CompilationJobName: EntityName
}
object StopCompilationJobRequest {
  
  inline def apply(CompilationJobName: EntityName): StopCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCompilationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopCompilationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
  }
}
