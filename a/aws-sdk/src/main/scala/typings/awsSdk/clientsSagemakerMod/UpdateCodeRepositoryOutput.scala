package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCodeRepositoryOutput extends StObject {
  
  /**
    * The ARN of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.clientsSagemakerMod.CodeRepositoryArn
}
object UpdateCodeRepositoryOutput {
  
  inline def apply(CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeRepositoryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCodeRepositoryOutput] (val x: Self) extends AnyVal {
    
    inline def setCodeRepositoryArn(value: CodeRepositoryArn): Self = StObject.set(x, "CodeRepositoryArn", value.asInstanceOf[js.Any])
  }
}
