package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptBatchJobDefinition extends StObject {
  
  /**
    * The name of the script containing the batch job definition.
    */
  var scriptName: String
}
object ScriptBatchJobDefinition {
  
  inline def apply(scriptName: String): ScriptBatchJobDefinition = {
    val __obj = js.Dynamic.literal(scriptName = scriptName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBatchJobDefinition]
  }
  
  extension [Self <: ScriptBatchJobDefinition](x: Self) {
    
    inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
  }
}
