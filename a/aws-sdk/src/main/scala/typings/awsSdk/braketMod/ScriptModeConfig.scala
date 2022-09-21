package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptModeConfig extends StObject {
  
  /**
    * The type of compression used by the Python scripts for an Amazon Braket job.
    */
  var compressionType: js.UndefOr[CompressionType] = js.undefined
  
  /**
    * The path to the Python script that serves as the entry point for an Amazon Braket job.
    */
  var entryPoint: String
  
  /**
    * The URI that specifies the S3 path to the Python script module that contains the training script used by an Amazon Braket job.
    */
  var s3Uri: S3Path
}
object ScriptModeConfig {
  
  inline def apply(entryPoint: String, s3Uri: S3Path): ScriptModeConfig = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], s3Uri = s3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptModeConfig]
  }
  
  extension [Self <: ScriptModeConfig](x: Self) {
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Path): Self = StObject.set(x, "s3Uri", value.asInstanceOf[js.Any])
  }
}
