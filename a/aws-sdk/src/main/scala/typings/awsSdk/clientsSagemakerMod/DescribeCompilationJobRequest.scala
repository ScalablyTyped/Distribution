package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCompilationJobRequest extends StObject {
  
  /**
    * The name of the model compilation job that you want information about.
    */
  var CompilationJobName: EntityName
}
object DescribeCompilationJobRequest {
  
  inline def apply(CompilationJobName: EntityName): DescribeCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCompilationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCompilationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
  }
}
