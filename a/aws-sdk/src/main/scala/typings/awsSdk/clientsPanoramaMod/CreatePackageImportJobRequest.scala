package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageImportJobRequest extends StObject {
  
  /**
    * A client token for the package import job.
    */
  var ClientToken: typings.awsSdk.clientsPanoramaMod.ClientToken
  
  /**
    * An input config for the package import job.
    */
  var InputConfig: PackageImportJobInputConfig
  
  /**
    * Tags for the package import job.
    */
  var JobTags: js.UndefOr[JobTagsList] = js.undefined
  
  /**
    * A job type for the package import job.
    */
  var JobType: PackageImportJobType
  
  /**
    * An output config for the package import job.
    */
  var OutputConfig: PackageImportJobOutputConfig
}
object CreatePackageImportJobRequest {
  
  inline def apply(
    ClientToken: ClientToken,
    InputConfig: PackageImportJobInputConfig,
    JobType: PackageImportJobType,
    OutputConfig: PackageImportJobOutputConfig
  ): CreatePackageImportJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageImportJobRequest]
  }
  
  extension [Self <: CreatePackageImportJobRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: PackageImportJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobTags(value: JobTagsList): Self = StObject.set(x, "JobTags", value.asInstanceOf[js.Any])
    
    inline def setJobTagsUndefined: Self = StObject.set(x, "JobTags", js.undefined)
    
    inline def setJobTagsVarargs(value: JobResourceTags*): Self = StObject.set(x, "JobTags", js.Array(value*))
    
    inline def setJobType(value: PackageImportJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: PackageImportJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
