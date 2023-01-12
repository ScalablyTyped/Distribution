package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSetDetailsRequest extends StObject {
  
  /**
    * The unique identifier of the application that this data set is associated with.
    */
  var applicationId: Identifier
  
  /**
    * The name of the data set.
    */
  var dataSetName: String200
}
object GetDataSetDetailsRequest {
  
  inline def apply(applicationId: Identifier, dataSetName: String200): GetDataSetDetailsRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], dataSetName = dataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataSetDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setDataSetName(value: String200): Self = StObject.set(x, "dataSetName", value.asInstanceOf[js.Any])
  }
}
