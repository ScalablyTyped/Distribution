package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringOutputConfig extends StObject {
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
    */
  var MonitoringOutputs: typings.awsSdk.clientsSagemakerMod.MonitoringOutputs
}
object MonitoringOutputConfig {
  
  inline def apply(MonitoringOutputs: MonitoringOutputs): MonitoringOutputConfig = {
    val __obj = js.Dynamic.literal(MonitoringOutputs = MonitoringOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutputConfig]
  }
  
  extension [Self <: MonitoringOutputConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMonitoringOutputs(value: MonitoringOutputs): Self = StObject.set(x, "MonitoringOutputs", value.asInstanceOf[js.Any])
    
    inline def setMonitoringOutputsVarargs(value: MonitoringOutput*): Self = StObject.set(x, "MonitoringOutputs", js.Array(value*))
  }
}
