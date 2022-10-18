package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to be described.
    */
  var Name: DatasetName
}
object DescribeDatasetRequest {
  
  inline def apply(Name: DatasetName): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  extension [Self <: DescribeDatasetRequest](x: Self) {
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
