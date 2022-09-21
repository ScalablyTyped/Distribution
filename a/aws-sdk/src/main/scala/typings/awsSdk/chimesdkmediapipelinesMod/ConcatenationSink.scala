package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenationSink extends StObject {
  
  /**
    * The configuration settings for an Amazon S3 bucket sink.
    */
  var S3BucketSinkConfiguration: typings.awsSdk.chimesdkmediapipelinesMod.S3BucketSinkConfiguration
  
  /**
    * The type of data sink in the configuration object.
    */
  var Type: ConcatenationSinkType
}
object ConcatenationSink {
  
  inline def apply(S3BucketSinkConfiguration: S3BucketSinkConfiguration, Type: ConcatenationSinkType): ConcatenationSink = {
    val __obj = js.Dynamic.literal(S3BucketSinkConfiguration = S3BucketSinkConfiguration.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenationSink]
  }
  
  extension [Self <: ConcatenationSink](x: Self) {
    
    inline def setS3BucketSinkConfiguration(value: S3BucketSinkConfiguration): Self = StObject.set(x, "S3BucketSinkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConcatenationSinkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
