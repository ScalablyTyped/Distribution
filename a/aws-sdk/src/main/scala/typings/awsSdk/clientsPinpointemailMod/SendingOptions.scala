package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendingOptions extends StObject {
  
  /**
    * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}
object SendingOptions {
  
  inline def apply(): SendingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendingOptions] (val x: Self) extends AnyVal {
    
    inline def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
