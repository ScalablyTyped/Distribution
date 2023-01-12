package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDefaultConfig extends StObject {
  
  var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.undefined
}
object FunctionDefaultConfig {
  
  inline def apply(): FunctionDefaultConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionDefaultConfig] (val x: Self) extends AnyVal {
    
    inline def setExecution(value: FunctionDefaultExecutionConfig): Self = StObject.set(x, "Execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "Execution", js.undefined)
  }
}
