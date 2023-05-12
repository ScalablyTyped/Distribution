package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartZonalShiftRequest extends StObject {
  
  /**
    * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in the AWS Region.
    */
  var awayFrom: AvailabilityZone
  
  /**
    * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is maintained. A new comment overwrites any existing comment string.
    */
  var comment: ZonalShiftComment
  
  /**
    * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three days (72 hours). If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic to the Availability Zone. To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following, with no space:  &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter m:&lt;/b&gt; To specify that the value is in minutes.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;A lowercase letter h:&lt;/b&gt; To specify that the value is in hours.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For example: &lt;code&gt;20h&lt;/code&gt; means the zonal shift expires in 20 hours. &lt;code&gt;120m&lt;/code&gt; means the zonal shift expires in 120 minutes (2 hours).&lt;/p&gt; 
    */
  var expiresIn: ExpiresIn
  
  /**
    * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for the resource. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off.
    */
  var resourceIdentifier: ResourceIdentifier
}
object StartZonalShiftRequest {
  
  inline def apply(
    awayFrom: AvailabilityZone,
    comment: ZonalShiftComment,
    expiresIn: ExpiresIn,
    resourceIdentifier: ResourceIdentifier
  ): StartZonalShiftRequest = {
    val __obj = js.Dynamic.literal(awayFrom = awayFrom.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartZonalShiftRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartZonalShiftRequest] (val x: Self) extends AnyVal {
    
    inline def setAwayFrom(value: AvailabilityZone): Self = StObject.set(x, "awayFrom", value.asInstanceOf[js.Any])
    
    inline def setComment(value: ZonalShiftComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: ExpiresIn): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
