package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortProbeAction extends StObject {
  
  /**
    * Indicates whether the port probe was blocked.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the ports affected by the port probe.
    */
  var PortProbeDetails: js.UndefOr[PortProbeDetailList] = js.undefined
}
object PortProbeAction {
  
  inline def apply(): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortProbeAction] (val x: Self) extends AnyVal {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    inline def setPortProbeDetails(value: PortProbeDetailList): Self = StObject.set(x, "PortProbeDetails", value.asInstanceOf[js.Any])
    
    inline def setPortProbeDetailsUndefined: Self = StObject.set(x, "PortProbeDetails", js.undefined)
    
    inline def setPortProbeDetailsVarargs(value: PortProbeDetail*): Self = StObject.set(x, "PortProbeDetails", js.Array(value*))
  }
}
