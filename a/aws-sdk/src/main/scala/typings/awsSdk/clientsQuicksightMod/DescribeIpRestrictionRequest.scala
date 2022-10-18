package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpRestrictionRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the IP rules.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object DescribeIpRestrictionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DescribeIpRestrictionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIpRestrictionRequest]
  }
  
  extension [Self <: DescribeIpRestrictionRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
