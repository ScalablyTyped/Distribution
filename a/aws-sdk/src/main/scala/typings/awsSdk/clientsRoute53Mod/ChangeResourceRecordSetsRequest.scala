package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeResourceRecordSetsRequest extends StObject {
  
  /**
    * A complex type that contains an optional comment and the Changes element.
    */
  var ChangeBatch: typings.awsSdk.clientsRoute53Mod.ChangeBatch
  
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to change.
    */
  var HostedZoneId: ResourceId
}
object ChangeResourceRecordSetsRequest {
  
  inline def apply(ChangeBatch: ChangeBatch, HostedZoneId: ResourceId): ChangeResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeResourceRecordSetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeResourceRecordSetsRequest] (val x: Self) extends AnyVal {
    
    inline def setChangeBatch(value: ChangeBatch): Self = StObject.set(x, "ChangeBatch", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
  }
}
