package typings.activexLibreoffice.com_.sun.star.script.vba

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a VBA script event fired via {@link XVBACompatibility.broadcastVBAScriptEvent()} , and received by {@link
  * XVBAScriptListener.notifyVBAScriptEvent()} .
  * @see XVBACompatibility
  * @see XVBAScriptListener
  */
@js.native
trait VBAScriptEvent extends EventObject {
  
  /**
    * Identifies the type of the event.
    * @see VBAScriptEventId
    */
  var Identifier: Double = js.native
  
  /**
    * Contains the name of the involved VBA module.
    * @see VBAScriptEventId
    */
  var ModuleName: String = js.native
}
object VBAScriptEvent {
  
  @scala.inline
  def apply(Identifier: Double, ModuleName: String, Source: XInterface): VBAScriptEvent = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], ModuleName = ModuleName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VBAScriptEvent]
  }
  
  @scala.inline
  implicit class VBAScriptEventOps[Self <: VBAScriptEvent] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: Double): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleName(value: String): Self = this.set("ModuleName", value.asInstanceOf[js.Any])
  }
}
