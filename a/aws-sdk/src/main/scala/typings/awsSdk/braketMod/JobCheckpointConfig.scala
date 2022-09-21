package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobCheckpointConfig extends StObject {
  
  /**
    * (Optional) The local directory where checkpoints are written. The default directory is /opt/braket/checkpoints/.
    */
  var localPath: js.UndefOr[String4096] = js.undefined
  
  /**
    * Identifies the S3 path where you want Amazon Braket to store checkpoints. For example, s3://bucket-name/key-name-prefix.
    */
  var s3Uri: S3Path
}
object JobCheckpointConfig {
  
  inline def apply(s3Uri: S3Path): JobCheckpointConfig = {
    val __obj = js.Dynamic.literal(s3Uri = s3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCheckpointConfig]
  }
  
  extension [Self <: JobCheckpointConfig](x: Self) {
    
    inline def setLocalPath(value: String4096): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
    
    inline def setS3Uri(value: S3Path): Self = StObject.set(x, "s3Uri", value.asInstanceOf[js.Any])
  }
}
