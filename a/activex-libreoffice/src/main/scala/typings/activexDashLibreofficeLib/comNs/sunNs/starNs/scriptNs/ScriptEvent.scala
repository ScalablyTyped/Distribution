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
    Arguments: activexDashInteropLib.SafeArray[_],
    Helper: js.Any,
    ListenerType: activexDashLibreofficeLib.`type`,
    MethodName: java.lang.String,
    ScriptCode: java.lang.String,
    ScriptType: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ScriptEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Arguments")(Arguments)
    __obj.updateDynamic("Helper")(Helper)
    __obj.updateDynamic("ListenerType")(ListenerType)
    __obj.updateDynamic("MethodName")(MethodName)
    __obj.updateDynamic("ScriptCode")(ScriptCode)
    __obj.updateDynamic("ScriptType")(ScriptType)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[ScriptEvent]
  }
}

