package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCidrCollectionRequest extends StObject {
  
  /**
    * A client-specific token that allows requests to be securely retried so that the intended outcome will only occur once, retries receive a similar response, and there are no additional edge cases to handle.
    */
  var CallerReference: CidrNonce
  
  /**
    * A unique identifier for the account that can be used to reference the collection from other API calls.
    */
  var Name: CollectionName
}
object CreateCidrCollectionRequest {
  
  inline def apply(CallerReference: CidrNonce, Name: CollectionName): CreateCidrCollectionRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCidrCollectionRequest]
  }
  
  extension [Self <: CreateCidrCollectionRequest](x: Self) {
    
    inline def setCallerReference(value: CidrNonce): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setName(value: CollectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
