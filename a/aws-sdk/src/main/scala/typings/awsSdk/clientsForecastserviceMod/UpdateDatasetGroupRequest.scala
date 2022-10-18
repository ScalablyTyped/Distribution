package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetGroupRequest extends StObject {
  
  /**
    * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
    */
  var DatasetArns: ArnList
  
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: Arn
}
object UpdateDatasetGroupRequest {
  
  inline def apply(DatasetArns: ArnList, DatasetGroupArn: Arn): UpdateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetArns = DatasetArns.asInstanceOf[js.Any], DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetGroupRequest]
  }
  
  extension [Self <: UpdateDatasetGroupRequest](x: Self) {
    
    inline def setDatasetArns(value: ArnList): Self = StObject.set(x, "DatasetArns", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnsVarargs(value: Arn*): Self = StObject.set(x, "DatasetArns", js.Array(value*))
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
  }
}
