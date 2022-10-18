package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogGroupLogDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the log group where text and metadata logs are delivered.
    */
  var cloudWatchLogGroupArn: CloudWatchLogGroupArn
  
  /**
    * The prefix of the log stream name within the log group that you specified 
    */
  var logPrefix: LogPrefix
}
object CloudWatchLogGroupLogDestination {
  
  inline def apply(cloudWatchLogGroupArn: CloudWatchLogGroupArn, logPrefix: LogPrefix): CloudWatchLogGroupLogDestination = {
    val __obj = js.Dynamic.literal(cloudWatchLogGroupArn = cloudWatchLogGroupArn.asInstanceOf[js.Any], logPrefix = logPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogGroupLogDestination]
  }
  
  extension [Self <: CloudWatchLogGroupLogDestination](x: Self) {
    
    inline def setCloudWatchLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "cloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogPrefix(value: LogPrefix): Self = StObject.set(x, "logPrefix", value.asInstanceOf[js.Any])
  }
}
