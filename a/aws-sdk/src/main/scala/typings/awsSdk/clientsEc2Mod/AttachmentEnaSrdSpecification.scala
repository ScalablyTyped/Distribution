package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentEnaSrdSpecification extends StObject {
  
  /**
    * Indicates whether ENA Express is enabled for the network interface that's attached to the instance.
    */
  var EnaSrdEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ENA Express configuration for UDP network traffic.
    */
  var EnaSrdUdpSpecification: js.UndefOr[AttachmentEnaSrdUdpSpecification] = js.undefined
}
object AttachmentEnaSrdSpecification {
  
  inline def apply(): AttachmentEnaSrdSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentEnaSrdSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentEnaSrdSpecification] (val x: Self) extends AnyVal {
    
    inline def setEnaSrdEnabled(value: Boolean): Self = StObject.set(x, "EnaSrdEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnaSrdEnabledUndefined: Self = StObject.set(x, "EnaSrdEnabled", js.undefined)
    
    inline def setEnaSrdUdpSpecification(value: AttachmentEnaSrdUdpSpecification): Self = StObject.set(x, "EnaSrdUdpSpecification", value.asInstanceOf[js.Any])
    
    inline def setEnaSrdUdpSpecificationUndefined: Self = StObject.set(x, "EnaSrdUdpSpecification", js.undefined)
  }
}
