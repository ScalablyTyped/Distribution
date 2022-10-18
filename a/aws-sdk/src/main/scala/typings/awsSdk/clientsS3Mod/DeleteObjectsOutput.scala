package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectsOutput extends StObject {
  
  /**
    * Container element for a successful delete. It identifies the object that was successfully deleted.
    */
  var Deleted: js.UndefOr[DeletedObjects] = js.undefined
  
  /**
    * Container for a failed delete action that describes the object that Amazon S3 attempted to delete and the error it encountered.
    */
  var Errors: js.UndefOr[typings.awsSdk.clientsS3Mod.Errors] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
}
object DeleteObjectsOutput {
  
  inline def apply(): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
  
  extension [Self <: DeleteObjectsOutput](x: Self) {
    
    inline def setDeleted(value: DeletedObjects): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
    
    inline def setDeletedVarargs(value: DeletedObject*): Self = StObject.set(x, "Deleted", js.Array(value*))
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
