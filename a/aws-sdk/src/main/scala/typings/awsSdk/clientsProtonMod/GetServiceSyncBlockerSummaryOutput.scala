package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSyncBlockerSummaryOutput extends StObject {
  
  /**
    * The detailed data of the requested service sync blocker summary.
    */
  var serviceSyncBlockerSummary: js.UndefOr[ServiceSyncBlockerSummary] = js.undefined
}
object GetServiceSyncBlockerSummaryOutput {
  
  inline def apply(): GetServiceSyncBlockerSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSyncBlockerSummaryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSyncBlockerSummaryOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceSyncBlockerSummary(value: ServiceSyncBlockerSummary): Self = StObject.set(x, "serviceSyncBlockerSummary", value.asInstanceOf[js.Any])
    
    inline def setServiceSyncBlockerSummaryUndefined: Self = StObject.set(x, "serviceSyncBlockerSummary", js.undefined)
  }
}
