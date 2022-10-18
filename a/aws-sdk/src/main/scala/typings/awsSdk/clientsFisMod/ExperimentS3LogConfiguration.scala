package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentS3LogConfiguration extends StObject {
  
  /**
    * The name of the destination bucket.
    */
  var bucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The bucket prefix.
    */
  var prefix: js.UndefOr[S3ObjectKey] = js.undefined
}
object ExperimentS3LogConfiguration {
  
  inline def apply(): ExperimentS3LogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentS3LogConfiguration]
  }
  
  extension [Self <: ExperimentS3LogConfiguration](x: Self) {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setPrefix(value: S3ObjectKey): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
