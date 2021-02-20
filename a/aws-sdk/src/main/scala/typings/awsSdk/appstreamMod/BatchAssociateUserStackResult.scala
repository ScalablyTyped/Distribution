package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateUserStackResult extends StObject {
  
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.native
}
object BatchAssociateUserStackResult {
  
  @scala.inline
  def apply(): BatchAssociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateUserStackResult]
  }
  
  @scala.inline
  implicit class BatchAssociateUserStackResultMutableBuilder[Self <: BatchAssociateUserStackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: UserStackAssociationErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: UserStackAssociationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
