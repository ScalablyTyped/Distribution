package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptBatchJobIdentifier extends StObject {
  
  /**
    * The name of the script containing the batch job definition.
    */
  var scriptName: String
}
object ScriptBatchJobIdentifier {
  
  inline def apply(scriptName: String): ScriptBatchJobIdentifier = {
    val __obj = js.Dynamic.literal(scriptName = scriptName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBatchJobIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptBatchJobIdentifier] (val x: Self) extends AnyVal {
    
    inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
  }
}
