package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipMediaApplicationCallResponse extends StObject {
  
  /**
    * The actual call.
    */
  var SipMediaApplicationCall: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplicationCall] = js.native
}
object CreateSipMediaApplicationCallResponse {
  
  @scala.inline
  def apply(): CreateSipMediaApplicationCallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipMediaApplicationCallResponse]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationCallResponseMutableBuilder[Self <: CreateSipMediaApplicationCallResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationCall(value: SipMediaApplicationCall): Self = StObject.set(x, "SipMediaApplicationCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationCallUndefined: Self = StObject.set(x, "SipMediaApplicationCall", js.undefined)
  }
}
