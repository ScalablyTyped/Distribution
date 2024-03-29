package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSetRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: _String
}
object GetDataSetRequest {
  
  inline def apply(DataSetId: _String): GetDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataSetRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSetId(value: _String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
  }
}
