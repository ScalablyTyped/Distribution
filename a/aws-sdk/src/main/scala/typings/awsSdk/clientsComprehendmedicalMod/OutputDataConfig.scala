package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDataConfig extends StObject {
  
  /**
    * When you use the OutputDataConfig object with asynchronous operations, you specify the Amazon S3 location where you want to write the output data. The URI must be in the same region as the API endpoint that you are calling. The location is used as the prefix for the actual location of the output.
    */
  var S3Bucket: typings.awsSdk.clientsComprehendmedicalMod.S3Bucket
  
  /**
    * The path to the output data files in the S3 bucket. Comprehend Medical; creates an output directory using the job ID so that the output from one job does not overwrite the output of another.
    */
  var S3Key: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.S3Key] = js.undefined
}
object OutputDataConfig {
  
  inline def apply(S3Bucket: S3Bucket): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDataConfig]
  }
  
  extension [Self <: OutputDataConfig](x: Self) {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
