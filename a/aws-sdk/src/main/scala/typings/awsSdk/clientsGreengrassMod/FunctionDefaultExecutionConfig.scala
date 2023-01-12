package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDefaultExecutionConfig extends StObject {
  
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined
  
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
}
object FunctionDefaultExecutionConfig {
  
  inline def apply(): FunctionDefaultExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultExecutionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionDefaultExecutionConfig] (val x: Self) extends AnyVal {
    
    inline def setIsolationMode(value: FunctionIsolationMode): Self = StObject.set(x, "IsolationMode", value.asInstanceOf[js.Any])
    
    inline def setIsolationModeUndefined: Self = StObject.set(x, "IsolationMode", js.undefined)
    
    inline def setRunAs(value: FunctionRunAsConfig): Self = StObject.set(x, "RunAs", value.asInstanceOf[js.Any])
    
    inline def setRunAsUndefined: Self = StObject.set(x, "RunAs", js.undefined)
  }
}
