package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHostedZoneResponse extends StObject {
  
  /**
    * A complex type that contains the ID, the status, and the date and time of a request to delete a hosted zone.
    */
  var ChangeInfo: typings.awsSdk.clientsRoute53Mod.ChangeInfo
}
object DeleteHostedZoneResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): DeleteHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostedZoneResponse]
  }
  
  extension [Self <: DeleteHostedZoneResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
