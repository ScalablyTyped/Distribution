package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscribedWorkteamResponse extends StObject {
  
  /**
    * A Workteam instance that contains information about the work team.
    */
  var SubscribedWorkteam: typings.awsSdk.clientsSagemakerMod.SubscribedWorkteam
}
object DescribeSubscribedWorkteamResponse {
  
  inline def apply(SubscribedWorkteam: SubscribedWorkteam): DescribeSubscribedWorkteamResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteam = SubscribedWorkteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribedWorkteamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSubscribedWorkteamResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscribedWorkteam(value: SubscribedWorkteam): Self = StObject.set(x, "SubscribedWorkteam", value.asInstanceOf[js.Any])
  }
}
