package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroup extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the resource group.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The error message that generates when the propagation process for the resource group fails.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the propagation process for the resource group. The states includes:  CREATING if the resource group is in the process of being created.  CREATE_COMPLETE if the resource group was created successfully.  CREATE_FAILED if the resource group failed to be created.  UPDATING if the resource group is in the process of being updated.  UPDATE_COMPLETE if the resource group updated successfully.  UPDATE_FAILED if the resource group could not update successfully.
    */
  var state: js.UndefOr[ResourceGroupState] = js.undefined
}
object ResourceGroup {
  
  inline def apply(): ResourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroup]
  }
  
  extension [Self <: ResourceGroup](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setState(value: ResourceGroupState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
