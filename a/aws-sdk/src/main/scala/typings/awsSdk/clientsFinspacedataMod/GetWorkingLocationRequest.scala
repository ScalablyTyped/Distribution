package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkingLocationRequest extends StObject {
  
  /**
    * Specify the type of the working location.    SAGEMAKER – Use the Amazon S3 location as a temporary location to store data content when working with FinSpace Notebooks that run on SageMaker studio.    INGESTION – Use the Amazon S3 location as a staging location to copy your data content and then use the location with the Changeset creation operation.  
    */
  var locationType: js.UndefOr[typings.awsSdk.clientsFinspacedataMod.locationType] = js.undefined
}
object GetWorkingLocationRequest {
  
  inline def apply(): GetWorkingLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkingLocationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkingLocationRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationType(value: locationType): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
  }
}
