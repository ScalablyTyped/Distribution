package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAccountRequest extends StObject {
  
  /**
    * The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
    */
  var iamResources: js.UndefOr[IamResources] = js.undefined
  
  var timestreamResources: TimestreamResources
}
object RegisterAccountRequest {
  
  inline def apply(timestreamResources: TimestreamResources): RegisterAccountRequest = {
    val __obj = js.Dynamic.literal(timestreamResources = timestreamResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setIamResources(value: IamResources): Self = StObject.set(x, "iamResources", value.asInstanceOf[js.Any])
    
    inline def setIamResourcesUndefined: Self = StObject.set(x, "iamResources", js.undefined)
    
    inline def setTimestreamResources(value: TimestreamResources): Self = StObject.set(x, "timestreamResources", value.asInstanceOf[js.Any])
  }
}
