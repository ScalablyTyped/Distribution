package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportEarthObservationJobInput extends StObject {
  
  /**
    * The input Amazon Resource Name (ARN) of the Earth Observation job being exported.
    */
  var Arn: EarthObservationJobArn
  
  /**
    * A unique token that guarantees that the call to this API is idempotent.
    */
  var ClientToken: js.UndefOr[ExportEarthObservationJobInputClientTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn
  
  /**
    * The source images provided to the Earth Observation job being exported.
    */
  var ExportSourceImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object containing information about the output file.
    */
  var OutputConfig: OutputConfigInput
}
object ExportEarthObservationJobInput {
  
  inline def apply(Arn: EarthObservationJobArn, ExecutionRoleArn: ExecutionRoleArn, OutputConfig: OutputConfigInput): ExportEarthObservationJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEarthObservationJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportEarthObservationJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EarthObservationJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ExportEarthObservationJobInputClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExportSourceImages(value: Boolean): Self = StObject.set(x, "ExportSourceImages", value.asInstanceOf[js.Any])
    
    inline def setExportSourceImagesUndefined: Self = StObject.set(x, "ExportSourceImages", js.undefined)
    
    inline def setOutputConfig(value: OutputConfigInput): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
