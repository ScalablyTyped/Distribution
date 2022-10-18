package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityPoolInput extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId
}
object DescribeIdentityPoolInput {
  
  inline def apply(IdentityPoolId: IdentityPoolId): DescribeIdentityPoolInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityPoolInput]
  }
  
  extension [Self <: DescribeIdentityPoolInput](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
