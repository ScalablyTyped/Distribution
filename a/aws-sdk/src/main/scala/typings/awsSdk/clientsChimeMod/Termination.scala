package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Termination extends StObject {
  
  /**
    * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format. Required.
    */
  var CallingRegions: js.UndefOr[CallingRegionList] = js.undefined
  
  /**
    * The IP addresses allowed to make calls, in CIDR format. Required.
    */
  var CidrAllowedList: js.UndefOr[StringList] = js.undefined
  
  /**
    * The limit on calls per second. Max value based on account service quota. Default value of 1.
    */
  var CpsLimit: js.UndefOr[typings.awsSdk.clientsChimeMod.CpsLimit] = js.undefined
  
  /**
    * The default caller ID phone number.
    */
  var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  
  /**
    * When termination settings are disabled, outbound calls can not be made.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
}
object Termination {
  
  inline def apply(): Termination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Termination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Termination] (val x: Self) extends AnyVal {
    
    inline def setCallingRegions(value: CallingRegionList): Self = StObject.set(x, "CallingRegions", value.asInstanceOf[js.Any])
    
    inline def setCallingRegionsUndefined: Self = StObject.set(x, "CallingRegions", js.undefined)
    
    inline def setCallingRegionsVarargs(value: CallingRegion*): Self = StObject.set(x, "CallingRegions", js.Array(value*))
    
    inline def setCidrAllowedList(value: StringList): Self = StObject.set(x, "CidrAllowedList", value.asInstanceOf[js.Any])
    
    inline def setCidrAllowedListUndefined: Self = StObject.set(x, "CidrAllowedList", js.undefined)
    
    inline def setCidrAllowedListVarargs(value: String*): Self = StObject.set(x, "CidrAllowedList", js.Array(value*))
    
    inline def setCpsLimit(value: CpsLimit): Self = StObject.set(x, "CpsLimit", value.asInstanceOf[js.Any])
    
    inline def setCpsLimitUndefined: Self = StObject.set(x, "CpsLimit", js.undefined)
    
    inline def setDefaultPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "DefaultPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setDefaultPhoneNumberUndefined: Self = StObject.set(x, "DefaultPhoneNumber", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
  }
}
