package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressAccessLogs extends StObject {
  
  /**
    * Customize the log group name.
    */
  var LogGroupName: js.UndefOr[string] = js.undefined
}
object EgressAccessLogs {
  
  inline def apply(): EgressAccessLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressAccessLogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EgressAccessLogs] (val x: Self) extends AnyVal {
    
    inline def setLogGroupName(value: string): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
  }
}
