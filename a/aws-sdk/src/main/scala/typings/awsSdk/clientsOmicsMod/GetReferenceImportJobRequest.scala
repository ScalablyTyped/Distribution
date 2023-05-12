package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReferenceImportJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var id: ImportJobId
  
  /**
    * The job's reference store ID.
    */
  var referenceStoreId: ReferenceStoreId
}
object GetReferenceImportJobRequest {
  
  inline def apply(id: ImportJobId, referenceStoreId: ReferenceStoreId): GetReferenceImportJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referenceStoreId = referenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReferenceImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ImportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
  }
}
