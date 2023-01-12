package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketSinkConfiguration extends StObject {
  
  /**
    * The destination URL of the S3 bucket.
    */
  var Destination: Arn
}
object S3BucketSinkConfiguration {
  
  inline def apply(Destination: Arn): S3BucketSinkConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketSinkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketSinkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: Arn): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
  }
}
