package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSummary extends StObject {
  
  /**
    * The time at which the specific model was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the dataset used to create the model. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetArn] = js.undefined
  
  /**
    * The name of the dataset being used for the ML model. 
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetName] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the ML model. 
    */
  var ModelArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ModelArn] = js.undefined
  
  /**
    * The name of the ML model. 
    */
  var ModelName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ModelName] = js.undefined
  
  /**
    * Indicates the status of the ML model. 
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
}
object ModelSummary {
  
  inline def apply(): ModelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSummary]
  }
  
  extension [Self <: ModelSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
