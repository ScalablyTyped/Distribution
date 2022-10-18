package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchOutputConfig extends StObject {
  
  /**
    * The name of the CloudWatch Logs log group where you want to send command output. If you don't specify a group name, Amazon Web Services Systems Manager automatically creates a log group for you. The log group uses the following naming format:  aws/ssm/SystemsManagerDocumentName  
    */
  var CloudWatchLogGroupName: js.UndefOr[typings.awsSdk.clientsSsmMod.CloudWatchLogGroupName] = js.undefined
  
  /**
    * Enables Systems Manager to send command output to CloudWatch Logs.
    */
  var CloudWatchOutputEnabled: js.UndefOr[typings.awsSdk.clientsSsmMod.CloudWatchOutputEnabled] = js.undefined
}
object CloudWatchOutputConfig {
  
  inline def apply(): CloudWatchOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchOutputConfig]
  }
  
  extension [Self <: CloudWatchOutputConfig](x: Self) {
    
    inline def setCloudWatchLogGroupName(value: CloudWatchLogGroupName): Self = StObject.set(x, "CloudWatchLogGroupName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupNameUndefined: Self = StObject.set(x, "CloudWatchLogGroupName", js.undefined)
    
    inline def setCloudWatchOutputEnabled(value: CloudWatchOutputEnabled): Self = StObject.set(x, "CloudWatchOutputEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchOutputEnabledUndefined: Self = StObject.set(x, "CloudWatchOutputEnabled", js.undefined)
  }
}
