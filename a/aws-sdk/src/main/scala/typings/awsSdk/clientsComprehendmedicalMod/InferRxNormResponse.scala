package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferRxNormResponse extends StObject {
  
  /**
    * The medication entities detected in the text linked to RxNorm concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: RxNormEntityList
  
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If the result of the previous request to InferRxNorm was truncated, include the PaginationToken to fetch the next page of medication entities.
    */
  var PaginationToken: js.UndefOr[String] = js.undefined
}
object InferRxNormResponse {
  
  inline def apply(Entities: RxNormEntityList): InferRxNormResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferRxNormResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferRxNormResponse] (val x: Self) extends AnyVal {
    
    inline def setEntities(value: RxNormEntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: RxNormEntity*): Self = StObject.set(x, "Entities", js.Array(value*))
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
