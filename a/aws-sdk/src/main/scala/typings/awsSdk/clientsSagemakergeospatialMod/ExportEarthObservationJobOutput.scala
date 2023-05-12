package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportEarthObservationJobOutput extends StObject {
  
  /**
    * The output Amazon Resource Name (ARN) of the Earth Observation job being exported.
    */
  var Arn: EarthObservationJobArn
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn
  
  /**
    * The source images provided to the Earth Observation job being exported.
    */
  var ExportSourceImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of the results of the Earth Observation job being exported.
    */
  var ExportStatus: EarthObservationJobExportStatus
  
  /**
    * An object containing information about the output file.
    */
  var OutputConfig: OutputConfigInput
}
object ExportEarthObservationJobOutput {
  
  inline def apply(
    Arn: EarthObservationJobArn,
    CreationTime: js.Date,
    ExecutionRoleArn: ExecutionRoleArn,
    ExportStatus: EarthObservationJobExportStatus,
    OutputConfig: OutputConfigInput
  ): ExportEarthObservationJobOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ExportStatus = ExportStatus.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEarthObservationJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportEarthObservationJobOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EarthObservationJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExportSourceImages(value: Boolean): Self = StObject.set(x, "ExportSourceImages", value.asInstanceOf[js.Any])
    
    inline def setExportSourceImagesUndefined: Self = StObject.set(x, "ExportSourceImages", js.undefined)
    
    inline def setExportStatus(value: EarthObservationJobExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: OutputConfigInput): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
