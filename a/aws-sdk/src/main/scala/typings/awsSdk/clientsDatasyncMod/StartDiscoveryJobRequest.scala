package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDiscoveryJobRequest extends StObject {
  
  /**
    * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a client token, DataSync generates one for you automatically.
    */
  var ClientToken: PtolemyUUID
  
  /**
    * Specifies in minutes how long you want the discovery job to run.  For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow time to collect a sufficient number of data points and provide a realistic representation of storage performance and utilization. 
    */
  var CollectionDurationMinutes: typings.awsSdk.clientsDatasyncMod.CollectionDurationMinutes
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the discovery job on.
    */
  var StorageSystemArn: typings.awsSdk.clientsDatasyncMod.StorageSystemArn
  
  /**
    * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object StartDiscoveryJobRequest {
  
  inline def apply(
    ClientToken: PtolemyUUID,
    CollectionDurationMinutes: CollectionDurationMinutes,
    StorageSystemArn: StorageSystemArn
  ): StartDiscoveryJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], CollectionDurationMinutes = CollectionDurationMinutes.asInstanceOf[js.Any], StorageSystemArn = StorageSystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDiscoveryJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDiscoveryJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: PtolemyUUID): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setCollectionDurationMinutes(value: CollectionDurationMinutes): Self = StObject.set(x, "CollectionDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
