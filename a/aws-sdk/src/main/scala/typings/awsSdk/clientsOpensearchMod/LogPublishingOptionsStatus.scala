package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPublishingOptionsStatus extends StObject {
  
  /**
    * The log publishing options configured for the domain.
    */
  var Options: js.UndefOr[LogPublishingOptions] = js.undefined
  
  /**
    * The status of the log publishing options for the domain.
    */
  var Status: js.UndefOr[OptionStatus] = js.undefined
}
object LogPublishingOptionsStatus {
  
  inline def apply(): LogPublishingOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOptionsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogPublishingOptionsStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: LogPublishingOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
