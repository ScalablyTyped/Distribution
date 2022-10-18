package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRoutingProfileResponse extends StObject {
  
  /**
    * The routing profile.
    */
  var RoutingProfile: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfile] = js.undefined
}
object DescribeRoutingProfileResponse {
  
  inline def apply(): DescribeRoutingProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRoutingProfileResponse]
  }
  
  extension [Self <: DescribeRoutingProfileResponse](x: Self) {
    
    inline def setRoutingProfile(value: RoutingProfile): Self = StObject.set(x, "RoutingProfile", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileUndefined: Self = StObject.set(x, "RoutingProfile", js.undefined)
  }
}
