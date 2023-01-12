package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextLogDestination extends StObject {
  
  /**
    * Defines the Amazon CloudWatch Logs log group where text and metadata logs are delivered.
    */
  var cloudWatch: CloudWatchLogGroupLogDestination
}
object TextLogDestination {
  
  inline def apply(cloudWatch: CloudWatchLogGroupLogDestination): TextLogDestination = {
    val __obj = js.Dynamic.literal(cloudWatch = cloudWatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLogDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextLogDestination] (val x: Self) extends AnyVal {
    
    inline def setCloudWatch(value: CloudWatchLogGroupLogDestination): Self = StObject.set(x, "cloudWatch", value.asInstanceOf[js.Any])
  }
}
