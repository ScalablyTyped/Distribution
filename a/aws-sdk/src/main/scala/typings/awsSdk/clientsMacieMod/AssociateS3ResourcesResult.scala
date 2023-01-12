package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateS3ResourcesResult extends StObject {
  
  /**
    * (Discontinued) S3 resources that couldn't be associated with Amazon Macie Classic. An error code and an error message are provided for each failed item.
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
}
object AssociateS3ResourcesResult {
  
  inline def apply(): AssociateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateS3ResourcesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateS3ResourcesResult] (val x: Self) extends AnyVal {
    
    inline def setFailedS3Resources(value: FailedS3Resources): Self = StObject.set(x, "failedS3Resources", value.asInstanceOf[js.Any])
    
    inline def setFailedS3ResourcesUndefined: Self = StObject.set(x, "failedS3Resources", js.undefined)
    
    inline def setFailedS3ResourcesVarargs(value: FailedS3Resource*): Self = StObject.set(x, "failedS3Resources", js.Array(value*))
  }
}
