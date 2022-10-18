package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPublishingOptionsStatus extends StObject {
  
  /**
    * The log publishing options configured for the Elasticsearch domain.
    */
  var Options: js.UndefOr[LogPublishingOptions] = js.undefined
  
  /**
    * The status of the log publishing options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: js.UndefOr[OptionStatus] = js.undefined
}
object LogPublishingOptionsStatus {
  
  inline def apply(): LogPublishingOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOptionsStatus]
  }
  
  extension [Self <: LogPublishingOptionsStatus](x: Self) {
    
    inline def setOptions(value: LogPublishingOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
