package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageVersionResponse extends StObject {
  
  /**
    * The registry path of the container image on which this image version is based.
    */
  var BaseImage: js.UndefOr[ImageBaseImage] = js.undefined
  
  /**
    * The registry path of the container image that contains this image version.
    */
  var ContainerImage: js.UndefOr[ImageContainerImage] = js.undefined
  
  /**
    * When the version was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * Indicates Horovod compatibility.
    */
  var Horovod: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Horovod] = js.undefined
  
  /**
    * The ARN of the image the version is based on.
    */
  var ImageArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageArn] = js.undefined
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageVersionArn] = js.undefined
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageVersionStatus] = js.undefined
  
  /**
    * Indicates SageMaker job type compatibility.    TRAINING: The image version is compatible with SageMaker training jobs.    INFERENCE: The image version is compatible with SageMaker inference jobs.    NOTEBOOK_KERNEL: The image version is compatible with SageMaker notebook kernels.  
    */
  var JobType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.JobType] = js.undefined
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The machine learning framework vended in the image version.
    */
  var MLFramework: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MLFramework] = js.undefined
  
  /**
    * Indicates CPU or GPU compatibility.    CPU: The image version is compatible with CPU.    GPU: The image version is compatible with GPU.  
    */
  var Processor: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Processor] = js.undefined
  
  /**
    * The supported programming language and its version.
    */
  var ProgrammingLang: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProgrammingLang] = js.undefined
  
  /**
    * The maintainer description of the image version.
    */
  var ReleaseNotes: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ReleaseNotes] = js.undefined
  
  /**
    * The stability of the image version specified by the maintainer.    NOT_PROVIDED: The maintainers did not provide a status for image version stability.    STABLE: The image version is stable.    TO_BE_ARCHIVED: The image version is set to be archived. Custom image versions that are set to be archived are automatically archived after three months.    ARCHIVED: The image version is archived. Archived image versions are not searchable and are no longer actively supported.   
    */
  var VendorGuidance: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VendorGuidance] = js.undefined
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.undefined
}
object DescribeImageVersionResponse {
  
  inline def apply(): DescribeImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImageVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setBaseImage(value: ImageBaseImage): Self = StObject.set(x, "BaseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageUndefined: Self = StObject.set(x, "BaseImage", js.undefined)
    
    inline def setContainerImage(value: ImageContainerImage): Self = StObject.set(x, "ContainerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "ContainerImage", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHorovod(value: Horovod): Self = StObject.set(x, "Horovod", value.asInstanceOf[js.Any])
    
    inline def setHorovodUndefined: Self = StObject.set(x, "Horovod", js.undefined)
    
    inline def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionArnUndefined: Self = StObject.set(x, "ImageVersionArn", js.undefined)
    
    inline def setImageVersionStatus(value: ImageVersionStatus): Self = StObject.set(x, "ImageVersionStatus", value.asInstanceOf[js.Any])
    
    inline def setImageVersionStatusUndefined: Self = StObject.set(x, "ImageVersionStatus", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setMLFramework(value: MLFramework): Self = StObject.set(x, "MLFramework", value.asInstanceOf[js.Any])
    
    inline def setMLFrameworkUndefined: Self = StObject.set(x, "MLFramework", js.undefined)
    
    inline def setProcessor(value: Processor): Self = StObject.set(x, "Processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "Processor", js.undefined)
    
    inline def setProgrammingLang(value: ProgrammingLang): Self = StObject.set(x, "ProgrammingLang", value.asInstanceOf[js.Any])
    
    inline def setProgrammingLangUndefined: Self = StObject.set(x, "ProgrammingLang", js.undefined)
    
    inline def setReleaseNotes(value: ReleaseNotes): Self = StObject.set(x, "ReleaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "ReleaseNotes", js.undefined)
    
    inline def setVendorGuidance(value: VendorGuidance): Self = StObject.set(x, "VendorGuidance", value.asInstanceOf[js.Any])
    
    inline def setVendorGuidanceUndefined: Self = StObject.set(x, "VendorGuidance", js.undefined)
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
