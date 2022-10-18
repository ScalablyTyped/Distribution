package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVaultsInput extends StObject {
  
  /**
    * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String
  
  /**
    * The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might be fewer than the specified limit, but the number of returned vaults never exceeds the limit.
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /**
    * A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should begin.
    */
  var marker: js.UndefOr[String] = js.undefined
}
object ListVaultsInput {
  
  inline def apply(accountId: String): ListVaultsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVaultsInput]
  }
  
  extension [Self <: ListVaultsInput](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
  }
}
