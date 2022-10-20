package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessorSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[ArnString] = js.undefined
  
  /**
    * The creation date and time of the accessor.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the accessor.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The current status of the accessor.
    */
  var Status: js.UndefOr[AccessorStatus] = js.undefined
  
  /**
    * The type of the accessor.  Currently accessor type is restricted to BILLING_TOKEN. 
    */
  var Type: js.UndefOr[AccessorType] = js.undefined
}
object AccessorSummary {
  
  inline def apply(): AccessorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessorSummary]
  }
  
  extension [Self <: AccessorSummary](x: Self) {
    
    inline def setArn(value: ArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStatus(value: AccessorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: AccessorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
