package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlMetadata extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the control. 
    */
  var arn: js.UndefOr[AuditManagerArn] = js.undefined
  
  /**
    *  The data source that determines where Audit Manager collects evidence from for the control. 
    */
  var controlSources: js.UndefOr[ControlSources] = js.undefined
  
  /**
    *  Specifies when the control was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier for the control. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  Specifies when the control was most recently updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The name of the control. 
    */
  var name: js.UndefOr[ControlName] = js.undefined
}
object ControlMetadata {
  
  inline def apply(): ControlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlMetadata]
  }
  
  extension [Self <: ControlMetadata](x: Self) {
    
    inline def setArn(value: AuditManagerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setControlSources(value: ControlSources): Self = StObject.set(x, "controlSources", value.asInstanceOf[js.Any])
    
    inline def setControlSourcesUndefined: Self = StObject.set(x, "controlSources", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: ControlName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
