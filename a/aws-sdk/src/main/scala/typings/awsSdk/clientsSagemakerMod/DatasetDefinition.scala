package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetDefinition extends StObject {
  
  var AthenaDatasetDefinition: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AthenaDatasetDefinition] = js.undefined
  
  /**
    * Whether the generated dataset is FullyReplicated or ShardedByS3Key (default).
    */
  var DataDistributionType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DataDistributionType] = js.undefined
  
  /**
    * Whether to use File or Pipe input mode. In File (default) mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In Pipe mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var InputMode: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InputMode] = js.undefined
  
  /**
    * The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a processing job. LocalPath is an absolute path to the input data. This is a required parameter when AppManaged is False (default).
    */
  var LocalPath: js.UndefOr[ProcessingLocalPath] = js.undefined
  
  var RedshiftDatasetDefinition: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RedshiftDatasetDefinition] = js.undefined
}
object DatasetDefinition {
  
  inline def apply(): DatasetDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetDefinition] (val x: Self) extends AnyVal {
    
    inline def setAthenaDatasetDefinition(value: AthenaDatasetDefinition): Self = StObject.set(x, "AthenaDatasetDefinition", value.asInstanceOf[js.Any])
    
    inline def setAthenaDatasetDefinitionUndefined: Self = StObject.set(x, "AthenaDatasetDefinition", js.undefined)
    
    inline def setDataDistributionType(value: DataDistributionType): Self = StObject.set(x, "DataDistributionType", value.asInstanceOf[js.Any])
    
    inline def setDataDistributionTypeUndefined: Self = StObject.set(x, "DataDistributionType", js.undefined)
    
    inline def setInputMode(value: InputMode): Self = StObject.set(x, "InputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "InputMode", js.undefined)
    
    inline def setLocalPath(value: ProcessingLocalPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    inline def setRedshiftDatasetDefinition(value: RedshiftDatasetDefinition): Self = StObject.set(x, "RedshiftDatasetDefinition", value.asInstanceOf[js.Any])
    
    inline def setRedshiftDatasetDefinitionUndefined: Self = StObject.set(x, "RedshiftDatasetDefinition", js.undefined)
  }
}
