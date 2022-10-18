package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityInput extends StObject {
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsSdk.clientsCognitoidentityMod.IdentityId
}
object DescribeIdentityInput {
  
  inline def apply(IdentityId: IdentityId): DescribeIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityInput]
  }
  
  extension [Self <: DescribeIdentityInput](x: Self) {
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
  }
}
