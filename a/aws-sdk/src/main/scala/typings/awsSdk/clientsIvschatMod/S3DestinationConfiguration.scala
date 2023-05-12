package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationConfiguration extends StObject {
  
  /**
    * Name of the Amazon S3 bucket where chat activity will be logged.
    */
  var bucketName: BucketName
}
object S3DestinationConfiguration {
  
  inline def apply(bucketName: BucketName): S3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
  }
}
