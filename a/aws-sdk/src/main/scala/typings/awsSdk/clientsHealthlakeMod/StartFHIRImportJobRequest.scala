package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFHIRImportJobRequest extends StObject {
  
  /**
    * Optional user provided token used for ensuring idempotency.
    */
  var ClientToken: ClientTokenString
  
  /**
    * The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * The AWS-generated Data Store ID.
    */
  var DatastoreId: typings.awsSdk.clientsHealthlakeMod.DatastoreId
  
  /**
    * The input properties of the FHIR Import job in the StartFHIRImport job request.
    */
  var InputDataConfig: typings.awsSdk.clientsHealthlakeMod.InputDataConfig
  
  /**
    * The name of the FHIR Import job in the StartFHIRImport job request.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.JobName] = js.undefined
  
  var JobOutputDataConfig: OutputDataConfig
}
object StartFHIRImportJobRequest {
  
  inline def apply(
    ClientToken: ClientTokenString,
    DataAccessRoleArn: IamRoleArn,
    DatastoreId: DatastoreId,
    InputDataConfig: InputDataConfig,
    JobOutputDataConfig: OutputDataConfig
  ): StartFHIRImportJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], DatastoreId = DatastoreId.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], JobOutputDataConfig = JobOutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFHIRImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFHIRImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "JobOutputDataConfig", value.asInstanceOf[js.Any])
  }
}
