package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /**
    * The S3 bucket where training output is placed.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.clientsRekognitionMod.S3Bucket] = js.undefined
  
  /**
    * The prefix applied to the training output files. 
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.clientsRekognitionMod.S3KeyPrefix] = js.undefined
}
object OutputConfig {
  
  inline def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  extension [Self <: OutputConfig](x: Self) {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
