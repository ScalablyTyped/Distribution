package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScriptInput extends StObject {
  
  /**
    * A unique identifier for the Realtime script to retrieve properties for. You can use either the script ID or ARN value.
    */
  var ScriptId: ScriptIdOrArn
}
object DescribeScriptInput {
  
  inline def apply(ScriptId: ScriptIdOrArn): DescribeScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScriptInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeScriptInput] (val x: Self) extends AnyVal {
    
    inline def setScriptId(value: ScriptIdOrArn): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
  }
}
