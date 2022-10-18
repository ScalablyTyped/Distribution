package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscribedWorkteamRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the subscribed work team to describe.
    */
  var WorkteamArn: typings.awsSdk.clientsSagemakerMod.WorkteamArn
}
object DescribeSubscribedWorkteamRequest {
  
  inline def apply(WorkteamArn: WorkteamArn): DescribeSubscribedWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribedWorkteamRequest]
  }
  
  extension [Self <: DescribeSubscribedWorkteamRequest](x: Self) {
    
    inline def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
  }
}
