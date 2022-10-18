package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}
object S3Destination {
  
  inline def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  extension [Self <: S3Destination](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
