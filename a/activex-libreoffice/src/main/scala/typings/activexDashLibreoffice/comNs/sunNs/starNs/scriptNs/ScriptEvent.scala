package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
  var ScriptCode: String
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: String
}

object ScriptEvent {
  @scala.inline
  def apply(
    Arguments: SafeArray[_],
    Helper: js.Any,
    ListenerType: `type`,
    MethodName: String,
    ScriptCode: String,
    ScriptType: String,
    Source: XInterface
  ): ScriptEvent = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Helper = Helper, ListenerType = ListenerType, MethodName = MethodName, ScriptCode = ScriptCode, ScriptType = ScriptType, Source = Source)
  
    __obj.asInstanceOf[ScriptEvent]
  }
}

