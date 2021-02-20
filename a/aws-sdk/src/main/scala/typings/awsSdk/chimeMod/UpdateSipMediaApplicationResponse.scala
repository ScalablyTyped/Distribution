package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSipMediaApplicationResponse extends StObject {
  
  /**
    * The updated SIP media application details.
    */
  var SipMediaApplication: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplication] = js.native
}
object UpdateSipMediaApplicationResponse {
  
  @scala.inline
  def apply(): UpdateSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSipMediaApplicationResponse]
  }
  
  @scala.inline
  implicit class UpdateSipMediaApplicationResponseMutableBuilder[Self <: UpdateSipMediaApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplication(value: SipMediaApplication): Self = StObject.set(x, "SipMediaApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationUndefined: Self = StObject.set(x, "SipMediaApplication", js.undefined)
  }
}
