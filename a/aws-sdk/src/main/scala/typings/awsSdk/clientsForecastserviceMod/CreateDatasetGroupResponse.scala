package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
}
object CreateDatasetGroupResponse {
  
  inline def apply(): CreateDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetGroupResponse]
  }
  
  extension [Self <: CreateDatasetGroupResponse](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "DatasetGroupArn", js.undefined)
  }
}
