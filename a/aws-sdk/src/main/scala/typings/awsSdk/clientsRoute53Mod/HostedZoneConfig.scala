package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedZoneConfig extends StObject {
  
  /**
    * Any comments that you want to include about the hosted zone.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * A value that indicates whether this is a private hosted zone.
    */
  var PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined
}
object HostedZoneConfig {
  
  inline def apply(): HostedZoneConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedZoneConfig]
  }
  
  extension [Self <: HostedZoneConfig](x: Self) {
    
    inline def setComment(value: ResourceDescription): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setPrivateZone(value: IsPrivateZone): Self = StObject.set(x, "PrivateZone", value.asInstanceOf[js.Any])
    
    inline def setPrivateZoneUndefined: Self = StObject.set(x, "PrivateZone", js.undefined)
  }
}
