package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisionedProductPropertiesOutput extends StObject {
  
  /**
    * The provisioned product identifier.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * A map that contains the properties updated.
    */
  var ProvisionedProductProperties: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisionedProductProperties] = js.undefined
  
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[RecordStatus] = js.undefined
}
object UpdateProvisionedProductPropertiesOutput {
  
  inline def apply(): UpdateProvisionedProductPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesOutput]
  }
  
  extension [Self <: UpdateProvisionedProductPropertiesOutput](x: Self) {
    
    inline def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    inline def setProvisionedProductProperties(value: ProvisionedProductProperties): Self = StObject.set(x, "ProvisionedProductProperties", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductPropertiesUndefined: Self = StObject.set(x, "ProvisionedProductProperties", js.undefined)
    
    inline def setRecordId(value: Id): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    inline def setRecordIdUndefined: Self = StObject.set(x, "RecordId", js.undefined)
    
    inline def setStatus(value: RecordStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
