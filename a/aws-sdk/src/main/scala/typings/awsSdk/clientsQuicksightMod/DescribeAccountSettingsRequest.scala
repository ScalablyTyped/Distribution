package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountSettingsRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the settings that you want to list.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object DescribeAccountSettingsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DescribeAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccountSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
