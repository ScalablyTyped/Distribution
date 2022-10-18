package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplayRequest extends StObject {
  
  /**
    * The name of the replay to retrieve.
    */
  var ReplayName: typings.awsSdk.clientsEventbridgeMod.ReplayName
}
object DescribeReplayRequest {
  
  inline def apply(ReplayName: ReplayName): DescribeReplayRequest = {
    val __obj = js.Dynamic.literal(ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplayRequest]
  }
  
  extension [Self <: DescribeReplayRequest](x: Self) {
    
    inline def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
  }
}
