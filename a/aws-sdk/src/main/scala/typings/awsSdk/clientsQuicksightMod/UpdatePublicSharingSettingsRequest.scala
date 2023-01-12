package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePublicSharingSettingsRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with your Amazon QuickSight subscription.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account.
    */
  var PublicSharingEnabled: js.UndefOr[Boolean] = js.undefined
}
object UpdatePublicSharingSettingsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): UpdatePublicSharingSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicSharingSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePublicSharingSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPublicSharingEnabled(value: Boolean): Self = StObject.set(x, "PublicSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPublicSharingEnabledUndefined: Self = StObject.set(x, "PublicSharingEnabled", js.undefined)
  }
}
