package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportVectorEnrichmentJobOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Vector Enrichment job being exported.
    */
  var Arn: VectorEnrichmentJobArn
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role with permission to upload to the location in OutputConfig.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn
  
  /**
    * The status of the results the Vector Enrichment job being exported.
    */
  var ExportStatus: VectorEnrichmentJobExportStatus
  
  /**
    * Output location information for exporting Vector Enrichment Job results. 
    */
  var OutputConfig: ExportVectorEnrichmentJobOutputConfig
}
object ExportVectorEnrichmentJobOutput {
  
  inline def apply(
    Arn: VectorEnrichmentJobArn,
    CreationTime: js.Date,
    ExecutionRoleArn: ExecutionRoleArn,
    ExportStatus: VectorEnrichmentJobExportStatus,
    OutputConfig: ExportVectorEnrichmentJobOutputConfig
  ): ExportVectorEnrichmentJobOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ExportStatus = ExportStatus.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportVectorEnrichmentJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportVectorEnrichmentJobOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExportStatus(value: VectorEnrichmentJobExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: ExportVectorEnrichmentJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
