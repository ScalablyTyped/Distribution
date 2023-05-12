package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageVersionRequest extends StObject {
  
  /**
    * A list of aliases created with the image version.
    */
  var Aliases: js.UndefOr[SageMakerImageVersionAliases] = js.undefined
  
  /**
    * The registry path of the container image to use as the starting point for this version. The path is an Amazon Elastic Container Registry (ECR) URI in the following format:  &lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt; 
    */
  var BaseImage: ImageBaseImage
  
  /**
    * A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK for Python (Boto3), add a unique value to the call.
    */
  var ClientToken: typings.awsSdk.clientsSagemakerMod.ClientToken
  
  /**
    * Indicates Horovod compatibility.
    */
  var Horovod: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Horovod] = js.undefined
  
  /**
    * The ImageName of the Image to create a version of.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * Indicates SageMaker job type compatibility.    TRAINING: The image version is compatible with SageMaker training jobs.    INFERENCE: The image version is compatible with SageMaker inference jobs.    NOTEBOOK_KERNEL: The image version is compatible with SageMaker notebook kernels.  
    */
  var JobType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.JobType] = js.undefined
  
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
    * The stability of the image version, specified by the maintainer.    NOT_PROVIDED: The maintainers did not provide a status for image version stability.    STABLE: The image version is stable.    TO_BE_ARCHIVED: The image version is set to be archived. Custom image versions that are set to be archived are automatically archived after three months.    ARCHIVED: The image version is archived. Archived image versions are not searchable and are no longer actively supported.   
    */
  var VendorGuidance: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VendorGuidance] = js.undefined
}
object CreateImageVersionRequest {
  
  inline def apply(BaseImage: ImageBaseImage, ClientToken: ClientToken, ImageName: ImageName): CreateImageVersionRequest = {
    val __obj = js.Dynamic.literal(BaseImage = BaseImage.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateImageVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: SageMakerImageVersionAliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: SageMakerImageVersionAlias*): Self = StObject.set(x, "Aliases", js.Array(value*))
    
    inline def setBaseImage(value: ImageBaseImage): Self = StObject.set(x, "BaseImage", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setHorovod(value: Horovod): Self = StObject.set(x, "Horovod", value.asInstanceOf[js.Any])
    
    inline def setHorovodUndefined: Self = StObject.set(x, "Horovod", js.undefined)
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
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
  }
}
