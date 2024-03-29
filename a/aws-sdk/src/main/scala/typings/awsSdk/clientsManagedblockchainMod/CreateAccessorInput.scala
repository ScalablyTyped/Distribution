package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessorInput extends StObject {
  
  /**
    * The type of accessor.  Currently, accessor type is restricted to BILLING_TOKEN. 
    */
  var AccessorType: typings.awsSdk.clientsManagedblockchainMod.AccessorType
  
  /**
    * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than once. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon Web Services CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  
  /**
    * Tags to assign to the Accessor.  Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single request with an overall maximum of 50 tags allowed per resource. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  var Tags: js.UndefOr[InputTagMap] = js.undefined
}
object CreateAccessorInput {
  
  inline def apply(AccessorType: AccessorType, ClientRequestToken: ClientRequestTokenString): CreateAccessorInput = {
    val __obj = js.Dynamic.literal(AccessorType = AccessorType.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessorInput] (val x: Self) extends AnyVal {
    
    inline def setAccessorType(value: AccessorType): Self = StObject.set(x, "AccessorType", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
