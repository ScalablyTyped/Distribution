package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportVectorEnrichmentJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Vector Enrichment job.
    */
  var Arn: VectorEnrichmentJobArn
  
  /**
    * A unique token that guarantees that the call to this API is idempotent.
    */
  var ClientToken: js.UndefOr[ExportVectorEnrichmentJobInputClientTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM rolewith permission to upload to the location in OutputConfig.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn
  
  /**
    * Output location information for exporting Vector Enrichment Job results. 
    */
  var OutputConfig: ExportVectorEnrichmentJobOutputConfig
}
object ExportVectorEnrichmentJobInput {
  
  inline def apply(
    Arn: VectorEnrichmentJobArn,
    ExecutionRoleArn: ExecutionRoleArn,
    OutputConfig: ExportVectorEnrichmentJobOutputConfig
  ): ExportVectorEnrichmentJobInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportVectorEnrichmentJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportVectorEnrichmentJobInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ExportVectorEnrichmentJobInputClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: ExportVectorEnrichmentJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
  }
}
