package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSetRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
}
object GetDataSetRequest {
  
  inline def apply(DataSetId: string): GetDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetRequest]
  }
  
  extension [Self <: GetDataSetRequest](x: Self) {
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
  }
}
