package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes an effect, especially a script to be executed, for a certain event given by the listener type and the name of the event method. */
trait ScriptEventDescriptor extends js.Object {
  /**
    * data to be used if the addListener method needs an additional parameter.
    *
    * If the type of this parameter is different from string, it will be converted, when added.
    */
  var AddListenerParam: java.lang.String
  /** event method as string. */
  var EventMethod: java.lang.String
  /** listener type as string, same as listener-XIdlClass.getName(). */
  var ListenerType: java.lang.String
  /** script code as string (the code has to correspond with the language defined by ScriptType). */
  var ScriptCode: java.lang.String
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: java.lang.String
}

object ScriptEventDescriptor {
  @scala.inline
  def apply(
    AddListenerParam: java.lang.String,
    EventMethod: java.lang.String,
    ListenerType: java.lang.String,
    ScriptCode: java.lang.String,
    ScriptType: java.lang.String
  ): ScriptEventDescriptor = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam, EventMethod = EventMethod, ListenerType = ListenerType, ScriptCode = ScriptCode, ScriptType = ScriptType)
  
    __obj.asInstanceOf[ScriptEventDescriptor]
  }
}

