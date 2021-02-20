package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Termination extends StObject {
  
  /**
    * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format. Required.
    */
  var CallingRegions: js.UndefOr[CallingRegionList] = js.native
  
  /**
    * The IP addresses allowed to make calls, in CIDR format. Required.
    */
  var CidrAllowedList: js.UndefOr[StringList] = js.native
  
  /**
    * The limit on calls per second. Max value based on account service quota. Default value of 1.
    */
  var CpsLimit: js.UndefOr[typings.awsSdk.chimeMod.CpsLimit] = js.native
  
  /**
    * The default caller ID phone number.
    */
  var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  
  /**
    * When termination settings are disabled, outbound calls can not be made.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
}
object Termination {
  
  @scala.inline
  def apply(): Termination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Termination]
  }
  
  @scala.inline
  implicit class TerminationMutableBuilder[Self <: Termination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallingRegions(value: CallingRegionList): Self = StObject.set(x, "CallingRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallingRegionsUndefined: Self = StObject.set(x, "CallingRegions", js.undefined)
    
    @scala.inline
    def setCallingRegionsVarargs(value: CallingRegion*): Self = StObject.set(x, "CallingRegions", js.Array(value :_*))
    
    @scala.inline
    def setCidrAllowedList(value: StringList): Self = StObject.set(x, "CidrAllowedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAllowedListUndefined: Self = StObject.set(x, "CidrAllowedList", js.undefined)
    
    @scala.inline
    def setCidrAllowedListVarargs(value: String*): Self = StObject.set(x, "CidrAllowedList", js.Array(value :_*))
    
    @scala.inline
    def setCpsLimit(value: CpsLimit): Self = StObject.set(x, "CpsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpsLimitUndefined: Self = StObject.set(x, "CpsLimit", js.undefined)
    
    @scala.inline
    def setDefaultPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "DefaultPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPhoneNumberUndefined: Self = StObject.set(x, "DefaultPhoneNumber", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
  }
}
