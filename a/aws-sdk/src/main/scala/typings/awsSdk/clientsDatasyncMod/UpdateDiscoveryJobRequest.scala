package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDiscoveryJobRequest extends StObject {
  
  /**
    * Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to less than the number of minutes that the job has already run for.)
    */
  var CollectionDurationMinutes: typings.awsSdk.clientsDatasyncMod.CollectionDurationMinutes
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
    */
  var DiscoveryJobArn: typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn
}
object UpdateDiscoveryJobRequest {
  
  inline def apply(CollectionDurationMinutes: CollectionDurationMinutes, DiscoveryJobArn: DiscoveryJobArn): UpdateDiscoveryJobRequest = {
    val __obj = js.Dynamic.literal(CollectionDurationMinutes = CollectionDurationMinutes.asInstanceOf[js.Any], DiscoveryJobArn = DiscoveryJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDiscoveryJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDiscoveryJobRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionDurationMinutes(value: CollectionDurationMinutes): Self = StObject.set(x, "CollectionDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
  }
}
