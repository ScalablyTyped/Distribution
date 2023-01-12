package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssociationBatchResult extends StObject {
  
  /**
    * Information about the associations that failed.
    */
  var Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined
  
  /**
    * Information about the associations that succeeded.
    */
  var Successful: js.UndefOr[AssociationDescriptionList] = js.undefined
}
object CreateAssociationBatchResult {
  
  inline def apply(): CreateAssociationBatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssociationBatchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssociationBatchResult] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: FailedCreateAssociationList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setFailedVarargs(value: FailedCreateAssociation*): Self = StObject.set(x, "Failed", js.Array(value*))
    
    inline def setSuccessful(value: AssociationDescriptionList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: AssociationDescription*): Self = StObject.set(x, "Successful", js.Array(value*))
  }
}
