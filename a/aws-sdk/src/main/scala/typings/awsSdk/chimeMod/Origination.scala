package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origination extends StObject {
  
  /**
    * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of 20.
    */
  var Routes: js.UndefOr[OriginationRouteList] = js.undefined
}
object Origination {
  
  @scala.inline
  def apply(): Origination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origination]
  }
  
  @scala.inline
  implicit class OriginationMutableBuilder[Self <: Origination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setRoutes(value: OriginationRouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: OriginationRoute*): Self = StObject.set(x, "Routes", js.Array(value :_*))
  }
}
