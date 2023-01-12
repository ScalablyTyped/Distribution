package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogs extends StObject {
  
  var Enabled: boolean
  
  var LogGroup: js.UndefOr[string] = js.undefined
}
object CloudWatchLogs {
  
  inline def apply(Enabled: boolean): CloudWatchLogs = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogs] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setLogGroup(value: string): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
  }
}
