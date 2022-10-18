package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditContext extends StObject {
  
  /**
    * The context for the audit..
    */
  var AdditionalAuditContext: js.UndefOr[AuditContextString] = js.undefined
  
  /**
    * All columns request for audit.
    */
  var AllColumnsRequested: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The requested columns for audit.
    */
  var RequestedColumns: js.UndefOr[AuditColumnNamesList] = js.undefined
}
object AuditContext {
  
  inline def apply(): AuditContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditContext]
  }
  
  extension [Self <: AuditContext](x: Self) {
    
    inline def setAdditionalAuditContext(value: AuditContextString): Self = StObject.set(x, "AdditionalAuditContext", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuditContextUndefined: Self = StObject.set(x, "AdditionalAuditContext", js.undefined)
    
    inline def setAllColumnsRequested(value: NullableBoolean): Self = StObject.set(x, "AllColumnsRequested", value.asInstanceOf[js.Any])
    
    inline def setAllColumnsRequestedUndefined: Self = StObject.set(x, "AllColumnsRequested", js.undefined)
    
    inline def setRequestedColumns(value: AuditColumnNamesList): Self = StObject.set(x, "RequestedColumns", value.asInstanceOf[js.Any])
    
    inline def setRequestedColumnsUndefined: Self = StObject.set(x, "RequestedColumns", js.undefined)
    
    inline def setRequestedColumnsVarargs(value: ColumnNameString*): Self = StObject.set(x, "RequestedColumns", js.Array(value*))
  }
}
