package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentEnaSrdUdpSpecification extends StObject {
  
  /**
    * Indicates whether UDP traffic to and from the instance uses ENA Express. To specify this setting, you must first enable ENA Express.
    */
  var EnaSrdUdpEnabled: js.UndefOr[Boolean] = js.undefined
}
object AttachmentEnaSrdUdpSpecification {
  
  inline def apply(): AttachmentEnaSrdUdpSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentEnaSrdUdpSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentEnaSrdUdpSpecification] (val x: Self) extends AnyVal {
    
    inline def setEnaSrdUdpEnabled(value: Boolean): Self = StObject.set(x, "EnaSrdUdpEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnaSrdUdpEnabledUndefined: Self = StObject.set(x, "EnaSrdUdpEnabled", js.undefined)
  }
}
