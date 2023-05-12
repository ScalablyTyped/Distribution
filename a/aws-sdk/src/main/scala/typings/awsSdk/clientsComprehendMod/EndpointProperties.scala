package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointProperties extends StObject {
  
  /**
    * The creation date and time of the endpoint.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of inference units currently used by the model using this endpoint.
    */
  var CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to trained custom models encrypted with a customer managed key (ModelKmsKeyId).
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Data access role ARN to use in case the new model is encrypted with a customer KMS key.
    */
  var DesiredDataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.undefined
  
  /**
    * ARN of the new model to use for updating an existing endpoint. This ARN is going to be different from the model ARN when the update is in progress
    */
  var DesiredModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
  
  /**
    * The date and time that the endpoint was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies a reason for failure in cases of Failed status.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers will need to wait for the endpoint to be Ready status before making inference requests.
    */
  var Status: js.UndefOr[EndpointStatus] = js.undefined
}
object EndpointProperties {
  
  inline def apply(): EndpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointProperties] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "CurrentInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setCurrentInferenceUnitsUndefined: Self = StObject.set(x, "CurrentInferenceUnits", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDesiredDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DesiredDataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDesiredDataAccessRoleArnUndefined: Self = StObject.set(x, "DesiredDataAccessRoleArn", js.undefined)
    
    inline def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "DesiredInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setDesiredInferenceUnitsUndefined: Self = StObject.set(x, "DesiredInferenceUnits", js.undefined)
    
    inline def setDesiredModelArn(value: ComprehendModelArn): Self = StObject.set(x, "DesiredModelArn", value.asInstanceOf[js.Any])
    
    inline def setDesiredModelArnUndefined: Self = StObject.set(x, "DesiredModelArn", js.undefined)
    
    inline def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
