package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImageVersionRequest extends StObject {
  
  /**
    * The alias of the image version.
    */
  var Alias: js.UndefOr[SageMakerImageVersionAlias] = js.undefined
  
  /**
    * A list of aliases to add.
    */
  var AliasesToAdd: js.UndefOr[SageMakerImageVersionAliases] = js.undefined
  
  /**
    * A list of aliases to delete.
    */
  var AliasesToDelete: js.UndefOr[SageMakerImageVersionAliases] = js.undefined
  
  /**
    * Indicates Horovod compatibility.
    */
  var Horovod: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Horovod] = js.undefined
  
  /**
    * The name of the image.
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
    * The availability of the image version specified by the maintainer.    NOT_PROVIDED: The maintainers did not provide a status for image version stability.    STABLE: The image version is stable.    TO_BE_ARCHIVED: The image version is set to be archived. Custom image versions that are set to be archived are automatically archived after three months.    ARCHIVED: The image version is archived. Archived image versions are not searchable and are no longer actively supported.   
    */
  var VendorGuidance: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VendorGuidance] = js.undefined
  
  /**
    * The version of the image.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.undefined
}
object UpdateImageVersionRequest {
  
  inline def apply(ImageName: ImageName): UpdateImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImageVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateImageVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: SageMakerImageVersionAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setAliasesToAdd(value: SageMakerImageVersionAliases): Self = StObject.set(x, "AliasesToAdd", value.asInstanceOf[js.Any])
    
    inline def setAliasesToAddUndefined: Self = StObject.set(x, "AliasesToAdd", js.undefined)
    
    inline def setAliasesToAddVarargs(value: SageMakerImageVersionAlias*): Self = StObject.set(x, "AliasesToAdd", js.Array(value*))
    
    inline def setAliasesToDelete(value: SageMakerImageVersionAliases): Self = StObject.set(x, "AliasesToDelete", value.asInstanceOf[js.Any])
    
    inline def setAliasesToDeleteUndefined: Self = StObject.set(x, "AliasesToDelete", js.undefined)
    
    inline def setAliasesToDeleteVarargs(value: SageMakerImageVersionAlias*): Self = StObject.set(x, "AliasesToDelete", js.Array(value*))
    
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
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
