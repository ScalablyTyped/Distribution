package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedZoneSummary extends StObject {
  
  /**
    * The Route 53 hosted zone ID of a private hosted zone that the specified VPC is associated with.
    */
  var HostedZoneId: ResourceId
  
  /**
    * The name of the private hosted zone, such as example.com.
    */
  var Name: DNSName
  
  /**
    * The owner of a private hosted zone that the specified VPC is associated with. The owner can be either an Amazon Web Services account or an Amazon Web Services service.
    */
  var Owner: HostedZoneOwner
}
object HostedZoneSummary {
  
  inline def apply(HostedZoneId: ResourceId, Name: DNSName, Owner: HostedZoneOwner): HostedZoneSummary = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedZoneSummary] (val x: Self) extends AnyVal {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setName(value: DNSName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: HostedZoneOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
