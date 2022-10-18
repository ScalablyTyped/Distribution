package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateUserStackResult extends StObject {
  
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
}
object BatchAssociateUserStackResult {
  
  inline def apply(): BatchAssociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateUserStackResult]
  }
  
  extension [Self <: BatchAssociateUserStackResult](x: Self) {
    
    inline def setErrors(value: UserStackAssociationErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: UserStackAssociationError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
