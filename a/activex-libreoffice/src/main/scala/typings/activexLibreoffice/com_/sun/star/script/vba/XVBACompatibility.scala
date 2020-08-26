package typings.activexLibreoffice.com_.sun.star.script.vba

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVBACompatibility extends js.Object {
  var ProjectName: String = js.native
  var RunningVBAScripts: Double = js.native
  var VBACompatibilityMode: Boolean = js.native
  def addVBAScriptListener(Listener: XVBAScriptListener): Unit = js.native
  def broadcastVBAScriptEvent(Identifier: Double, ModuleName: String): Unit = js.native
  def removeVBAScriptListener(Listener: XVBAScriptListener): Unit = js.native
}

object XVBACompatibility {
  @scala.inline
  def apply(
    ProjectName: String,
    RunningVBAScripts: Double,
    VBACompatibilityMode: Boolean,
    addVBAScriptListener: XVBAScriptListener => Unit,
    broadcastVBAScriptEvent: (Double, String) => Unit,
    removeVBAScriptListener: XVBAScriptListener => Unit
  ): XVBACompatibility = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any], RunningVBAScripts = RunningVBAScripts.asInstanceOf[js.Any], VBACompatibilityMode = VBACompatibilityMode.asInstanceOf[js.Any], addVBAScriptListener = js.Any.fromFunction1(addVBAScriptListener), broadcastVBAScriptEvent = js.Any.fromFunction2(broadcastVBAScriptEvent), removeVBAScriptListener = js.Any.fromFunction1(removeVBAScriptListener))
    __obj.asInstanceOf[XVBACompatibility]
  }
  @scala.inline
  implicit class XVBACompatibilityOps[Self <: XVBACompatibility] (val x: Self) extends AnyVal {
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
    def setProjectName(value: String): Self = this.set("ProjectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunningVBAScripts(value: Double): Self = this.set("RunningVBAScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setVBACompatibilityMode(value: Boolean): Self = this.set("VBACompatibilityMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddVBAScriptListener(value: XVBAScriptListener => Unit): Self = this.set("addVBAScriptListener", js.Any.fromFunction1(value))
    @scala.inline
    def setBroadcastVBAScriptEvent(value: (Double, String) => Unit): Self = this.set("broadcastVBAScriptEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveVBAScriptListener(value: XVBAScriptListener => Unit): Self = this.set("removeVBAScriptListener", js.Any.fromFunction1(value))
  }
  
}

