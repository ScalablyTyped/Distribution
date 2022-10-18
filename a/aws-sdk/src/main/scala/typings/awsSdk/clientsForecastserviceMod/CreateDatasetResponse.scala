package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
}
object CreateDatasetResponse {
  
  inline def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  extension [Self <: CreateDatasetResponse](x: Self) {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
  }
}
