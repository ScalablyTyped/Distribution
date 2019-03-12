package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * script event that gets delivered whenever a script event takes place.
  *
  * For that to happen, a "ScriptEventDescriptor" must be registered at and attached to an object by an {@link XEventAttacherManager} .
  */
trait ScriptEvent extends AllEventObject {
  /**
    * script code as string.
    *
    * The code has to correspond with the language defined by ScriptType.
    */
  var ScriptCode: java.lang.String
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: java.lang.String
}

object ScriptEvent {
  @scala.inline
  def apply(
    Arguments: stdLib.SafeArray[_],
    Helper: js.Any,
    ListenerType: activexDashLibreofficeLib.`type`,
    MethodName: java.lang.String,
    ScriptCode: java.lang.String,
    ScriptType: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ScriptEvent = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Helper = Helper, ListenerType = ListenerType, MethodName = MethodName, ScriptCode = ScriptCode, ScriptType = ScriptType, Source = Source)
  
    __obj.asInstanceOf[ScriptEvent]
  }
}

