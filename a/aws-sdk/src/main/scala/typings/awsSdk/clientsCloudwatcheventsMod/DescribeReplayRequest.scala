package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplayRequest extends StObject {
  
  /**
    * The name of the replay to retrieve.
    */
  var ReplayName: typings.awsSdk.clientsCloudwatcheventsMod.ReplayName
}
object DescribeReplayRequest {
  
  inline def apply(ReplayName: ReplayName): DescribeReplayRequest = {
    val __obj = js.Dynamic.literal(ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReplayRequest] (val x: Self) extends AnyVal {
    
    inline def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
  }
}
