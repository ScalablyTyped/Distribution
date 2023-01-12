package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchEventsExecutionDataDetails extends StObject {
  
  /**
    * Indicates whether input or output was included in the response. Always true for API calls. 
    */
  var included: js.UndefOr[includedDetails] = js.undefined
}
object CloudWatchEventsExecutionDataDetails {
  
  inline def apply(): CloudWatchEventsExecutionDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchEventsExecutionDataDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchEventsExecutionDataDetails] (val x: Self) extends AnyVal {
    
    inline def setIncluded(value: includedDetails): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
  }
}
