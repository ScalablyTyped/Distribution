package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.undefined
  
  var JobId: typings.awsSdk.clientsImportexportMod.JobId
  
  var JobType: typings.awsSdk.clientsImportexportMod.JobType
  
  var Manifest: typings.awsSdk.clientsImportexportMod.Manifest
  
  var ValidateOnly: typings.awsSdk.clientsImportexportMod.ValidateOnly
}
object UpdateJobInput {
  
  inline def apply(JobId: JobId, JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
  
  extension [Self <: UpdateJobInput](x: Self) {
    
    inline def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    inline def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: Manifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    inline def setValidateOnly(value: ValidateOnly): Self = StObject.set(x, "ValidateOnly", value.asInstanceOf[js.Any])
  }
}
