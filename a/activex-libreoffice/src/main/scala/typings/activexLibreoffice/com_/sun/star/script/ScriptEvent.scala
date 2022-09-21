package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * script event that gets delivered whenever a script event takes place.
  *
  * For that to happen, a "ScriptEventDescriptor" must be registered at and attached to an object by an {@link XEventAttacherManager} .
  */
trait ScriptEvent
  extends StObject
     with AllEventObject {
  
  /**
    * script code as string.
    *
    * The code has to correspond with the language defined by ScriptType.
    */
  var ScriptCode: String
  
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: String
}
object ScriptEvent {
  
  inline def apply(
    Arguments: SafeArray[Any],
    Helper: Any,
    ListenerType: `type`,
    MethodName: String,
    ScriptCode: String,
    ScriptType: String,
    Source: XInterface
  ): ScriptEvent = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any], ScriptCode = ScriptCode.asInstanceOf[js.Any], ScriptType = ScriptType.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptEvent]
  }
  
  extension [Self <: ScriptEvent](x: Self) {
    
    inline def setScriptCode(value: String): Self = StObject.set(x, "ScriptCode", value.asInstanceOf[js.Any])
    
    inline def setScriptType(value: String): Self = StObject.set(x, "ScriptType", value.asInstanceOf[js.Any])
  }
}
