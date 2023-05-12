package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRefreshDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the topic refresh.
    */
  var RefreshArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the refresh, which occurs as a result of topic creation or topic update.
    */
  var RefreshId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The status of the refresh job that indicates whether the job is still running, completed successfully, or failed.
    */
  var RefreshStatus: js.UndefOr[TopicRefreshStatus] = js.undefined
}
object TopicRefreshDetails {
  
  inline def apply(): TopicRefreshDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRefreshDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicRefreshDetails] (val x: Self) extends AnyVal {
    
    inline def setRefreshArn(value: Arn): Self = StObject.set(x, "RefreshArn", value.asInstanceOf[js.Any])
    
    inline def setRefreshArnUndefined: Self = StObject.set(x, "RefreshArn", js.undefined)
    
    inline def setRefreshId(value: ResourceId): Self = StObject.set(x, "RefreshId", value.asInstanceOf[js.Any])
    
    inline def setRefreshIdUndefined: Self = StObject.set(x, "RefreshId", js.undefined)
    
    inline def setRefreshStatus(value: TopicRefreshStatus): Self = StObject.set(x, "RefreshStatus", value.asInstanceOf[js.Any])
    
    inline def setRefreshStatusUndefined: Self = StObject.set(x, "RefreshStatus", js.undefined)
  }
}
