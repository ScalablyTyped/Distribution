package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCodeRepositoryInput extends StObject {
  
  /**
    * The name of the Git repository to describe.
    */
  var CodeRepositoryName: EntityName
}
object DescribeCodeRepositoryInput {
  
  inline def apply(CodeRepositoryName: EntityName): DescribeCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCodeRepositoryInput] (val x: Self) extends AnyVal {
    
    inline def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
  }
}
