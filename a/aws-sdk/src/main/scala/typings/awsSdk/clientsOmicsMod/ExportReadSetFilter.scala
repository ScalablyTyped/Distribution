package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportReadSetFilter extends StObject {
  
  /**
    * The filter's start date.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The filter's end date.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A status to filter on.
    */
  var status: js.UndefOr[ReadSetExportJobStatus] = js.undefined
}
object ExportReadSetFilter {
  
  inline def apply(): ExportReadSetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportReadSetFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportReadSetFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setStatus(value: ReadSetExportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
