package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScriptInput extends StObject {
  
  /**
    * A unique identifier for the Realtime script to delete. You can use either the script ID or ARN value.
    */
  var ScriptId: ScriptIdOrArn
}
object DeleteScriptInput {
  
  inline def apply(ScriptId: ScriptIdOrArn): DeleteScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScriptInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteScriptInput] (val x: Self) extends AnyVal {
    
    inline def setScriptId(value: ScriptIdOrArn): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
  }
}
