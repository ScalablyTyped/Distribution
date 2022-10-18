package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetResponse extends StObject {
  
  /**
    * The description of the requested dataset. 
    */
  var DatasetDescription: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.DatasetDescription] = js.undefined
}
object DescribeDatasetResponse {
  
  inline def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  extension [Self <: DescribeDatasetResponse](x: Self) {
    
    inline def setDatasetDescription(value: DatasetDescription): Self = StObject.set(x, "DatasetDescription", value.asInstanceOf[js.Any])
    
    inline def setDatasetDescriptionUndefined: Self = StObject.set(x, "DatasetDescription", js.undefined)
  }
}
