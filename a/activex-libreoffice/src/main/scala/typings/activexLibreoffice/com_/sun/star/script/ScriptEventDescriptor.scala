package typings.activexLibreoffice.com_.sun.star.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes an effect, especially a script to be executed, for a certain event given by the listener type and the name of the event method. */
@js.native
trait ScriptEventDescriptor extends js.Object {
  /**
    * data to be used if the addListener method needs an additional parameter.
    *
    * If the type of this parameter is different from string, it will be converted, when added.
    */
  var AddListenerParam: String = js.native
  /** event method as string. */
  var EventMethod: String = js.native
  /** listener type as string, same as listener-XIdlClass.getName(). */
  var ListenerType: String = js.native
  /** script code as string (the code has to correspond with the language defined by ScriptType). */
  var ScriptCode: String = js.native
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: String = js.native
}

object ScriptEventDescriptor {
  @scala.inline
  def apply(
    AddListenerParam: String,
    EventMethod: String,
    ListenerType: String,
    ScriptCode: String,
    ScriptType: String
  ): ScriptEventDescriptor = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam.asInstanceOf[js.Any], EventMethod = EventMethod.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any], ScriptCode = ScriptCode.asInstanceOf[js.Any], ScriptType = ScriptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptEventDescriptor]
  }
  @scala.inline
  implicit class ScriptEventDescriptorOps[Self <: ScriptEventDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddListenerParam(value: String): Self = this.set("AddListenerParam", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventMethod(value: String): Self = this.set("EventMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerType(value: String): Self = this.set("ListenerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptCode(value: String): Self = this.set("ScriptCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptType(value: String): Self = this.set("ScriptType", value.asInstanceOf[js.Any])
  }
  
}

