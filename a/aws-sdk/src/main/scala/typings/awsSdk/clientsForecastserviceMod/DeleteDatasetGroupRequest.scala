package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group to delete.
    */
  var DatasetGroupArn: Arn
}
object DeleteDatasetGroupRequest {
  
  inline def apply(DatasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
  
  extension [Self <: DeleteDatasetGroupRequest](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
  }
}
