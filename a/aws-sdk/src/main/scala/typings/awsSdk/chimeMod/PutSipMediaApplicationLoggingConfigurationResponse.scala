package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSipMediaApplicationLoggingConfigurationResponse extends StObject {
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplicationLoggingConfiguration] = js.native
}
object PutSipMediaApplicationLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): PutSipMediaApplicationLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutSipMediaApplicationLoggingConfigurationResponseMutableBuilder[Self <: PutSipMediaApplicationLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
