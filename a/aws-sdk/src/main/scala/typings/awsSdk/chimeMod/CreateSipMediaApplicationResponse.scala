package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipMediaApplicationResponse extends StObject {
  
  /**
    * The Sip media application details.
    */
  var SipMediaApplication: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplication] = js.native
}
object CreateSipMediaApplicationResponse {
  
  @scala.inline
  def apply(): CreateSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipMediaApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationResponseMutableBuilder[Self <: CreateSipMediaApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplication(value: SipMediaApplication): Self = StObject.set(x, "SipMediaApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationUndefined: Self = StObject.set(x, "SipMediaApplication", js.undefined)
  }
}
