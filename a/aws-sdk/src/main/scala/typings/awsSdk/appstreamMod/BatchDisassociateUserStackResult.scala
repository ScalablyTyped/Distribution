package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateUserStackResult extends StObject {
  
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
}
object BatchDisassociateUserStackResult {
  
  inline def apply(): BatchDisassociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateUserStackResult]
  }
  
  extension [Self <: BatchDisassociateUserStackResult](x: Self) {
    
    inline def setErrors(value: UserStackAssociationErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: UserStackAssociationError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
