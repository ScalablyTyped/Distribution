package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionPolicyRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  var retentionInDays: Days
}
object PutRetentionPolicyRequest {
  
  inline def apply(logGroupName: LogGroupName, retentionInDays: Days): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], retentionInDays = retentionInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
  
  extension [Self <: PutRetentionPolicyRequest](x: Self) {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setRetentionInDays(value: Days): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
  }
}
