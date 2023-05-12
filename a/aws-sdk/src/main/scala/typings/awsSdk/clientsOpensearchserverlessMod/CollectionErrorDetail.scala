package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionErrorDetail extends StObject {
  
  /**
    * The error code for the request. For example, NOT_FOUND.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the error. For example, The specified Collection is not found. 
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * If the request contains collection IDs, the response includes the IDs provided in the request.
    */
  var id: js.UndefOr[CollectionId] = js.undefined
  
  /**
    * If the request contains collection names, the response includes the names provided in the request.
    */
  var name: js.UndefOr[CollectionName] = js.undefined
}
object CollectionErrorDetail {
  
  inline def apply(): CollectionErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionErrorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionErrorDetail] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setId(value: CollectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: CollectionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
