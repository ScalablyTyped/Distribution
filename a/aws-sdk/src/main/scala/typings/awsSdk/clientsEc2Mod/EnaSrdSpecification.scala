package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnaSrdSpecification extends StObject {
  
  /**
    * Indicates whether ENA Express is enabled for the network interface.
    */
  var EnaSrdEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures ENA Express for UDP network traffic.
    */
  var EnaSrdUdpSpecification: js.UndefOr[typings.awsSdk.clientsEc2Mod.EnaSrdUdpSpecification] = js.undefined
}
object EnaSrdSpecification {
  
  inline def apply(): EnaSrdSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnaSrdSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnaSrdSpecification] (val x: Self) extends AnyVal {
    
    inline def setEnaSrdEnabled(value: Boolean): Self = StObject.set(x, "EnaSrdEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnaSrdEnabledUndefined: Self = StObject.set(x, "EnaSrdEnabled", js.undefined)
    
    inline def setEnaSrdUdpSpecification(value: EnaSrdUdpSpecification): Self = StObject.set(x, "EnaSrdUdpSpecification", value.asInstanceOf[js.Any])
    
    inline def setEnaSrdUdpSpecificationUndefined: Self = StObject.set(x, "EnaSrdUdpSpecification", js.undefined)
  }
}
