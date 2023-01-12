package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedZoneCountResponse extends StObject {
  
  /**
    * The total number of public and private hosted zones that are associated with the current Amazon Web Services account.
    */
  var HostedZoneCount: typings.awsSdk.clientsRoute53Mod.HostedZoneCount
}
object GetHostedZoneCountResponse {
  
  inline def apply(HostedZoneCount: HostedZoneCount): GetHostedZoneCountResponse = {
    val __obj = js.Dynamic.literal(HostedZoneCount = HostedZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneCountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHostedZoneCountResponse] (val x: Self) extends AnyVal {
    
    inline def setHostedZoneCount(value: HostedZoneCount): Self = StObject.set(x, "HostedZoneCount", value.asInstanceOf[js.Any])
  }
}
