package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSpotDatafeedSubscriptionRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket in which to store the Spot Instance data feed. For more information about bucket names, see Rules for bucket naming in the Amazon S3 Developer Guide.
    */
  var Bucket: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The prefix for the data feed file names.
    */
  var Prefix: js.UndefOr[String] = js.undefined
}
object CreateSpotDatafeedSubscriptionRequest {
  
  inline def apply(Bucket: String): CreateSpotDatafeedSubscriptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSpotDatafeedSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
