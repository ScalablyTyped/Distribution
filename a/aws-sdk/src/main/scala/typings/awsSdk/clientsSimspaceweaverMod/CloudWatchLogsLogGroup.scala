package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsLogGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log group for the simulation. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference. For more information about log groups, see Working with log groups and log streams in the Amazon CloudWatch Logs User Guide.
    */
  var LogGroupArn: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.LogGroupArn] = js.undefined
}
object CloudWatchLogsLogGroup {
  
  inline def apply(): CloudWatchLogsLogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogsLogGroup] (val x: Self) extends AnyVal {
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
  }
}
