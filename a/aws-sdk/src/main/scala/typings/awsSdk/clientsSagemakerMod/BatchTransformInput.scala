package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchTransformInput extends StObject {
  
  /**
    * The Amazon S3 location being used to capture the data.
    */
  var DataCapturedDestinationS3Uri: DestinationS3Uri
  
  /**
    * The dataset format for your batch transform job.
    */
  var DatasetFormat: MonitoringDatasetFormat
  
  /**
    * If specified, monitoring jobs substract this time from the end time. For information about using offsets for scheduling monitoring jobs, see Schedule Model Quality Monitoring Jobs.
    */
  var EndTimeOffset: js.UndefOr[MonitoringTimeOffsetString] = js.undefined
  
  /**
    * The attributes of the input data that are the input features.
    */
  var FeaturesAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * The attribute of the input data that represents the ground truth label.
    */
  var InferenceAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the filesystem where the batch transform data is available to the container.
    */
  var LocalPath: ProcessingLocalPath
  
  /**
    * In a classification problem, the attribute that represents the class probability.
    */
  var ProbabilityAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * The threshold for the class probability to be evaluated as a positive result.
    */
  var ProbabilityThresholdAttribute: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProbabilityThresholdAttribute] = js.undefined
  
  /**
    * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defaults to FullyReplicated 
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.undefined
  
  /**
    * Whether the Pipe or File is used as the input mode for transferring data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
    */
  var S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.undefined
  
  /**
    * If specified, monitoring jobs substract this time from the start time. For information about using offsets for scheduling monitoring jobs, see Schedule Model Quality Monitoring Jobs.
    */
  var StartTimeOffset: js.UndefOr[MonitoringTimeOffsetString] = js.undefined
}
object BatchTransformInput {
  
  inline def apply(
    DataCapturedDestinationS3Uri: DestinationS3Uri,
    DatasetFormat: MonitoringDatasetFormat,
    LocalPath: ProcessingLocalPath
  ): BatchTransformInput = {
    val __obj = js.Dynamic.literal(DataCapturedDestinationS3Uri = DataCapturedDestinationS3Uri.asInstanceOf[js.Any], DatasetFormat = DatasetFormat.asInstanceOf[js.Any], LocalPath = LocalPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTransformInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchTransformInput] (val x: Self) extends AnyVal {
    
    inline def setDataCapturedDestinationS3Uri(value: DestinationS3Uri): Self = StObject.set(x, "DataCapturedDestinationS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDatasetFormat(value: MonitoringDatasetFormat): Self = StObject.set(x, "DatasetFormat", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffset(value: MonitoringTimeOffsetString): Self = StObject.set(x, "EndTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "EndTimeOffset", js.undefined)
    
    inline def setFeaturesAttribute(value: String): Self = StObject.set(x, "FeaturesAttribute", value.asInstanceOf[js.Any])
    
    inline def setFeaturesAttributeUndefined: Self = StObject.set(x, "FeaturesAttribute", js.undefined)
    
    inline def setInferenceAttribute(value: String): Self = StObject.set(x, "InferenceAttribute", value.asInstanceOf[js.Any])
    
    inline def setInferenceAttributeUndefined: Self = StObject.set(x, "InferenceAttribute", js.undefined)
    
    inline def setLocalPath(value: ProcessingLocalPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    inline def setProbabilityAttribute(value: String): Self = StObject.set(x, "ProbabilityAttribute", value.asInstanceOf[js.Any])
    
    inline def setProbabilityAttributeUndefined: Self = StObject.set(x, "ProbabilityAttribute", js.undefined)
    
    inline def setProbabilityThresholdAttribute(value: ProbabilityThresholdAttribute): Self = StObject.set(x, "ProbabilityThresholdAttribute", value.asInstanceOf[js.Any])
    
    inline def setProbabilityThresholdAttributeUndefined: Self = StObject.set(x, "ProbabilityThresholdAttribute", js.undefined)
    
    inline def setS3DataDistributionType(value: ProcessingS3DataDistributionType): Self = StObject.set(x, "S3DataDistributionType", value.asInstanceOf[js.Any])
    
    inline def setS3DataDistributionTypeUndefined: Self = StObject.set(x, "S3DataDistributionType", js.undefined)
    
    inline def setS3InputMode(value: ProcessingS3InputMode): Self = StObject.set(x, "S3InputMode", value.asInstanceOf[js.Any])
    
    inline def setS3InputModeUndefined: Self = StObject.set(x, "S3InputMode", js.undefined)
    
    inline def setStartTimeOffset(value: MonitoringTimeOffsetString): Self = StObject.set(x, "StartTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "StartTimeOffset", js.undefined)
  }
}
